package com.seminario1.demo.Domain.model.gateways;

import com.seminario1.demo.Domain.model.Client;

public interface ClientRepository {
    Client saveClient(Client client);
    Client getClientById(Client client);
}
