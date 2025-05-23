public class Pessoa{
	String nome;
	int idade;
	String celularnum;
	String email;

	public Pessoa(String nome, int idade, String celularnum, String email){
		this.nome = nome;
		this.idade = idade;
		this.celularnum = celularnum;
		this.email = email;
	}

	public String toString(){
		return "nome: " + nome + "\n" +
		"idade: " + idade + "\n" +
		"número de celular: " + celularnum + "\n" +
		"email: " + email + "\n";
	}
}