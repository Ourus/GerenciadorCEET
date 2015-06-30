/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos_tabela;

import java.util.ArrayList;
import modelos.Curso;

/**
 *
 * @author Mateus
 */
public class ModeloTabelaCurso extends javax.swing.table.AbstractTableModel
{
    ArrayList<Curso> listaCursos = new ArrayList();
    Curso curso;

    @Override
    public int getRowCount() {
        return listaCursos.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        curso = listaCursos.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0: return curso.getNomeCurso();
            case 1: return curso.getNumeroIdMEC();
            case 2: return curso.getTurno();
            case 3: return curso.getQuantmodulos();
            default: return null;
        }
    }
    
     @Override
    public String getColumnName(int columnIndex)
    {
        switch(columnIndex)
        {
            case 0: return "Nome";
            case 1: return "ID MEC";
            case 2: return "Turno";
            case 3: return "Modulos";
            default: return null;
        }
    }
   

    public void inserirListaCurso(ArrayList<Curso> listaCursos)
        {
            this.listaCursos = listaCursos;
        }

        public ArrayList<Curso> retornarListaCursos()
        {
            return this.listaCursos;
        }    


}
