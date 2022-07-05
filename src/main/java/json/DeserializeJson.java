package json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.getProperty;

public class DeserializeJson {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Path filePath = situateJsonFile();
        Path file = findJsonFile(filePath);
        HomeworkJsonFile homeworkJsonFile = openJsonFile(file, objectMapper);
        modifiedJson(homeworkJsonFile, objectMapper);
        createModifiedJsonFile(filePath, homeworkJsonFile, objectMapper);
    }

    public static Path situateJsonFile() {
        String current = getProperty("user.dir");
        String separator = getProperty("file.separator");
        String resourcesFolder = "src" + separator + "main" + separator + "resources";
        Path filePath = Paths.get(current + separator + resourcesFolder + separator);
        return filePath;
    }

    public static Path findJsonFile(Path filePath) {
        String resourcesFile = "example2.json";
        Path file = Paths.get(String.valueOf(filePath), resourcesFile);
        return file;
    }

    public static HomeworkJsonFile openJsonFile(Path file, ObjectMapper objectMapper) throws IOException {
        HomeworkJsonFile homeworkJsonFile = objectMapper.readValue(file.toFile(), HomeworkJsonFile.class);
        System.out.println("Added JSON: \n" + homeworkJsonFile);
        return homeworkJsonFile;
    }

    public static void modifiedJson(HomeworkJsonFile homeworkJsonFile, ObjectMapper objectMapper) throws JsonProcessingException {
        homeworkJsonFile.setName("Learn something");
        homeworkJsonFile.setId(4);
        Owner owner = new Owner();
        owner.setRollNo(33);
        owner.setId(15);
        owner.setName("Anton");
        homeworkJsonFile.setOwner(owner);
        List<Book> books = new ArrayList<>();
        Book book1 = new Book();
        book1.setOwner(5);
        book1.setName("Learn");
        book1.setId(22);
        books.add(book1);
        Book book2 = new Book();
        book2.setOwner(53);
        book2.setName("Still learn");
        book2.setId(12);
        books.add(book2);
        Book book3 = new Book();
        book3.setOwner(53);
        book3.setName("Learn, work, work");
        book3.setId(12);
        books.add(book3);
        owner.setBooks(books);
        String modifiedJson = objectMapper.writeValueAsString(homeworkJsonFile);
        System.out.println("Modified JSON: \n" + modifiedJson);
    }

    public static void createModifiedJsonFile(Path filePath, HomeworkJsonFile homeworkJsonFile, ObjectMapper objectMapper) throws IOException {
        String newResourcesFile = "modExample2.json";
        Path modFile = Paths.get(String.valueOf(filePath), newResourcesFile);
        Files.createFile(modFile);
        String prettyF = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(homeworkJsonFile);
        Files.writeString(modFile, prettyF);
    }
}
