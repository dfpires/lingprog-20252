package br.edu.fatecfranca;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main( String[] args ){
        AlunoDAO dao = new AlunoDAO();
        Scanner entrada = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Menu Aluno");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Alterar Aluno");
            System.out.println("3 - Excluir Aluno");
            System.out.println("4 - Listar Alunos");
            System.out.println("0 - Sair");
            System.out.println("Escolha: ");
            opcao = entrada.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Informe nome do aluno");
                    String nome = entrada.next();
                    System.out.println("Informe cpf do aluno");
                    String cpf = entrada.next();
                    dao.inserir(nome, cpf);
                    break;
                case 2:
                    System.out.println("Informe id do aluno");
                    int id = entrada.nextInt();
                    System.out.println("Informe nome do aluno");
                    nome = entrada.next();
                    System.out.println("Informe cpf do aluno");
                    cpf = entrada.next();
                    dao.atualizar(id, nome, cpf);
                    break;
                case 3:
                    System.out.println("Informe id do aluno");
                    id = entrada.nextInt();
                    dao.remover(id);
                    break;
                case 4:
                    System.out.println("Lista de alunos");
                    List<String> alunos = dao.listar();
                    if (alunos.isEmpty()){ // se vetor é vazio
                        System.out.println("Sem aluno cadastrado");
                    }
                    else {
                        for (String aluno : alunos) { // para cada string aluno
                            System.out.println(aluno); // exibe os dados dos alunos
                        }
                    }
                    break;
                case 0:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
        while (opcao != 0);
    }
}
