package br.com.feltex.alunoservice;

import br.com.feltex.alunoservice.domain.Aluno;
import br.com.feltex.alunoservice.domain.AlunoRepository;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
@AllArgsConstructor
public class AlunoServiceApplication {

  private AlunoRepository alunoRepository;

  public static void main(String[] args) {
		SpringApplication.run(AlunoServiceApplication.class, args);
	}

  @PostConstruct
  public void initDB(){
    log.info("Iniciando a aplicacao");

    alunoRepository.save(new Aluno(1L, "Feltex", "123123123132", "contato@feltex.com.br"));
    alunoRepository.save(new Aluno(2L, "Feltex02", "55555", "contato2@feltex.com.br"));

    var totalAlunos = alunoRepository.findAll().stream().count();

    log.info("Total de alunos: {}", totalAlunos);

  }

}
