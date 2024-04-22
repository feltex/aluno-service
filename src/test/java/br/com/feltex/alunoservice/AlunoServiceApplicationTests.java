package br.com.feltex.alunoservice;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.context.ImportTestcontainers;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(TestAlunoServiceApplication.class)
class AlunoServiceApplicationTests {

  @Autowired
  private ApplicationContext context;

	@Test
	void validarContexto() {
    assertNotNull(context);
	}

}
