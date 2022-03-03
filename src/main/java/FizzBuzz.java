
public class FizzBuzz {

    public static StringBuilder fizzBuzz(int num) {
        StringBuilder result = new StringBuilder();
        if (num % 15 == 0) {
            result.append("fizzBuzz");
        } else if (num % 3 == 0) {
            result.append("fizz");
        } else if (num % 5 == 0) {
            result.append("buzz");
        } else {
            result.append(num);
        }
        return result;
    }
}
