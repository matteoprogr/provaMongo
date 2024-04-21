package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.dto.UtenteDto;
import com.example.demo.dto.UtenteDtoUpdate;
import com.example.demo.models.Utente;
import com.example.demo.repositories.UtenteRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class UtenteService {

	private final UtenteRepository utenteRepository;

  public void save(UtenteDto uDto){
      Utente utente = new Utente();
      utente.setNome(uDto.getNome());
      utente.setCognome(uDto.getCognome());
	  utenteRepository.save(utente);
  }
  public void update(UtenteDtoUpdate ut){
      Utente utente = utenteRepository.findByCognome(ut.getCognome());
      utente.setEta(ut.getEta());
      utente.setCitta(ut.getCitta());
      utente.setProfessione(ut.getProfessione());
      utente.setSesso(ut.getSesso());

      utenteRepository.save(utente);
  }

  public void delete(UtenteDto ut){
      Utente utente=utenteRepository.findByCognome(ut.getCognome());
      utenteRepository.delete(utente);
  }
}
