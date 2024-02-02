package code;

import java.util.ArrayList;
import java.util.List;

public class BaseDadosDeparta {

    public static BaseDadosDeparta instancia;
    protected static List<Departamento> baseDepatamentos = new ArrayList<>();

    protected BaseDadosDeparta() {

    }

    public static BaseDadosDeparta getInstancia() {
        if (instancia == null) {
            instancia = new BaseDadosDeparta();
        }
        return instancia;
    }

    /**
     * @return the baseDepatamentos
     */
    public static List<Departamento> getBaseDepatamentos() {
        return baseDepatamentos;
    }

    /**
     * @param departamento
     */
    public void setBaseDepatamentos(Departamento departamento) {
        BaseDadosDeparta.baseDepatamentos.add(departamento);
    }

    public String[] getNomes() {
        String[] listaNomes = new String[baseDepatamentos.size()];
        int contador = 0;
        for (Departamento d : baseDepatamentos) {
            listaNomes[contador] = d.getNome();
            contador++;
        }
        return listaNomes;
    }

    public Departamento getDepartamentoPorCodigo(int codigo) {
        for (Departamento dept : baseDepatamentos) {
            if (dept.getCodigo() == codigo) {
                return dept;
            }
        }
        return null;  // Retorna null se nenhum departamento com o código fornecido for encontrado
    }

    public void alterarDepartamento(Departamento deptExistente) {
        for (int i = 0; i < baseDepatamentos.size(); i++) {
            if (baseDepatamentos.get(i).getCodigo() == deptExistente.getCodigo()) {
                baseDepatamentos.set(i, deptExistente);
                break;
            }
        }

    }

    public boolean excluirDepartamentoPorNome(String nome) {
        for (int i = 0; i < baseDepatamentos.size(); i++) {
            if (baseDepatamentos.get(i).getNome().equals(nome)) {
                baseDepatamentos.remove(i);
                return true;
            }
        }
        return false;  // Retorna false se nenhum departamento com o nome fornecido for encontrado
    }

    public Departamento getDepartamentoPorNome(String nome) {
        for (Departamento dept : baseDepatamentos) {
            if (dept.getNome().equals(nome)) {
                return dept;
            }
        }
        return null;  // Retorna null se nenhum departamento com o nome fornecido for encontrado
    }
    public void addDepartamento(Departamento departamento){
        baseDepatamentos.add(departamento);
    } 
}
