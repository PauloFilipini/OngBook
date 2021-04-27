package br.com.ong.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

import br.com.ong.domain.Login;
import br.com.ong.domain.Ong;
import br.com.ong.domain.TipoOng;
import br.com.ong.factory.ConexaoFactory;

public class OngDAO {
	
	public void salvar(Ong ong) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO ONG ");
		sql.append("(ID_ONG, ID_LOGIN, NOME_ONG, DESCRICAO_ONG, ID_TIPO_ONG, ID_ENDERECO, DATA_FUNDACAO, ID_STATUS_ONG, TELEFONE_ONG, EMAIL_ONG) ");
		sql.append("VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		
		Connection conexao = ConexaoFactory.conectar();
		
		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setInt(1, ong.getId_Ong());
		comando.setInt(2, ong.getId_Login());
		comando.setString(3, ong.getNome_Ong());
		comando.setString(4, ong.getDescricao_Ong());
		comando.setInt(5, ong.getId_Tipo_Ong());
		comando.setInt(6, ong.getId_Endereco());
		comando.setString(7, ong.getData_Fundacao());
		comando.setInt(8, ong.getId_Status_Ong());
		comando.setString(9, ong.getTelefone_Ong());
		comando.setString(10, ong.getEmail_Ong());
		
		comando.executeUpdate();
	}
	
	public void excluir(Ong ong) throws SQLException{
		StringBuilder sql = new StringBuilder();
		sql.append("DELETE FROM ONG ");
		sql.append("WHERE ID_ONG = ? ");
		
		Connection conexao = ConexaoFactory.conectar();
		
		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setInt(1, ong.getId_Ong());
		
		comando.executeUpdate();


	}
	
	public void editar(Ong ong) throws SQLException{
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE ONG ");
		sql.append("SET DESCRICAO_ONG = ? ");
		sql.append("WHERE ID_ONG = ? ");
		
		Connection conexao = ConexaoFactory.conectar();
		
		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setString(1, ong.getDescricao_Ong());
		comando.setInt(2, ong.getId_Ong());
		
		comando.executeUpdate();


	}
	
	public Ong buscarPorCodigo(Ong ong) throws SQLException{
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM ONG ");
		sql.append("WHERE ID_ONG = ? ");
		
		Connection conexao = ConexaoFactory.conectar();
		
		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setInt(1, ong.getId_Ong());
		
		ResultSet resultado = comando.executeQuery();
		
		Ong retorno = null;
		
		if(resultado.next()) {
			retorno = new Ong();
			retorno.setId_Ong(resultado.getInt("ID_ONG"));
			retorno.setId_Login(resultado.getInt("ID_LOGIN"));
			retorno.setNome_Ong(resultado.getString("NOME_ONG"));
			retorno.setDescricao_Ong(resultado.getString("DESCRICAO_ONG"));
			retorno.setId_Tipo_Ong(resultado.getInt("ID_TIPO_ONG"));
			retorno.setId_Endereco(resultado.getInt("ID_ENDERECO"));
			retorno.setData_Fundacao(resultado.getString("DATA_FUNDACAO"));
			retorno.setId_Status_Ong(resultado.getInt("ID_STATUS_ONG"));
			retorno.setTelefone_Ong(resultado.getString("TELEFONE_ONG"));
			retorno.setEmail_Ong(resultado.getString("EMAIL_ONG"));
			
		}
		
		return retorno;
		
	}
	
	public ArrayList<Ong> listar() throws SQLException{
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM ONG ");
		
		Connection conexao = ConexaoFactory.conectar();
		
		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		
		ResultSet resultado = comando.executeQuery();
		
		ArrayList<Ong> lista = new ArrayList<Ong>();
		
		
		while(resultado.next()) {
			Ong ong = new Ong();
			ong.setId_Ong(resultado.getInt("ID_ONG"));
			ong.setId_Login(resultado.getInt("ID_LOGIN"));
			ong.setNome_Ong(resultado.getString("NOME_ONG"));
			ong.setDescricao_Ong(resultado.getString("DESCRICAO_ONG"));
			ong.setId_Tipo_Ong(resultado.getInt("ID_TIPO_ONG"));
			ong.setId_Endereco(resultado.getInt("ID_ENDERECO"));
			ong.setData_Fundacao(resultado.getString("DATA_FUNDACAO"));
			ong.setId_Status_Ong(resultado.getInt("ID_STATUS_ONG"));
			ong.setTelefone_Ong(resultado.getString("TELEFONE_ONG"));
			ong.setEmail_Ong(resultado.getString("EMAIL_ONG"));
			
			lista.add(ong);
		}
		
		return lista;
		
	}
	
	public ArrayList<Ong> buscarPorNome(Ong ong) throws SQLException{
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM ONG ");
		sql.append("WHERE NOME_ONG LIKE ? ");
		
		
		Connection conexao = ConexaoFactory.conectar();
		
		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setString(1, "%" + ong.getDescricao_Ong()+ "%");
		
		ResultSet resultado = comando.executeQuery();
		
		ArrayList<Ong> lista = new ArrayList<Ong>();
		
		
		while(resultado.next()) {
			Ong item = new Ong();
			item.setId_Ong(resultado.getInt("ID_ONG"));
			item.setId_Login(resultado.getInt("ID_LOGIN"));
			item.setNome_Ong(resultado.getString("NOME_ONG"));
			item.setDescricao_Ong(resultado.getString("DESCRICAO_ONG"));
			item.setId_Tipo_Ong(resultado.getInt("ID_TIPO_ONG"));
			item.setId_Endereco(resultado.getInt("ID_ENDERECO"));
			item.setData_Fundacao(resultado.getString("DATA_FUNDACAO"));
			item.setId_Status_Ong(resultado.getInt("ID_STATUS_ONG"));
			item.setTelefone_Ong(resultado.getString("TELEFONE_ONG"));
			item.setEmail_Ong(resultado.getString("EMAIL_ONG"));
			
			lista.add(item);
		}
		
		return lista;
		
	}
	
	
	public static void main(String[] args) {
		Ong ong1 = new Ong();
		ong1.setId_Ong(1);
		ong1.setId_Login(1);
		ong1.setNome_Ong("AMIGOS DOS CAES");
		ong1.setDescricao_Ong("ONG DE PROTECAO AOS CAES");
		ong1.setId_Tipo_Ong(1);
		ong1.setId_Endereco(1);
		ong1.setData_Fundacao("12/03/2020");
		ong1.setId_Status_Ong(1);
		ong1.setTelefone_Ong("99999999");
		ong1.setEmail_Ong("amigocaes@ong.com.br");

		
		OngDAO ongoad = new OngDAO();
		
		try {
			ongoad.salvar(ong1);
			System.out.println("A ONG foi salva com sucesso!");
		} catch(SQLException e) {
			System.out.println("Ocorreu um erro ao salvar");
			e.printStackTrace();
		}
	}

}
