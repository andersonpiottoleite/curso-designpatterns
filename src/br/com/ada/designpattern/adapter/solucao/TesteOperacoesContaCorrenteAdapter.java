package br.com.ada.designpattern.adapter.solucao;

import br.com.ada.designpattern.adapter.problema.ClientJarOperacoesContaCorrente;
import br.com.ada.designpattern.adapter.problema.JarOperacoesContaCorrente;

import java.math.BigDecimal;

public class TesteOperacoesContaCorrenteAdapter {

    public static void main(String[] args) {
        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
        JarOperacoesContaCorrenteAdapter jarContaAdapter = new JarOperacoesContaCorrenteAdapter(jarConta);
        ClientJarOperacoesContaCorrenteAdapter client = new ClientJarOperacoesContaCorrenteAdapter(jarContaAdapter);

        BigDecimal valorPretendidoParaSaque = new BigDecimal(100000);

        client.saca(valorPretendidoParaSaque); // 1° chamada

        client.deposita(new BigDecimal(500)); // 2° chamada
    }
}
