package com.seminario1.demo.Application.Configuration;

import com.seminario1.demo.Domain.model.gateways.BookRepository;
import com.seminario1.demo.Domain.model.gateways.ClientRepository;
import com.seminario1.demo.Domain.usecase.BookUseCase;
import com.seminario1.demo.Domain.usecase.ClienteUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseBeanConfig {
    @Bean
    public BookUseCase bookUseCase(BookRepository bookRepository){
        return new BookUseCase(bookRepository);
    }
    @Bean
    public ClienteUseCase clienteUseCase(ClientRepository clientRepository){
        return new ClienteUseCase(clientRepository);
    }
}
