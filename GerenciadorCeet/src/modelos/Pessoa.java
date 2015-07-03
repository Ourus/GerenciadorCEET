
package modelos;

import java.util.ArrayList;
import bandoDados.PessoaBD;
import com.mysql.jdbc.Blob;
import java.sql.Date;
import java.util.Calendar;

public class Pessoa
{
  
    private int codPessoa;
    private Blob foto;
    private String nome;
    private String sexo;
    private String corRaca;
    private String cpf;
    private String dataNacimento;
    private String naturalidade;
    private String uf;
    private String nomeMae;
    private String nomePai;
    private String RG;
    private String senha;
    private String orgaoEmissor;
    private String dataExpedicao;
    private String compFoto;
    private String compResidencia;
    private ArrayList <Endereco> enderecos = new ArrayList ();
    private ArrayList <Contato> contatos = new ArrayList();

    
   
    
    
    
    // Comandos para Buscar em outras tabelas 

    
    // endereço 

    /**
     * @return the codPessoa
     */
    public int getCodPessoa() {
        return codPessoa;
    }

    /**
     * @param codPessoa the codPessoa to set
     */
    public void setCodPessoa(int codPessoa) {
        this.codPessoa = codPessoa;
    }

    /**
     * @return the foto
     */
    public Blob getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(Blob foto) {
        this.foto = foto;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the corRaca
     */
    public String getCorRaca() {
        return corRaca;
    }

    /**
     * @param corRaca the corRaca to set
     */
    public void setCorRaca(String corRaca) {
        this.corRaca = corRaca;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the dataNacimento
     */
    public String getDataNacimento() {
        return dataNacimento;
    }

    /**
     * @param dataNacimento the dataNacimento to set
     */
    public void setDataNacimento(String dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    /**
     * @return the naturalidade
     */
    public String getNaturalidade() {
        return naturalidade;
    }

    /**
     * @param naturalidade the naturalidade to set
     */
    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    /**
     * @return the uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * @param uf the uf to set
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * @return the nomeMae
     */
    public String getNomeMae() {
        return nomeMae;
    }

    /**
     * @param nomeMae the nomeMae to set
     */
    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    /**
     * @return the nomePai
     */
    public String getNomePai() {
        return nomePai;
    }

    /**
     * @param nomePai the nomePai to set
     */
    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    /**
     * @return the RG
     */
    public String getRG() {
        return RG;
    }

    /**
     * @param RG the RG to set
     */
    public void setRG(String RG) {
        this.RG = RG;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the orgaoEmissor
     */
    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    /**
     * @param orgaoEmissor the orgaoEmissor to set
     */
    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    /**
     * @return the dataExpedicao
     */
    public String getDataExpedicao() {
        return dataExpedicao;
    }

    /**
     * @param dataExpedicao the dataExpedicao to set
     */
    public void setDataExpedicao(String dataExpedicao) {
        this.dataExpedicao = dataExpedicao;
    }

    /**
     * @return the compFoto
     */
    public String getCompFoto() {
        return compFoto;
    }

    /**
     * @param compFoto the compFoto to set
     */
    public void setCompFoto(String compFoto) {
        this.compFoto = compFoto;
    }

    /**
     * @return the compResidencia
     */
    public String getCompResidencia() {
        return compResidencia;
    }

    /**
     * @param compResidencia the compResidencia to set
     */
    public void setCompResidencia(String compResidencia) {
        this.compResidencia = compResidencia;
    }

    /**
     * @return the enderecos
     */
    public ArrayList <Endereco> getEnderecos() {
        return enderecos;
    }

    /**
     * @param enderecos the enderecos to set
     */
    public void setEnderecos(ArrayList <Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    /**
     * @return the contatos
     */
    public ArrayList <Contato> getContatos() {
        return contatos;
    }

    /**
     * @param contatos the contatos to set
     */
    public void setContatos(ArrayList <Contato> contatos) {
        this.contatos = contatos;
    }
    
   
  
    
}
