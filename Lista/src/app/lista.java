package app;

/**
 * lista
 */
public class lista {

    private No prim;
    private No ult;
    private int qtdNo;

    public lista()
    {
        this.prim = null;
        this.ult = null;
        this.qtdNo = 0;
    }

    public No getPrim() {
        return prim;
    }

    public void setPrim(No prim) {
        this.prim = prim;
    }

    public No getUlt() {
        return ult;
    }

    public void setUlt(No ult) {
        this.ult = ult;
    }

    public int getQtdNo() {
        return qtdNo;
    }

    public void setQtdNo(int qtdNo) {
        this.qtdNo = qtdNo;
    }//-----------------------------------Gets e Setters

    public void inserirPrimeiro(Pessoa p) {
        No novoNo = new No(p);
        if (this.eVazia()) {
            this.ult = novoNo;
        }
        novoNo.setProx(this.prim);
        this.prim = novoNo;
        this.qtdNo++;
        
    }//-------------------------------------------------INSERIR PRIMEIRO

    public boolean eVazia()
    {
        return (this.prim == null);

    }//---------------------------------------------------ÉVazia?

    
}