package kodigo.modulo1.semana2.guia1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int intentos = 0;
        Scanner entrada = new Scanner(System.in);
        String claveDB = "kodigo";
        String clave = "";
        while(!claveDB.equals(clave)){
            if(intentos == 10){
                System.out.println("Has excedido el número de intentos permitidos");
                break;
            }
            System.out.println("Tienes " + (10 - intentos) + " intentos restantes");
            System.out.println("Ingrese la clave: ");
            clave = entrada.nextLine();
            if(!claveDB.equals(clave)){
                //"!claveDB.equals(clave)" es lo mismo que "claveDB.equals(clave) == false" pero al poner el signo de admiración (!)
                //se simplifica la lectura del código
                System.out.println("Clave incorrecta");
                if(intentos == 0){
                    System.out.println("Intenta de nuevo, recuerda que la clave posee " + claveDB.length() + " caracteres");
                }
                if(intentos == 1){
                    System.out.println("Intenta de nuevo, recuerda que la clave posee la letra inicial '" + claveDB.charAt(0) + "' y la letra final '" + claveDB.charAt(claveDB.length() - 1) + "'");
                }
            }else{
                System.out.println("Clave correcta");
            }
            intentos++;

        }
    }
}