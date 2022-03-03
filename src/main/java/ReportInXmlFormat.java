import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.File;



public class ReportInXmlFormat {
    public static void addReportAndCreateXmlFile() {
       try{
           ObjectMapper mapper = new XmlMapper();
           mapper.writeValue(new File("src/result.xml"), new Results());
           System.out.println("Xml file successfully created ");
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
    }
}

class Results {
    public String fizz = String.valueOf(FizzBuzzInstances.num_fizz);
    public String buzz = String.valueOf(FizzBuzzInstances.num_buzz);
    public String fizzBuzz = String.valueOf(FizzBuzzInstances.num_fizzBuzz);
    public String other = String.valueOf(FizzBuzzInstances.other);
}