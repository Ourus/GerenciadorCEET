
package bandoDados;

import java.util.ArrayList;
import modelos.Contato;
import modelos.Desempenho;
import modelos.Endereco;
import modelos.Escolaridade;
import modelos.Professor;

public class ProfessorBD extends FuncionarioBD
{
    public int cadastroProfessor(Professor professo, Endereco endereco, Contato contato, ArrayList<Escolaridade> escolaridade, ArrayList<Desempenho> desempenho)
    {
        int key=0;
        
        try 
        {
            key = super.cadastroFuncionario(professo, endereco, contato, escolaridade, desempenho);
            
            
        } 
        catch (Exception e) 
        {
            
        }
        finally
        {
            return key;
        }
        
    }
}
