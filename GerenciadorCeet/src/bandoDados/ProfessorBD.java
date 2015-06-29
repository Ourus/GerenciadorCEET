
package bandoDados;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.Contato;
import modelos.Desempenho;
import modelos.Endereco;
import modelos.Escolaridade;
import modelos.Professor;

public class ProfessorBD extends FuncionarioBD
{
  
    public int cadastroProfessor (Professor professor, Endereco endereco, Contato contato, ArrayList<Escolaridade> escolaridade, ArrayList<Desempenho> desempenho)
    {
        int key =0;
        try 
        {
            key = super.cadastroFuncionario(professor, endereco, contato, escolaridade, desempenho);
            conectarBanco();
            String sql = "insert into professor(codProfessor,codDepartamento)values(?,?);";
            PreparedStatement stm = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
               stm.setInt(1, key);
            stm.setInt(2,professor.getCodDepartamento());
            stm.executeUpdate();
           
            ResultSet codPessoa = stm.getGeneratedKeys();
            while (codPessoa.next()) {
                key = codPessoa.getInt(1);
            }
          
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        finally
        {
            return key;
        }
    }    
}
