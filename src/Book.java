import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book {

    private String name, author;
    private List<String> text;

    public Book()
    {
        this.name = "Как написать курсач за лето";
        this.author = "Каримов Хамзат Таусович";
        this.text = Collections.singletonList("И жили они долго и счастливо.");
    }

    public Book(String name, String author, List<String> text)
    {
        this.name = name;
        this.author = author;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<String> getText() {
        return text;
    }

    public void setText(List<String> text) {
        this.text = text;
    }

    public String toString()
    {
        return "Book: {name: " + this.name + ", author: " + this.author + ", text: " + text.toString() + "}";
    }


}
