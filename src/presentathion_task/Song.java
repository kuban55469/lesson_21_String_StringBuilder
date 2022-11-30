package presentathion_task;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Song {

    public void getReader(){
        try(FileReader fileReader = new FileReader("song.txt")) {
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (IOException e){
            System.err.println("НЕ удается найти указанный файл!!");
        }
    }
    public void getWriter()  {
        try (FileWriter fileWriter = new FileWriter("song.txt")) {
            fileWriter.write("Title: Nothing else matters\n");
            fileWriter.write("Author: Metallica\n");
            fileWriter.write(
                    """
                            So close, no matter how far
                            Couldn't be much more from the heart
                            Forever trusting who we are
                            And nothing else matters
                            Never opened myself this way
                            Life is ours, we live it our way
                            All these words I don't just say
                            And nothing else matters""".indent(8));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
