package sovos.calculadora.main;
import sovos.calculadora.main.soma.Soma;
import sovos.calculadora.main.subtracao.Subtrai;
import sovos.calculadora.main.multiplicacao.Multiplica;
import sovos.calculadora.main.divisao.Divide;

public class Calculadora {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println("Resultado da soma por Atributo: " + calculadora.getSomarAtributo(50, 2));
        System.out.println("Resultado da soma por Parametro: " + calculadora.getSomarParametro(70, 2));
        System.out.println("Resultado da soma por Atributo e Parametro: " + calculadora.getSomarParametroeAtributo(90, 2));

        System.out.println("Resultado da subtracao por Atributo: " + calculadora.getSubtrairAtributo(90, 2));
        System.out.println("Resultado da subtracao por Parametro: " + calculadora.getSubtrairParametro(90, 3));
        System.out.println("Resultado da subtracao por Atributo e Parametro: " + calculadora.getSubtrairParametroeAtributo(90, 4));

        System.out.println("Resultado da multiplicacao por Atributo: " + calculadora.getMultiplicarAtributo(90, 2));
        System.out.println("Resultado da multiplicacao por Parametro: " + calculadora.getMultiplicarParametro(90, 3));
        System.out.println("Resultado da multiplicacao por Atributo e Parametro: " + calculadora.getMultiplicarParametroeAtributo(90, 4));

        System.out.println("Resultado da divisao por Atributo: " + calculadora.getDividirAtributo(90, 2));
        System.out.println("Resultado da divisao por Parametro: " + calculadora.getDividirParametro(90, 3));
        System.out.println("Resultado da divisao por Atributo e Parametro: " + calculadora.getDividirParametroeAtributo(90, 4));


    }




    private int getSomarParametro(int n1, int n2) {
        Soma somatoria = new Soma();
        somatoria.somarValores(n1,n2);
        return somatoria.getResultado();

    }

    private int getSomarAtributo(int n1, int n2) {
        Soma somatoria = new Soma();
        somatoria.setValor1(n1);
        somatoria.setValor2(n2);
        somatoria.somarValores();
        return somatoria.getResultado();
    }

    private int getSomarParametroeAtributo(int n1, int n2) {
        Soma somatoria = new Soma();
        somatoria.setValor2(n2);
        return somatoria.somarValores(n1);
    }
    private int getSubtrairAtributo(int n1, int n2) {
        Subtrai subtrai = new Subtrai();
        subtrai.setValor1(n1);
        subtrai.setValor2(n2);
        subtrai.subtrairValores();
        return subtrai.getResultado();
    }
    private int getSubtrairParametro(int n1, int n2) {
        Subtrai subtrai = new Subtrai();
        subtrai.subtrairValores(n1,n2);
        return subtrai.getResultado();

    }
    private int getSubtrairParametroeAtributo(int n1, int n2) {
        Subtrai subtrai = new Subtrai();
        subtrai.setValor2(n2);
        return subtrai.subtrairValores(n1);
    }

    private int getMultiplicarAtributo(int n1, int n2) {
        Multiplica multiplica = new Multiplica();
        multiplica.setValor1(n1);
        multiplica.setValor2(n2);
        multiplica.multiplicarValores();
        return multiplica.getResultado();

    }
    private int getMultiplicarParametro(int n1, int n2) {
        Multiplica multiplica = new Multiplica();
        multiplica.multiplicarValores(n1,n2);
        return multiplica.getResultado();
    }
    private int getMultiplicarParametroeAtributo(int n1, int n2) {
        Multiplica multiplica = new Multiplica();
        multiplica.setValor2(n2);
        return multiplica.multiplicarValores(n1);
    }

    private int getDividirAtributo(int n1, int n2) {
        Divide divisao = new Divide();
        divisao.setValor1(n1);
        divisao.setValor2(n2);
        divisao.dividirValores();
        return divisao.getResultado();
    }
    private int getDividirParametro(int n1, int n2) {
        Divide divisao = new Divide();
        divisao.dividirValores(n1,n2);
        return divisao.getResultado();
    }
    private int getDividirParametroeAtributo(int n1, int n2) {
        Divide divisao = new Divide();
        divisao.setValor2(n2);
        return divisao.dividirValores(n1);
    }


}
