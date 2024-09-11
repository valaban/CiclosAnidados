public class PiramideInvertida {
    public static void main(String[] args) {
        // Ciclo externo para controlar las líneas (de 1 a 6)
        for (int i = 1; i <= 6; i++) {
            // Ciclo interno para imprimir los asteriscos en cada línea
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Imprimir un salto de línea después de cada fila de asteriscos
            System.out.println();
        }
    }
}
