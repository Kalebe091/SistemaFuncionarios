package tablesModel;

import code.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class FuncionarioTableModel extends AbstractTableModel {

    private List<Funcionario> lista;

    public FuncionarioTableModel(List<Funcionario> list) {
        this.lista = list;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 7; // Ajuste este valor para o número de colunas que você deseja
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Funcionario func = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return func.getCod_func();
            case 1:
                return func.getNome();
            case 2:
                return func.getCpf();
            case 3:
                return func.getSalario();
            case 4:
                return func.getTelefone();
            case 5:
                return func.getEmail();
            case 6:
                return func.getCargaHoraria();
        }
        return "";
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Codigo";
            case 1:
                return "Nome";
            case 2:
                return "CPF";
            case 3:
                return "Salario";
            case 4:
                return "Telefone";
            case 5:
                return "Email";
            case 6:
                return "Carga Horaria";
        }
        return "";
    }

    public void atualizaLista(List<Funcionario> list) {
        this.lista = list;
    }

    public Funcionario getFuncionario(int rowIndex) {
        Funcionario func = lista.get(rowIndex);
        return func;
    }
}
