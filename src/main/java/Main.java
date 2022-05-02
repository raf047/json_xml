import model.Address;
import model.Employee;
import model.PhoneNumber;
import service.JsonParserReader;
import service.XMLParserReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

//        PhoneNumber phoneNumber1 = new PhoneNumber("123456789", "HOME");
//        PhoneNumber phoneNumber2 = new PhoneNumber("123476789", "HOME");
//        Address address1 = new Address("Yerevan", "AM", "Khachatryan", 4747);
//        Address address2 = new Address("Yeghvard", "AM", "Sevak", 4747);
//
//        ArrayList<PhoneNumber> phoneNumbers = new ArrayList<>();
//        phoneNumbers.add(phoneNumber1);
//        phoneNumbers.add(phoneNumber2);
//
//        Employee employee1 = new Employee("Dan", "Hamilton", 47, address1, phoneNumbers);
//        Employee employee2 = new Employee("Ban", "Hamilton", 11, address2, phoneNumbers);
//        List<Employee> employees = Arrays.asList(employee1, employee2);


//        JsonParserReader.toJsonFromList(employees);


//        System.out.println(Arrays.toString(JsonParserReader.toListFromJson("src/main/resources/test.json")));


//        XMLParserReader.toXml(employee1);


        System.out.println(XMLParserReader.fromXml("src/main/resources/employee.xml"));




    }
}
