package br.com.ada.designpattern.proxy.solucao;

import br.com.ada.designpattern.builder.Pessoa;

public interface ProxyPessoa {

    void save(Pessoa pessoa);

    Pessoa findById(Long id);
}
