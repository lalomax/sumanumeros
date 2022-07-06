public class Main {
    public static void main(String[] args) {
        int resultado;
        resultado = suma(3, 5, 4);
        System.out.println("El resultado es: " +
                resultado);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}