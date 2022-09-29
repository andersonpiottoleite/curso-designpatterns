package br.com.ada.designpattern.templatemethod.problema;

import br.com.ada.designpattern.templatemethod.VeiculoParaReparo;
import br.com.ada.designpattern.templatemethod.problema.ReparVeiculoDeLuxoService;

public class TesteReparVeiculos {

    public static void main(String[] args) {
        System.out.println("----------------LUXO-----------------");
        VeiculoParaReparo veiculoDeLuxo = new VeiculoParaReparo();
        veiculoDeLuxo.setPorcentagemDano(51);

        ReparVeiculoDeLuxoService rpl = new ReparVeiculoDeLuxoService(veiculoDeLuxo);

        rpl.reparaVeiculo();

        System.out.println("----------------COMUM-----------------");

        VeiculoParaReparo veiculoComum = new VeiculoParaReparo();
        veiculoComum.setPorcentagemDano(69);

        ReparVeiculoComumService rpc = new ReparVeiculoComumService(veiculoComum);

        rpc.reparaVeiculo();
    }
}
