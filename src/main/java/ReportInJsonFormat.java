import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class ReportInJsonFormat {
    public static void main(String[] args) {
        FizzBuzzInstances.fizzInstancesCounter(1, 25);
        addReportAndCreateJsonFile();
    }

    public static void addReportAndCreateJsonFile() {
        JSONObject result = new JSONObject();
        result.put("other", FizzBuzzInstances.other);
        result.put("fizz", FizzBuzzInstances.num_fizz);
        result.put("buzz", FizzBuzzInstances.num_buzz);
        result.put("fizzbuzz", FizzBuzzInstances.num_fizzBuzz);
        try {
            FileWriter file = new FileWriter("src/result.json");
            file.write(String.valueOf(result));
            file.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("JSON file created successfully: " + result);
    }
}
