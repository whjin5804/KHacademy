import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exception02 {
	public static void main(String[] args) throws IOException {
		Path file = Paths.get("C:\\java\\simple.txt"); 
		BufferedWriter bw = Files.newBufferedWriter(file); 
	}
}
