public class Main {

    @FunctionalInterface
    interface calculable{
        Integer operacion(Integer valor1, Integer valor2);
    }

    public static void main(String args[]){

        calculable suma = (valor1, valor2) -> valor1 + valor2;
        calculable resta = (valor1, valor2) -> valor1 - valor2;
        calculable multiplicacion = (valor1, valor2) -> valor1 * valor2;
        calculable division = (valor1, valor2) -> valor1 / valor2;

        System.out.println(suma.operacion(suma.operacion(2,4),5));
    }
}
