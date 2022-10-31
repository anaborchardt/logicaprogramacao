package java1;
import java.util.Scanner;
public class aula1 {
	
	public static void main(String[]args) {
		Scanner entrada=new Scanner(System.in);
		
		 int numero=0, maior=0, menor=0;

		 System.out.print("Digite um valor:\n");
		 numero=entrada.nextInt();
		       
		 if(numero>maior)

		           maior = numero;

		       if(numero<menor && numero!=0)

		           menor = numero;

		   System.out.print("O maior número é: " +maior); //maior resultado

		   System.out.print("O maior número é: " +menor); //menor resultado


	}

}
