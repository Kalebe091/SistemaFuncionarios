package code;

public class Pagamento {  
    private Integer cod_pag;
    private String data;
    private Pagamento func;
    private Double valor;

    public Pagamento(Integer cod_pag, String data, Pagamento func, Double valor) {
        this.cod_pag = cod_pag;
        this.data = data;
        this.func = func;
        this.valor = valor;
    }

    public Double calculaValorLiquido() {
        // Implemente o cálculo do valor líquido do pagamento aqui
        // Por exemplo, você pode subtrair os descontos do valor total
        return valor;
    }

    public Integer getCod_pag() {
        return cod_pag;
    }

    public void setCod_pag(Integer cod_pag) {
        this.cod_pag = cod_pag;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Pagamento getFunc() {
        return func;
    }

    public void setFunc(Pagamento func) {
        this.func = func;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}