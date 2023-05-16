import java.util.Scanner;

public class Calculadora {
	private int x;
	private int y;
	
	public Calculadora() {
		
	}
	
	public Calculadora(int x, int y) {
		this.x = x;
		this.y = y;
		
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int soma() {
		return x+y;
	}
	
	public int subtracao() {
		return x-y;
	}
	public int multiplicacao() {
		return x*y;
	}
	public int divisao() {
		boolean achou = false;
		int resultado = 0;
		Scanner sc = new Scanner(System.in);
		while(!achou) {
			
		try{
			resultado = x/y;
			achou = true;
			
		}catch(ArithmeticException e) {
			
			System.out.println("Erro de divisão por zero! " + e.getMessage());
			System.out.println("Informe novamente o segundo numero");
			y = sc.nextInt();
			
			}
			

		}
		return resultado;
	}
	


	
}
 
