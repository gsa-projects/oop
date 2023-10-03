package mid_exam.java0828;

public class Book {
    String title;
    String author;

    public Book(String _title) {
        title = _title;
        author = "작자 미상";
    }

    public Book(String _title, String _author) {
        title = _title;
        author = _author;
    }

    @Override
    public String toString() {
        return title + ": " + author;
    }

    public static void main(String[] args) {
        Book littlePrince = new Book("어린왕자", "생텍쥐페리");
        Book loveStory = new Book("춘향전");

        System.out.println(littlePrince);
        System.out.println(loveStory);
    }
}
