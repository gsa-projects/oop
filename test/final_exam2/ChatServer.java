package final_exam2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer extends JFrame implements ActionListener {
    // here: private 접근 제어자 안 씀
    BufferedReader in;
    BufferedWriter out;
    JTextField sender;
    Receiver receiver;

    public ChatServer() {
        setTitle("Chat Server");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        sender = new JTextField();
        sender.addActionListener(this);

        receiver = new Receiver();
        receiver.setEditable(false);

        c.add(sender, BorderLayout.SOUTH);
        c.add(receiver, BorderLayout.CENTER);   // here: JScrollPane 까먹음

        setSize(300, 150);
        setVisible(true);

        try {
            setupConnection();
        } catch (IOException e) {
            handleError(e.getMessage());
        }

        Thread th = new Thread(receiver);
        th.start();
    }

    private class Receiver extends JTextArea implements Runnable {
        public void run() {
            String msg = null;
            while (true) {
                try {
                    msg = in.readLine();
                } catch (IOException e) {
                    handleError(e.getMessage());
                }

                this.append("\n클라이언트: " + msg);
                int pos = this.getText().length();
                this.setCaretPosition(pos);
            }
        }
    }

    private static void handleError(String string) {
        System.out.println(string);
        System.exit(1);
    }

    private void setupConnection() throws IOException {
        ServerSocket listener = new ServerSocket(9999);
        Socket socket = listener.accept();
        receiver.append("클라이언트로부터 연결되었습니다.");
        // here: 모든 receiver append에는 캐럿 위치 재조정이 따라야함

        // here: 여기 클래스 매개변수니까 직접 로컬 변수처럼 타입까지 써서 정의ㄴㄴ 꽤 혼났다
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sender) {
            try {
                String msg = sender.getText();
                out.write(msg + "\n");
                out.flush();

                receiver.append("\n서버: " + msg);
                int pos = receiver.getText().length();
                receiver.setCaretPosition(pos);
                sender.setText(null);   // here: 아 맞다 sender에 있던 거 지워야지
            } catch (IOException e1) {
                handleError(e1.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new ChatServer();
    }
}
