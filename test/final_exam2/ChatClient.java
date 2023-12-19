package final_exam2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatClient extends JFrame implements ActionListener {
    BufferedReader in;
    BufferedWriter out;
    Receiver receiver;
    JTextField sender;

    public ChatClient() {
        setTitle("Chat Client");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        receiver = new Receiver();
        receiver.setEditable(false);

        sender = new JTextField();
        sender.addActionListener(this);

        c.add(receiver, BorderLayout.CENTER);
        c.add(sender, BorderLayout.SOUTH);

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

                this.append("\n서버: " + msg);
                int pos = this.getText().length();
                this.setCaretPosition(pos);
            }
        }
    }

    private void setupConnection() throws IOException {
        Socket socket = new Socket("localhost", 9999);
        receiver.append("서버와 연결되었습니다.");

        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
    }

    private static void handleError(String string) {
        System.out.println(string);
        System.exit(1);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sender) {
            try {
                String msg = sender.getText();
                out.write(msg + "\n");
                out.flush();

                receiver.append("\n클라이언트: " + msg);
                int pos = receiver.getText().length();
                receiver.setCaretPosition(pos);
                sender.setText(null);
            } catch (IOException e1) {
                handleError(e1.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new ChatClient();
    }
}