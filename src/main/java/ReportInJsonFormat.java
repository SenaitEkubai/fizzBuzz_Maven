import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class ReportInJsonFormat {
    public static void main(String[] args) {
        FizzBuzzInstances.fizzInstancesCounter(1,25);
        addReportAndCreateJsonFile();
    }
    public static void addReportAndCreateJsonFile() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("other", FizzBuzzInstances.other);
        jsonObject.put("fizz", FizzBuzzInstances.num_fizz);
        jsonObject.put("buzz", FizzBuzzInstances.num_buzz);
        jsonObject.put("fizzbuzz", FizzBuzzInstances.num_fizzBuzz);
        try {
            FileWriter file = new FileWriter("src/result.json");
            file.write(String.valueOf(jsonObject));
            file.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("JSON file created: " + jsonObject);
    }
}
