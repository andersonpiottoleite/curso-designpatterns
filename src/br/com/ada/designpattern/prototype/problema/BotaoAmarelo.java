package br.com.ada.designpattern.prototype.problema;

import br.com.ada.designpattern.prototype.Botao;
import br.com.ada.designpattern.prototype.TipoBordaEnum;

public class BotaoAmarelo extends Botao {
    public BotaoAmarelo() {
        setCor("Amarelo");
        setAltura(40);
        setLargura(100);
        setTipoBorda(TipoBordaEnum.TRACEJADA);

    }
}
