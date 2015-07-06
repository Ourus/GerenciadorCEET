package bandoDados;

import com.mysql.jdbc.Blob;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.JOptionPane;
import modelos.*;

public class PessoaBD extends Conexao {

// ================= Metodos Principais de Pessoas =====================
// Cadastro de Pessoa
    public int cadastro(Pessoa pessoa, Endereco endereco, Contato contato) {
        int i = 0;
        try {
            i = cadastroPessoaKey(pessoa);
            cadastroEndereco(i, endereco);
            cadastroContato(i, contato);
            JOptionPane.showMessageDialog(null, "Cadastro Realizado \n \t com sucesso !!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();
            return i;
        }
    }

    // ===================================================================================
    public int cadastro(Pessoa pessoa, Endereco endereco, ArrayList<Contato> contato) {
        int i = 0;
        try {
            i = cadastroPessoaKey(pessoa);
            cadastroEndereco(i, endereco);
            cadastroContato(i, contato);
            JOptionPane.showMessageDialog(null, "Cadastro Realizado \n \t com sucesso !!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();
            return i;
        }
    }



    public int cadastro(Pessoa pessoa, ArrayList <Endereco> endereco, Contato contato) {
        int i = 0;
        try {
            i = cadastroPessoaKey(pessoa);
            cadastroEndereco(i, endereco);
            cadastroContato(i, contato);
            JOptionPane.showMessageDialog(null, "Cadastro Realizado \n \t com sucesso !!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();
            return i;
        }
    }



    
    public int cadastro(Pessoa pessoa, ArrayList <Endereco> endereco, ArrayList <Contato> contato) {

        int i = 0;
        try {
            i = cadastroPessoaKey(pessoa);
            cadastroEndereco(i, endereco);
            cadastroContato(i, contato);
            JOptionPane.showMessageDialog(null, "Cadastro Realizado \n \t com sucesso !!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();
            return i;
        }
    }

// Excluir Pessoa

    
    public void excluirPessoa(Pessoa pessoa) {
        try {
            conectarBanco();
            stm = con.createStatement();
            String sql = "delete from pessoa where codPessoa=" + pessoa.getCodPessoa() + ";";
            stm.executeUpdate(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();
        }
    }

// ================= Metodos de destinada a cadastro ==================
    public void cadastro(Pessoa pessoa) {
        try {
            conectarBanco();
            stm = con.createStatement();
            String sql = "insert into pessoa (nome,rg,cpf,naturalidade,"
                    + "dataNascimento,uf,nomePai,nomeMae,foto) value ('"
                    + pessoa.getNome() + "','" + pessoa.getRG() + "','" + pessoa.getCpf() + "',"
                    + "'" + pessoa.getNaturalidade() + "','" + pessoa.getDataNacimento() + "',"
                    + "'" + pessoa.getUf() + "','" + pessoa.getNomePai() + "','" + pessoa.getNomeMae() + "'"
                    + ",'" + pessoa.getFoto() + "');";
            stm.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);

            ResultSet tb = stm.getGeneratedKeys();

            while (tb.next()) {
                JOptionPane.showConfirmDialog(null, tb.getInt("codPessoa"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();
        }
    }

    public void cadastroEndereco(int pessoa, Endereco endereco) {

        try {
            conectarBanco();
            stm = con.createStatement();
            String sql = "insert into endereco (codPessoa,rua,cidade,uf,bairro,cep,complemento)"
                    + "values(" + pessoa + ",'" + endereco.getRua() + "','" + endereco.getCidade() + "'"
                    + ",'" + endereco.getUf() + "','" + endereco.getBairro() + "','" + endereco.getCep() + "',"
                    + "'" + endereco.getComplemento() + "');";
            stm.executeUpdate(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();
        }

    }

    private void cadastroEndereco(int pessoa, ArrayList<Endereco> ende) {

        try {
            conectarBanco();
            for (Endereco endereco : ende) {
                stm = con.createStatement();
                String sql = "insert into endereco (codPessoa,endereco,cidade,uf,bairro,cep,complemento)"
                        + "values(" + pessoa + ",'" + endereco.getRua() + "','" + endereco.getCidade() + "'"
                        + ",'" + endereco.getUf() + "','" + endereco.getBairro() + "','" + endereco.getCep() + "',"
                        + "'" + endereco.getComplemento() + "');";
                stm.executeUpdate(sql);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();
        }

    }

    public void cadastroContato(int pessoa, Contato contato) {
        try {
            conectarBanco();
            stm = con.createStatement();
            String sql = "insert into contato (codPessoa,email,telefone,celular) values(" + pessoa + ","
                    + "'" + contato.getEmail() + "','" + contato.getTelefone() + "','" + contato.getCelular() + "');";
            stm.executeUpdate(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } finally {
            desconectarBanco();
        }

    }

    private void cadastroContato(int pessoa, ArrayList<Contato> cont) {
        try {
            for (Contato contato : cont) {
                conectarBanco();

                stm = con.createStatement();
                String sql = "insert into contato (codPessoa,email,telefone,celular) values(" + pessoa + ","
                        + "'" + contato.getEmail()+ "','" + contato.getTelefone()+ "','" + contato.getCelular()+ "');";
                stm.executeUpdate(sql);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } finally {
            desconectarBanco();
        }

    }

    private int cadastroPessoaKey(Pessoa pessoa) {
        int key = 0;
         DecimalFormat formato = new DecimalFormat("00");

        try {
            conectarBanco();
            String sql = "insert into pessoa (nome,rg,dataExpedicao,orgaoEmissor,cpf, naturalidade,dataNascimento,uf,"
                    + "nomePai,nomeMae,foto,sexo,corRaca,compResidencia,compFoto,senha) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement stm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stm.setString(1, pessoa.getNome());
            stm.setString(2, pessoa.getRG());
            stm.setString(3, pessoa.getDataExpedicao());
            stm.setString(4, pessoa.getOrgaoEmissor());
            stm.setString(5, pessoa.getCpf());
            stm.setString(6, pessoa.getNaturalidade());
            // new Date(pessoa.getDataNacimento().get(Calendar.DAY_OF_MONTH), pessoa.getDataNacimento().get(Calendar.MONTH), pessoa.getDataNacimento().get(Calendar.YEAR))
            stm.setString(7, pessoa.getDataNacimento());
            stm.setString(8, pessoa.getUf());
            stm.setString(9, pessoa.getNomePai());
            stm.setString(10, pessoa.getNomeMae());
            stm.setBlob(11, pessoa.getFoto());
            stm.setString(12, pessoa.getSexo());
            stm.setString(13, pessoa.getCorRaca());
            stm.setString(14, pessoa.getCompResidencia());
            stm.setString(15, pessoa.getCompFoto());
            stm.setString(16, pessoa.getSenha());
            
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

// ================= Metodos de destinada a excluir ==================
    public void excluirContato(Pessoa pessoa, Contato contato) {
        try {
            conectarBanco();
            stm = con.createStatement();
            String sql = "delete from contato where codContato=" + contato.getCodContato() + "and "
                    + "codPessoa=" + pessoa.getCodPessoa() + ";";
            stm.executeUpdate(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();
        }

    }

    public void excluirEndereco(Pessoa pessoa, Endereco endereco) {
        try {
            conectarBanco();
            stm = con.createStatement();
            String sql = "delete from endereco where codEndereco=" + endereco.getCodEndereco() + "and"
                    + "codPessoa=" + pessoa.getCodPessoa() + ";";
            stm.executeUpdate(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();
        }
    }

// ================= Metodos de destinada a buscar ==================
// Buscar endereco de uma pessoa
    public ArrayList<Endereco> listarEnderecoPessoa(int pessoa) {
        ArrayList<Endereco> listaEnderecoPessoa = new ArrayList();

        try {

            conectarBanco();
            Endereco endereco;
            stm = con.createStatement();
            String sqlComando = "select * from endereco where codPessoa= " + pessoa+";";
            ResultSet tabelaEnderecosPessoas = stm.executeQuery(sqlComando);
            while (tabelaEnderecosPessoas.next()) {
                endereco = new Endereco();
                
            
                endereco.setCidade(tabelaEnderecosPessoas.getString("cidade"));
                endereco.setBairro(tabelaEnderecosPessoas.getString("bairro"));
                endereco.setComplemento(tabelaEnderecosPessoas.getString("complemento"));
                endereco.setCep(tabelaEnderecosPessoas.getString("cep"));
                endereco.setUf(tabelaEnderecosPessoas.getString("uf"));
                endereco.setRua(tabelaEnderecosPessoas.getString("rua"));
                endereco.setCodEndereco(tabelaEnderecosPessoas.getInt("codEndereco"));

                listaEnderecoPessoa.add(endereco);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();
            return listaEnderecoPessoa;
        }
    }

    // Buacar Contatos de uma pessoa
    public ArrayList<Contato> listarContatoPessoa(Pessoa pessoa) {
        ArrayList<Contato> listaContatosPessoa = new ArrayList();

        try {
            conectarBanco();

            Contato novoContato;
            stm = con.createStatement();
            String sql = "select * from contato where  codPessoa=" + pessoa.getCodPessoa();

            ResultSet tabelaResultadoContatos = stm.executeQuery(sql);

            while (tabelaResultadoContatos.next()) {
                novoContato = new Contato();

                novoContato.setEmail(tabelaResultadoContatos.getString("email"));
                novoContato.setTelefone(tabelaResultadoContatos.getString("telefone"));
                novoContato.setCelular(tabelaResultadoContatos.getString("celular"));
                novoContato.setCodContato(tabelaResultadoContatos.getInt("codContato"));
                listaContatosPessoa.add(novoContato);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();
            return listaContatosPessoa;

        }
    }

    public Pessoa localizarPessoa(Pessoa pessoa) {
        Pessoa pessoaCadastrada = new Pessoa();
        ArrayList<Pessoa> Pessoa = new ArrayList();
        try {
            conectarBanco();
            stm = con.createStatement();
            String sql = "select * from pessoa where codPessoa=" + pessoa.getCodPessoa() + ";";
            ResultSet tabelaResultante = stm.executeQuery(sql);
             

                pessoaCadastrada.setCodPessoa(tabelaResultante.getInt("codPessoa"));
                pessoaCadastrada.setCpf(tabelaResultante.getString("cpf"));
                pessoaCadastrada.setDataNacimento(tabelaResultante.getString("dataNascimento"));
                pessoaCadastrada.setDataExpedicao(tabelaResultante.getString("dataExpedicao"));
                pessoaCadastrada.setFoto((Blob) tabelaResultante.getBlob("foto"));
                pessoaCadastrada.setNaturalidade(tabelaResultante.getString("naturalidade"));
                pessoaCadastrada.setNome(tabelaResultante.getString("nome"));
                pessoaCadastrada.setNomeMae(tabelaResultante.getString("nomeMae"));
                pessoaCadastrada.setNomePai(tabelaResultante.getString("nomePai"));
                pessoaCadastrada.setRG(tabelaResultante.getString("rg"));
                pessoaCadastrada.setUf(tabelaResultante.getString("uf"));
                pessoaCadastrada.setSexo(tabelaResultante.getString("sexo"));
                pessoaCadastrada.setCompResidencia(tabelaResultante.getString("compResidencia"));
                pessoaCadastrada.setCompFoto(tabelaResultante.getString("compFoto"));
                pessoaCadastrada.setOrgaoEmissor(tabelaResultante.getString("orgaoEmissor"));
                pessoaCadastrada.setCorRaca(tabelaResultante.getString("corRaca"));
                Pessoa.add(pessoaCadastrada);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();
            return pessoaCadastrada;
        }
    }

    public ArrayList<Pessoa> listarPessoasBanco() {
        ArrayList<Pessoa> listaPessoa = new ArrayList();

        try {
            Pessoa novoPessoa;
            conectarBanco();
            String sql = "select * from pessoa;";
            stm = con.createStatement();
            ResultSet listasPessoaCadastradas = stm.executeQuery(sql);
            while (listasPessoaCadastradas.next()) {
                novoPessoa = new Pessoa();

                novoPessoa.setCodPessoa(listasPessoaCadastradas.getInt("codPessoa"));
                novoPessoa.setCpf(listasPessoaCadastradas.getString("cpf"));
                novoPessoa.setDataNacimento(listasPessoaCadastradas.getString("dataNascimento"));
                novoPessoa.setDataExpedicao(listasPessoaCadastradas.getString("dataExpedicao"));
                novoPessoa.setFoto((Blob) listasPessoaCadastradas.getBlob("foto"));
                novoPessoa.setNaturalidade(listasPessoaCadastradas.getString("naturalidade"));
                novoPessoa.setNome(listasPessoaCadastradas.getString("nome"));
                novoPessoa.setNomeMae(listasPessoaCadastradas.getString("nomeMae"));
                novoPessoa.setNomePai(listasPessoaCadastradas.getString("nomePai"));
                novoPessoa.setRG(listasPessoaCadastradas.getString("rg"));
                novoPessoa.setUf(listasPessoaCadastradas.getString("uf"));
                novoPessoa.setSexo(listasPessoaCadastradas.getString("sexo"));
                novoPessoa.setCompResidencia(listasPessoaCadastradas.getString("compResidencia"));
                novoPessoa.setCompFoto(listasPessoaCadastradas.getString("compFoto"));
                novoPessoa.setOrgaoEmissor(listasPessoaCadastradas.getString("orgaoEmissor"));
                novoPessoa.setCorRaca(listasPessoaCadastradas.getString("corRaca"));
                novoPessoa.setSenha(listasPessoaCadastradas.getString("senha"));

                listaPessoa.add(novoPessoa);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();

            //  novoPessoa.setEnderecos(listarEnderecoPessoa(novoPessoa));
            return listaPessoa;
        }
    }

    public ArrayList<Pessoa> listarPessoasBanco(String nome) {
        ArrayList<Pessoa> nomePessoa = new ArrayList();

        try {
            Pessoa novoPessoa;
            conectarBanco();
            String sql = "select * from pessoa where nome= '" + nome + "';";
            stm = con.createStatement();
            ResultSet listasPessoaCadastradas = stm.executeQuery(sql);
            while (listasPessoaCadastradas.next()) {
                novoPessoa = new Pessoa();

                novoPessoa.setCodPessoa(listasPessoaCadastradas.getInt("codPessoa"));
                novoPessoa.setCpf(listasPessoaCadastradas.getString("cpf"));
                novoPessoa.setSenha(listasPessoaCadastradas.getString("senha"));
                novoPessoa.setDataNacimento(listasPessoaCadastradas.getString("dataNascimento"));
                novoPessoa.setDataExpedicao(listasPessoaCadastradas.getString("dataExpedicao"));
                novoPessoa.setFoto((Blob) listasPessoaCadastradas.getBlob("foto"));
                novoPessoa.setNaturalidade(listasPessoaCadastradas.getString("naturalidade"));
                novoPessoa.setNome(listasPessoaCadastradas.getString("nome"));
                novoPessoa.setNomeMae(listasPessoaCadastradas.getString("nomeMae"));
                novoPessoa.setNomePai(listasPessoaCadastradas.getString("nomePai"));
                novoPessoa.setRG(listasPessoaCadastradas.getString("rg"));
                novoPessoa.setUf(listasPessoaCadastradas.getString("uf"));

                nomePessoa.add(novoPessoa);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();
            return nomePessoa;
        }

    }

    // ================= Metodos de destinada a Atualizar ==================
    public void atualizarPessoa(Pessoa pessoa) {
        try {
            conectarBanco();
            String sql = "update pessoa set nome = '" + pessoa.getNome() + "',rg='" + pessoa.getRG() + "',"
                    + "cpf='" + pessoa.getCpf() + "',naturalidade='" + pessoa.getNaturalidade() + "',"
                    + "dataNascimento='" + pessoa.getDataNacimento() + "',"
                    + "uf='" + pessoa.getUf() + "',nomePai='" + pessoa.getNomePai() + "',nomeMae='" + pessoa.getNomeMae() + "',"
                    + "foto='" + pessoa.getFoto() + "' where codPessoa= " + pessoa.getCodPessoa() + ";";
            stm = con.createStatement();
            stm.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Cadastro Realizado \n\t com sucesso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();
        }
    }

    public void atualizarContato(Pessoa pessoa, Contato contato) {
        try {
            conectarBanco();
            stm = con.createStatement();
            String sql = "update contato set email='" + contato.getEmail() + "', "
                    + "telefone='" + contato.getTelefone() +  "', "
                    + "celular='" + contato.getCelular() +  "' where codPessoa=" + pessoa.getCodPessoa() + ";";
            stm.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso ");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();
        }
    }

    public void atualizarEndereco(Pessoa pessoa, Endereco endereco) {
        try {
            conectarBanco();
            stm = con.createStatement();
            String sql = "uptdate";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } finally {
            desconectarBanco();
        }
    }

}
