package br.com.ada.designpattern.builder;

import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private String sobreNome;
    private String documento;
    private String email;
    private String apelido;
    private LocalDate dataNascimento;

    private Pessoa(String nome, String sobreNome, String documento, String email, String apelido, LocalDate dataNascimento) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.documento = documento;
        this.email = email;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", documento='" + documento + '\'' +
                ", email='" + email + '\'' +
                ", apelido='" + apelido + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }

    public static class PessoaBuilder {
        private String nome;
        private String sobreNome;
        private String documento;
        private String email;
        private String apelido;
        private LocalDate dataNascimento;

        public PessoaBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public PessoaBuilder sobreNome(String sobreNome) {
            this.sobreNome = sobreNome;
            return this;
        }

        public PessoaBuilder documento(String documento) {
            this.documento = documento;
            return this;
        }

        public PessoaBuilder email(String email) {
            this.email = email;
            return this;
        }

        public PessoaBuilder apelido(String apelido) {
            this.apelido = apelido;
            return this;
        }

        public PessoaBuilder dataNascimento(LocalDate dataNascimento) {
            this.dataNascimento = dataNascimento;
            return this;
        }

        public Pessoa build(){
            return new Pessoa(nome,sobreNome, documento, email, apelido, dataNascimento);
        }
    }
}
