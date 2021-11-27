package medipol.ileri.java.ders.iki;

import java.io.File;
import java.io.IOException;

public class CreateFileExample1 {
    public static void main(String[] args) {
        new CreateFileExample1();
        System.out.println();
    }

    public CreateFileExample1() {
        String path = "C:\\demo\\";
        File filePath = new File(path);
        //filePath.mkdirs();
        File file = new File(path + "music.txt"); //initialize File object and passing path as argument
        boolean result;
        try {
            result = file.createNewFile();  //creates a new file
            if (result)      // test if successfully created a new file
            {
                System.out.println("CreateFileExample1:file created " + file.getCanonicalPath()); //returns the path string
            } else {
                System.out.println("File already exist at location: " + file.getCanonicalPath());
            }
        } catch (IOException e) {
            e.printStackTrace();    //prints exception if any
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("System out");

        System.err.println("System err");
    }
}