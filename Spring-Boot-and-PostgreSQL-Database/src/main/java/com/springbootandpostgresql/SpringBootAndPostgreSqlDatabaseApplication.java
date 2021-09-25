package com.springbootandpostgresql;

import com.springbootandpostgresql.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringBootAndPostgreSqlDatabaseApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAndPostgreSqlDatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) {
		log.info("ID with 101 -> {}", studentRepository.findById(101));
		log.info("Find all students -> {}", studentRepository.findAllStudents());
	}
}
