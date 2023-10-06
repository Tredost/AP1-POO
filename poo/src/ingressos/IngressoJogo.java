package ingressos;

import eventos.Evento;

public class IngressoJogo extends Ingresso{
    double percentualDescontoTorcedor;

    IngressoJogo(double percentualDescontoTorcedor, Evento evento, TipoIngresso tipo){
        super(evento, tipo);
        this.percentualDescontoTorcedor = percentualDescontoTorcedor;
    }

    public double getPreco(){
        double desconto = 1 - (this.percentualDescontoTorcedor/100);
        if(tipo.equals(TipoIngresso.inteira)){
            double valorFinal = desconto*this.getEvento().getPrecoCheio();
            return valorFinal; 
        }else{
            double valorFinal = desconto*this.getEvento().getPrecoCheio(); 
            return valorFinal; 
        }
    }

    //getter
    public double getPercentualDescontoTorcedor(){
        return this.percentualDescontoTorcedor;
    }

    //setter
    public void setPercentualDescontoTorcedor(double percentualAtualizado){
        this.percentualDescontoTorcedor = percentualAtualizado;
    }

    @Override
    public String toString() {
        return "Ingresso " + super.toString() + "\n" +
            "Deconto de torcedor: " + this.getPercentualDescontoTorcedor();
    }
}
