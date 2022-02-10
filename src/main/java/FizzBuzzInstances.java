
public class FizzBuzzInstances {

    static int num_fizz = 0;
    static int num_buzz = 0;
    static int num_fizzBuzz = 0;
    static int other = 0;

    public static void main(String[] args) {
       // fizzInstancesCounter(0, 15);
    }

    public static void fizzInstancesCounter(int x, int y) {
        int min = Math.min(x, y);
        int max = Math.max(x, y);

        while (min < max - 1) {
            min++;
            if (min % 3 == 0 && min % 5 == 0) {
                num_fizzBuzz++;
            } else if (min % 3 == 0) {
                num_fizz++;
            } else if (min % 5 == 0) {
                num_buzz++;
            } else {
                other++;
            }
        }
        System.out.println(
                "number of fizz= " + num_fizz + ", number of buzz=" + num_buzz + ", number of fizzbuzz= " + num_fizzBuzz
                        + ", other= " + other);
    }
    /*
    public static void addReportAndCreateJsonFile() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("other", other);
        jsonObject.put("fizz", num_fizz);
        jsonObject.put("buzz", num_buzz);
        jsonObject.put("fizzbuzz", num_fizzBuzz);
        try {
            FileWriter file = new FileWriter("src/result.json");
            file.write(String.valueOf(jsonObject));
            file.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("JSON file created: " + jsonObject);
    }

*/

}