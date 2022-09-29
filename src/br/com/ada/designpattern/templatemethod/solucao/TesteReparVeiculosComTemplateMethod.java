package br.com.ada.designpattern.templatemethod.solucao;

import br.com.ada.designpattern.templatemethod.VeiculoParaReparo;
import br.com.ada.designpattern.templatemethod.problema.ReparVeiculoComumService;
import br.com.ada.designpattern.templatemethod.problema.ReparVeiculoDeLuxoService;

public class TesteReparVeiculosComTemplateMethod {

    public static void main(String[] args) {
        System.out.println("----------------LUXO-----------------");
        VeiculoParaReparo veiculoDeLuxo = new VeiculoParaReparo();
        veiculoDeLuxo.setPorcentagemDano(49);

        ReparoVeiculoService rpl = new ReparoVeiculoLuxoServiceComTemplateMethod(veiculoDeLuxo);

        rpl.reparaVeiculo();

        System.out.println("----------------COMUM-----------------");

        VeiculoParaReparo veiculoComum = new VeiculoParaReparo();
        veiculoComum.setPorcentagemDano(71);

        ReparoVeiculoService rpc = new ReparoVeiculoComumServiceComTemplateMethod(veiculoComum);

        rpc.reparaVeiculo();
    }
}
