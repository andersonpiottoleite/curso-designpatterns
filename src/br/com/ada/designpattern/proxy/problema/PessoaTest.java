package br.com.ada.designpattern.proxy.problema;

import br.com.ada.designpattern.builder.Pessoa;
import br.com.ada.designpattern.proxy.PessoaRepository;
import br.com.ada.designpattern.proxy.PessoaService;

import java.time.LocalDate;

public class PessoaTest {

    public static void main(String[] args) {
        /*PessoaService pessoaService = new PessoaService(new PessoaRepository());

        Pessoa pessoa = new Pessoa.PessoaBuilder()
                .sobreNome("Piotto")
                .dataNascimento(LocalDate.of(1985, 03, 12))
                .nome("Anderson")
                .apelido("Careca")
                .documento("35461848889")
                .build();

        pessoaService.save(pessoa);

        Pessoa pessoaRetornada = pessoaService.findById(1L);
        System.out.println(pessoaRetornada);*/
    }
}
