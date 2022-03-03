import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;


public class ReportInJsonFormat {
  /*public static void main(String[] args){
       // addReportAndCreateJsonFile();
      addReportAndCreateJsonFile( FizzBuzzInstances.fizzInstancesCounter(0,16));

    }


*/

   public static JSONObject addReportAndCreateJsonFile(HashMap instances) {
     JSONObject result = new JSONObject();

       try{
           instances.forEach((key, value) -> result.put(key,value));

            FileWriter file = new FileWriter("src/result.json");
            file.write(String.valueOf(result));
            file.close();
            System.out.println("JSON file created successfully: ");
        }catch (Exception e){
          e.getStackTrace();
        }
        return result;
    }
}
