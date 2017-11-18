package pregunta1;

public class CumputerFactory {

	public ComputerInterface getComputer(String tipo) {
		
		if(tipo.equalsIgnoreCase("B")) {
			return new ComputerBasic(new Finish(), new Storage(), new Processor(), new Memory());
		} else if (tipo.equalsIgnoreCase("O")) {
			return new ComputerBasic(new Finish(), new Storage(), new Processor(), new Memory());			
		} else if (tipo.equalsIgnoreCase("D")) {
			return new ComputerBasic(new Finish(), new Storage(), new Processor(), new Memory());			
		} else if (tipo.equalsIgnoreCase("D")) {
			return new ComputerBasic(new Finish(), new Storage(), new Processor(), new Memory());			
		}
	};
	
}
