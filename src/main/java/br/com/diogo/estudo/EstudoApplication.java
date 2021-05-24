package br.com.diogo.estudo;

import br.com.diogo.estudo.spring.pessoa.PessoaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class EstudoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudoApplication.class, args);
		System.out.println("Olá Mundo!");
		System.out.println("Me livrei da Maldição");


		PessoaController pessoaController = new PessoaController();

		pessoaController.cadastrar("Diego", 36, new Date(), 1000.00F);
	}







}
