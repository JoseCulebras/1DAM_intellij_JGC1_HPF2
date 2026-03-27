import java.util.Scanner;

public class Extra1_JGC1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Variables para los totales
        double totalSinDescuento = 0;
        double totalDescuento = 0;

        // Procesaremos 3 productos
        for (int i = 1; i <= 3; i++) {
            System.out.print("Ingrese el nombre del producto " + i + ": ");
            String nombre = teclado.nextLine();

            System.out.print("Ingrese el precio de " + nombre + ": ");
            double precio = Double.parseDouble(teclado.nextLine());

            // Lógica del descuento
            double descuento;
            if (precio < 50) {
                descuento = precio * 0.08; // 8%
            } else {
                descuento = precio * 0.10; // 10%
            }

            // Imprimir línea del producto
            System.out.println(nombre + " ... " + precio + " euros (descuento " + descuento + " euros)");

            // Acumular totales
            totalSinDescuento += precio;
            totalDescuento += descuento;
        }

        double totalConDescuento = totalSinDescuento - totalDescuento;

        // Resultados finales
        System.out.println("---------------------------");
        System.out.println("Precio a pagar sin descuento (" + totalSinDescuento + " euros)");
        System.out.println("Precio a pagar con descuento (" + totalConDescuento + " euros)");
        System.out.println("Con un ahorro de " + totalDescuento + " euros.");

        teclado.close();
    }
}