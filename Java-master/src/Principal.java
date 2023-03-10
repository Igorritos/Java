import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vareáveis - tipo nome;
		
		Scanner entrada  = new Scanner(System.in);
		
		
		Boolean casado; //lógico true or false
		casado =true;
		//char x; // caracter um único caracter (numero, letra, dígito)
		//x = 'd';
		//numéricos: int (3 5 983) double (3.54 984.59) 
		double salario;
		//quantidade de filhos
		int qtdFilhos; //ocupa muito espaço na memória - para números grandes
		byte qtdFilhos2; // ocupa menos espaço na memória - números pequenos
		
		int r, x =1, y =0;
		r = x + y;
		System.out.println(x+y);
		
		final int MIN =1;
		r = x + y * MIN;
		String nome;
		System.out.println("Digite seu nome: ");
		nome = entrada.nextLine();
		System.out.println(nome);
	
		int idade;
		System.out.println("Digite sua idade: ");
		idade = entrada.nextInt();
		System.out.println(nome + "você tem " + idade + " anos.");
		
	}
}
