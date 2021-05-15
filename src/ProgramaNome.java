//Como queremos utilizar o scanner para ler os dados que o usu�rio vai digitar e ele n�o � carregado por padr�o, precisamos IMPORTAR o Scanner para que nosso 
import java.util.Scanner;

//Esse programa deve receber o nome do usuario e exibir este nome com uma mensagem de boas vindas
public class ProgramaNome {

	public static void main(String[] args) {
		//A linha abaixo cria um leitor para ler o teclado do usuario
		Scanner leitor = new Scanner(System.in);
		
		//A linha abaixo cria uma vari�vel (espa�o na RAM) para guardar dados do tipo String(texto)
		String nome;
		
		System.out.println("Por favor, digite seu nome: ");
		//A linha abaixo pega o texto digitado pelo usu�rio e guarda na varia�vel "nome"
		nome = leitor.next();
		
		//Para lermos textos com espa�o podemos usar o nextline
		//nome=leitor.nextLine();
		
		//esse codigo l� um texto do teclado do usuario
		System.out.println("Que legal que seu nome �: " + nome);
		
		System.out.println(nome + ", fico feliz que voc� esteja usando o meu programa");
		
		//Ap�s terminarmos de usar o leitor, precisamos fechar
		leitor.close();
	}

}
