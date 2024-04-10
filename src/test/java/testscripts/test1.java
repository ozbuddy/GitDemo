package testscripts;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class test1 {
	public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            // Read JSON file and map it to the Person POJO
          //        	Person person = mapper.readValue(new File("PurchaseOrder.json"), Person.class);
//        	File file = new File("PurchaseOrder.json");
Person person= mapper.readValue(new File(System.getProperty("user.dir") + "//PurchaseOrder.json"), Person.class);
            // Print the mapped POJO
            System.out.println(person.getEmail());
            System.out.println(person.getPassword());
            System.out.println(person.getProduct());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
