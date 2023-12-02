package final_exam.java1130.chat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;

public class ChatClient extends JFrame {
    private BufferedReader in = null;
    private BufferedWriter out = null;
    private Socket socket = null;

    private JTextField entry;
    private Receiver area;

    public ChatClient(int port) {
        setTitle("클라이언트 채팅 창");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        entry = new JTextField();
        entry.addActionListener(new EntryAction());
        c.add(entry, BorderLayout.SOUTH);

        area = new Receiver();
        area.setEditable(false);
        c.add(new JScrollPane(area), BorderLayout.CENTER);

        setSize(400, 200);
        setVisible(true);

        try {
            socket = new Socket("localhost", port);
            area.append("클라이언트 연결 완료\n");

            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        } catch (IOException e) {
            System.out.println("초기화 중 오류 발생");
        }

        Thread th = new Thread(area);
        th.start();
    }

    class Receiver extends JTextArea implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    if (in != null) {
                        String recieve = in.readLine();
                        this.append("서버: " + recieve + "\n");
                    }
                } catch (IOException e) {
                    System.out.println("메시지 받다가 오류");
                    break;
                }
            }
        }
    }

    class EntryAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == entry) {
                String text = entry.getText();
                entry.setText("");

                try {
                    out.write(text + "\n");
                    out.flush();

                    area.append("클라이언트: " + text + "\n");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }
}
