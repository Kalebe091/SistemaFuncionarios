package code;

public class Contratado {
    private String dataInicio;
    private String dataFim;
    private Double salarioHora;

    
    private double horasTrabalhadas;
    private double salarioContratado;
    void calculoSalarioLiquidoCont(){

        this.setSalarioContratado(this.getHorasTrabalhadas() * this.getSalarioHora());
        System.out.println(this.getSalarioContratado());

    }
    public Contratado(String dataInicio, String dataFim, Double salarioHora) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.salarioHora = salarioHora;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public Double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(Double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public Double calculaSalarioLiquido(int quantHoras) {
        return quantHoras * salarioHora;
    }

    /**
     * @return the horasTrabalhadas
     */
    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    /**
     * @param horasTrabalhadas the horasTrabalhadas to set
     */
    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    /**
     * @return the salarioContratado
     */
    public double getSalarioContratado() {
        return salarioContratado;
    }

    /**
     * @param salarioContratado the salarioContratado to set
     */
    public void setSalarioContratado(double salarioContratado) {
        this.salarioContratado = salarioContratado;
    }
}