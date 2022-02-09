 import org.json.simple.JSONObject;

 import java.io.FileWriter;
 import java.io.IOException;

    public class FizzBuzzInstances {
        static JSONObject jsonObject = new JSONObject();

        public static void main(String[] args) throws IOException {
            fizzInstancesCounter(5,15);
        }

    public static void fizzInstancesCounter(int x, int y) throws IOException {
         int min = Math.min(x,y);
         int max = Math.max(x,y);
         int num_fizz=0;
         int num_buzz=0;
         int num_fizzBuzz=0;
         int other=0;


        while (min < max-1){
            min++;
        if(min % 3 ==0 && min % 5 ==0){
          num_fizzBuzz++;
        }
        else if(min % 3 ==0){
            num_fizz++;
        }

        else if(min % 5 ==0){
            num_buzz++;
        }
       else{
           other++;
        }
      }
            System.out.println("number of fizz= "+ num_fizz + ", number of buzz="+ num_buzz + ", number of fizzbuzz= "+ num_fizzBuzz + ", other= "+other);

            jsonObject.put("other", other);
            jsonObject.put("fizz",num_fizz);
            jsonObject.put("buzz", num_buzz);
            jsonObject.put("fizzbuzz",num_fizzBuzz);

        try {
            FileWriter file = new FileWriter("/Users/senaitekubai/Library/CloudStorage/OneDrive-Capgemini/intellijworkspace/Java-academy/java-fundamentals/fizzBuzz/src/output.json");
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("JSON file created: "+jsonObject);
    }

    }

