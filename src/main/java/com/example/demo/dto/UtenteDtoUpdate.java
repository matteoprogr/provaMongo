package com.example.demo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UtenteDtoUpdate {

	private String nome; 
	private String cognome;
	private int eta;
	private char sesso;
	private String professione;
	private String indirizzo;
	private String citta;
	
}
