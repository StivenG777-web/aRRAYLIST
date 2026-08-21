import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    /*ArrayList<String> frutas = new ArrayList<>();

        frutas.add("Mango");
        frutas.add("Banano");
        frutas.add("Naranja");
        frutas.add(1,"Fresa");
        
        frutas.set(0, "Pera");
        frutas.remove(2);
        frutas.remove("Naranja");

        String primera = frutas.get(0);
        String segunda = frutas.get(1);
        String tercera = frutas.get(2);
        System.out.println(frutas);
        String cuarta = frutas.get(3);

        System.out.println("Resultado: " + primera + " " + segunda);

        int cantidad = frutas.size();
        System.out.println("Cantidad: " + cantidad);

        boolean contiene = frutas.contains("Mango");
        System.out.println("Contiene Mango: " + contiene);

        boolean no = frutas.contains("banano");
        System.out.println("No contiene banano: " + no);

        boolean vacia = frutas.isEmpty();
        System.out.println("Está vacía: " + vacia);

        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        for (int i = 0; i < frutas.size(); i++) {
            System.out.println(i + ": " + frutas.get(i));
        }
    }
    
    ArrayList<Estudiante> grupo = new ArrayList<>();
        
            grupo.add(new Estudiante("Juan", 2.5));
            grupo.add(new Estudiante("Maria", 3.8));
            grupo.add(new Estudiante("Pedro", 4.2));
            grupo.add(new Estudiante("Ana", 3.0));

        for (Estudiante e: grupo) {
            System.out.println(e);
        }

        double suma = 0;
        for (Estudiante e: grupo) {
            suma += e.getNota();
        }
        System.out.println("promedio: " + (suma / grupo.size()));

        Estudiante mejor = grupo.get(0);
        for (Estudiante e: grupo) {
            if (e.getNota() > mejor.getNota()) {
                mejor = e;
            }
        }
        System.out.println("Mejor estudiante: " + mejor.getNombre() + " con nota " + mejor.getNota());

        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero");
            System.out.println("Error: " + e.getMessage());
        }

        try {
            String texto = null;
            System.out.println(texto.length());
        } catch (NullPointerException e) {
            System.out.println("Error: la variable no tiene valor asignado");
        }

        try {
            String entrada = "abc";
            int numero = Integer.parseInt(entrada);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage() + " no es un número válido.");
        }

        try {
            int[] arr = {10, 20, 30};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: indice " + e.getMessage() + " no existe.");
        }

        try {
            String texto = null;
            int numero = Integer.parseInt(texto);
            int resultado = numero / 0;
        } catch (NullPointerException e) {
            System.out.println("Variable nula: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Formato invalido: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error aritmético: " + e.getMessage());
        }

        try {
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        } 
         

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            int numero = sc.nextInt();
            System.out.println("El doble es: " + (numero * 2));
        } catch (Exception e) {
            System.out.println("Debe ingresar un número entero.");
        } finally {
            sc.close();
            System.out.println("Programa finalizado.");
        }

        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            System.out.println(e.getClass().getSimpleName());
            e.printStackTrace();
        }*/
       try {
            System.out.println("Raiz cuadrada de 25: " + calcularRaiz(25));
            System.out.println("Raiz cuadrada de -4: " + calcularRaiz(-4));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } 
    }

        //System.out.println("Raiz cuadrada de 16: " + calcularRaiz(16));
        //System.out.println("Raiz cuadrada de -4: " + calcularRaiz(-4));
    
    public static double calcularRaiz(double numero) {
        if (numero < 0) {
            throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(numero);
    }
}







