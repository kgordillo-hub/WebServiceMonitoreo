package co.edu.udistrital.controlador;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.udistrital.dominio.MedicalSignal;

@RestController
@RequestMapping("/medical")
public class MedicalSignController {

	@PostMapping("/sendSignal")
	String capturarSenal(@RequestBody MedicalSignal senalMedica){
		final String mensajeRetorno = "Recieved signal: "+senalMedica.getDato();
		return mensajeRetorno;
	}
	
	@GetMapping("/hello")
    public Collection<String> sayHello() {
        return null;
    }
	
}
