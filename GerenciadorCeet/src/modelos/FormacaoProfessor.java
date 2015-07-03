
package modelos;

import java.util.Calendar;

public class FormacaoProfessor
{
    private int  codFormacao ;
    private String tipo;
    private String curso;
    private String instituicao;
    private String situacao;
    private Calendar anoConclusao;
    private Calendar anoIncio;

    public int getCodFormacao() {
        return codFormacao;
    }

    public void setCodFormacao(int codFormacao) {
        this.codFormacao = codFormacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Calendar getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(Calendar anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    public Calendar getAnoIncio() {
        return anoIncio;
    }

    public void setAnoIncio(Calendar anoIncio) {
        this.anoIncio = anoIncio;
    }

    /**
     * @return the status
     */
    
     
}
