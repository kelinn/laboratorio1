import Avion.Avioneta;
import Avion.Jet;
import carro.Carro;
import carro.Sedan;
import carro.Suv;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //ejecutarCarro();
		  ejecutarAvion();
	}
    private static void ejecutarCarro(){
        Carro carro=new Suv();
      carro.imprimir();
      
      carro = new Sedan();
      carro.imprimir();
  }
   private static void ejecutarAvion(){
      Aeropuerto aeropuerto= new Aeropuerto(new Jet());
      aeropuerto.takingOff();
      
      aeropuerto= new Aeropuerto(new Avioneta());
      aeropuerto.takingOff();
  }
   
 
  
}
