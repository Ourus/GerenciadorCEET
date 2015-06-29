/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelos_tabela;

import java.util.ArrayList;
import modelos.Aluno;

/**
 *
 * @author alunom
 */
public class ModeloTabelaAluno extends javax.swing.table.AbstractTableModel
{
    ArrayList<Aluno> listaAlunos = new ArrayList();
    Aluno alunos;
    
    @Override
    public int getRowCount() {
        return listaAlunos.size();
        }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        alunos = listaAlunos.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0: return alunos.getNome();
            case 1: return alunos.getCpf();
            case 2: return alunos.getRG();
            case 3: return alunos.getStatus();
            default: return null;
        }
    }
    
    @Override
    public String getColumnName(int columnIndex)
    {
        switch(columnIndex)
        {
            case 0: return "Nome";
            case 1: return "CPF";
            case 2: return "RG";
            case 3: return "Status";
            default: return null;
        }
    }

    public void inserirListaAlunos(ArrayList<Aluno> listaAlunos)
        {
            this.listaAlunos = listaAlunos;
        }

        public ArrayList<Aluno> retornarListaAlunos()
        {
            return this.listaAlunos;
        }

}
