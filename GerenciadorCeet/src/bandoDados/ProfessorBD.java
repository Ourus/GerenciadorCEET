package bandoDados;

import com.mysql.jdbc.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.JOptionPane;
import modelos.Aluno;
import modelos.Contato;
import modelos.Desempenho;
import modelos.Endereco;
import modelos.Escolaridade;
import modelos.FormacaoProfessor;
import modelos.Professor;

public class ProfessorBD extends FuncionarioBD {

    public int cadastroProfessor(Professor professor, Endereco endereco, Contato contato, FormacaoProfessor fp) {
        int key = 0;
        try {
            key = super.cadastroFuncionario(professor, endereco, contato);
            conectarBanco();
            String sql = "insert into professor(codProfessor,codDepartamento)values(?,?);";
            PreparedStatement stm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stm.setInt(1, key);
            stm.setInt(2, professor.getCodDepartamento());
            stm.executeUpdate();
            cadastrarFormacao(key, fp);

        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } finally {
            desconectarBanco();
            return key;
        }
    }
     
    public int cadastroProfessor(Professor professor, Endereco endereco, Contato contato, ArrayList<FormacaoProfessor> fp) {
        int key = 0;
        try {
            key = super.cadastroFuncionario(professor, endereco, contato);
            conectarBanco();
            String sql = "insert into professor(codProfessor,codDepartamento)values(?,?);";
            PreparedStatement stm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stm.setInt(1, key);
            stm.setInt(2, professor.getCodDepartamento());
            stm.executeUpdate();
               for(FormacaoProfessor temp: fp)
           {
               cadastrarFormacao(key, temp);
               
           }


            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } finally {
            desconectarBanco();
                return key;
        }
    }
    
    private void cadastrarFormacao (int i, FormacaoProfessor forma)
    {
        try 
        {
            conectarBanco();
            String sql = "insert into formacao values (codProfessor,tipo,curso,instituicao,situacao,anoConclucao, anoInicio)"
                    + "values(?,?,?,?,?,?,?)";
            PreparedStatement stm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stm.setInt(1, i);
            stm.setString(2, forma.getTipo());
            stm.setString(3, forma.getCurso());
            stm.setString(4, forma.getInstituicao());
            stm.setString(5, forma.getSituacao());
            stm.setString(6, forma.getAnoConclusao().get(Calendar.YEAR)+"-"+forma.getAnoConclusao().get(Calendar.MONTH)+"-"+forma.getAnoConclusao().get(Calendar.DAY_OF_MONTH));
            stm.setString(7, forma.getAnoIncio().get(Calendar.YEAR)+"-" + forma.getAnoIncio().get(Calendar.MONTH)+"-"+ forma.getAnoIncio().get(Calendar.DAY_OF_MONTH));
            stm.executeUpdate();
            
        } catch (Exception e) {
        }finally
        {
            desconectarBanco();
        }
        
    }
   
    public ArrayList<Professor> localizarProfessor(String nomeProfessor) {
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
