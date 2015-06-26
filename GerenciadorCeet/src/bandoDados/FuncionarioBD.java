package bandoDados;

import com.mysql.jdbc.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import modelos.*;

public class FuncionarioBD extends PessoaBD {

    public int cadastroFuncionario(Funcionario funcionario, Endereco endereco, Contato contato, ArrayList<Escolaridade> escolaridade, ArrayList<Desempenho> desempenho) {
        int key = 0;

        try {
            key = super.cadastro(funcionario, endereco, contato);
            conectarBanco();
            String sql = "insert into funcionarios (codFuncionario, cargo, salario, cargaHoraria,codDepartamento, senha) values (?,?,?,?,?,?);";
            PreparedStatement stm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stm.setInt(1, key);
            stm.setString(2, funcionario.getCargo());
            stm.setFloat(3, funcionario.getSalario());
            stm.setFloat(4, funcionario.getCargaHoraria());
            stm.setInt(5, funcionario.getCodDepartamento());
            stm.setString(6, funcionario.getSenha());
            
            stm.executeUpdate();
            ResultSet codPessoa = stm.getGeneratedKeys();
            while (codPessoa.next()) {
                key = codPessoa.getInt(1);
            }


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();
            return key;
        }

    }
  
    public ArrayList<Funcionario> listarFuncionario ()
    {
     
        ArrayList<Funcionario> listaPessoa = new ArrayList();

        try {
           Funcionario novoPessoa;
            conectarBanco();
            String sql = "select * from pessoa,funcionarios;";
            stm = con.createStatement();
            ResultSet listasPessoaCadastradas = stm.executeQuery(sql);
            while (listasPessoaCadastradas.next()) {
                novoPessoa = new Funcionario();

                novoPessoa.setCodPessoa(listasPessoaCadastradas.getInt("codPessoa"));
                novoPessoa.setCpf(listasPessoaCadastradas.getString("cpf"));
                Calendar cal = Calendar.getInstance();
                cal.setTime(listasPessoaCadastradas.getDate("dataNascimento"));
                novoPessoa.setDataNacimento(cal);
                novoPessoa.setFoto((Blob) listasPessoaCadastradas.getBlob("foto"));
                novoPessoa.setNaturalidade(listasPessoaCadastradas.getString("naturalidade"));
                novoPessoa.setNome(listasPessoaCadastradas.getString("nome"));
                novoPessoa.setNomeMae(listasPessoaCadastradas.getString("nomeMae"));
                novoPessoa.setNomePai(listasPessoaCadastradas.getString("nomePai"));
                novoPessoa.setSenha(listasPessoaCadastradas.getString("senha"));
                novoPessoa.setRG(listasPessoaCadastradas.getString("rg"));
                novoPessoa.setUf(listasPessoaCadastradas.getString("uf"));
                novoPessoa.setCargo(listasPessoaCadastradas.getString("cargo"));
                novoPessoa.setSalario(listasPessoaCadastradas.getFloat(" salario"));
                novoPessoa.setCargaHoraria(listasPessoaCadastradas.getFloat("cargaHoraria"));
                novoPessoa.setCodDepartamento(listasPessoaCadastradas.getInt("codDepartamento"));

                listaPessoa.add(novoPessoa);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();

            //    novoPessoa.setEnderecos(listarEnderecoPessoa(novoPessoa));
            return listaPessoa;
        }
    }
}
