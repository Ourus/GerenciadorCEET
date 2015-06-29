package bandoDados;

import com.mysql.jdbc.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import modelos.Aluno;
import modelos.Contato;
import modelos.Desempenho;
import modelos.Endereco;
import modelos.Escolaridade;
import modelos.Professor;

public class ProfessorBD extends FuncionarioBD {

    public int cadastroProfessor(Professor professor, Endereco endereco, Contato contato, ArrayList<Escolaridade> escolaridade, ArrayList<Desempenho> desempenho) {
        int key = 0;
        try {
            key = super.cadastroFuncionario(professor, endereco, contato, escolaridade, desempenho);
            conectarBanco();
            String sql = "insert into professor(codProfessor,codDepartamento)values(?,?);";
            PreparedStatement stm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stm.setInt(1, key);
            stm.setInt(2, professor.getCodDepartamento());
            stm.executeUpdate();

            ResultSet codPessoa = stm.getGeneratedKeys();
            while (codPessoa.next()) {
                key = codPessoa.getInt(1);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } finally {
            return key;
        }
    }

    public ArrayList<Professor> localizarAluno(String nomeProfessor) {
        ArrayList<Professor> listaPessoa = new ArrayList();

        try {
            Professor novoPessoa;
            conectarBanco();
            String sql = "select * from pessoa p ,professor a,funcionarios f where p.codPessoa = a.codProfessor and p.nome='" + nomeProfessor + "';";
            stm = con.createStatement();
            ResultSet listasPessoaCadastradas = stm.executeQuery(sql);
            while (listasPessoaCadastradas.next()) {
                novoPessoa = new Professor();

                novoPessoa.setCodPessoa(listasPessoaCadastradas.getInt("codPessoa"));
                novoPessoa.setCpf(listasPessoaCadastradas.getString("cpf"));
                Calendar cal = Calendar.getInstance();
                cal.setTime(listasPessoaCadastradas.getDate("dataNascimento"));
                novoPessoa.setDataNacimento(cal);
                novoPessoa.setFoto((Blob) listasPessoaCadastradas.getBlob("foto"));
                novoPessoa.setNaturalidade(listasPessoaCadastradas.getString("naturalidade"));
                novoPessoa.setNome(listasPessoaCadastradas.getString("nome"));
                novoPessoa.setNomeMae(listasPessoaCadastradas.getString("nomeMae"));
                novoPessoa.setSenha(listasPessoaCadastradas.getString("senha"));
                novoPessoa.setNomePai(listasPessoaCadastradas.getString("nomePai"));
                novoPessoa.setRG(listasPessoaCadastradas.getString("rg"));
                novoPessoa.setUf(listasPessoaCadastradas.getString("uf"));
                novoPessoa.setCargo(listasPessoaCadastradas.getString("cargo"));
                novoPessoa.setSalario(listasPessoaCadastradas.getFloat("salario"));
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
    
    public ArrayList<Professor> localizarAluno() {
        ArrayList<Professor> listaPessoa = new ArrayList();

        try {
            Professor novoPessoa;
            conectarBanco();
            String sql = "select * from pessoa p ,professor a,funcionarios f where p.codPessoa, = a.codProfessor;";
            stm = con.createStatement();
            ResultSet listasPessoaCadastradas = stm.executeQuery(sql);
            while (listasPessoaCadastradas.next()) {
                novoPessoa = new Professor();

                novoPessoa.setCodPessoa(listasPessoaCadastradas.getInt("codPessoa"));
                novoPessoa.setCpf(listasPessoaCadastradas.getString("cpf"));
                Calendar cal = Calendar.getInstance();
                cal.setTime(listasPessoaCadastradas.getDate("dataNascimento"));
                novoPessoa.setDataNacimento(cal);
                novoPessoa.setFoto((Blob) listasPessoaCadastradas.getBlob("foto"));
                novoPessoa.setNaturalidade(listasPessoaCadastradas.getString("naturalidade"));
                novoPessoa.setNome(listasPessoaCadastradas.getString("nome"));
                novoPessoa.setNomeMae(listasPessoaCadastradas.getString("nomeMae"));
                novoPessoa.setSenha(listasPessoaCadastradas.getString("senha"));
                novoPessoa.setNomePai(listasPessoaCadastradas.getString("nomePai"));
                novoPessoa.setRG(listasPessoaCadastradas.getString("rg"));
                novoPessoa.setUf(listasPessoaCadastradas.getString("uf"));
                novoPessoa.setCargo(listasPessoaCadastradas.getString("cargo"));
                novoPessoa.setSalario(listasPessoaCadastradas.getFloat("salario"));
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
