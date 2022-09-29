package br.com.ada.designpattern.templatemethod.problema;

import br.com.ada.designpattern.templatemethod.VeiculoParaReparo;

public class ReparVeiculoComumService{

    private VeiculoParaReparo veiculoParaReparo;

    public ReparVeiculoComumService(VeiculoParaReparo veiculoParaReparo){

        this.veiculoParaReparo = veiculoParaReparo;
    }

    public void reparaVeiculo(){
        entradaOficina();
        analisarDanos();
        if(veiculoParaReparo()){
            repararVeiculo();
            notificarReparoParaSeguradora();
        } else {
            notificarPerdaTotalParaSeguradora();
        }
    }

    private boolean veiculoParaReparo() {

        return veiculoParaReparo.getPorcentagemDano() <= 70;
    }

    private void notificarPerdaTotalParaSeguradora() {
        System.out.println("Notificando perda total para Seguradora...");
    }

    private void notificarReparoParaSeguradora() {
        System.out.println("Notificando reparo para Seguradora...");
    }

    private void repararVeiculo() {
        System.out.println("Reparando veiculo...");
    }

    private void analisarDanos() {
        System.out.println("Analisando Danos...");
    }

    private void entradaOficina() {
        System.out.println("Veiculo entrando Oficina...");
    }
}
