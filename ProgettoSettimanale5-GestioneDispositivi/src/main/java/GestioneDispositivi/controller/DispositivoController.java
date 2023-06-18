package GestioneDispositivi.controller;

import java.awt.print.Pageable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import GestioneDispositivi.service.DipendenteService;
import GestioneDispositivi.service.DispositivoService;

@RestController
@RequestMapping("/api/dispositivi")
public class DispositivoController {


	@Autowired DispositivoService dispositivoService;
	
	@Autowired DipendenteService dipendenteService;
	
	@GetMapping
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> getAllDevices(Pageable pageable){
		return new ResponseEntity<>(dispositivoService.findAll(pageable), HttpStatus.OK);
	}
	
	@GetMapping(path = "/status/available")
	@PreAuthorize("isAuthenticated()")
	public ResponseEntity<?> getAvailableDevices(Pageable pageable){
		return new ResponseEntity<>(deviceService.findByStatus(DeviceStatus.AVAILABLE, pageable), HttpStatus.OK);
	}
	
	@GetMapping(path = "/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> getById(@PathVariable(name = "id") Long id){
		return new ResponseEntity<>(deviceService.findById(id), HttpStatus.OK);
	}
	
	@GetMapping(path = "/status/{status}")
	@PreAuthorize("isAuthenticated()")
	public ResponseEntity<?> getStatusDevices(@PathVariable(name = "status") String status, Pageable pageable){
		return new ResponseEntity<>(deviceService.findByStatus(DeviceStatus.valueOf(status.toUpperCase()), pageable), HttpStatus.OK);
	}
	
	@GetMapping(path = "/status/available/{type}")
	@PreAuthorize("isAuthenticated()")
	public ResponseEntity<?> getAvailableDevicesType(@PathVariable(name = "type") String type, Pageable pageable){
		return new ResponseEntity<>(deviceService.findByStatusAndType(DeviceStatus.AVAILABLE, DeviceType.valueOf(type.toUpperCase()), pageable), HttpStatus.OK);
	}
	
	@GetMapping(path = "/status/{stat}/{type}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> getDevicesStatusType(@PathVariable(name = "stat") String status, @PathVariable(name = "type") String type, Pageable pageable){
		return new ResponseEntity<>(deviceService.findByStatusAndType(DeviceStatus.valueOf(status.toUpperCase()), DeviceType.valueOf(type.toUpperCase()), pageable), HttpStatus.OK);
	}
	
	@PostMapping
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> createDevice(@RequestBody Device d){
		return new ResponseEntity<>(deviceService.saveDevice(d), HttpStatus.CREATED);
	}
	
	@PutMapping
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> updateDevice(@RequestBody Device d){
		if (!d.getStatus().equals(DeviceStatus.ASSIGNED)) {
			d.setEmployee(null);
		}
		return new ResponseEntity<>(deviceService.updateDevice(d), HttpStatus.OK);
	}
	
	@PutMapping(path = "/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> updateEmployeeForDevice(@RequestBody Employee e, @PathVariable(name = "id") Long id){
		Device d = deviceService.findById(id);
		if (!d.getStatus().equals(DeviceStatus.AVAILABLE)) {
			throw new EntityNotFoundException("Device not available: " + d.getStatus());
		}
		Employee eDb = employeeService.findById(e.getId());
		d.setStatus(DeviceStatus.ASSIGNED);
		d.setEmployee(eDb);
		return new ResponseEntity<>(deviceService.updateDevice(d), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> deleteById(@PathVariable Long id){
			return new ResponseEntity<>(deviceService.removeDevice(id), HttpStatus.OK);
	}
}
