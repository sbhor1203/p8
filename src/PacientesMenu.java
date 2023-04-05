import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author Audrey Bhor
 *  
 */

public class PacientesMenu {

	
	public static void main(String[] args) {
		Lector con = new Lector();
		Scanner sc = new Scanner(System.in);
		
		PriorityQueue<Paciente> pacientePri = new PriorityQueue<>();
		VectorHeap<Paciente> pacienteVec = new VectorHeap<Paciente>();

		Scanner teclado = new Scanner(System.in);

        Scanner entry = new Scanner(System.in);

		System.out.println("Bienvenido al programa de pacientes");
        String menu = "\n--------------------------------------------------------\n| Seleccione alguna de las siguientes opciones:        |\n| (1) Ordenamiento Arboles                             |\n| (2) Ver Pacientes Heap                        |\n| (3) Salir   |\n|-------------------------------------------------------\nOpcion a elegir: ";
        System.out.println(menu);
        int op = teclado.nextInt();
        teclado.nextLine();
       

        while(op != 3){

            switch(op){
                case 1:{

					con.readPatientList(1);
            		pacientePri = con.getPacientesPri();
            		int turno = 1;
            		while(!pacientePri.isEmpty()) {
            		System.out.println("Turno #: "+turno+" es de : "+ pacientePri.remove());
            		turno += 1;
            	}
                    
                    break;
                }
                case 2:{

						con.readPatientList(2);
						pacienteVec = con.getPacientesVec();
						int turno = 1;
						while(!pacienteVec.isEmpty()) {
						System.out.println("Turno #: "+turno+" es de: "+ pacienteVec.remove());
						turno += 1;
					}
                    
                    
                	break;
                }
				case 3:{
					System.out.print("Gracias por utilizar este programa!");
                    break;
				}
		
	}

	}
}

}
