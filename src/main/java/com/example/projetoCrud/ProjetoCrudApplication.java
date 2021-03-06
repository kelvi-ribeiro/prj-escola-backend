package com.example.projetoCrud;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.projetoCrud.domain.Aluno;
import com.example.projetoCrud.domain.Curso;
import com.example.projetoCrud.domain.enums.EstadoCivil;
import com.example.projetoCrud.repositories.AlunoRepository;
import com.example.projetoCrud.repositories.CursoRepository;

@SpringBootApplication
public class ProjetoCrudApplication implements CommandLineRunner {
	@Autowired
	CursoRepository repo;
	
	@Autowired
	AlunoRepository repoAluno;
	

	public static void main(String[] args) {
		SpringApplication.run(ProjetoCrudApplication.class, args);
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		Curso curso1 = new Curso(null, 20, "Sistema de informação",""
				+ "O Bacharelado em Sistemas de Informação tem como objetivo formar profissionais para atuar de forma competente e"
				+ " transformadora no desenvolvimento de sistemas e na gestão da tecnologia da informação nas organizações"); 
				 
				
		
		Curso curso2 = new Curso(null, 35, "Medicina","A medicina trabalha com a manutenção e a restauração da saúde. Num sentido amplo, "
				+ "lida com a prevenção e cura das doenças humanas. O médico investiga a natureza e as causas das doenças.");
		Curso curso3 = new Curso(null, 45, "Nutrição","O nutricionista investiga e controla a relação do homem com o alimento para preservar sua saúde");
		Curso curso4 = new Curso(null, 55, "Engenharia Civil","O engenheiro civil projeta, gerencia e executa obras como casas, prédios, pontes, viadutos, estradas e barragens. ");
		repo.save(Arrays.asList(curso1,curso2,curso3,curso4));
		
		
		
		
		Aluno aluno1 = new Aluno(null, "Kelvi Martins Ribeiro", 530333,curso1, 9.5f,null);		
		aluno1.setEstadoCivil(EstadoCivil.CASADO);
		
		Aluno aluno2 = new Aluno(null, "Vinícius Souza", 603502, curso2, 8.5f,null);		
		aluno2.setEstadoCivil(EstadoCivil.CASADO);

		Aluno aluno3 = new Aluno(null, "Marcelo Ramos", 703503,  curso3 , 9.5f,null);
		aluno3.setEstadoCivil(EstadoCivil.DIVORCIADO);

		Aluno aluno4 = new Aluno(null, "Thaís Almeida", 603503, curso2, 8.5f,null);
		aluno4.setEstadoCivil(EstadoCivil.CASADO);
			

		Aluno aluno5 = new Aluno(null, "Deivisson Martins", 803502,curso4,8.5f,null);
		aluno5.setEstadoCivil(EstadoCivil.SOLTEIRO);
		
		Aluno aluno6 = new Aluno(null, "Deivid Ribeiro", 803502, curso4, 7.5f,null);
		aluno6.setEstadoCivil(EstadoCivil.DIVORCIADO);
		
		
		
		repoAluno.save(Arrays.asList(aluno1,aluno2,aluno3,aluno4,aluno5,aluno6));
	}
}
