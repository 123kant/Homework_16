package xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.io.Serializable;

public class HomeworkXmlFile implements Serializable {
    @JacksonXmlProperty(isAttribute = true)
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "HomeworkXmlFile{" +
                "person=" + person +
                '}';
    }
}
