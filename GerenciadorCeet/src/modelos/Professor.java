
package modelos;

import java.util.ArrayList;

public class Professor extends Funcionario
{
 
     private int codProfessor;
    private int codDepartamento ;
    private ArrayList <FormacaoProfessor> formacaoProfesso = new ArrayList ();

    public int getCodProfessor() {
        return codProfessor;
    }

    public void setCodProfessor(int codProfessor) {
        this.codProfessor = codProfessor;
    }

    public int getCodDepartamento() {
        return codDepartamento;
    }

    public void setCodDepartamento(int codDepartamento) {
        this.codDepartamento = codDepartamento;
    }

    public ArrayList <FormacaoProfessor> getFormacaoProfesso() {
        return formacaoProfesso;
    }

    public void setFormacaoProfesso(ArrayList <FormacaoProfessor> formacaoProfesso) {
        this.formacaoProfesso = formacaoProfesso;
    }
      public void setFormacaoProfesso(FormacaoProfessor formacaoProfesso) {
        this.formacaoProfesso.add(formacaoProfesso);
    }
        
}
