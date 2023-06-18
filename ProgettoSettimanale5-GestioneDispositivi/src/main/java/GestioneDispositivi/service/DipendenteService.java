package GestioneDispositivi.service;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import GestioneDispositivi.model.Dipendente;
import GestioneDispositivi.model.Dispositivo;
import GestioneDispositivi.repository.DipendenteDAORepository;
import GestioneDispositivi.repository.DipendentePageableRepository;
import GestioneDispositivi.repository.DispositivoDAORepository;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;

@Service
public class DipendenteService {

	@Autowired private DipendenteDAORepository dipRepo; //repo
	@Autowired private DispositivoDAORepository dispRepo;
	@Autowired private DipendentePageableRepository repoPage;
	
	//CRUD
	
	//get All
	// get All 
		public List<Dipendente> getAll() {
			return dipRepo.findAll();
		}
		
		
	//get By id	
		public Dipendente getById(Long id) {
			if(!dipRepo.existsById(id)) {
				throw new EntityNotFoundException("Employee ID doesnt exists!!");
			}
			return dipRepo.findById(id).get();	
		}
	
	//create
	public Dipendente createDispositivo(Dipendente d) {
		if(dipRepo.existsByEmail(d.getEmail()) || dipRepo.existsByUsername(d.getUsername())) {
			throw new EntityExistsException("Username or Email already exists!!");
		}
		dipRepo.save(d);
		return d;
	}

	
	//delete
	public String removeDipendente(Long id) {
		if (!dipRepo.existsById(id)) {
			throw new EntityNotFoundException("Dipendente ID doesnt exists!!");
		}
		if(dispRepo.findByDipendente(dipRepo.findById(id).get()).size() > 0) {
			throw new EntityExistsException("Dipendente ha già dispositivo");
		}
		dipRepo.deleteById(id);
		return "Dipendente deleted from DB!";
	}
	

	//update
	public Dipendente updateEmployee(Dipendente d) {
		if (!dipRepo.existsById(d.getId())) {
			throw new EntityNotFoundException("Dipendente ID not exists!!");
		}
		dipRepo.save(d);
		d.setDispositivi(dispRepo.findByDipendente(d));
		return d;
	}
	
	
	
	////////////////
	public Dipendente findByEmail(String email) {
		if(!dipRepo.existsByEmail(email)) {
			throw new EntityNotFoundException(" Email not exists!!");
		}
		return dipRepo.findByEmail(email);	
	}
	
	public Dipendente findByUsername(String username) {
		if(!dipRepo.existsByUsername(username)) {
			throw new EntityNotFoundException(" Username not exists!!");
		}
		return dipRepo.findByUsername(username);	
	}
	
	/////////////////////
	// get All Dip Pageable		
	public Page<Dipendente> getPAgeabledAll(Pageable pageable){
		return (Page<Dipendente>) repoPage.findAll(pageable);
	}
	
	
	
}
