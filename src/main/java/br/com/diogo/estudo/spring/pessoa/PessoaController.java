package br.com.diogo.estudo.spring.pessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.Date;

@Controller
public class PessoaController {

    @Autowired
    private PessoaBusinnes pessoaBusinnes;
        /*
    *
    *
    <pessoa>
        <nome>Diego</nome>
        <idade>36</idade>
        <dataNascimento>24-03-1985</dataNascimento>
        <salario>1000</salario>
    </pessoa>

    ["nome": "Diego", "idate": 36, "dataNascimento": "24-03-1985", "salario": 1000.00]

    *
    *
    * */

    public void cadastrar(String nome, Integer idade, Date dataNascimento, Float salario, String cpf){
        PessoaVO fulano = new PessoaVO();

        fulano.setNome(nome);
        fulano.setIdade(idade);
        fulano.setDataNascimento(dataNascimento);
        fulano.setSalario(salario);
        fulano.setCpf(cpf);

        pessoaBusinnes.validarEcadastrar(fulano);

    }


    public void cadastrarDependentes(String nome){
        pessoaBusinnes.cadastrarDependentes(nome);
    }
}
