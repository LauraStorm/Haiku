package data;
import haikuanalysis.HaikuPoem;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HaikuWriter {
    //responsibility to write haiku poem as a file to haikuPoems folder

    public void saveHaikuPoemToFile(HaikuPoem haikuPoem){
        try {
            File file = new File("haikuPoems/haiku.txt");         //Create a file
            FileWriter haikuWriter = new FileWriter(file,true);     //create a writer and save in file. True for at gemme flere
            haikuWriter.write(haikuPoem + "\n");                       //write to file
            haikuWriter.close();                                           //Finish with writing to file.

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
