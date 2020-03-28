package app;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

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

    public void inserirUltimo(Pessoa p)
    {
        No novoNO = new No(p);
        if (this.eVazia()) {
            this.prim = novoNO;
        }else{
            this.ult.setProx(novoNO);
        }
        this.ult = novoNO;
        this.qtdNo++;
    }//----------------------------------------------------INSERIR ULTIMO


    public boolean removerNo(String nome)
    {
        No atual = this.prim;
        No ant = null;
        if(eVazia())
        {
            return false;
        }else{
            while (atual != null && (!atual.getP().getNome().equals(nome))) {
                ant = atual;
                atual = atual.getProx();
            }
            if (atual == this.prim) {
                if (prim == ult) {
                    this.ult = null;
                }
                this.prim = this.prim.getProx();
            }else{
                if (atual == this.ult) {
                    this.ult = ant;
                }
                ant.setProx(atual.getProx());

            }
            this.qtdNo--;
            return true;
        }

    }//-----------------------------------------------------REMOVER NO


    public String pesquisarNo(String nome)
    {
        String msg ="";
        No atual = this.prim;
        while ((atual != null) && (!atual.getP().getNome().equals(nome))) {
            atual = atual.getProx();
        }
        return msg = "Nome: " + atual.getP().getNome() + "\n"+
                    "Sexo: " + atual.getP().getSexo() + "\n"+
                    "Idade: " + atual.getP().getIdade();
    }//-----------------------------------------------------------Pesquisar NO

    public String imprmirLista()
    {
        String msg ="";
        if (eVazia()) {
            msg = "A lista está vazia";
        }else{
            No atual = this.prim;
            while (atual != null) {
                msg += atual.getP().getNome() + " -> ";
                atual = atual.getProx();
            }
        }
        return msg;
    }//--------------------------------------------------------------imprimir Lista

    
}