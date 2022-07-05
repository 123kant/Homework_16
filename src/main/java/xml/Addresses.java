package xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.io.Serializable;
import java.util.Arrays;

public class Addresses implements Serializable  {
    @JacksonXmlElementWrapper(useWrapping = false)
    private Address[] address;

    public Address[] getAddress() {
        return address;
    }

    public void setAddress(Address[] address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Addresses{" +
                "address=" + Arrays.toString(address) +
                '}';
    }
}
