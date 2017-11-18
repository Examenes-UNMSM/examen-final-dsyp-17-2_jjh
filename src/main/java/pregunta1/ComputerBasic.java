package pregunta1;


public class ComputerBasic extends Computer implements ComputerI {

    
	public ComputerBasic(Finish finish, Storage storage, Processor processor, Memory memory) {
		super(finish, storage, processor, memory);
	}
	
	public String getDescripcion(){
    	System.out.println("Basic Computer:\n" + super.getDescription());    	
    }

}
