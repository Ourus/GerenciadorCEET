
package modelos;

import java.util.ArrayList;

public class Professor extends Funcionario
{
 
     private int codProfessor;
     private int codDepartamento;
     private String certidaoNascimento;
     private String comprovanteEscolarida;
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

    /**
     * @return the certidaoNascimento
     */
    public String getCertidaoNascimento() {
        return certidaoNascimento;
    }

    /**
     * @param certidaoNascimento the certidaoNascimento to set
     */
    public void setCertidaoNascimento(String certidaoNascimento) {
        this.certidaoNascimento = certidaoNascimento;
    }

    /**
     * @return the comprovanteEscolarida
     */
    public String getComprovanteEscolarida() {
        return comprovanteEscolarida;
    }

    /**
     * @param comprovanteEscolarida the comprovanteEscolarida to set
     */
    public void setComprovanteEscolarida(String comprovanteEscolarida) {
        this.comprovanteEscolarida = comprovanteEscolarida;
    }
        
}
