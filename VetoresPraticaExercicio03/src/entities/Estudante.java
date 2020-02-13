package entities;

public class Estudante {
	
	private String nome;
	
	private String email;
	
	private byte quarto;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte getQuarto() {
		return quarto;
	}

	public void setQuarto(byte quarto) {
		this.quarto = quarto;
	}

	@Override
	public String toString() {
		return "Estudante [nome=" + nome + ", email=" + email + ", quarto=" + quarto + "]";
	}

}
