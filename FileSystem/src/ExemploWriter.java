import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class ExemploWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			String arquivo = "exemplo-filesystem.txt";
			
			Writer write = new PrintWriter( arquivo );
			for( int i = 0; i < 10; i++) {
				write.write("Linha = " + i + "\n");
			}
			
			write.flush();
			write.close();
			
	}

}
