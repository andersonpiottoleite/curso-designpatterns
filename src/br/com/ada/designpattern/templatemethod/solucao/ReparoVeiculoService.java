package br.com.ada.designpattern.templatemethod.solucao;

public abstract class ReparoVeiculoService {

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

    protected abstract boolean veiculoParaReparo();

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

    protected void entradaOficina() {
        System.out.println("Veiculo entrando Oficina...");
    }
}
