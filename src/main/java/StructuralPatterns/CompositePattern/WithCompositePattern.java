package StructuralPatterns.CompositePattern;

import java.util.ArrayList;
import java.util.List;


interface FolderComponents{
    void displayDetails();

}
class File1 implements FolderComponents{
    private String fileName;


    public File1(String fileName) {
        this.fileName = fileName;
    }

   public void displayDetails(){
        System.out.println(fileName);
    }
}


class Folder1 implements FolderComponents{
    private String folderName;
    private List<FolderComponents> components = new ArrayList<>();

    public Folder1(String folderName) {
        this.folderName = folderName;
    }


    void addComponent(FolderComponents c){
        components.add(c);
    }
    public void displayDetails(){
        System.out.println(folderName);

        for(FolderComponents component : components){
            //recursion here but method is used in diffrent way
            //it using olymorphim run time
            component.displayDetails();
        }
    }
}

class Image implements FolderComponents{
    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }
    public void displayDetails(){
        System.out.println(imageName);
    }

}
public class WithCompositePattern {
    public static void main(String[] args) {
         Folder1 myFolder = new Folder1("MainFolder");

         FolderComponents file1 = new File1("file1.txt");
        FolderComponents file2 = new File1("file2.txt");

  myFolder.addComponent(file1);
        myFolder.addComponent(file2);
        //Folder cuz we will store aother compionnets in too
        Folder1 imageFolder = new Folder1("MyImages");

        FolderComponents image1 = new Image("RP.jpeg");

        imageFolder.addComponent(image1);


        //its accepting imageFolder cuz its implementing FolderCompnent so it represt this too
        myFolder.addComponent(imageFolder);
   myFolder.displayDetails();


    }
}
