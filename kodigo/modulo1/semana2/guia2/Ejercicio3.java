package kodigo.modulo1.semana2.guia2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio del articulo: ");
        int precioInicial = scanner.nextInt();
        int precioFinal = 0;
        int descuento = 0;
        if(precioInicial >= 200){
            precioFinal = precioInicial - (precioInicial * 15 / 100);
            descuento = 15;
        }else if (precioInicial > 100 && precioInicial < 200) {
            precioFinal = precioInicial - (precioInicial * 12 / 100);
            descuento = 12;
        } else if (precioInicial < 100) {
            precioFinal = precioInicial - (precioInicial * 10 / 100);
            descuento = 10;
        }
        System.out.println("El precio final del producto es: $" + precioFinal + " con un descuento del " + descuento + "%");
    }
}
