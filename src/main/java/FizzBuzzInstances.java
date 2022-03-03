import java.util.HashMap;

public class FizzBuzzInstances {
    static int num_fizz = 0;
    static int num_buzz = 0;
    static int num_fizzBuzz = 0;
    static int other = 0;

    public static HashMap fizzInstancesCounter(int x, int y) {

        HashMap<String,Integer> result = new HashMap<>();
        int min = Math.min(x, y);
        int max = Math.max(x, y);
        
        while (min < max - 1) {
            min++;
            if (min % 15 == 0) {
                num_fizzBuzz++;
                result.put("fizzBuzz", num_fizzBuzz);
            } else if (min % 3 == 0) {
                num_fizz++;
                result.put("fizz", num_fizz);

            } else if (min % 5 == 0) {
                num_buzz++;
                result.put("buzz", num_buzz);
            } else {
                other++;
                result.put("other", other);

            }
        }
        return result;
    }


}