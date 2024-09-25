public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Crear una instancia de la clase Repaso.
         * 
         * Una 'instancia' es un objeto concreto creado a partir de una clase.
         * En este caso, estamos creando un nuevo objeto llamado 'dataStructuresPrep' a
         * partir
         * de la clase 'Repaso'. Cada instancia de una clase tiene sus propios
         * atributos y métodos, lo que significa que podemos usar 'dataStructuresPrep'
         * para
         * acceder a los métodos definidos dentro de la clase 'Repaso'.
         */
        DataStructuresPrep dataStructuresPrep = new DataStructuresPrep();

        /*
         * Usar la instancia 'dataStructuresPrep' para llamar al método
         * 'subtractWithoutSubtracting'.
         * 
         * Ahora que tenemos una instancia de 'Repaso', podemos usarla para llamar a sus
         * métodos.
         * Aquí, llamamos al método 'subtractWithoutSubtracting', pasando 15 y 5 como
         * argumentos.
         * Este método está diseñado para restar el segundo número del primero sin usar
         * el
         * operador de resta tradicional. Es un buen ejercicio para entender cómo
         * podemos
         * realizar operaciones básicas de manera creativa en programación.
         */
        int resultado_r  = dataStructuresPrep.subtractAlgorithm(30, 5);
        int resultado_m  = dataStructuresPrep.multiplyAlgorithm(3, 5);
        int resultado_d  = dataStructuresPrep.divideWAlgorithm(20, 5);
        boolean resultado_np  = dataStructuresPrep.isPerfectNumber(28);//isPerfectNumber
        int resultado_f  = dataStructuresPrep.getFactorial(5);//getFactorial
        int resultado_max  = dataStructuresPrep.findMaximum(new int[]{1, 5, 3, 6, 8, 2});//findMaximum
        int resultado_pw  = dataStructuresPrep.powerAlgorithm(2,3);//powerAlgorithm
        boolean resultado_pr  = dataStructuresPrep.isPrime(5);//isPrime
        int resultado_c  = dataStructuresPrep.countDigits(12345);//countDigits

        /*
         * Imprimir el resultado de la operación.
         * 
         * Finalmente, imprimimos el resultado de la operación a la consola. Esto nos
         * permite
         * ver el resultado de nuestro método 'subtractWithoutSubtracting'. En este
         * ejemplo,
         * estamos esperando que el resultado sea 10, ya que 15 menos 5 es igual a 10.
         * Esta línea demuestra cómo podemos interactuar con los métodos de nuestras
         * instancias
         * y usar los resultados de sus operaciones en otras partes de nuestro código,
         * como
         * parte de mensajes de salida o en lógicas de decisión más complejas.
         */
        System.out.println("El resultado de subtractAlgorithm es: " + resultado_r);
        System.out.println("El resultado de multiplyAlgorithm es: " + resultado_m);
        System.out.println("El resultado de divideWAlgorithm es: " + resultado_d);
        System.out.println("El resultado de isPerfectNumber es: " + resultado_np);
        System.out.println("El resultado de getFactorial es: " + resultado_f);
        System.out.println("El resultado de findMaximum es: " + resultado_max);
        System.out.println("El resultado de powerAlgorithm es: " + resultado_pw);
        System.out.println("El resultado de isPrime es: " + resultado_pr);
        System.out.println("El resultado de countDigits es: " + resultado_c);


    }
}
