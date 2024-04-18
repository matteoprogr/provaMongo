package com.example.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "utenti")
public class Utente {

	@Id
	private String id;

	private String nome;
	private String cognome;
	private int eta;
	private char sesso;
	private String professione;
	private String indirizzo;
	private String citta;



}
