package GestioneDispositivi.service;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import GestioneDispositivi.model.Dipendente;
import GestioneDispositivi.model.Dispositivo;
import GestioneDispositivi.model.StatoDispositivo;
import GestioneDispositivi.model.TipoDispositivo;
import GestioneDispositivi.repository.DispositivoDAORepository;
import jakarta.persistence.EntityNotFoundException;

public class DispositivoService {

@Autowired private DispositivoDAORepository repo;
	
	//CRUD
	

	// get All 
	public List<Dispositivo> getAll() {
		return repo.findAll();
	}
	
	// get By ID
		public Dispositivo getById1(Long id) {
			// Gestione di un errore (id non presente)
			if(!repo.existsById(id)) {
				throw new EntityNotFoundException("Device ID doesnt exists!!");
			}
			return repo.findById(id).get();	
		}
	
	// create Dispositivo
		public Dispositivo createDispositivo(Dispositivo d) {
				return repo.save(d);
		}
	
	
	//update
		public Dispositivo updateDDispositivo(Dispositivo d) {
			// Gestione di un errore | id non presente
			if (!repo.existsById(d.getId())) {
				throw new EntityNotFoundException("Device ID doesnt exists on No Id Specified!!");
			}
			return 	repo.save(d);
			 
		}
		
	
	//delete
	public String removeDispositivo(Long id) {
		if (!repo.existsById(id)) {
			throw new EntityNotFoundException("Device ID not exists!!");
		}
		repo.deleteById(id);
		return "Device Deleted from DB!";
	}
	
	

	
	///////////////////////////////////////
	
	public Page<Dispositivo> findAll(Pageable pageable){
		return (Page<Dipendente>) dipRepo.findAll();
		return (Page<Dispositivo>) repo.findAll(pageable);
	}
	
	public Page<Dispositivo> findByStatus(StatoDispositivo stato, Pageable pageable){
		return (Page<Dispositivo>) repo.findByStato(stato, pageable);
	}
	
	public Page<Dispositivo> findByType(TipoDispositivo tipo, Pageable pageable){
		return (Page<Dispositivo>) repo.findByTipo(tipo, pageable);
	}
	
	public Page<Dispositivo> findByStatusAndType(StatoDispositivo stato, TipoDispositivo tipo, Pageable pageable){
		return (Page<Dispositivo>) repo.findByStatoAndTipo(stato, tipo, pageable);
	}

}
