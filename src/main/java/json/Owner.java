package json;

import java.io.Serializable;
import java.util.List;

public class Owner implements Serializable {
    private int id;
    private int rollNo;
    private String name;
    private List<Book> books;

    public Owner() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "json.Owner {" +
                "id=" + id +
                ", rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", " + books +
                '}';
    }
}
