import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double valor1;
		double valor2;
		int operacao;
		double resultado;
		System.out.print("Escolha o primeiro valor      ");
		valor1=entrada.nextDouble();
		System.out.print("Escolha o segundo valor");
		valor2=entrada.nextDouble();
		 System.out.println("Escolha a operação:");
		 System.out.println("1 - Adição");
		 
		 System.out.println("2 - Subtração");
		 System.out.println("3 - Multiplicação");
		 System.out.println("4 - Divisão");
		 operacao=entrada.nextInt();
		 resultado=0;
		 switch (operacao){
		 case 1:
			 resultado= valor1 + valor2;
			 System.out.println(valor1 + " + " + valor2 + " = " + resultado);
             break;
		 case 2:
             resultado = valor1 - valor2;
             System.out.println(valor1 + " - " + valor2 + " = " + resultado);
             break;
             case 3:
                 resultado = valor1 * valor2;
                 System.out.println(valor1 + " * " + valor2 + " = " + resultado);
                 break;
             case 4:
                 if (valor2 != 0) {
                     resultado = valor1 / valor2;
                     System.out.println(valor1 + " / " + valor2 + " = " + resultado);
                 } else {
                     System.out.println("Não é possível dividir por zero.");
                 }
                 break;
             default:
                 System.out.println("Opção inválida.");}
		 
		// TODO Auto-generated method stub

	}

}
