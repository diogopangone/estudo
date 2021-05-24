package br.com.diogo.estudo.spring.pessoa;

import org.springframework.stereotype.Controller;

import java.util.Date;

@Controller
public class PessoaController {

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


        PessoaBusinnes pessoaBusinnes = new PessoaBusinnes();

        pessoaBusinnes.validarEcadastrar(fulano);

    }

}
