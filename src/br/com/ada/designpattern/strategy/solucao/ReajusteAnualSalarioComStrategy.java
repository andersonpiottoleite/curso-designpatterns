package br.com.ada.designpattern.strategy.solucao;

import br.com.ada.designpattern.strategy.Funcionario;
import br.com.ada.designpattern.strategy.TipoContratacaoEnum;

import java.math.BigDecimal;

public class ReajusteAnualSalarioComStrategy {

    public void calculaRejusteAnual(Funcionario funcionario , CalculadorReajusteAnualSalario calculador){
        calculador.calcularReajusteAnual(funcionario);
    }
}
