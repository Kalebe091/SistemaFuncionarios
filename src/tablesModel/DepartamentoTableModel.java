
package tablesModel;

import code.Departamento;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class DepartamentoTableModel extends AbstractTableModel{
    
    private List<Departamento> lista;
    
    public DepartamentoTableModel(List<Departamento> list){
        this.lista = list;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Departamento dept = lista.get(rowIndex);
        switch(columnIndex) {
            case 0: 
                return dept.getCodigo();
            case 1:
                return dept.getNome();
            case 2:
                return dept.getRamal();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "Código";
            case 1:
                return "Nome";
            case 2:
                return "Ramal";
        }
        return "";
    }
    
    public void atualizaLista(List<Departamento> list){
        this.lista = list;
    }
    
    public Departamento getDepartamento(int rowIndex){
        Departamento dept = lista.get(rowIndex);
        return dept;
    }
    
}
