package br.com.ong.domain;

import java.sql.Date;

public class Ong {

	private int Id_Ong;
	private int Id_Login;
	private String Nome_Ong;
	private String Descricao_Ong;
	private int Id_Tipo_Ong;
	private int Id_Endereco;
	private String Data_Fundacao;
	private int Id_Status_Ong;
	private String Telefone_Ong;
	private String Email_Ong;

	public int getId_Ong() {
		return Id_Ong;
	}

	public void setId_Ong(int id_Ong) {
		Id_Ong = id_Ong;
	}

	public int getId_Login() {
		return Id_Login;
	}

	public void setId_Login(int id_Login) {
		Id_Login = id_Login;
	}

	public String getNome_Ong() {
		return Nome_Ong;
	}

	public void setNome_Ong(String nome_Ong) {
		Nome_Ong = nome_Ong;
	}

	public String getDescricao_Ong() {
		return Descricao_Ong;
	}

	public void setDescricao_Ong(String descricao_Ong) {
		Descricao_Ong = descricao_Ong;
	}

	public int getId_Tipo_Ong() {
		return Id_Tipo_Ong;
	}

	public void setId_Tipo_Ong(int id_Tipo_Ong) {
		Id_Tipo_Ong = id_Tipo_Ong;
	}

	public int getId_Endereco() {
		return Id_Endereco;
	}

	public void setId_Endereco(int id_Endereco) {
		Id_Endereco = id_Endereco;
	}

	public String getData_Fundacao() {
		return Data_Fundacao;
	}

	public void setData_Fundacao(String data_Fundacao) {
		Data_Fundacao = data_Fundacao;
	}

	public int getId_Status_Ong() {
		return Id_Status_Ong;
	}

	public void setId_Status_Ong(int id_Status_Ong) {
		Id_Status_Ong = id_Status_Ong;
	}

	public String getTelefone_Ong() {
		return Telefone_Ong;
	}

	public void setTelefone_Ong(String telefone_Ong) {
		Telefone_Ong = telefone_Ong;
	}

	public String getEmail_Ong() {
		return Email_Ong;
	}

	public void setEmail_Ong(String email_Ong) {
		Email_Ong = email_Ong;
	}

}
