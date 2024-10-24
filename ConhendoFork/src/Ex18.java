/*Cálculo de Média com Condição: Leia 5 notas de alunos e calcule a média, 
informando se o aluno foi aprovado (média >= 7) ou reprovado.
*/
import java.util.Scanner;
public class Ex18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite a 1º nota: ");
		double nota1 = scanner.nextDouble();
		
		System.out.println("Digite a 2º nota: ");
		double nota2 = scanner.nextDouble();
		
		System.out.println("Digite a 3º nota: ");
		double nota3 = scanner.nextDouble();
		
		System.out.println("Digite a 4º nota: ");
		double nota4 = scanner.nextDouble();
		
		System.out.println("Digite a 5º nota: ");
		double nota5 = scanner.nextDouble();
		
		double media = nota1 + nota2 + nota3 + nota4 + nota5;
		
		if (media >= 7) {
			System.out.print("Com a nota " + media + " voce está aprovado");
		}
		else {
			System.out.print("Com a nota " + media + " voce está reprovado");
		}

	}

}
