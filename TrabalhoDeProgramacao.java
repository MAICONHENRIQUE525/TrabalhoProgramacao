package br.edu.trabalhoDeProgramacao.main;

import java.util.Scanner;

public class TrabalhoDeProgramacao{

	public static void main(String[] args){
		
		int opcao;
		float base,base1, altura;
	    java.util.Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("============================================================================\n");
			System.out.println("EScolha uma das opçoes do menu abaixo, digitando o numero correspondente:"+"\n");
			System.out.println("                       # Menu de poligonos #                       \n");
			System.out.println("                          1 - Triângulo");
		    System.out.println("                          2 - Quadrado ");
		    System.out.println("                          3 - Paralelogramo");
		    System.out.println("                          4 - Trapézio ");
		    System.out.println("                          9 - Sair     \n");
		    opcao = input.nextInt();
		
		switch(opcao){
		case 1:
	    	System.out.println("Você escolheu triângulo, para calcular sua area, insiras as medidas exigidas: \n");
	    	System.out.println("Digite a medida da base do triângulo: ");
	    	base = input.nextFloat();
	    	System.out.println("Digite a medida da altura do triângulo: ");
	    	altura = input.nextFloat();
	    	System.out.println("A area do triângulo é " + base * altura / 2 + "\n");break;	
	    
	    case 2:
	    	System.out.println("Você escolheu quadrado, para calcular sua area, insiras as medidas exigidas: \n");
	    	System.out.println("Digite a medida da base do quadrado: ");
	    	base = input.nextFloat();
	    	System.out.println("A area do quadrado é: " + base * base + "\n");break;
	    	
	    
	    case 3:
	    	System.out.println("Você escolheu paralelogramo, para calcular sua area, insiras as medidas exigidas: \n");
	    	System.out.println("Digite a medida da base da base do paralelogramo : ");
	    	base = input.nextFloat();
	    	System.out.println("Digite a medida da altura do paralelogramo : ");
	    	altura = input.nextFloat();
	    	System.out.println("A area do paralelogramo é: " + base * altura + "\n");break;
	    
	    case 4:
	    	System.out.println("Você escolheu trapézio, para calcular sua area, insiras as medidas exigidas: \n");
	    	System.out.println("Digite a medida da base maior do trapézio: ");
	    	base = input.nextFloat();
	    	System.out.println("Digite a medida da base menor do trapézio: ");
	    	base1 = input.nextFloat();
	    	System.out.println("Digite a medida da altura do trapézio: ");
	    	altura = input.nextFloat();
	    	
	    	System.out.println("A area do trapézio é: " +((base1 + base) * altura) / 2 + "\n" );break;
		    
	    case 9:
	    	System.exit(9);
	    	break ;
	    	
		default: 
			System.out.print("Opção invalida! \n");
			break;
	   }
		
	 }while(opcao != 9);
		input.close();
   }

}
