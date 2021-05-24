package br.com.diogo.estudo.spring.pessoa;

import java.util.Date;

public class PessoaVO {

    private String nome;
    private Integer idade;
    private Date dataNascimento;
    private Float salario;
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    private String formataCpf(String cpf){
        // TODO Criar mecanismo de formatação de CPF
        return cpf+"../../";
    }

    public void setCpf(String cpf) {
        this.cpf = formataCpf(cpf);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nomeParam) {
        this.nome = nomeParam;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salarioPqp) {
        this.salario = salarioPqp;
    }
}
