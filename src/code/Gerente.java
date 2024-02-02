package code;

public class Gerente extends Funcionario {
    private String dataInicioGerente;
    private String dataFimGerente;
    private int adicionaPercent;

    public Gerente(
        String nome,
        String dataInicioGerente,
        String dataFimGerente,
        int adicionaPercent,
        String dataInicio, 
        String dataFim,
        double salarioBruto,
        double descontos,
        double salarioHora
    ) {
       // super(dataInicio, dataFim, salarioBruto, descontos, salarioHora);
        this.dataInicioGerente = dataInicioGerente;
        this.dataFimGerente = dataFimGerente;
        this.adicionaPercent = adicionaPercent;
    }

    // Getters
    public String getDataInicioGerente() {
        return dataInicioGerente;
    }

    public String getDataFimGerente() {
        return dataFimGerente;
    }

    public int getAdicionaPercent() {
        return adicionaPercent;
    }

    // Setters
    public void setDataIniciogerente(String dataInicio) {
        this.dataInicioGerente = dataInicio;
    }

    public void setDataFimGerente(String dataFim) {
        this.dataFimGerente = dataFim;
    }

    public void setAdicionaPercent(int adicionaPercent) {
        this.adicionaPercent = adicionaPercent;
    }

    public double calculaSalarioLiquidoPorMes(int horasTrabalhadas, Double salario) {
        Double salarioFinal;

        if (horasTrabalhadas >= 1 && horasTrabalhadas <= 30) {
            salarioFinal = salario / 150 * 0.5;
        } else if (horasTrabalhadas >= 30 && horasTrabalhadas <= 36) {
            salarioFinal = salario / 180 * 0.54;
        } else if (horasTrabalhadas >= 36 && horasTrabalhadas <= 40) {
            salarioFinal = salario / 200 * 0.6;
        } else if (horasTrabalhadas >= 40 && horasTrabalhadas <= 44) {
            salarioFinal = salario / 220 * 0.66;
        } else {
            salarioFinal = 0.0;
        }
           return salarioFinal;
    }
}