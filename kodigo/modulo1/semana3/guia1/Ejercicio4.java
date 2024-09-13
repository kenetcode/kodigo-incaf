package kodigo.modulo1.semana3.guia1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        double dineroDisponible = 200; //Pesos disponibles que tiene la persona para viajar
        int costoPorKm = 2; //Costo por kilómetro en pesos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la terminal la \"Tortuga\"");
        System.out.println("Dinero disponible: " + dineroDisponible);
        System.out.println("Por favor indique su destino: ");
        System.out.println("1. México, 750 km");
        System.out.println("2. P.V., 800 km");
        System.out.println("3. Acapulco, 1200 km");
        System.out.println("4. Cancún, 1800 km");
        int seleccion = scanner.nextInt();
        switch (seleccion){
            case 1:
                if(dineroDisponible < costoPorKm * 750 *2){
                    System.out.println("No tienes suficiente dinero para viajar a México");
                    System.out.println("Dinero disponible: " + dineroDisponible);
                    System.out.println("Le falta: " + (costoPorKm * 750 * 2 - dineroDisponible) + " pesos");
                } else {
                    System.out.println("¡Buen viaje a México!");
                    System.out.println("El costo del viaje es: " + costoPorKm * 750 * 2 + " pesos");
                    System.out.println("Le quedan: " + (dineroDisponible - costoPorKm * 750 * 2) + " pesos para gastar");
                }
                break;
            case 2:
                if(dineroDisponible < costoPorKm * 800 *2){
                    System.out.println("No tienes suficiente dinero para viajar a P.V.");
                    System.out.println("Dinero disponible: " + dineroDisponible);
                    System.out.println("Le falta: " + (costoPorKm * 800 * 2 - dineroDisponible) + " pesos");
                } else {
                    System.out.println("¡Buen viaje a P.V.!");
                    System.out.println("El costo del viaje es: " + costoPorKm * 800 * 2 + " pesos");
                    System.out.println("Le quedan: " + (dineroDisponible - costoPorKm * 800 *2) + " pesos para gastar");
                }
                break;
            case 3:
                if(dineroDisponible < costoPorKm * 1200 *2){
                    System.out.println("No tienes suficiente dinero para viajar a Acapulco");
                    System.out.println("Dinero disponible: " + dineroDisponible);
                    System.out.println("Le falta: " + (costoPorKm * 1200 * 2 - dineroDisponible) + " pesos");
                } else {
                    System.out.println("¡Buen viaje a Acapulco!");
                    System.out.println("El costo del viaje es: " + costoPorKm * 1200 * 2 + " pesos");
                    System.out.println("Le quedan: " + (dineroDisponible - costoPorKm * 1200 *2) + " pesos para gastar");
                }
                break;
            case 4:
                if(dineroDisponible < costoPorKm * 1800 *2){
                    System.out.println("No tienes suficiente dinero para viajar a Cancún");
                    System.out.println("Dinero disponible: " + dineroDisponible);
                    System.out.println("Le falta: " + (costoPorKm * 1800 * 2 - dineroDisponible) + " pesos");
                } else {
                    System.out.println("¡Buen viaje a Cancún!");
                    System.out.println("El costo del viaje es: " + costoPorKm * 1800 *2 + " pesos");
                    System.out.println("Le quedan: " + (dineroDisponible - costoPorKm * 1800 *2) + " pesos para gastar");
                }
                break;
            default:
                System.out.println("Opcion inválida");
        }
    }
}
