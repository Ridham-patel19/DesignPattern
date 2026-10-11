package BehaviouralPatterns.TemplatePattern;

class CSVParser{
    public void parse(){
        open();
        parseCSV();
        close();
    }

    private void open(){
        System.out.println("Openning the file");
    }

    private void close(){
        System.out.println("closing the file");
    }

    private void parseCSV(){
        System.out.println("Parsing the CSV");
    }
}

class JSONParser{
    public void parse(){
        open();
        parseJSON();
        close();
    }

    private void open(){
        System.out.println("Openning the file");
    }

    private void close(){
        System.out.println("closing the file");
    }

    private void parseJSON(){
        System.out.println("Parsing the JSON");
    }
}





public class WithoutTemplatePattern {

    public static void main(String[] args) {
        CSVParser csv = new CSVParser();
        JSONParser json = new JSONParser();

        csv.parse();
        json.parse();
    }
}

// here we are making file parsing an dthere could be many types of file so we ahve to
//make that parsers now you can see that open and close file code is going to be same for all but
//still we are writing here code many times which is duplication and also lets say in future we have to chnage the
//logic of a open close file then we have to touch all classes also lets say sometime in duplication we can forget
//any steps may be we can forget the open or close so this wrong pattern
