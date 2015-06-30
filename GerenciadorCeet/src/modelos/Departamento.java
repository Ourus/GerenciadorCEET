package modelos;

import java.util.ArrayList;

public class Departamento {

    private int codDepartamento;
    private String nomeDepartamento;
    private String descricao;
    private ArrayList <Funcionario> funcionarios = new ArrayList();

    public int getCodDepartamento() {
        return codDepartamento;
    }

    public void setCodDepartamento(int codDepartamento) {
        this.codDepartamento = codDepartamento;
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList <Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList <Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
      public void setFuncionarios(Funcionario funcionarios) {
        this.funcionarios.add(funcionarios);
    }

}
