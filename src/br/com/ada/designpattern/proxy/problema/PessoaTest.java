package br.com.ada.designpattern.proxy.problema;

import br.com.ada.designpattern.proxy.PessoaRepository;
import br.com.ada.designpattern.proxy.PessoaService;

public class PessoaTest {

    public static void main(String[] args) {
        PessoaService pessoaService = new PessoaService(new PessoaRepository());

        /*Pessoa pessoa = new Pessoa.PessoaBuilderInterno()
                .sobreNome("Piotto 2")
                .dataNascimento("12/03/1985")
                .nome("Anderson 2")
                .apelido("Careca")
                .documento("35461848889")
                .build();

        pessoaService.save(pessoa);

        Pessoa pessoaRetornada = pessoaService.findById(1L);
        System.out.println(pessoaRetornada);

        pessoaRetornada = pessoaService.findById(1L);
        System.out.println(pessoaRetornada);*/
    }
}
