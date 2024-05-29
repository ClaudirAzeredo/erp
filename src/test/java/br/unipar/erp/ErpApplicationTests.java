package br.unipar.erp;

import br.unipar.erp.data.entity.Usuario;
import org.junit.jupiter.api.Test;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class ErpApplicationTests implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(ErpApplicationTests.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Usuario usuario = new Usuario();
		usuario.setNome("Spring JPA");
		usuario.setSenha("123456");
		usuario.setUsuario("springjpa");
		usuario.setDataNascimento(LocalDate.of(1993,6,20));
	}
}
