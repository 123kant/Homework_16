package json;

import java.io.Serializable;

public class HomeworkJsonFile implements Serializable {
    private int id;
    private String name;
    private Owner owner;

    public HomeworkJsonFile() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "json.HomeworkJsonFile {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", " + owner +
                '}';
    }
}
