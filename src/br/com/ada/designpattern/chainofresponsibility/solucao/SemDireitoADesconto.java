package br.com.ada.designpattern.chainofresponsibility.solucao;

import br.com.ada.designpattern.chainofresponsibility.Carro;
import br.com.ada.designpattern.chainofresponsibility.Marca;

import java.math.BigDecimal;

public class SemDireitoADesconto extends DescontoCarro{

    public SemDireitoADesconto(DescontoCarro proximoDesconto){
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        return BigDecimal.ZERO;
    }
}
