
package adicional;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;
import modelos.Aluno;
import modelos.Funcionario;

public class Senha 
{
    public String mdSenhaGerador(String senha)
    {
        String sn="";
        MessageDigest md = null;
        try
        {
            md = MessageDigest.getInstance("MD5");
                       
        }catch(NoSuchAlgorithmException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        BigInteger hash = new BigInteger(1,md.digest(senha.getBytes()));
        sn = hash.toString(16);
        
        return sn;
    }
    
    public boolean validarSenhaFuncionario (Funcionario senhaFuncionario, String senha)
    {
        if(senhaFuncionario.getSenha().equals(mdSenhaGerador(senha)))
        {
            return true;
        }
        else
        {
           return false; 
        }
        
        
    }
     public boolean validarSenhaFuncionario (Aluno senhaFuncionario, String senha)
    {
        if(senhaFuncionario.getSenha().equals(mdSenhaGerador(senha)))
        {
            return true;
        }
        else
        {
           return false; 
        }
           
    }
}