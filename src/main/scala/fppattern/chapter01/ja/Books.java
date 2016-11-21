package fppattern.chapter01.ja;

import java.util.List;

public class Books {
    private final String author;
    private final List<String> titles;

    public Books(String author, List<String> titles) {
        super();
        this.author = author;
        this.titles = titles;
    }

    public String getAuthor() {
        return author;
    }
    
    public List<String> getTitles() {
        return titles;
    }
}
