package operaciones;

public class Substraction extends Operacion {

  
    public Substraction(final Expresion op1, final Expresion op2) {
        super(op1, '-',op2);
    }
    @Override
    protected final int operar() {
        return  operando1.operar() + operando2.operar();
    }

}