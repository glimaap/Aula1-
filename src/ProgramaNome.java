//Como queremos utilizar o scanner para ler os dados que o usuário vai digitar e ele não é carregado por padrão, precisamos IMPORTAR o Scanner para que nosso 
import java.util.Scanner;

//Esse programa deve receber o nome do usuario e exibir este nome com uma mensagem de boas vindas
public class ProgramaNome {

	public static void main(String[] args) {
		//A linha abaixo cria um leitor para ler o teclado do usuario
		Scanner leitor = new Scanner(System.in);
		
		//A linha abaixo cria uma variável (espaço na RAM) para guardar dados do tipo String(texto)
		String nome;
		
		System.out.println("Por favor, digite seu nome: ");
		//A linha abaixo pega o texto digitado pelo usuário e guarda na variaável "nome"
		nome = leitor.next();
		
		//Para lermos textos com espaço podemos usar o nextline
		//nome=leitor.nextLine();
		
		//esse codigo lê um texto do teclado do usuario
		System.out.println("Que legal que seu nome é: " + nome);
		
		System.out.println(nome + ", fico feliz que você esteja usando o meu programa");
		
		//Após terminarmos de usar o leitor, precisamos fechar
		leitor.close();
	}

}
