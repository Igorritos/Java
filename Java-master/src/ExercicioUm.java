import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Crie uma classe chamada ExercicioUm com o método main que declare e
		 * atribua três variáveis, uma com o seu 'nome', outra com o seu 'sobrenome' 
		 * e outra com a sua 'idade'. Então, declare uma variável com
		 * nome resultado que una suas variáveis da seguinte forma: “Horácio Augusto da
		 * Silveira tem 30 anos“.           * Utilize o System.out pra mostrar o que
		 * acontece e respeite os espaços!
		 */
		Scanner entrada = new Scanner (System.in);
	
	
		String nome;
		System.out.println("Digite seu nome: ");
		nome = entrada.nextLine();
	
		
		String sobrenome;
		System.out.println("Digite seu sobrenome: ");
		sobrenome = entrada.nextLine();

		
		int idade;
		System.out.println("Digite sua idade: ");
		idade = entrada.nextInt();
		System.out.println(nome + " " + sobrenome + " você tem " + idade + " anos.");

		
		
	
	
	}

}
