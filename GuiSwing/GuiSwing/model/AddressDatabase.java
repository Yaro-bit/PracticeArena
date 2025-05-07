package model;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class AddressDatabase {
    private final Map<String, Address> database;

    // Konstruktor, der die Datenbank initialisiert
    public AddressDatabase() {
        this.database = new HashMap<>();
    }

    // Gibt alle Adressen für die gegebene PLZ zurück
    public String[] getAddressesForZip(String zipCode) {
        return database.values().stream()
                .filter(address -> address.getZipCode().equals(zipCode))
                .map(Address::getStreet)
                .toArray(String[]::new);
    }

    // Gibt die Adresse für eine gegebene Straße zurück
    public Address getAddressByStreet(String street) {
        return database.values().stream()
                .filter(address -> address.getStreet().equals(street))
                .findFirst()
                .orElse(null);
    }

    // Fügt eine Adresse in die Datenbank ein
    public void addAddress(Address address) {
        database.put(address.getAdrCdSubCd(), address);
    }

    // Gibt alle Adressen mit der gleichen Postleitzahl zurück
    public Map<String, Address> getAddressesForZipMap(String zipCode) {
        return database.values().stream()
                .filter(address -> address.getZipCode().equals(zipCode))
                .collect(Collectors.toMap(Address::getAdrCdSubCd, address -> address));
    }

    // Gibt alle Adressen zurück
    public Map<String, Address> getAllAddresses() {
        return database;
    }
}