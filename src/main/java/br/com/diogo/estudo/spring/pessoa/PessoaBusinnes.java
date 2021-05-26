package br.com.diogo.estudo.spring.pessoa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaBusinnes {

    @Autowired
    PessoaRepository pessoaRepository;

    public void validarEcadastrar(PessoaVO pessoa){

        if( pessoa.getNome() == null ){
            throw new RuntimeException("Nome da pessoa é obrigatório!");
        }

        if( pessoa.getIdade() == null ){
            throw new RuntimeException("Idate da pessoa é obrigatório!");
        }
        if( pessoa.getDataNascimento() == null){
            throw new RuntimeException("Data de nascimento é obrigatório");
        }

        pessoaRepository.cadastrarNaBaseDados(pessoa);

    }

    public void cadastrarDependentes(String nome){

    }

    public PessoaVO consultarPeloNome(String nome){
        return null;
    }

}
