
package modelos;

import java.util.ArrayList;

public class Curso
{
    private int codCurso;
    private String nomeCurso;
    private String numeroIdMEC;
    private String turno;
    private String quantmodulos;
    private ArrayList <Disciplina> disciplina= new ArrayList();
    // esse atributo deve ser habilitado caso mude o DER !!

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getNumeroIdMEC() {
        return numeroIdMEC;
    }

    public void setNumeroIdMEC(String numeroIdMEC) {
        this.numeroIdMEC = numeroIdMEC;
    }

    public ArrayList <Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(ArrayList <Disciplina> disciplina) {
        this.disciplina = disciplina;
    }
    public void setDisciplina (Disciplina des)
    {
        this.disciplina.add(des);
    }

    /**
     * @return the turno
     */
    public String getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(String turno) {
        this.turno = turno;
    }

    /**
     * @return the quantmodulos
     */
    public String getQuantmodulos() {
        return quantmodulos;
    }

    /**
     * @param quantmodulos the quantmodulos to set
     */
    public void setQuantmodulos(String quantmodulos) {
        this.quantmodulos = quantmodulos;
    }
    
}
