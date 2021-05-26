package br.com.diogo.estudo.spring.pessoa;

import org.springframework.stereotype.Repository;

@Repository
public class PessoaRepository implements OperacoesBasicasRepository{

    public void cadastrarNaBaseDados(PessoaVO pessoa){
        System.out.println("Nome :"+ pessoa.getNome());
        System.out.println("Idade :"+ pessoa.getIdade());
        System.out.println("Data de nascimento :"+ pessoa.getDataNascimento());
        System.out.println("Salário :"+ pessoa.getSalario());
        System.out.println("CPF :"+ pessoa.getCpf());
    }

    @Override
    public void cadastrar() {

    }

    @Override
    public void consultar() {

    }
}
