package br.edu.trabalhoDeProgramacao.main;

import java.util.Scanner;

public class TrabalhoDeProgramacao{

	public static void main(String[] args){
		
		int opcao;
		float base,base1, altura;
	    java.util.Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("============================================================================\n");
			System.out.println("EScolha uma das op�oes do menu abaixo, digitando o numero correspondente:"+"\n");
			System.out.println("                       # Menu de poligonos #                       \n");
			System.out.println("                          1 - Tri�ngulo");
		    System.out.println("                          2 - Quadrado ");
		    System.out.println("                          3 - Paralelogramo");
		    System.out.println("                          4 - Trap�zio ");
		    System.out.println("                          9 - Sair     \n");
		    opcao = input.nextInt();
		
		switch(opcao){
		case 1:
	    	System.out.println("Voc� escolheu tri�ngulo, para calcular sua area, insiras as medidas exigidas: \n");
	    	System.out.println("Digite a medida da base do tri�ngulo: ");
	    	base = input.nextFloat();
	    	System.out.println("Digite a medida da altura do tri�ngulo: ");
	    	altura = input.nextFloat();
	    	System.out.println("A area do tri�ngulo � " + base * altura / 2 + "\n");break;	
	    
	    case 2:
	    	System.out.println("Voc� escolheu quadrado, para calcular sua area, insiras as medidas exigidas: \n");
	    	System.out.println("Digite a medida da base do quadrado: ");
	    	base = input.nextFloat();
	    	System.out.println("A area do quadrado �: " + base * base + "\n");break;
	    	
	    
	    case 3:
	    	System.out.println("Voc� escolheu paralelogramo, para calcular sua area, insiras as medidas exigidas: \n");
	    	System.out.println("Digite a medida da base da base do paralelogramo : ");
	    	base = input.nextFloat();
	    	System.out.println("Digite a medida da altura do paralelogramo : ");
	    	altura = input.nextFloat();
	    	System.out.println("A area do paralelogramo �: " + base * altura + "\n");break;
	    
	    case 4:
	    	System.out.println("Voc� escolheu trap�zio, para calcular sua area, insiras as medidas exigidas: \n");
	    	System.out.println("Digite a medida da base maior do trap�zio: ");
	    	base = input.nextFloat();
	    	System.out.println("Digite a medida da base menor do trap�zio: ");
	    	base1 = input.nextFloat();
	    	System.out.println("Digite a medida da altura do trap�zio: ");
	    	altura = input.nextFloat();
	    	
	    	System.out.println("A area do trap�zio �: " +((base1 + base) * altura) / 2 + "\n" );break;
		    
	    case 9:
	    	System.exit(9);
	    	break ;
	    	
		default: 
			System.out.print("Op��o invalida! \n");
			break;
	   }
		
	 }while(opcao != 9);
		input.close();
   }

}
