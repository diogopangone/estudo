package br.com.diogo.estudo.spring.pessoa;

public class PessoaRepository {

    public void cadastrarNaBaseDados(PessoaVO pessoa){
        System.out.println("Nome :"+ pessoa.getNome());
        System.out.println("Idade :"+ pessoa.getIdade());
        System.out.println("Data de nascimento :"+ pessoa.getDataNascimento());
        System.out.println("Salário :"+ pessoa.getSalario());
        System.out.println("CPF :"+ pessoa.getCpf());
    }

}
