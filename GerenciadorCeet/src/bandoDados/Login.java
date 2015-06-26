
package bandoDados;

import modelos.Funcionario;
import adicional.Senha;
import bandoDados.AlunoBD;
import bandoDados.FuncionarioBD;
import modelos.Aluno;

public class Login 
{
    Senha senha = new Senha();
    FuncionarioBD funcBD = new FuncionarioBD();
    AlunoBD alunoBD = new AlunoBD();
    
    public boolean verificarLogin(Funcionario funcionario, String senha)
    {
        boolean senhaTest= false;
        for(Funcionario func:funcBD.listarFuncionario())
        {
           if((this.senha.validarSenhaFuncionario(funcionario, senha)) &&(funcionario.getCpf().equals(func.getCpf())))
           {
                  senhaTest= true;
           }else
           {
                  senhaTest = false;
           }
        }
        return senhaTest;
    }
    
    public boolean verificarLogin(Aluno aluno, String senha)
    {
        boolean senhaTest= false;
        for(Aluno func:alunoBD.listarAluno())
        {
           if((this.senha.validarSenhaFuncionario(aluno, senha)) &&(aluno.getMatricula().equals(func.getMatricula())))
           {
                  senhaTest= true;
           }else
           {
                  senhaTest = false;
           }
        }
        return senhaTest;
    }
    
    
}
