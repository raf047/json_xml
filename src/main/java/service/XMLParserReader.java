package service;

import model.Employee;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XMLParserReader {

    public static void toXml(Employee employee){
        JAXBContext jaxbContext =null;
        try {
            jaxbContext = JAXBContext.newInstance(Employee.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            marshaller.marshal(employee,new File("src/main/resources/employee.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static Employee fromXml(String fileName){
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return (Employee) unmarshaller.unmarshal(new File(fileName));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;

    }
}
