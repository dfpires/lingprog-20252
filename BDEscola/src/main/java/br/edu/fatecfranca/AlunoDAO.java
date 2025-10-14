package br.edu.fatecfranca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// DAO - Data Access Object
public class AlunoDAO {
    // função para inserir um aluno no banco de dados
    public void inserir(String nome, String cpf){
        // monta uma string que representa o SQL
        String sql = "INSERT INTO aluno (nome,cpf) VALUES (?,?)";
        try { // tenta inserir
            // conecta no banco de dados
            Connection conexao = ConnectionFactory.getConnection();
            // prepara para inserir
            PreparedStatement stmt = conexao.prepareStatement(sql);
            // define os valores de nome e cpf
            stmt.setString(1, nome);
            stmt.setString(2, cpf);
            // executa a inserção no banco de dados
            stmt.executeUpdate();
            System.out.println("Aluno adicionado com sucesso!");
        }
        catch(SQLException e){
            System.out.println("Erro ao inserir aluno " + e.getMessage());
        }
    }
}
