package com.seminario1.demo.Domain.usecase;

import com.seminario1.demo.Domain.model.Client;
import com.seminario1.demo.Domain.model.gateways.ClientRepository;

public class ClienteUseCase {
    private final ClientRepository clientRepository;

    public ClienteUseCase(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
    public Client createClient(Client client){
        return clientRepository.saveClient(client);
    }
    public Client getClientById (Client client){
        return clientRepository.getClientById(client);
    }
}
