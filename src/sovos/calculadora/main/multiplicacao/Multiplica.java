package sovos.calculadora.main.multiplicacao;

public class Multiplica {
    private int valor1;
    private int valor2;
    private int resultado;

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public void multiplicarValores(){
        setResultado(getValor1()*getValor2());
    }
    public void multiplicarValores(int val1 ,int val2){
        setResultado(val1*val2);
    }
    public int multiplicarValores(int val1){
        return val1 * this.valor2;
    }
}
