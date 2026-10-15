package StructuralPatterns.CompositePattern;


import java.util.ArrayList;
import java.util.List;

class File{
    private String fileName;


    public File(String fileName) {
        this.fileName = fileName;
    }

    void Details(){
        System.out.println(fileName);
    }
}


class Folder{
    private String folderName;
  private List<File> files = new ArrayList<>();

    public Folder(String folderName) {
        this.folderName = folderName;
    }


    void addFile(File file){
        files.add(file);
    }
    void Details(){
        System.out.println(folderName);

        for(File file : files){
            file.Details();
        }
    }
}
public class WithoutCompositePattern {
    public static void main(String[] args) {
        Folder myFolder = new Folder("RP");
        File Day1 = new File("Day1.txt");
        File Day2 = new File("Day2.txt");

        myFolder.addFile(Day1);
        myFolder.addFile(Day2);

        myFolder.Details();
        //here you can addfiles but folder can have other folder too or
        //it can hold image too so if we have to make diff method withh diffname
        //now client have to know everything like client has to call all method diff
        //and know all method
        //which is wrong
    }
}
