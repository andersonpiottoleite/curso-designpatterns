package br.com.ada.designpattern.strategy.solucao;

import br.com.ada.designpattern.strategy.Funcionario;

import java.math.BigDecimal;

public class CalculadorReajusteAnualSalarioPJ implements CalculadorReajusteAnualSalario{
    @Override
    public void calcularReajusteAnual(Funcionario funcionario) {
        BigDecimal salario = funcionario.getSalario();
        funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.05))));
    }
}
