package modelos_tabela;

import Classes.Login;
import java.util.ArrayList;

public class ModeloTabelaLogin extends javax.swing.table.AbstractTableModel
{
    ArrayList<Login> listaLogins = new ArrayList();
    Login login;
    
    @Override
    public int getRowCount() {
        return listaLogins.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        login = listaLogins.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0: return login.getLogin();
            case 1: return login.getNivel();
            default: return null;
        }
    }
    
    @Override
    public String getColumnName(int columnIndex)
    {
        switch(columnIndex)
        {
            case 0: return "Usuario";
            case 1: return "Nível";
            default: return null;
        }
    }

    
    public void inserirListaLogins(ArrayList<Login> listaLogins)
    {
        this.listaLogins = listaLogins;
    }
    
    public ArrayList<Login> retornarListaLogins()
    {
        return this.listaLogins;
    }
}
