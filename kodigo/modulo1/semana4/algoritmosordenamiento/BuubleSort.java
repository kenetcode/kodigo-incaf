package kodigo.modulo1.semana4.algoritmosordenamiento;

public class BuubleSort {
    public void buubleSortString(String[] array){
        //El algoritmo de ordenamiento burbuja es un algoritmo de comparación que recorre repetidamente
        //una lista que necesita ordenarse, compara elementos adyacentes y los intercambia si están en el
        // orden incorrecto. Este proceso se repite hasta que no se requiere más intercambios, lo que indica que la lista está ordenada.
        int n = array.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - 1; j++){
                if(array[j].compareTo(array[j + 1]) < 0){
                    //temp es una variable temporal que se utiliza para intercambiar los valores de las posiciones j y j + 1
                    String temp = array[j];
                    //Intercambio de valores
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    //Método que ordena un array de Objetos persona por edad
    public void buubleSortObject(ObjetoPersona[] array){
        int n = array.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - 1; j++){
                if(array[j].edad > array[j + 1].edad){
                    ObjetoPersona temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    //Método que ordena un array de Objetos Estudiante por calificacion
    public void buubleSortObject(Estudiante[] array){
        int n = array.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - 1; j++){
                if(array[j].getCalificacion() > array[j + 1].getCalificacion()){
                    Estudiante temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    //Método que ordena un array de Objetos Empleado por salario
    public void buubleSortObject(Empleado[] array){
        int n = array.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - 1; j++){
                if(array[j].getSalario() > array[j + 1].getSalario()){
                    Empleado temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public void buubleSortNegativos(double[] array){
        int n = array.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - 1; j++){
                if(array[j] < array[j + 1]){
                    //temp es una variable temporal que se utiliza para intercambiar los valores de las posiciones j y j + 1
                    double temp = array[j];
                    //Intercambio de valores
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
