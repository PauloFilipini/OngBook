package br.com.ong.domain;

public class Endereco {

	private int Id_Endere�o;
	private String Rua;
	private String Numero;
	private String Bairro;
	private String Cidade;
	private String Estado;
	private String Pais;
	private String Complemento;
	private String CEP;

	public int getId_Endere�o() {
		return Id_Endere�o;
	}

	public void setId_Endere�o(int id_Endere�o) {
		Id_Endere�o = id_Endere�o;
	}

	public String getRua() {
		return Rua;
	}

	public void setRua(String rua) {
		Rua = rua;
	}

	public String getNumero() {
		return Numero;
	}

	public void setNumero(String numero) {
		Numero = numero;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		Bairro = bairro;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getPais() {
		return Pais;
	}

	public void setPais(String pais) {
		Pais = pais;
	}

	public String getComplemento() {
		return Complemento;
	}

	public void setComplemento(String complemento) {
		Complemento = complemento;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

}
