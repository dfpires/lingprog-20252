package br.edu.fatecfranca;

public class ConnectionFactory {

    // criar 3 variáveis
    // jdbc -> protocolo de comunicação do java com BD
    // postgresql -> banco de dados
    // localhost -> máquina local
    // 5432 -> porta onde o postgres fica escutando requisição
    // escola -> nome do banco de dados
    String URL = "jdbc:postgresql://localhost:5432/escola";
    String USER = "postgres";
    String PASSWORD = "123";
}
