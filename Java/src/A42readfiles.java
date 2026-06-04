
import java.io.BufferedReader;
import java.io.FileReader;

public class A42readfiles {
    public static void main(String[] args) {
        
        // HOW to read a file using Java (3 popular options)

        // BufferedReader + FileReader: Best for reading text files line-by-line
        // FileInputStream: Best for binary files (e.g., image, audio files)
        // RandomAccessFile: Beat for read/write specific portions of a large file

        //String filePath = = "C:\\Users\\HP\\Desktop\\test.txt";
        
        try(BufferedReader reader = new BufferedReader(new FileReader("text.txt"))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } 
        catch (Exception e) {

        }
    }
}
