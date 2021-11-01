package com.example.cliente;

import com.example.cliente.model.entity.Cliente;
import com.example.cliente.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class ClienteApplication {
	@Bean
	public CommandLineRunner runner(@Autowired ClienteRepository clienteRepository){
		return args -> {
			clienteRepository.save(Cliente.builder()
											.cpf("82695580010")
											.nome("Fulano")
											.dataCadastro(LocalDate.now())
											.build());
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ClienteApplication.class, args);
	}

}
