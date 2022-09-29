package br.com.ada.designpattern.adapter.problema;

import java.math.BigDecimal;

public class TesteOperacoesContaCorrente {

    public static void main(String[] args) {

        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
        ClientJarOperacoesContaCorrente client = new ClientJarOperacoesContaCorrente(jarConta);

        BigDecimal valorPretendidoParaSaque = new BigDecimal(100000);

        if(client.validaSaldo(valorPretendidoParaSaque)){ // 1° chamada
            client.saca(valorPretendidoParaSaque); // 2° chamada
        }

        client.deposita(new BigDecimal(500)); // 3 / chamada
    }
}
