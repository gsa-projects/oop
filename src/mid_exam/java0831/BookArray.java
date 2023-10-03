package mid_exam.java0831;

import java.util.Scanner;

class Book {
    String title, author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book(title=" + this.title + ", author=" + this.author + ")";
    }
}

public class BookArray {
    public static void main(String[] args) {
        Book books[] = new Book[2];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < books.length; i++) {
            System.out.print("제목: ");
            String title = scanner.nextLine();
            System.out.print("저자: ");
            String author = scanner.nextLine();

            books[i] = new Book(title, author);
        }

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
