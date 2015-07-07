/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos_tabela;

import java.util.ArrayList;
import modelos.Professor;

/**
 *
 * @author Mateus
 */
public class ModeloTabelaProfessor extends javax.swing.table.AbstractTableModel
{
    ArrayList<Professor> listaProfessores = new ArrayList();
    Professor professores;

    @Override
    public int getRowCount() {
       return listaProfessores.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        professores = listaProfessores.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0: return professores.getNome();
            case 1: return professores.getCargo();
            case 2: return professores.getSalario();
            case 3: return professores.getSexo();
            default: return null;
        }
    }
     @Override
    public String getColumnName(int columnIndex)
    {
        switch(columnIndex)
        {
            case 0: return "Nome";
            case 1: return "Cargo";
            case 2: return "Salario";
            case 3: return "Sexo";
            default: return null;
        }
    }

    public void inserirListaProfessores(ArrayList<Professor> listaProfessores)
        {
            this.listaProfessores = listaProfessores;
        }

        public ArrayList<Professor> retornarListaProfessores()
        {
            return this.listaProfessores;
        }


}
