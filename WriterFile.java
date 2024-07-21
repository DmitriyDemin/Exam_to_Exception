package Exam_to_Eception;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterFile {

    public String fileName;

    public WriterFile(String name) {
        this.fileName = name;
    }

    public void writeDataOfUserToFile(String data){
        try {
            Writer writer = new FileWriter(fileName, true);
            writer.write(data);
            writer.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }


    }


}
