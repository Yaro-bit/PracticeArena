package controller;

import model.Address;
import org.springframework.web.bind.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/adresse")
public class AddressController {

	private final List<Address> addressList = new ArrayList<>();

	// Methode zum Abrufen aller Adressen (GET)
	@GetMapping
	public List<Address> getAllAddresses() {
		return addressList;
	}

	// Methode zum Hochladen einer Adresse (POST) ohne Datei
	@PostMapping("/upload")
	public String addAddress(@RequestBody String addressData) {
		// Adresse als String (z.B. JSON) empfangen und in ein Address-Objekt umwandeln
		Address address = parseAddressData(addressData);

		// Adresse zur Liste hinzufügen
		addressList.add(address);

		// Rückmeldung, dass die Adresse hochgeladen wurde
		return "Adresse erfolgreich hochgeladen!";
	}

	// Hilfsmethode zum Parsen von Address-Daten (z.B. von einem JSON-String)
	private Address parseAddressData(String addressData) {
		// Hier verwenden wir Jackson, um den JSON-String in ein Address-Objekt zu
		// konvertieren
		try {
			// Jackson ObjectMapper verwenden, um die Daten in das Address-Objekt zu
			// konvertieren
			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.findAndRegisterModules(); // Stellt sicher, dass lokale Daten korrekt verarbeitet werden
			return objectMapper.readValue(addressData, Address.class);
		} catch (IOException e) {
			throw new RuntimeException("Fehler beim Parsen der Adressdaten", e);
		}
	}
}
