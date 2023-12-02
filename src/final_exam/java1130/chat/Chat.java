package final_exam.java1130.chat;

public class Chat {
    public static void main(String[] args) {
        final int port = 9999;

        Thread serverThread = new Thread(() -> new ChatServer(port));
        serverThread.start();

        Thread clientThread = new Thread(() -> new ChatClient(port));
        clientThread.start();
    }
}
