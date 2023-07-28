package FileIO;
import java.io.*;
import java.util.Scanner;


public class FileReader {
    public static void read(){
        try{
            File poem = new File("/Users/pnt03/IdeaProjects/Inheritance/src/FileIO/Poem");
            Scanner scanner = new Scanner(poem);
            while (scanner.hasNextLine()){
                String data = scanner.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void write(){
        try {
            FileWriter writer = new FileWriter("/Users/pnt03/IdeaProjects/Inheritance/src/FileIO/Poem");
            writer.write("Hey, Hello how are you doing?");
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



