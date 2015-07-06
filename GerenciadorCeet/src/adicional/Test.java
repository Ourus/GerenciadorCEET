
package adicional;

import bandoDados.AlunoBD;
import modelos.Endereco;
import modelos.Funcionario;



public class Test 
{
    public static void main(String[] args)
    {
        Senha senha= new Senha();
        Funcionario fun =new Funcionario();
        fun.setSenha("123");
        System.out.println(senha.mdSenhaGerador("123"));
        System.out.println(senha.validarSenhaFuncionario(fun, senha.mdSenhaGerador("123")));
        
        AlunoBD aluno = new AlunoBD();
        
        for(Endereco temp: aluno.listarEnderecoPessoa(aluno))
        {
            
        }
    }
}
