import acm.graphics.*;
public class Ejercicio1 extends acm.program.ConsoleProgram {
 
	 /*
	  * tenemos una fiesta de ardillas y tiene exito cuando
	  *  el numero de bellotas esta entre 40 y 60 a.i. excepto cuando es fin de semana que no hay limite de bellotas
	  *  devuelve true si la fiesta tiene exito o false si no lo tiene
	  */
	 
		 private boolean fiestaArdillas(int bellotas, boolean finDeSemana) {
			    if (finDeSemana){
			    	return true;
			    }
			    else if(bellotas >= 40 && bellotas <= 60){
			    return true;
		 }
		return false;
		 }
			    	
 public void run(){
	 
	 
	 
	 println(fiestaArdillas (40, false));
	 println(fiestaArdillas (60, false));
	 println(fiestaArdillas (70, true));
 }

}

