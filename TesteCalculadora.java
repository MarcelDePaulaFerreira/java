import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("Informe o primeiro numero:");
		num1 = sc.nextInt();
		
		System.out.println("Informe o segundo número: ");
		num2 = sc.nextInt();
		
		Calculadora calc = new Calculadora(num1, num2);
		System.out.println("Soma dos numeros: " + calc.soma());
		System.out.println("Subtracao dos numeros: " + calc.subtracao());
		System.out.println("Multiplicacao dos numeros: " + calc.multiplicacao());
		System.out.println("Divisao dos numeros: " + calc.divisao());
	}

}
