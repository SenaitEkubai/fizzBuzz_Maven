    /*
    *GIVEN an input of two numbers
    WHEN the program is run
    THEN report the number of fizz, buzz and fizzbuzz instances found between those two numbers
    * */

    import java.util.ArrayList;

    public class FizzBuzzInstances {
        static ArrayList<Integer>  fizzs =new ArrayList();
        static ArrayList<Integer>  buzzs =new ArrayList();
        static ArrayList<Integer>  fizzBuzzs =new ArrayList();
        static ArrayList<Integer>  others =new ArrayList();

        public static void main(String[] args) {
            fizzInstancesCounter(5,15);
        }

    public static void fizzInstancesCounter(int x, int y){
         int min = Math.min(x,y);
         int max = Math.max(x,y);
         int num_fizz=0;
         int num_buzz=0;
         int num_fizzBuzz=0;
         int other=0;

        while (min < max-1){
            min++;
        if(min % 3 ==0 && min % 5 ==0){
            fizzBuzzs.add(min);
          num_fizzBuzz++;
        }
        else if(min % 3 ==0){
            fizzs.add(min);
            num_fizz++;
        }

        else if(min % 5 ==0){
            buzzs.add(min);
            num_buzz++;
        }
       else{
           others.add(min);
           other++;
        }
      }
            System.out.println("number of fizz= "+ num_fizz + ", number of buzz="+ num_buzz + ", number of fizzbuzz= "+ num_fizzBuzz + ", other= "+other);
            System.out.println("fizzs= " + fizzs + " buzzs= "+ buzzs+" fizzBuzzs= "+ fizzBuzzs + "other= "+ others);

        }
    }
