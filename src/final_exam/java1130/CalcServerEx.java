package final_exam.java1130;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

public class CalcServerEx {
    public static String calc(String expr) {
        StringTokenizer st = new StringTokenizer(expr, " ");

        if (st.countTokens() != 3) return "error: 개수";

        StringBuilder res = new StringBuilder("");

        int n1 = Integer.parseInt(st.nextToken());
        String op = st.nextToken();
        int n2 = Integer.parseInt(st.nextToken());

        switch (op) {
            case "+":
                res.append(n1 + n2);
                break;
            case "-":
                res.append(n1 - n2);
                break;
            case "*":
                res.append(n1 * n2);
                break;
            case "/":
                res.append(n1 / n2);
                break;
            case "^":
                int t = (int)(Math.pow(n1, n2));
                res.append(t);
                break;
            default:
                return "error: 연산자";
        }

        return res.toString();
    }

    public static void main(String[] args) {
        BufferedReader in = null;
        BufferedWriter out = null;
        ServerSocket listener = null;
        Socket socket = null;

        try {
            listener = new ServerSocket(9999);
            System.out.println("연결 대기 중...");

            socket = listener.accept();
            System.out.println("연결되었습니다.");

            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            while (true) {
                String inputMessage = in.readLine();

                if (inputMessage.equalsIgnoreCase("bye")) {
                    System.out.println("클라이언트가 연결을 종료하였습니다.");
                    break;
                }

                System.out.println(inputMessage);
                String res = calc(inputMessage);
                out.write(res + "\n");
                out.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (socket != null) socket.close();
                if (listener != null) listener.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
