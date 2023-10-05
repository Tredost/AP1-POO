package ingressos;

import eventos.Evento;

public class IngressoJogo extends Ingresso{
    double percentualDescontoTorcedor;

    IngressoJogo(double percentualDescontoTorcedor, Evento evento, TipoIngresso tipo){
        super(evento, tipo);
        this.percentualDescontoTorcedor = percentualDescontoTorcedor;
    }

    //getter
    public double getPercentualDescontoTorcedor(){
        return this.percentualDescontoTorcedor;
    }

    //setter
    public void setPercentualDescontoTorcedor(double percentualAtualizado){
        this.percentualDescontoTorcedor = percentualAtualizado;
    }

    /*  MEIA 
    desconto = 1 - (percentualDescontoTorcedor/100)
    valorFinal = desconto*0.5*precoCheio 
        INTEIRA
    desconto = 1 - (percentualDescontoTorcedor/100)
    valorFinal = desconto*precoCheio 
    */
}
