package br.com.diogo.estudo;

import br.com.diogo.estudo.spring.pessoa.PessoaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class EstudoApplication implements CommandLineRunner {

	@Autowired
	private PessoaController pessoaController;

	public static void main(String[] args) {
		SpringApplication.run(EstudoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Olá Mundo!");
		System.out.println("Me livrei da Maldição");

		pessoaController.cadastrar("Diego", 36, new Date(), 1000.00F, "12345678900");
		pessoaController.cadastrar("Marina", 67, new Date(), 6000.00F, "9999999999");
	}
}
