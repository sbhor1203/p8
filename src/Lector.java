/**
 * @author Audrey Bhor
 *  
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.PriorityQueue;

public class Lector {
	
	PriorityQueue<Paciente> pacientesPri = new PriorityQueue<>();
	VectorHeap<Paciente> pacientesVec = new VectorHeap<Paciente>();
	
	public Lector() {
	}
	
	
	
	public void readPatientList(int typeQueue) {

		String texto = new String();

		try {
			FileReader fr = new FileReader("pacientes.txt");// path
			BufferedReader entrada = new BufferedReader(fr); 
			String s;

			while((s = entrada.readLine()) != null) {
				String[] temp = s.split(", ");
				Paciente pac = new Paciente(temp[0], temp[1], temp[2]);
				if(typeQueue == 1) {
					pacientesPri.add(pac);
				}else {
					pacientesVec.add(pac);
				}
			}
		}
		catch(java.io.FileNotFoundException fnfex) {
			System.out.println("Error, el archivo no se ha encontrado: " + fnfex);}
		catch(java.io.IOException ioex) {}
	}
	
	
	
	public PriorityQueue<Paciente> getPacientesPri(){
		return pacientesPri;
	}
	
	
	public VectorHeap<Paciente> getPacientesVec(){
		return pacientesVec;
	}
}
