package com.nttdata.clientmicroservice.repository;

import com.nttdata.clientmicroservice.entity.Client;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientRepository extends ReactiveMongoRepository<Client, String> {



}
