package dofile;

import java.io.*;

public class FileTest {

    public static void main(String...args){
        File file = new File("src/filetest.txt");
        Long fileLength = file.length();
        byte[] filecontent = new byte[fileLength.intValue()];
        try {
            FileInputStream in = new FileInputStream (file);
            in.read(filecontent,0,fileLength.intValue());
            System.out.print(new String(filecontent, "UTF-8"));
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
