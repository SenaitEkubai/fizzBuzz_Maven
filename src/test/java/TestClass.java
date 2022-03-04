import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestClass {
    FizzBuzz fizzBuzzObject = new FizzBuzz();



    @Test
    @DisplayName("should print fizz ")
    public void testFizz(){
        assertEquals("fizz",fizzBuzzObject.fizzBuzz(3).toString() );
    }
    @Test
    @DisplayName("should print buzz ")
    public void testBuzz(){
        assertEquals("buzz",fizzBuzzObject.fizzBuzz(5).toString() );
    }

    @Test
    @DisplayName("should print fizzbuzz ")
    public void testFizzBuzz(){
        assertEquals("fizzBuzz",fizzBuzzObject.fizzBuzz(15).toString() );
    }


}
