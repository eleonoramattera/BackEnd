package GestionePrenotazioni.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Prenotazione;

public interface IPrenotazioneDAO extends JpaRepository<Prenotazione, Long> {

}
