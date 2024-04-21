package com.example.demo.controller;


import java.util.List;

import com.example.demo.dto.UtenteDto;
import com.example.demo.dto.UtenteDtoUpdate;
import com.example.demo.models.Utente;
import com.example.demo.services.UtenteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class HomeControl {

	private final UtenteService utenteService;

 @PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody UtenteDto uDto){
	 utenteService.save(uDto);
	 return ResponseEntity.ok("Utente salvato");
 }

 @PutMapping("/update")
	public ResponseEntity<?> update(@RequestBody UtenteDtoUpdate utUpdate){
	 utenteService.update(utUpdate);

	 return ResponseEntity.ok("Utente modificato");
 }
 @DeleteMapping("/delete")
	public ResponseEntity<?> delete(@RequestBody  UtenteDto ut){
	 utenteService.delete(ut);

	 return ResponseEntity.ok("Utente cancellato");
 }



}
