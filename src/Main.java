import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello, World!");
		Formulas calcular = new Formulas();
		System.out.println("Qual formula deseja calcular?");
		System.out.println("1. Soma");
		System.out.println("2. Subtracao");
		System.out.println("3. Aceleracao media");
		System.out.println("4. Potencia (Lei de Ohm)");
		System.out.println("5. Sair");
		
		int resposta = scanner.nextInt();
		
		if(resposta == 1) {
			System.out.println("Insira o primeiro valor.");
			int a = scanner.nextInt();
			System.out.println("Insira outro valor");
			int b = scanner.nextInt();
			System.out.println("Valor da soma: " + calcular.sum(a, b));
		} else if(resposta == 2){
			System.out.println("Insira o primeiro valor.");
			int a = scanner.nextInt();
			System.out.println("Insira outro valor");
			int b = scanner.nextInt();
			System.out.println("Valor da subtracao: " + calcular.sub(a, b));
		} else if(resposta == 3) {
			System.out.println("Insira o delta v");
			int v = scanner.nextInt();
			System.out.println("Insira o delta t");
			int t = scanner.nextInt();
			System.out.println("Valor final: " + calcular.aem(v, t));
		} else if(resposta == 4) {
			System.out.println("Insira o r");
			int r = scanner.nextInt();
			System.out.println("Insira o i");
			int i = scanner.nextInt();
			System.out.println("Valor final: " + calcular.ohm(r, i));
		} else {
			System.exit(0);
		}

	}

}
