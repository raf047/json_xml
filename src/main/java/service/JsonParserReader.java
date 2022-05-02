package service;

import com.google.gson.*;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import model.Employee;


import java.io.*;
import java.util.Arrays;
import java.util.List;

public class JsonParserReader {

    public static void toJsonFromList(List<Employee> employees) throws IOException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter("src/main/resources/test.json")) {
            String jsonStr = gson.toJson(employees);
            writer.write(jsonStr);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Employee[] toListFromJson(String fileName) throws IOException {

        Gson gson = new Gson();

        try  {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            return gson.fromJson(reader, new TypeToken<Employee[]>(){}.getType());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
//        try  {
//            BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/test"));
//            Employee employee = gson.fromJson(reader, Employee.class);
//            System.out.println(employee);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }


}
