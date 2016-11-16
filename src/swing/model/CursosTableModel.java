/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Curso;
import model.Modalidade;

/**
 *
 * @author everaldo
 */
public class CursosTableModel extends AbstractTableModel {

    private List<Curso> cursos;
    
    public CursosTableModel(List<Curso> cursos){
        this.cursos = cursos;
    }
    
    
    @Override
    public String getColumnName(int column){
        switch (column) {
            case 0:
                return "Id";
            case 1:
                return "Nome";
            case 2:
                return "Modalidade";
            default:
                break;
        }
        return null;
    }
    
    @Override
    public Class getColumnClass(int columnIndex){
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return Modalidade.class;
            default:
                break;
        }
        return null;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return cursos.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Curso curso = cursos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return curso.getId();
            case 1:
                return curso.getNome();
            case 2:
                return curso.getModalidade();
            default:
                break;
        }
        return null;
    }
    
}
