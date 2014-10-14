package operaciones;

public class OperacionMain {
	
	public static void main(String[] args){
		
		OperacionesHandler op = new OperacionesHandler();
				
		op.ejecuta(new Addition(1,2));
		op.ejecuta(new Substraction(4,3));
				
		
	}

}
