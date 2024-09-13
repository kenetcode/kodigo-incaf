package kodigo.modulo1.semana4.algoritmosordenamiento;

public class ObjetoPersona {
    String nombre;
    int edad;
    //Constructor de la clase ObjetoPersona que recibe dos parámetros: nombre y edad.
    public ObjetoPersona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    //Método toString que retorna una cadena con el nombre y la edad de la persona.
    //Este método es llamado automáticamente cuando se imprime un objeto de tipo ObjetoPersona.
    //Ejemplo: System.out.println(persona);
    //En este caso, se imprimirá el nombre y la edad de la persona.
    //Si se desea imprimir un objeto de tipo ObjetoPersona en un formato diferente, se puede modificar este método.
    //Por ejemplo, si se desea imprimir el nombre y la edad de la persona en una sola línea, se puede modificar el método toString de la siguiente manera:
    //public String toString(){
    //    return nombre + " " + edad;
    //}
    //De esta manera, al imprimir un objeto de tipo ObjetoPersona, se mostrará el nombre y la edad de la persona en una sola línea.
    @Override
    public String toString(){
        return "Nombre: " + nombre + " Edad: " + edad;
    }
}