package br.com.diogo.estudo.spring.pessoa;

public class PessoaBusinnes {




    public void validarEcadastrar(PessoaVO pessoa){

        if( pessoa.getNome() == null ){
            throw new RuntimeException("Nome da pessoa é obrigatório!");
        }

        if( pessoa.getIdade() == null ){
            throw new RuntimeException("Idate da pessoa é obrigatório!");
        }

        PessoaRepository pessoaRepository = new PessoaRepository();

        pessoaRepository.cadastrarNaBaseDados(pessoa);

    }

}
