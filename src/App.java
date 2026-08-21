import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
    //ArrayList<String> frutas = new ArrayList<>();

        //frutas.add("Mango");
        //frutas.add("Banano");
        //frutas.add("Naranja");
        //frutas.add(1,"Fresa");
        
       // frutas.set(0, "Pera");
        //frutas.remove(2);
        //frutas.remove("Naranja");

        //String primera = frutas.get(0);
        //String segunda = frutas.get(1);
        //String tercera = frutas.get(2);
        //System.out.println(frutas);
        //String cuarta = frutas.get(3);

        //System.out.println("Resultado: " + primera + " " + segunda);

        //int cantidad = frutas.size();
        //System.out.println("Cantidad: " + cantidad);

        //boolean contiene = frutas.contains("Mango");
        //System.out.println("Contiene Mango: " + contiene);

        //boolean no = frutas.contains("banano");
      //  System.out.println("No contiene banano: " + no);

    //    boolean vacia = frutas.isEmpty();
    //    System.out.println("Está vacía: " + vacia);

    //    for (String fruta : frutas) {
         //   System.out.println(fruta);
       // }

        //for (int i = 0; i < frutas.size(); i++) {
        //    System.out.println(i + ": " + frutas.get(i));
        //}
    //}
    
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

    }
}

