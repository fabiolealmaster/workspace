import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			String arquivo = "exemplo-filesystem.txt";
			
			BufferedReader reader = new BufferedReader(new FileReader(arquivo));
			String linha;
			while( (linha = reader.readLine()) != null) {
				System.out.println( linha );
			}
			
			reader.close();
			
	}

}
