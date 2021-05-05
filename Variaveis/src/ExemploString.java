
public class ExemploString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = "James";
		String sobreNome = new String("Goslin");
		
		String nomeCompleto = nome + " " + sobreNome;
		System.out.println(nomeCompleto);
		
		System.out.println( String.valueOf(10.5) );
		
		String str = nomeCompleto.concat("Outro Sobrenome");
		System.out.println(str);
		
		System.out.println(str.length());
		System.out.println(str.substring(6, 12));
		System.out.println("   teste   ".length());
		
		str = "   teste   ";
		System.out.println(str);
		System.out.println(str.length());
		str = str.trim();
		System.out.println(str);
		System.out.println(str.length());
		
		str = str.replace("ste", "Replaced");
		System.out.println(str);
		System.out.println(str);
		
	}

}
