package modelos;

import java.util.ArrayList;
import java.util.Calendar;

public class Aula {

    private int codAula;
    private ArrayList<Professor> codProfessor = new ArrayList();
    private ArrayList<Turma> codTurma = new ArrayList();
    private ArrayList<Disciplina> codDisciplina = new ArrayList();
    private ArrayList<Labotaroio> codLab = new ArrayList();
    private int codDiaHora;
    private Calendar dataAula;

    public int getCodAula() {
        return codAula;
    }

    public void setCodAula(int codAula) {
        this.codAula = codAula;
    }

    public ArrayList<Professor> getCodProfessor() {
        return codProfessor;
    }

    public void setCodProfessor(ArrayList<Professor> codProfessor) {
        this.codProfessor = codProfessor;
    }

    public ArrayList<Turma> getCodTurma() {
        return codTurma;
    }

    public void setCodTurma(ArrayList<Turma> codTurma) {
        this.codTurma = codTurma;
    }

    public ArrayList<Disciplina> getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(ArrayList<Disciplina> codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    public ArrayList<Labotaroio> getCodLab() {
        return codLab;
    }

    public void setCodLab(ArrayList<Labotaroio> codLab) {
        this.codLab = codLab;
    }

    public int getCodDiaHora() {
        return codDiaHora;
    }

    public void setCodDiaHora(int codDiaHora) {
        this.codDiaHora = codDiaHora;
    }

    public Calendar getDataAula() {
        return dataAula;
    }

    public void setDataAula(Calendar dataAula) {
        this.dataAula = dataAula;
    }


}
