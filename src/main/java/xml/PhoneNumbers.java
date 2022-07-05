package xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.io.Serializable;
import java.util.Arrays;

public class PhoneNumbers implements Serializable {
    @JacksonXmlElementWrapper(useWrapping = false)
    private PhoneNumbers[] phoneNumbers;

    public PhoneNumbers[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(PhoneNumbers[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "PhoneNumbers{" +
                "phoneNumbers=" + Arrays.toString(phoneNumbers) +
                '}';
    }
}
