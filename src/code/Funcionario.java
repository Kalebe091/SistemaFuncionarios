package code;

import java.util.List;

public class Funcionario{
    private Integer cod_func;
    private String nome;
    private long cpf;
    private Double salario;
    private String telefone;
    private String email;
    private Departamento departamento;
    private List<Pagamento> listaPag;
    
    private double salarioGerente; 
    private Integer cargaHoraria;
    private double salarioFuncionario;
    private double salarioLiquido;
    private Integer horasExtras;
    private double valorHora;
    private double divisorDeJornada;
    private Integer adicionalPercent;
    
    void CalculaSalarioLiquido(){
        this.setDivisorDeJornada(this.getCargaHoraria() * 5);
        this.setValorHora(this.getSalarioFuncionario() / this.getDivisorDeJornada());
        this.setValorHora((this.getDivisorDeJornada() / 10) + this.getValorHora());

            this.setSalarioLiquido((this.getValorHora() * this.getHorasExtras()) + this.getSalarioFuncionario());
            double teste;
            teste = this.getSalarioLiquido();
            this.setSalarioGerente((teste/100)*this.getAdicionalPercent() + teste);
        
        
        
                
    }
        @Override
    public String toString() {
        return "Departamento{" +
               "codigo=" + cod_func +
               ", nome='" + nome + '\'' +
               ", salario='" + salario + '\'' +
               '}';
    }
    // Construtor
    public Funcionario(){
    
    }
    
    public Funcionario(Integer codigo, String nomeFunc, long cpfFunc, Double salarioFunc, String telefoneFunc, String emailFunc, Integer cHoraria) {
        cod_func = codigo;
        nome = nomeFunc;
        cpf = cpfFunc;
        salario = salarioFunc;
        telefone = telefoneFunc;
        email = emailFunc;
        cargaHoraria = cHoraria;
        
    }


    /**
     * @return the cod_func
     */
    public Integer getCod_func() {
        return cod_func;
    }

    /**
     * @param cod_func the cod_func to set
     */
    public void setCod_func(Integer cod_func) {
        this.cod_func = cod_func;
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
     * @return the cpf
     */
    public long getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the salario
     */
    public Double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the departamento
     */
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    /**
     * @return the listaPag
     */
    public List<Pagamento> getListaPag() {
        return listaPag;
    }

    /**
     * @param listaPag the listaPag to set
     */
    public void setListaPag(List<Pagamento> listaPag) {
        this.listaPag = listaPag;
    }

    /**
     * @return the cargaHoraria
     */
    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * @param cargaHoraria the cargaHoraria to set
     */
    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    /**
     * @return the salarioGerente
     */
    public double getSalarioGerente() {
        return salarioGerente;
    }

    /**
     * @param salarioGerente the salarioGerente to set
     */
    public void setSalarioGerente(double salarioGerente) {
        this.salarioGerente = salarioGerente;
    }

    /**
     * @return the salarioFuncionario
     */
    public double getSalarioFuncionario() {
        return salarioFuncionario;
    }

    /**
     * @param salarioFuncionario the salarioFuncionario to set
     */
    public void setSalarioFuncionario(double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    /**
     * @return the salarioLiquido
     */
    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    /**
     * @param salarioLiquido the salarioLiquido to set
     */
    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    /**
     * @return the horasExtras
     */
    public Integer getHorasExtras() {
        return horasExtras;
    }

    /**
     * @param horasExtras the horasExtras to set
     */
    public void setHorasExtras(Integer horasExtras) {
        this.horasExtras = horasExtras;
    }

    /**
     * @return the valorHora
     */
    public double getValorHora() {
        return valorHora;
    }

    /**
     * @param valorHora the valorHora to set
     */
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    /**
     * @return the divisorDeJornada
     */
    public double getDivisorDeJornada() {
        return divisorDeJornada;
    }

    /**
     * @param divisorDeJornada the divisorDeJornada to set
     */
    public void setDivisorDeJornada(double divisorDeJornada) {
        this.divisorDeJornada = divisorDeJornada;
    }

    /**
     * @return the adicionalPercent
     */
    public Integer getAdicionalPercent() {
        return adicionalPercent;
    }

    /**
     * @param adicionalPercent the adicionalPercent to set
     */
    public void setAdicionalPercent(Integer adicionalPercent) {
        this.adicionalPercent = adicionalPercent;
    }


}