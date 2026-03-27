import java.util.Scanner;

public class Extra2_HPF2 {

    public void calcularSalario() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuántas horas has trabajado esta semana?: ");
        int horasTotales = sc.nextInt();

        int horasNormales;
        int horasExtras = 0;
        double salarioNormal;
        double salarioExtra = 0;
        double salarioTotal;

        if (horasTotales <= 40) {
            horasNormales = horasTotales;
            salarioNormal = horasNormales * 16;
        } else {
            horasNormales = 40;
            horasExtras = horasTotales - 40;
            salarioNormal = horasNormales * 16;
            salarioExtra = horasExtras * 20;
        }

        salarioTotal = salarioNormal + salarioExtra;

        System.out.println("\n--- Desglose semanal ---");
        System.out.println("Horas normales: " + horasNormales + " (Pago: " + salarioNormal + "€)");

        if (horasExtras > 0) {
            System.out.println("Horas extras: " + horasExtras + " (Pago: " + salarioExtra + "€)");
        }

        System.out.println("-----------------------------------");
        System.out.println("salario total: " + salarioTotal + "€");
    }

    public static void main(String[] args) {
        Extra2_HPF2 obrero = new Extra2_HPF2();
        obrero.calcularSalario();
    }
}