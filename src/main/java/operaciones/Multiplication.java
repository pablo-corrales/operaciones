package operaciones;

public class Multiplication extends Operacion {

	  
    public Multiplication( Expresion op1, Expresion op2) {
        super(op1, '*',op2);
    }
    
    
    @Override
    protected int operar() {
        return  operando1.operar() * operando2.operar();
    }

}