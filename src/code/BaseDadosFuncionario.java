package code;

import java.util.ArrayList;
import java.util.List;

public class BaseDadosFuncionario {

    public static BaseDadosFuncionario instancia;
    protected static List<Funcionario> baseFuncionarios = new ArrayList<>();

    protected BaseDadosFuncionario() {

    }

    public static BaseDadosFuncionario getInstancia() {
        if (instancia == null) {
            instancia = new BaseDadosFuncionario();
        }
        return instancia;
    }

    public static List<Funcionario> getBaseFuncionarios() {
        return baseFuncionarios;
    }

    public void setBaseFuncionarios(Funcionario funcionario) {
        BaseDadosFuncionario.baseFuncionarios.add(funcionario);
    }

    public String[] getNomes() {
        String[] listaNomes = new String[baseFuncionarios.size()];
        int contador = 0;
        for (Funcionario f : baseFuncionarios) {
            listaNomes[contador] = f.getNome();
            contador++;
        }
        return listaNomes;
    }

    public Funcionario getFuncionarioPorCodigo(int codigo) {
        for (Funcionario func : baseFuncionarios) {
            if (func.getCod_func() == codigo) {
                return func;
            }
        }
        return null;  // Retorna null se nenhum funcionário com o código fornecido for encontrado
    }

    public void alterarFuncionario(Funcionario funcExistente) {
        for (int i = 0; i < baseFuncionarios.size(); i++) {
            if (baseFuncionarios.get(i).getCod_func() == funcExistente.getCod_func()) {
                baseFuncionarios.set(i, funcExistente);
                break;
            }
        }
    }

    public boolean excluirFuncionarioPorNome(String nome) {
        for (int i = 0; i < baseFuncionarios.size(); i++) {
            if (baseFuncionarios.get(i).getNome().equals(nome)) {
                baseFuncionarios.remove(i);
                return true;
            }
        }
        return false;  // Retorna false se nenhum funcionário com o nome fornecido for encontrado
    }

    public Funcionario getFuncionarioPorNome(String nome) {
        for (Funcionario func : baseFuncionarios) {
            if (func.getNome().equals(nome)) {
                return func;
            }
        }
        return null;  // Retorna null se nenhum funcionário com o nome fornecido for encontrado
    }

    public void addFuncionario(Funcionario funcionario) {
        baseFuncionarios.add(funcionario);
    }

    public List<Funcionario> getFuncionariosPorDepartamento(String departamento) {
        List<Funcionario> funcionariosDoDepartamento = new ArrayList<>();

        for (Funcionario func : this.getBaseFuncionarios()) {
            if (func.getDepartamento() != null && func.getDepartamento().equals(departamento)) {
                funcionariosDoDepartamento.add(func);
            }
        }

        return funcionariosDoDepartamento;
    }

}
