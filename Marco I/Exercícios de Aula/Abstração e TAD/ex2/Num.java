package ex2;

/**
 * Num
 */
public class Num implements IContador{
    int num;

    public Num(int n) {
        this.num = n;
    }

    @Override
    public void inicializar(int n) {
       n = this.num;
        
    }

    @Override
    public int acessar(int n) {
        n = this.num;
        return num;
    }

    @Override
    public void incrementar() {
        num++;
    }

    @Override
    public void decrementar() {
        num--;
    }


}
