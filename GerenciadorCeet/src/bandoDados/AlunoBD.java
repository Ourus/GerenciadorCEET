package bandoDados;

import com.mysql.jdbc.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelos.*;

public class AlunoBD extends PessoaBD {
    // cadastros 

    // Metodos Principais : alunos , endereço, contato, deempenho e escolaridade 
    public void cadastro(Aluno aluno, Endereco endereco, Contato contato, ArrayList<Escolaridade> escolaridade, ArrayList<Desempenho> desempenho) {
        int key = 0;
        try {
            key = super.cadastro(aluno, endereco, contato);

            conectarBanco();
            stm = con.createStatement();

            cadastroEscolaridade(key, escolaridade);
            cadastroDesempenho(key, desempenho);

            String sql = "insert into aluno (codAluno,matricula,certidaoNascimento,compEscolaridade,status,observacao)"
                    + "value(" + key + ",'" + aluno.getMatricula() + "','" + aluno.getCertidaoNascimento() + "',"
                    + "'" + aluno.getComprovanteEscolarida() + "','" + aluno.getStatus() + "','" + aluno.getObservacao() + "');";

            JOptionPane.showMessageDialog(null, "Aluno: " + aluno.getNome() + "\n \t Cadastrado com sucesso");

            stm.executeUpdate(sql);

            System.out.println(key);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();

        }

    }

    public void cadastro(Aluno aluno, Endereco endereco, Contato contato, Desempenho desempenho, Escolaridade escolaridade) {
        int key = 0;
        try {
            key = super.cadastro(aluno, endereco, contato);

            conectarBanco();
            stm = con.createStatement();

            cadastroDesempenho(key, desempenho);
            cadastroEscolaridade(key, escolaridade);

            String sql = "insert into aluno (codAluno,matricula,certidaoNascimento,compEscolaridade,status,observacao)"
                    + "value(" + key + ",'" + aluno.getMatricula() + "','" + aluno.getCertidaoNascimento() + "',"
                    + "'" + aluno.getComprovanteEscolarida() + "','" + aluno.getStatus() + "','" + aluno.getObservacao() + "');";

            JOptionPane.showMessageDialog(null, "Aluno: " + aluno.getNome() + "\n \t Cadastrado com sucesso");

            stm.executeUpdate(sql);

            System.out.println(key);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();

        }

    }

    // Cadastro de alunos , endereço, contato, deempenho e escolaridade 
    public void cadastro(Aluno aluno, Endereco endereco, Contato contato, Desempenho desempenho) {
        int key = 0;
        try {
            key = super.cadastro(aluno, endereco, contato);

            conectarBanco();
            stm = con.createStatement();

            cadastroDesempenho(key, desempenho);

            String sql = "insert into aluno (codAluno,matricula,certidaoNascimento,compEscolaridade,status,observacao)"
                    + "value(" + key + ",'" + aluno.getMatricula() + "','" + aluno.getCertidaoNascimento() + "',"
                    + "'" + aluno.getComprovanteEscolarida() + "','" + aluno.getStatus() + "','" + aluno.getObservacao() + "');";

            JOptionPane.showMessageDialog(null, "Aluno: " + aluno.getNome() + "\n \t Cadastrado com sucesso");

            stm.executeUpdate(sql);

            System.out.println(key);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();

        }

    }

    public void cadastro(Aluno aluno, Endereco endereco, Contato contato, Escolaridade escolaridade) {
        int key = 0;
        try {
            key = super.cadastro(aluno, endereco, contato);

            conectarBanco();
            stm = con.createStatement();

            cadastroEscolaridade(key, escolaridade);

            String sql = "insert into aluno (codAluno,matricula,certidaoNascimento,compEscolaridade,status,observacao)"
                    + "value(" + key + ",'" + aluno.getMatricula() + "','" + aluno.getCertidaoNascimento() + "',"
                    + "'" + aluno.getComprovanteEscolarida() + "','" + aluno.getStatus() + "','" + aluno.getObservacao() + "');";

            JOptionPane.showMessageDialog(null, "Aluno: " + aluno.getNome() + "\n \t Cadastrado com sucesso");

            stm.executeUpdate(sql);

            System.out.println(key);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();

        }

    }

    public void cadastro(Aluno aluno, Endereco endereco, ArrayList<Desempenho> desempenho, Contato contato) {
        int key = 0;
        try {
            key = super.cadastro(aluno, endereco, contato);

            conectarBanco();
            stm = con.createStatement();

            cadastroDesempenho(key, desempenho);

            String sql = "insert into aluno (codAluno,matricula,certidaoNascimento,compEscolaridade,status,observacao)"
                    + "value(" + key + ",'" + aluno.getMatricula() + "','" + aluno.getCertidaoNascimento() + "',"
                    + "'" + aluno.getComprovanteEscolarida() + "','" + aluno.getStatus() + "','" + aluno.getObservacao() + "');";

            JOptionPane.showMessageDialog(null, "Aluno: " + aluno.getNome() + "\n \t Cadastrado com sucesso");

            stm.executeUpdate(sql);

            System.out.println(key);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();

        }

    }

    public void cadastro(Aluno aluno, Endereco endereco, Contato contato, ArrayList<Escolaridade> escolaridade) {
        int key = 0;
        try {
            key = super.cadastro(aluno, endereco, contato);

            conectarBanco();
            stm = con.createStatement();

            cadastroEscolaridade(key, escolaridade);

            String sql = "insert into aluno (codAluno,matricula,certidaoNascimento,compEscolaridade,status,observacao)"
                    + "value(" + key + ",'" + aluno.getMatricula() + "','" + aluno.getCertidaoNascimento() + "',"
                    + "'" + aluno.getComprovanteEscolarida() + "','" + aluno.getStatus() + "','" + aluno.getObservacao() + "');";

            JOptionPane.showMessageDialog(null, "Aluno: " + aluno.getNome() + "\n \t Cadastrado com sucesso");

            stm.executeUpdate(sql);

            System.out.println(key);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();

        }

    }

    public void cadastro(Aluno aluno, Endereco endereco, Contato contato) {
        int key = 0;
        try {
            key = super.cadastro(aluno, endereco, contato);

            conectarBanco();
            stm = con.createStatement();

            String sql = "insert into aluno (codAluno,matricula,certidaoNascimento,compEscolaridade,status,observacao)"
                    + "value(" + key + ",'" + aluno.getMatricula() + "','" + aluno.getCertidaoNascimento() + "',"
                    + "'" + aluno.getComprovanteEscolarida() + "','" + aluno.getStatus() + "','" + aluno.getObservacao() + "');";

            JOptionPane.showMessageDialog(null, "Aluno: " + aluno.getNome() + "\n \t Cadastrado com sucesso");

            stm.executeUpdate(sql);


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();

        }

    }

    public void cadastro(Aluno aluno, Endereco endereco, ArrayList<Contato> contato) {
        int key = 0;
        try {
            key = super.cadastro(aluno, endereco, contato);

            conectarBanco();
            stm = con.createStatement();

            String sql = "insert into aluno (codAluno,matricula,certidaoNascimento,compEscolaridade,status,observacao)"
                    + "value(" + key + ",'" + aluno.getMatricula() + "','" + aluno.getCertidaoNascimento() + "',"
                    + "'" + aluno.getComprovanteEscolarida() + "','" + aluno.getStatus() + "','" + aluno.getObservacao() + "');";

            JOptionPane.showMessageDialog(null, "Aluno: " + aluno.getNome() + "\n \t Cadastrado com sucesso");

            stm.executeUpdate(sql);


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();

        }

    }

    public void cadastro(Aluno aluno, ArrayList<Endereco> endereco, Contato contato) {
        int key = 0;
        try {
            key = super.cadastro(aluno, endereco, contato);

            conectarBanco();
            stm = con.createStatement();

            String sql = "insert into aluno (codAluno,matricula,certidaoNascimento,compEscolaridade,status,observacao)"
                    + "value(" + key + ",'" + aluno.getMatricula() + "','" + aluno.getCertidaoNascimento() + "',"
                    + "'" + aluno.getComprovanteEscolarida() + "','" + aluno.getStatus() + "','" + aluno.getObservacao() + "');";

            JOptionPane.showMessageDialog(null, "Aluno: " + aluno.getNome() + "\n \t Cadastrado com sucesso");

            stm.executeUpdate(sql);


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();

        }

    }

    public void cadastro(Aluno aluno, ArrayList<Endereco> endereco, ArrayList<Contato> contato) {
        int key = 0;
        try {
            key = super.cadastro(aluno, endereco, contato);

            conectarBanco();
            stm = con.createStatement();

            String sql = "insert into aluno (codAluno,matricula,certidaoNascimento,compEscolaridade,status,observacao)"
                    + "value(" + key + ",'" + aluno.getMatricula() + "','" + aluno.getCertidaoNascimento() + "',"
                    + "'" + aluno.getComprovanteEscolarida() + "','" + aluno.getStatus() + "','" + aluno.getObservacao() + "');";

            stm.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Aluno: " + aluno.getNome() + "\n \t Cadastrado com sucesso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();

        }

    }

// Desempenho
    public void cadastroDesempenho(Aluno aluno, Desempenho despenho) {
        try {
            conectarBanco();
            stm = con.createStatement();
            String sql = "insert into desempenho (codAluno,desempenho,numeroFaltas,trimestre)"
                    + " values(" + aluno.getCodPessoa() + ",'" + despenho.getDesempenho() + "',"
                    + "" + despenho.getNumeroFaltas() + ",'" + despenho.getTrimestre() + "');";
            stm.executeUpdate(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();
        }

    }

    public void cadastroDesempenho(Aluno aluno, ArrayList<Desempenho> desp) {
        try {
            conectarBanco();
            stm = con.createStatement();
            for (Desempenho desempenho : desp) {
                String sql = "insert into desempenho (codAluno,desempenho,numeroFaltas,trimestre)"
                        + " values(" + aluno.getCodPessoa() + ",'" + desempenho.getDesempenho() + "',"
                        + "" + desempenho.getNumeroFaltas() + ",'" + desempenho.getTrimestre() + "');";
                stm.executeUpdate(sql);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();
        }

    }

    public void cadastroDesempenho(int aluno, Desempenho despenho) {
        try {
            conectarBanco();
            stm = con.createStatement();
            String sql = "insert into desempenho (codAluno,desempenho,numeroFaltas,trimestre)"
                    + " values(" + aluno + ",'" + despenho.getDesempenho() + "',"
                    + "" + despenho.getNumeroFaltas() + ",'" + despenho.getTrimestre() + "');";
            stm.executeUpdate(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();
        }

    }

    public void cadastroDesempenho(int aluno, ArrayList<Desempenho> desp) {
        try {
            conectarBanco();
            stm = con.createStatement();
            for (Desempenho desempenho : desp) {
                String sql = "insert into desempenho (codAluno,desempenho,numeroFaltas,trimestre)"
                        + " values(" + aluno + ",'" + desempenho.getDesempenho() + "',"
                        + "" + desempenho.getNumeroFaltas() + ",'" + desempenho.getTrimestre() + "');";
                stm.executeUpdate(sql);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();
        }

    }

// Escolaridade
    public void cadastroEscolaridade(Aluno aluno, Escolaridade escolaridade) {
        try {
            conectarBanco();
            stm = con.createStatement();
            String sql = "insert into escolaridade (codAluno,serie,nomeEscola,"
                    + "municipio,dependenciaAdministrativa,anoLetivo,eja)"
                    + " values(" + aluno.getCodPessoa() + ",'" + escolaridade.getSerie() + "'," + escolaridade.getNomeEscola() + "',"
                    + "'" + escolaridade.getMunicipioEscola() + "','" + escolaridade.getDependenciasAdministrativa() + "','" + escolaridade.getAnoLetivo() + "',"
                    + "'" + escolaridade.getEja() + "');";

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();
        }
    }

    public void cadastroEscolaridade(int aluno, Escolaridade escolaridade) {
        try {
            conectarBanco();
            stm = con.createStatement();
            String sql = "insert into escolaridade (codAluno,serie,nomeEscola,"
                    + "municipio,dependenciaAdministrativa,anoLetivo,eja)"
                    + " values(" + aluno + ",'" + escolaridade.getSerie() + "'," + escolaridade.getNomeEscola() + "',"
                    + "'" + escolaridade.getMunicipioEscola() + "','" + escolaridade.getDependenciasAdministrativa() + "','" + escolaridade.getAnoLetivo() + "',"
                    + "'" + escolaridade.getEja() + "');";

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();
        }
    }

    public void cadastroEscolaridade(Aluno aluno, ArrayList<Escolaridade> esco) {
        try {
            conectarBanco();
            stm = con.createStatement();
            for (Escolaridade escolaridade : esco) {
                String sql = "insert into escolaridade (codAluno,serie,nomeEscola,"
                        + "municipio,dependenciaAdministrativa,anoLetivo,eja)"
                        + " values(" + aluno.getCodPessoa() + ",'" + escolaridade.getSerie() + "'," + escolaridade.getNomeEscola() + "',"
                        + "'" + escolaridade.getMunicipioEscola() + "','" + escolaridade.getDependenciasAdministrativa() + "','" + escolaridade.getAnoLetivo() + "',"
                        + "'" + escolaridade.getEja() + "');";
                stm.executeUpdate(sql);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();
        }
    }

    public void cadastroEscolaridade(int aluno, ArrayList<Escolaridade> esco) {
        try {
            conectarBanco();
            stm = con.createStatement();
            for (Escolaridade escolaridade : esco) {
                String sql = "insert into escolaridade (codAluno,serie,nomeEscola,"
                        + "municipio,dependenciaAdministrativa,anoLetivo,eja)"
                        + " values(" + aluno + ",'" + escolaridade.getSerie() + "'," + escolaridade.getNomeEscola() + "',"
                        + "'" + escolaridade.getMunicipioEscola() + "','" + escolaridade.getDependenciasAdministrativa() + "','" + escolaridade.getAnoLetivo() + "',"
                        + "'" + escolaridade.getEja() + "');";
                stm.executeUpdate(sql);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();
        }
    }

// pesquisas 
    // desempenho Aluno 
    public ArrayList<Desempenho> listaDesempenhoAluno(Aluno aluno) {

        ArrayList<Desempenho> desempenho = new ArrayList();

        try {
            conectarBanco();
            Desempenho pesquisa;
            stm = con.createStatement();
            String comando = "select desempenho,numeroFaltas,trimestre"
                    + " from desempenho where codAluno=" + aluno.getCodPessoa() + ";";

            ResultSet tabelaDesempenhoAluno = stm.executeQuery(comando);
            while (tabelaDesempenhoAluno.next()) {
                pesquisa = new Desempenho();

                pesquisa.setDesempenho(tabelaDesempenhoAluno.getString("desempenho"));
                pesquisa.setNumeroFaltas(tabelaDesempenhoAluno.getInt("numeroFaltas"));
                pesquisa.setTrimestre(tabelaDesempenhoAluno.getString("trimestre"));

                desempenho.add(pesquisa);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            desconectarBanco();
            return desempenho;
        }

    }

    // Pesquisar escolaridade do aluno 
    public ArrayList<Escolaridade> listaEscolaridadeAluno(Aluno aluno) {
        ArrayList<Escolaridade> escolaridade = new ArrayList();
        try {
            conectarBanco();
            stm = con.createStatement();
            String comando = "select * from escolaridade"
                    + " where codAluno=" + aluno.getCodPessoa() + ";";
            ResultSet tabelaEsolaridadeAluno = stm.executeQuery(comando);
            Escolaridade pesquisa;

            while (tabelaEsolaridadeAluno.next()) {
                pesquisa = new Escolaridade();
                pesquisa.setNomeEscola(tabelaEsolaridadeAluno.getString("nomeEscola"));
                pesquisa.setMunicipioEscola(tabelaEsolaridadeAluno.getString("municipio"));
                pesquisa.setSerie(tabelaEsolaridadeAluno.getString("serie"));
                pesquisa.setAnoLetivo(tabelaEsolaridadeAluno.getString("anoLetivo"));
                pesquisa.setEja(tabelaEsolaridadeAluno.getString("eja"));
                pesquisa.setDependenciasAdministrativa(tabelaEsolaridadeAluno.getString("dependenciaAdministrativa"));

                escolaridade.add(pesquisa);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } finally {
            desconectarBanco();
            return escolaridade;

        }
    }

    // Atualizar dados  do Aluno 
    // Listar Aluno
    public ArrayList<Aluno> listarAluno() {

        ArrayList<Aluno> listaPessoa = new ArrayList();

        try {
            Aluno novoPessoa;
            conectarBanco();
            String sql = "select * from pessoa p ,aluno a where p.codPessoa = a.codAluno;";
            stm = con.createStatement();
            ResultSet listasPessoaCadastradas = stm.executeQuery(sql);
            while (listasPessoaCadastradas.next()) {
                novoPessoa = new Aluno();

                novoPessoa.setCodPessoa(listasPessoaCadastradas.getInt("codPessoa"));
                novoPessoa.setCpf(listasPessoaCadastradas.getString("cpf"));
                novoPessoa.setDataNacimento(listasPessoaCadastradas.getString("dataNascimento"));
                novoPessoa.setDataExpedicao(listasPessoaCadastradas.getString("dataExpedicao"));
                novoPessoa.setFoto((Blob) listasPessoaCadastradas.getBlob("foto"));
                novoPessoa.setNaturalidade(listasPessoaCadastradas.getString("naturalidade"));
                novoPessoa.setNome(listasPessoaCadastradas.getString("nome"));
                novoPessoa.setNomeMae(listasPessoaCadastradas.getString("nomeMae"));
                novoPessoa.setSenha(listasPessoaCadastradas.getString("senha"));
                novoPessoa.setNomePai(listasPessoaCadastradas.getString("nomePai"));
                novoPessoa.setRG(listasPessoaCadastradas.getString("rg"));
                novoPessoa.setUf(listasPessoaCadastradas.getString("uf"));
                novoPessoa.setMatricula(listasPessoaCadastradas.getString("matricula"));
                novoPessoa.setCertidaoNascimento(listasPessoaCadastradas.getString("certidaoNascimento"));
                novoPessoa.setComprovanteEscolarida(listasPessoaCadastradas.getString("compEscolaridade"));
                novoPessoa.setStatus(listasPessoaCadastradas.getString("status"));
                novoPessoa.setObservacao(listasPessoaCadastradas.getString("observacao"));
                novoPessoa.setCorRaca(listasPessoaCadastradas.getString("corRaca"));
                novoPessoa.setSexo(listasPessoaCadastradas.getString("sexo"));
                novoPessoa.setCompFoto(listasPessoaCadastradas.getString("compFoto"));

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
public ArrayList<Aluno> localizarAluno(String nomeAluno)
{   
    ArrayList<Aluno> listaPessoa = new ArrayList();

        try {
            Aluno novoPessoa;
            conectarBanco();
            String sql = "select * from pessoa p ,aluno a where p.codPessoa = a.codAluno and p.nome like '%"+nomeAluno+"%';";
            stm = con.createStatement();
            ResultSet listasPessoaCadastradas = stm.executeQuery(sql);
            while (listasPessoaCadastradas.next()) {
                novoPessoa = new Aluno();

                novoPessoa.setCodPessoa(listasPessoaCadastradas.getInt("codPessoa"));
                novoPessoa.setCpf(listasPessoaCadastradas.getString("cpf"));
                novoPessoa.setDataNacimento(listasPessoaCadastradas.getString("dataNascimento"));
                novoPessoa.setDataExpedicao(listasPessoaCadastradas.getString("dataExpedicao"));
                novoPessoa.setFoto((Blob) listasPessoaCadastradas.getBlob("foto"));
                novoPessoa.setNaturalidade(listasPessoaCadastradas.getString("naturalidade"));
                novoPessoa.setNome(listasPessoaCadastradas.getString("nome"));
                novoPessoa.setNomeMae(listasPessoaCadastradas.getString("nomeMae"));
                novoPessoa.setSenha(listasPessoaCadastradas.getString("senha"));
                novoPessoa.setNomePai(listasPessoaCadastradas.getString("nomePai"));
                novoPessoa.setRG(listasPessoaCadastradas.getString("rg"));
                novoPessoa.setUf(listasPessoaCadastradas.getString("uf"));
                novoPessoa.setMatricula(listasPessoaCadastradas.getString("matricula"));
                novoPessoa.setCertidaoNascimento(listasPessoaCadastradas.getString("certidaoNascimento"));
                novoPessoa.setComprovanteEscolarida(listasPessoaCadastradas.getString("compEscolaridade"));
                novoPessoa.setStatus(listasPessoaCadastradas.getString("status"));
                novoPessoa.setObservacao(listasPessoaCadastradas.getString("observacao"));
                novoPessoa.setCorRaca(listasPessoaCadastradas.getString("corRaca"));
                novoPessoa.setSexo(listasPessoaCadastradas.getString("sexo"));
                novoPessoa.setCompFoto(listasPessoaCadastradas.getString("compFoto"));

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


public ArrayList<Aluno> localizarAlunoDocumento(String nomeAluno)
{   
    ArrayList<Aluno> listaPessoaDocumento = new ArrayList();

        try {
            Aluno novoPessoa;
            conectarBanco();
            String sql = "SELECT * FROM ceet.pessoa,ceet.aluno where compResidencia = 'false' or compFoto = 'true' group by pessoa.codPessoa;";
            stm = con.createStatement();
            ResultSet listasPessoaCadastradas = stm.executeQuery(sql);
            while (listasPessoaCadastradas.next()) {
                novoPessoa = new Aluno();

                novoPessoa.setCodPessoa(listasPessoaCadastradas.getInt("codPessoa"));
                novoPessoa.setCpf(listasPessoaCadastradas.getString("cpf"));
                novoPessoa.setDataNacimento(listasPessoaCadastradas.getString("dataNascimento"));
                novoPessoa.setDataExpedicao(listasPessoaCadastradas.getString("dataExpedicao"));
                novoPessoa.setFoto((Blob) listasPessoaCadastradas.getBlob("foto"));
                novoPessoa.setNaturalidade(listasPessoaCadastradas.getString("naturalidade"));
                novoPessoa.setNome(listasPessoaCadastradas.getString("nome"));
                novoPessoa.setNomeMae(listasPessoaCadastradas.getString("nomeMae"));
                novoPessoa.setSenha(listasPessoaCadastradas.getString("senha"));
                novoPessoa.setNomePai(listasPessoaCadastradas.getString("nomePai"));
                novoPessoa.setRG(listasPessoaCadastradas.getString("rg"));
                novoPessoa.setUf(listasPessoaCadastradas.getString("uf"));
                novoPessoa.setMatricula(listasPessoaCadastradas.getString("matricula"));
                novoPessoa.setCertidaoNascimento(listasPessoaCadastradas.getString("certidaoNascimento"));
                novoPessoa.setComprovanteEscolarida(listasPessoaCadastradas.getString("compEscolaridade"));
                novoPessoa.setStatus(listasPessoaCadastradas.getString("status"));
                novoPessoa.setObservacao(listasPessoaCadastradas.getString("observacao"));
                novoPessoa.setCorRaca(listasPessoaCadastradas.getString("corRaca"));
                novoPessoa.setSexo(listasPessoaCadastradas.getString("sexo"));
                novoPessoa.setCompFoto(listasPessoaCadastradas.getString("compFoto"));

                listaPessoaDocumento.add(novoPessoa);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();

            //    novoPessoa.setEnderecos(listarEnderecoPessoa(novoPessoa));
            return listaPessoaDocumento;
        }
    
    
}

    public Iterable<Endereco> listarEnderecoPessoa(AlunoBD aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

