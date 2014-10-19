package operaciones;

public class Substraction extends Operacion {

  
    public Substraction(Expresion op1, Expresion op2) {
        super(op1, '-',op2);
    }
    
    
    @Override
    protected int operar() {
        return  operando1.operar() - operando2.operar();
    }

}