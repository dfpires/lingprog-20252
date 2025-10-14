package br.edu.fatecfranca;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        AlunoDAO alunoDAO = new AlunoDAO();
        alunoDAO.inserir("José Pedro", "1235");
    }
}
