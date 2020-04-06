
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *Universidad del Valle de Guatemala
 * @author Olivverde
 * Class's purpose: 
 * Main class executes the entire program
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
    	//File reader
        File file = new File ("pacientes.txt");
	    FileReader reader = new FileReader(file);
        BufferedReader buffered = new BufferedReader(reader);
        
        //Attributes
        String line = "";
        String selection;
        String name; //Patient's name
        String disease;
        String priority;
        
        //Scanners
        Scanner scanner = new Scanner(reader);
        Scanner entry = new Scanner(System.in);
        
        //PriorityQueue
        Priority_Queue<Patient> v = new Priority_Queue<Patient>();
        VectorHeap<Patient> p = new VectorHeap<Patient>();
        
        //Vector<Paciente> pacientes = new Vector<>();
        System.out.println("\n  SISTEMA DE CONTROL DE EMERGENCIAS  ");
		System.out.println("--------------------------------------");
		System.out.println("------CONFIGURACION DEL PROGRAMA------");
		System.out.println("--------------------------------------");
		System.out.println("\nINGRESE LA IMPLEMENTACION CON LA QUE");
		System.out.println("          DESEA TRABAJAR:");
		System.out.println("--------------------------------------");
		System.out.println("1) JFCollection Priority Queue");
		System.out.println("2) Local Priority Queue implementation");
		System.out.print("\nOPCION: ");
        
        String option = entry.nextLine();
        
        //While txt isn't empty
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            //Name
            name = line.substring(0, line.indexOf(","));
            line = line.substring(line.indexOf(",") + 2, line.length());
            //Disease
            disease = line.substring(0, line.indexOf(","));
            line = line.substring(line.indexOf(",") + 2, line.length());
            //Priority
            priority = line.substring(0, line.length());
            
            //External menu
            //Factory
            if (option.equals("1")) 
            {
                p.add(new Patient(name, disease, priority));
                
            }
            else if(option.equals("2"))
            {
                v.add(new Patient(name, disease, priority));
                
            }
         
            reader.close();
            buffered.close();
        }
        //Internal Menu
        while (true)
        {
        	System.out.println("--------------------------------------");
    		System.out.println("---------------OPCIONES---------------");
    		System.out.println("--------------------------------------");
            System.out.println("\n1. Lista de Pacientes");
            System.out.println("2. Siguiente Paciente");
            System.out.println("3. Ingreso de Paciente");
            System.out.println("4. Cerrar");
    		System.out.print("\nOPCION: ");
            selection = entry.nextLine();
            
            
            if (selection.equals("1") && option.equals("1")) 
            {
                System.out.println(p.show(p));
                
            }
            else if (selection.equals("1") && option.equals("2")) 
            {
                System.out.println(v.print(v));
            }
            
            if (selection.equals("2") && option.equals("1")) 
            {
                System.out.println(p.next(p));
                
            }
            else if (selection.equals("2") && option.equals("2")) 
            {
                System.out.println(v.next(v));
            }
             if (selection.equals("3") && option.equals("1")) 
            {
                p.remove();
                
            }
            else if (selection.equals("3") && option.equals("2")) 
            {
                v.poll();
            }
            
            if (selection.equals("4")) 
            {
                break;
                
            }
        }
    }
}
