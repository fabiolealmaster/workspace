
public class ExemploEnum {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DiaSemana diaSemana = DiaSemana.QUARTA;
		
//		switch (diaSemana.ordinal() ) {
//			case 0: 
//				System.out.print("0 - Processa " + diaSemana.getDescricao() + "...");
//				break;
//			case 1: 
//				System.out.print("1 - Processa " + diaSemana.getDescricao() + "...");
//				break;
//			case 2: 
//				System.out.print("2 - Processa " + diaSemana.getDescricao() + "...");
//				break;
//			case 3: 
//				System.out.print("3 - Processa " + diaSemana.getDescricao() + "...");
//				break;
//			case 4: 
//				System.out.print("4 - Processa " + diaSemana.getDescricao() + "...");
//				break;
//			case 5: 
//				System.out.print("5 - Processa " + diaSemana.getDescricao() + "...");
//				break;
//			case 6: 
//				System.out.print("6 - Processa " + diaSemana.getDescricao() + "...");
//				break;
//			default:
//				System.out.print("Dia Inv�lido!!");
//				break;
//		}
		
		
//		if (diaSemana == DiaSemana.SEGUNDA) {
//			System.out.println("Processa " + diaSemana.getDescricao() + "...");
//		} else if (diaSemana == DiaSemana.TER�A) {
//			System.out.println("Processa " + diaSemana.getDescricao() + "...");
//		} else if (diaSemana == DiaSemana.QUARTA) {
//			System.out.println("Processa " + diaSemana.getDescricao() + "...");
//		} else if (diaSemana == DiaSemana.QUINTA) {
//			System.out.println("Processa " + diaSemana.getDescricao() + "...");
//		} else if (diaSemana == DiaSemana.SEXTA) {
//			System.out.println("Processa " + diaSemana.getDescricao() + "...");
//		} else if (diaSemana == DiaSemana.S�BADO) {
//			System.out.println("Processa " + diaSemana.getDescricao() + "...");
//		} else if (diaSemana == DiaSemana.DOMINGO) {
//			System.out.println("Processa " + diaSemana.getDescricao() + "...");
//		} else {
//			System.out.println("Dia Inv�lido!");
//		}
		
//		System.out.println();
//		System.out.println("------------------------------------");
//		System.out.println();
		
//		for( DiaSemana dia : DiaSemana.values() ) {
//			System.out.println(dia.ordinal() + " - " + dia.name() + " - " + dia.getDescricao());
//		}
		
		//int mes = 6;
		
		switch (diaSemana.ordinal()) {
		case 1:
			System.out.println("0 - Processa " + diaSemana.getDescricao() + "...");
			break;
		case 2:
			System.out.println("1 - Processa " + diaSemana.getDescricao() + "...");
			break;
		case 3:
			System.out.println("2 - Processa " + diaSemana.getDescricao() + "...");
			break;
		case 4:
			System.out.println("3 - Processa " + diaSemana.getDescricao() + "...");
			break;
		case 5:
			System.out.println("4 - Processa " + diaSemana.getDescricao() + "...");
			break;
		case 6:
			System.out.println("5 - Processa " + diaSemana.getDescricao() + "...");
			break;
		case 7:
			System.out.println("6 - Processa " + diaSemana.getDescricao() + "...");
			break;
		default:
			System.out.println("Dia Inv�lido!!!");
			break;
		}
		
		
		
		}
	}

