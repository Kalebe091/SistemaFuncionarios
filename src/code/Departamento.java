package code;

import static code.BaseDadosFuncionario.baseFuncionarios;
import java.util.List;

public class Departamento {


    private Integer codigo;
    private String nome;
    private String ramal;
    private Gerente gerente;
    private List<Funcionario> listaFuncionarios;
    
    public Departamento(){
    }
    
    public Departamento(Integer cod, String nomeDept, String fone){
        codigo = cod;
        nome = nomeDept;
        ramal = fone;
    }
    
    @Override
    public String toString() {
        return "Departamento{" +
               "codigo=" + codigo +
               ", nome='" + nome + '\'' +
               ", ramal='" + ramal + '\'' +
               '}';
    }
    /**
     * @return the codigo
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * @return the ramal
     */
    public String getRamal() {
        return ramal;
    }

    /**
     * @param ramal the ramal to set
     */
    public void setRamal(String ramal) {
        this.ramal = ramal;
    }
    /**
     * @return the listaFuncionarios
     */
    public List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    /**
     * @param listaFuncionarios the listaFuncionarios to set
     */
    public void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }
    public void addFuncionario(Funcionario funcionario) {
        baseFuncionarios.add(funcionario);
    }
    
}
