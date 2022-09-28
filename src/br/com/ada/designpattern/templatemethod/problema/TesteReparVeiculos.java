package br.com.ada.designpattern.templatemethod.problema;

import br.com.ada.designpattern.templatemethod.VeiculoParaReparo;
import br.com.ada.designpattern.templatemethod.problema.ReparVeiculoDeLuxoService;

public class TesteReparVeiculos {

    public static void main(String[] args) {
        VeiculoParaReparo veiculoDeLuxo = new VeiculoParaReparo();
        veiculoDeLuxo.setPorcentagemDano(50);

        ReparVeiculoDeLuxoService rpl = new ReparVeiculoDeLuxoService(veiculoDeLuxo);

        rpl.reparaVeiculo();

        System.out.println("---------------------------------");

        VeiculoParaReparo veiculoComum = new VeiculoParaReparo();
        veiculoComum.setPorcentagemDano(71);

        ReparVeiculoDeLuxoService rpc = new ReparVeiculoDeLuxoService(veiculoComum);

        rpc.reparaVeiculo();
    }
}
