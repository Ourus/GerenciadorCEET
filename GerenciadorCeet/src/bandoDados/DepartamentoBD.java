package bandoDados;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.Departamento;
import modelos.Funcionario;

public class DepartamentoBD extends FuncionarioBD {

    public int cadastroDepartameto(Departamento departamento) {
        int key = 0;
        try {
            conectarBanco();
            String sql = "insert into departamento(nomeDepartamento, descricao) values(?,?);";
            PreparedStatement stm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stm.setString(1, departamento.getNomeDepartamento());
            stm.setString(2, departamento.getDescricao());
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

    public ArrayList<Departamento> listarDepartamentos() {
        ArrayList<Departamento> listaDepartamentos = new ArrayList();
        Departamento novoDepartamento;

        try {
            conectarBanco();
            String sql = "select * from departamento;";
            stm = con.createStatement();
            ResultSet listaDepartamentosCadastrados = stm.executeQuery(sql);
            while(listaDepartamentosCadastrados.next())
            {
                novoDepartamento = new Departamento();
                
                novoDepartamento.setCodDepartamento(listaDepartamentosCadastrados.getInt("codDepartamento"));
                novoDepartamento.setNomeDepartamento(listaDepartamentosCadastrados.getString("nomeDepartament"));
                novoDepartamento.setDescricao(listaDepartamentosCadastrados.getString("descricao"));
                
                listaDepartamentos.add(novoDepartamento);               
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();
            return listaDepartamentos;
        }

    }
    
     public ArrayList<Departamento> listarFuncionarioDepartamentos(Departamento departamento) {
        ArrayList<Departamento> listaDepartamentos = new ArrayList();
        Departamento novoDepartamento;
        Funcionario novoFuncionario ;

        try {
            conectarBanco();
            String sql = "select * from departamento dep ,funcionarios func where dep.codFuncionario="+departamento.getCodDepartamento()+ ";";
            stm = con.createStatement();
            ResultSet listaDepartamentosCadastrados = stm.executeQuery(sql);
            while(listaDepartamentosCadastrados.next())
            {
                novoDepartamento = new Departamento();
                novoFuncionario = new Funcionario();
                
                novoDepartamento.setCodDepartamento(listaDepartamentosCadastrados.getInt("codDepartamento"));
                novoDepartamento.setNomeDepartamento(listaDepartamentosCadastrados.getString("nomeDepartament"));
                novoDepartamento.setDescricao(listaDepartamentosCadastrados.getString("descricao"));
                novoFuncionario.setCodFuncionario(listaDepartamentosCadastrados.getInt("codFuncionario"));
                novoFuncionario.setCargo(listaDepartamentosCadastrados.getString(" cargo"));
                novoFuncionario.setSalario(listaDepartamentosCadastrados.getFloat("salario"));
                novoFuncionario.setCargaHoraria(listaDepartamentosCadastrados.getFloat("cargaHoraria"));
                novoDepartamento.setFuncionarios(novoFuncionario);
                listaDepartamentos.add(novoDepartamento);               
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();
            return listaDepartamentos;
        }

    }
     
     public ArrayList<Departamento> listarFuncionarioDepartamentos(int departamento) {
        ArrayList<Departamento> listaDepartamentos = new ArrayList();
        Departamento novoDepartamento;
        Funcionario novoFuncionario ;

        try {
            conectarBanco();
            String sql = "select * from departamento dep ,funcionarios func where dep.codFuncionario="+departamento+ ";";
            stm = con.createStatement();
            ResultSet listaDepartamentosCadastrados = stm.executeQuery(sql);
            while(listaDepartamentosCadastrados.next())
            {
                novoDepartamento = new Departamento();
                novoFuncionario = new Funcionario();
                
                novoDepartamento.setCodDepartamento(listaDepartamentosCadastrados.getInt("codDepartamento"));
                novoDepartamento.setNomeDepartamento(listaDepartamentosCadastrados.getString("nomeDepartament"));
                novoDepartamento.setDescricao(listaDepartamentosCadastrados.getString("descricao"));
                novoFuncionario.setCodFuncionario(listaDepartamentosCadastrados.getInt("codFuncionario"));
                novoFuncionario.setCargo(listaDepartamentosCadastrados.getString(" cargo"));
                novoFuncionario.setSalario(listaDepartamentosCadastrados.getFloat("salario"));
                novoFuncionario.setCargaHoraria(listaDepartamentosCadastrados.getFloat("cargaHoraria"));
                novoDepartamento.setFuncionarios(novoFuncionario);
                listaDepartamentos.add(novoDepartamento);               
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();
            return listaDepartamentos;
        }

    }
     
}
