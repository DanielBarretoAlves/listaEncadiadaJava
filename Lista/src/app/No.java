package app;

/**
 * No
 */
public class No {

    private Pessoa p;
    private No prox;

    public No(Pessoa pe)
    {
        this.p = pe;
        this.prox = null;
    }//----------------------Constructor

    public Pessoa getP() {
        return p;
    }

    public void setP(Pessoa p) {
        this.p = p;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
    
}