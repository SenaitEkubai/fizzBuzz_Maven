public class FizzBuzz {
    public static void main(String[] args) {
fizzBuzz(15);
fizzBuzz(3);
fizzBuzz(5);
fizzBuzz(17);
    }
    public static String fizzBuzz(int num){
        if(num % 3 ==0 && num % 5 ==0){
            System.out.println("FIZZBUZZ");
            return "FIZZBUZZ";
        }
        else if(num % 3 ==0 ){
            System.out.println("FIZZ");
            return  "FIZZ";
        }
        else if (num % 5 ==0){
            System.out.println("BUZZ");
            return  "BUZZ";
        }
        else {
            System.out.println(num);
            return ""+num;
        }
    }
}
