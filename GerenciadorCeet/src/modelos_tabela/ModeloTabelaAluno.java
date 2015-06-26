/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelos_tabela;

import java.util.ArrayList;
import modelos.Aluno;
import modelos.Pessoa;

/**
 *
 * @author alunom
 */
public class ModeloTabelaAluno extends javax.swing.table.AbstractTableModel
{
    ArrayList<Pessoa> listaPessoas = new ArrayList();
    Pessoa pessoa;
    
    @Override
    public int getRowCount() {
        return listaPessoas.size();
        }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        pessoa = listaPessoas.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0: return pessoa.getCodPessoa();
            case 1: return pessoa.getNome();
            case 2: return pessoa.getCpf();
            case 3: return pessoa.getRG();
            case 4: return pessoa.getCorRaca();
            default: return null;
        }
    }
    
    @Override
    public String getColumnName(int columnIndex)
    {
        switch(columnIndex)
        {
            case 0: return "ID";
            case 1: return "Nome";
            case 2: return "CPF";
            case 3: return "RG";
            case 4: return "Cor";
            default: return null;
        }
    }

    public void inserirListaPessoas(ArrayList<Pessoa> listaPessoas)
        {
            this.listaPessoas = listaPessoas;
        }

        public ArrayList<Pessoa> retornarListaPessoas()
        {
            return this.listaPessoas;
        }

}
