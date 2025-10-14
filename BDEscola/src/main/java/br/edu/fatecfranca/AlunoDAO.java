package br.edu.fatecfranca;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
    // função para consultar todos os alunos no banco de dados
    public List<String> listar(){
        // cria a lista de alunos
        List<String> alunos = new ArrayList<>();
        // cria o SQL
        String sql = "SELECT * FROM aluno order by id";
        try { // vamos tentar selecionar
            // abre a conexão
            Connection conexao = ConnectionFactory.getConnection();
            // cria objeto que vai realmente consultar
            Statement stmt = conexao.createStatement();
            // executa a consulta e atribui resultado para objeto rs
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){ // para cada aluno
                // adiciona id e nome na lista de alunos
                alunos.add(rs.getInt("id") + " - " +
                        rs.getString("nome"));
            }
        }
        catch(SQLException e){ // tivemos um erro
            System.out.println("Erro ao listar alunos!" + e.getMessage());
        }
        return alunos; // retorna a lista de alunos
    }
}
