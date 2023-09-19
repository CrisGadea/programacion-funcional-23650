public class Calculadora implements Operacionable{

    public Integer suma(Integer valor1, Integer valor2) {
        return valor1 + valor2;
    }

    public Integer resta(Integer valor1, Integer valor2) {
        return valor1 - valor2;
    }

    public Integer multiplicacion(Integer valor1, Integer valor2) {
        return valor1 * valor2;
    }

    public Integer division(Integer valor1, Integer valor2) {
        return valor1 / valor2;
    }
}
