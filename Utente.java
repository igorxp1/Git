package pacote;

import java.util.Date;

public class Utente implements Pessoa {

	private Date dataNascimento;
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
@Override
	public void verIdade() {
		System.out.println(this.getDataNascimento().compareTo(new Date()));
		
	}
}
