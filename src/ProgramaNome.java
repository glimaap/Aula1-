import java.util.Scanner;

//Esse programa deve receber o nome do usuario e exibir este nome com uma mensagem de boas vindas
public class ProgramaNome {

	public static void main(String[] args) {
		//A linha abaixo cria um leitor para ler o teclado do usuario
		Scanner leitor = new Scanner(System.in);
		System.out.println("Por favor, digite seu nome: ");
		//esse codigo lê um texto do teclado do usuario
		System.out.println("Que legal que seu nome é: " + leitor.next());
	}

}
