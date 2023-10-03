package mid_exam.java0828;

public class BookUsingThis {
    String title;
    String author;

    public BookUsingThis(String title) {
        this.title = title;
        this.author = "작자 미상";
    }

    public BookUsingThis(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.author;
    }

    public static void main(String[] args) {
        BookUsingThis littlePrince = new BookUsingThis("어린왕자", "생텍쥐페리");
        BookUsingThis loveStory = new BookUsingThis("춘향전");

        System.out.println(littlePrince);
        System.out.println(loveStory);
    }
}
