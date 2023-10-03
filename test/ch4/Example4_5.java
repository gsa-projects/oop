package ch4;

class Book {
    String title;
    String author;

    void show() {
        System.out.println(title + " " + author);
    }

    public Book() {
        this("", "");
        System.out.println("인자 0개 생성자 호출");
    }

    public Book(String title) {
        this(title, "");
        System.out.println("인자 1개 생성자 호출");
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        System.out.println("인자 2개 생성자 호출");
    }
}

public class Example4_5 {
    public static void main(String[] args) {
        Book littlePrince = new Book("어린왕자", "생텍쥐페리");
        Book loveStory = new Book("춘향전");
        Book emptyBook = new Book();

        littlePrince.show();
        loveStory.show();
        emptyBook.show();
    }
}
