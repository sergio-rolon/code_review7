// Sistema que solicita el nombre de un país y si lo conoce devuelve su capital, caso contrario
// solicita se le enseñe cual es la capital de se país
import java.util.HashMap;
import java.util.Scanner;

public class Codigo7 {

	public static void main(String[] args) {
			// Declaración e inicializaición de variables
		  	Scanner s = new Scanner(System.in);
		    HashMap<String, String> capitales = new HashMap<>();
		    capitales.put("Canadá", "Otawwa");
		    capitales.put("Estados Unidos", "Washington DC");
		    capitales.put("México", "México DF");
		    capitales.put("Belice", "Belmopán");
		    capitales.put("Costa rica", "San José");
		    capitales.put("El Salvador", "San Salvador");
		    capitales.put("Guatemala", "Ciudad de Guatemala");
		    capitales.put("Honduras", "Tegucigalpa");
		    capitales.put("Nicaragua", "Managua");
		    capitales.put("Panamá", "Panamá");
		    String c = "";
		    // Ciclo do para pedir el nombre o salir
		    do {
			      System.out.println("Escribe el nombre de un país y te diré su capital: ");
			      System.out.println("O escribe salir para finalizar ");
			      c = s.nextLine();
			      // Validar input para salir o mostrar nombre o pedir insertar capital
			      if (!c.equals("salir")) {
			        if (capitales.containsKey(c)) {
			        	System.out.print("La capital de " + c);
			          System.out.print(" es " + capitales.get(c)+"\n\n");
			        } else {
			          System.out.print("No conozco la respuesta ");
			          System.out.print("¿cuál es la capital de " + c + "?: ");
			          String ca = s.nextLine();
			          capitales.put(c, ca);
			          System.out.println("Gracias por enseñarme nuevas capitales"+"\n\n");
			        }//else
			      }//if
			    } while (!c.equals("salir"));
		    s.close();
	}//main
}//class Codigo7
