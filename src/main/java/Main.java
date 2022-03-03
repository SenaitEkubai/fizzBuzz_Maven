import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("number is " + FizzBuzz.fizzBuzz(3));
        HashMap instances = FizzBuzzInstances.fizzInstancesCounter(0, 25);
        System.out.println("number of instances" + instances);
        ReportInJsonFormat.addReportAndCreateJsonFile(instances);
        ReportInXmlFormat.addReportAndCreateXmlFile();
    }
}
