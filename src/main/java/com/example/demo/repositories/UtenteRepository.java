package com.example.demo.repositories;

import com.example.demo.models.Utente;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;


import java.util.List;


@Repository
public interface UtenteRepository extends MongoRepository<Utente, String> {

    public Utente findByCognome(String cognome);

}
