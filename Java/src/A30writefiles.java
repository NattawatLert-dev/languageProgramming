
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class A30writefiles {
    public static void main(String[] args) {
        
        // HOW to write a file using Java (4 popular options)

        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutoutStream = Best for binary files (e.g., image, audio files)

        //EX.1
        //String filePath = "C:\\Users\\HP\\Desktop\\test.txt";
        //String textCOntent = """
        //         Rose are Red 
        //         Violets are Blue
        //         """;

        try(FileWriter writer = new FileWriter("test.txt");){
            writer.write("I like pizza");
            System.out.println("File has been written");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
        catch(IOException e){
            System.out.println("Could not write file");
        }

    }
}
