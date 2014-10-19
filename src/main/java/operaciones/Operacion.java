package operaciones;

public abstract class Operacion extends Expresion {
    protected Expresion operando1;
    protected Expresion operando2;
    private char operador;

   
    public Operacion(final Expresion operando1, final char operador, final Expresion operando2) {
        this.operando1=operando1;
        this.operador = operador;
        this.operando2=operando2;
        
    }

    @Override
    protected abstract int operar();
    @Override
    protected final String toSring() {
        return "(" + operando1.toSring() + operador + operando2.toSring() + ")";
    }

}
