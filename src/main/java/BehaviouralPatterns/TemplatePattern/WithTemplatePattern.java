
package BehaviouralPatterns.TemplatePattern;


// Abstract class = Template class
// It defines the common structure/skeleton of the algorithm.
abstract class Parser {

    // Template Method
    // It defines the FIXED ORDER in which the algorithm should execute.
    //
    // Every parser must:
    // 1. Open the file
    // 2. Parse the file
    // 3. Close the file
    //
    // The subclasses do not decide this order.
    // The parent class controls the algorithm.
    public void parse() {

        open();       // Common step
        parseFile();  // Variable step - implemented by subclasses
        close();      // Common step
    }


    // Common step
    // Every type of parser needs to open the file in the same way.
    //
    // private means subclasses cannot override/change this step.
    private void open() {
        System.out.println("Opening the file");
    }


    // Common step
    // Every type of parser needs to close the file in the same way.
    //
    // private means subclasses cannot override/change this step.
    private void close() {
        System.out.println("Closing the file");
    }


    // Variable/customizable step
    //
    // Different parsers parse files differently.
    // Therefore, the parent class says:
    // "Every parser MUST provide its own implementation of parseFile()."
    protected abstract void parseFile();
}


// Concrete class
// CSVFile IS-A Parser
class CSVFile extends Parser {

    // CSV-specific implementation
    @Override
    protected void parseFile() {
        System.out.println("Parsing the CSV file");
    }
}


// Concrete class
// JSONFile IS-A Parser
class JSONFile extends Parser {

    // JSON-specific implementation
    @Override
    protected void parseFile() {
        System.out.println("Parsing the JSON file");
    }
}


public class WithTemplatePattern {

    public static void main(String[] args) {

        // Polymorphism
        Parser json = new JSONFile();
        Parser csv = new CSVFile();


        // Both objects use the SAME template method.
        //
        // parse() always follows:
        //
        // open()
        //    ↓
        // parseFile()
        //    ↓
        // close()
        //
        // But parseFile() behaves differently depending
        // on the actual object.

        json.parse();

        // Output:
        // Opening the file
        // Parsing the JSON file
        // Closing the file


        csv.parse();

        // Output:
        // Opening the file
        // Parsing the CSV file
        // Closing the file
    }
}
