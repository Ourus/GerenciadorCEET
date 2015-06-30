package bandoDados;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.Curso;

/**
 *
 * @author Jonathan Dutra
 */
public class CursoBD extends Conexao {

    public int cadastroCurosoKey(Curso curso) {
        int key = -1;
        try {
            conectarBanco();
            String sql = "insert into curso(nome,numeroIdMEC,turno,quantmodulos)values (?,?,?,?);";
            PreparedStatement stm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stm.setString(1, curso.getNomeCurso());
            stm.setString(2, curso.getNumeroIdMEC());
            stm.setString(3, curso.getTurno());
            stm.setString(4, curso.getQuantmodulos());

            stm.executeUpdate();

            ResultSet codCurso = stm.getGeneratedKeys();
            while (codCurso.next()) {
                key = codCurso.getInt(1);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();
            return key;
        }
    }

    public ArrayList<Curso> listarCurso() {

        ArrayList<Curso> listaCurso = new ArrayList();

        try {
            Curso novoCurso;
            conectarBanco();
            String sql = "select * from curso;";
            stm = con.createStatement();
            ResultSet listasCursoCadastradas = stm.executeQuery(sql);
            while (listasCursoCadastradas.next()) {
                novoCurso = new Curso();

                novoCurso.setCodCurso(listasCursoCadastradas.getInt("codCurso"));
                novoCurso.setNomeCurso(listasCursoCadastradas.getString("nome"));
                novoCurso.setNumeroIdMEC(listasCursoCadastradas.getString("numeroIdMEC"));
                novoCurso.setTurno(listasCursoCadastradas.getString("turno"));
                novoCurso.setQuantmodulos(listasCursoCadastradas.getString("quantmodulos"));
                listaCurso.add(novoCurso);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();

            //    novoPessoa.setEnderecos(listarEnderecoPessoa(novoPessoa));
            return listaCurso;
        }
    }

        public void excluirCurso(Curso curso) {
            try {
                conectarBanco();
                stm = con.createStatement();
                String sql = "delete from curso where codCurso=" + curso.getCodCurso() + ";";
                stm.executeUpdate(sql);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } finally {
                desconectarBanco();
            }
        }



}
