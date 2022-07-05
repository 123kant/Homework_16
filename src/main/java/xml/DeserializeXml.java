package xml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.lang.System.getProperty;

public class DeserializeXml {
    public static void main(String[] args) throws IOException {
        String current = getProperty("user.dir");
        String separator = getProperty("file.separator");
        String resourcesFolder = "src" + separator + "main" + separator + "resources";
        Path filePath = Paths.get(current + separator + resourcesFolder + separator);
        String resourcesFile = "HometaskXML.xml";
        Path file = Paths.get(String.valueOf(filePath), resourcesFile);
        String xmlToJava = new String(Files.readAllBytes(file));

        XmlMapper xmlMapper = new XmlMapper();
        HomeworkXmlFile value = xmlMapper.readValue(xmlToJava, HomeworkXmlFile.class);
        System.out.println(value.toString());
    }
}
