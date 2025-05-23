import java.util.Scanner;
import java.util.ArrayList;

public class Sistema{
	public static void main(String[] args){
		int i = 0;

		Scanner teclado = new Scanner(System.in);
		ArrayList<Pessoa> lst_Pessoas = new ArrayList<Pessoa>();

		System.out.print("Digite o nome da pessoa, caso deseje finalizar, envie vazio: ");
		String nome = teclado.nextLine();

		while(nome != ""){
			System.out.print("Digite a idade da pessoa: ");
			int idade = teclado.nextInt();

			System.out.print("Digite o número de celular da pessoa: ");
			String celularnum = teclado.nextLine();
			teclado.nextLine();

			System.out.print("Digite o email da pessoa: ");
			String email = teclado.nextLine();
			System.out.println();

			Pessoa pessoa = new Pessoa(nome, idade, celularnum, email);
			lst_Pessoas.add(pessoa);

			System.out.print("Digite o nome da pessoa, caso deseje finalizar, envie vazio: ");
			nome = teclado.nextLine();

		}
		System.out.println("------------Menu de Busca------------");
		System.out.print("Se deseja buscar por números de celular digite 1; se deseja buscar por emails digite 2; digite 3 para sair da busca: ");
		int proucurar = teclado.nextInt();
		teclado.nextLine();

		while(proucurar != 3){
		
				if(proucurar == 1){
						System.out.print("Digite o número de celular que quer proucurar, digite 3 para sair: ");
						String proucurarNum = teclado.nextLine();
						while(!proucurarNum.equals(lst_Pessoas.get(i).celularnum && i <= lst_Pessoas.size())){
							i = i+1;
						}

					if(existe){
						i = 0;
						while(!proucurarNum.equals(lst_Pessoas.get(i).celularnum)){
							i = i+1;
						}
						System.out.println(lst_Pessoas.get(i));
					}
					else{
						System.out.println("Não existe esse Número");
					}
	
				}
				else if(proucurar == 2){
					System.out.print("Digite o email que quer proucurar digite 3 para sair: ");
					String proucurarEmail = teclado.nextLine();
					boolean existe1 = lst_Pessoas.contains(proucurarEmail);
					if(existe1){
						while(proucurarEmail != lst_Pessoas.get(i).email){
							i = i+1;
						}
						System.out.println(lst_Pessoas.get(i));
					}
					else{
						System.out.println("Não existe esse email");
					}
				}

			System.out.println("------------Menu de Busca------------");
			System.out.print("Se deseja buscar por números de celular digite 1; se deseja buscar por emails digite 2; digite 3 para sair da busca: ");
			proucurar = teclado.nextInt();
		}



	}






}