package controller;

import model.Address;
import model.AddressDatabase;
import view.MainView;

public class MainController {
    private MainView view;
    private AddressDatabase addressDatabase;

    public MainController(MainView view) {
        this.view = view;
        this.addressDatabase = new AddressDatabase();
    }

    // Methode zum Laden von Adressen basierend auf der PLZ
    public void loadAddresses(String zipCode) {
        String[] addresses = addressDatabase.getAddressesForZip(zipCode);
        view.displayAddresses(addresses);
    }

    // Methode zum Wechseln des Status einer Adresse
    public void toggleAddressStatus(String selectedAddress) {
        Address address = addressDatabase.getAddressByStreet(selectedAddress);
        if (address != null) {
            switch (address.getStatus()) {
                case "Offen":
                    address.setStatus("In Bearbeitung");
                    view.updateStatusButton("In Bearbeitung");
                    break;
                case "In Bearbeitung":
                    address.setStatus("Erledigt");
                    view.updateStatusButton("Erledigt");
                    break;
                case "Erledigt":
                    address.setStatus("Offen");
                    view.updateStatusButton("Offen");
                    break;
            }
            view.updateNotes("Status der Adresse " + selectedAddress + " wurde geändert auf: " + address.getStatus());
        } else {
            view.updateNotes("Fehler beim Wechseln des Status der Adresse.");
        }
    }

    // Methode zum Markieren einer Adresse als erledigt
    public void markAddressAsDone(String selectedAddress) {
        Address address = addressDatabase.getAddressByStreet(selectedAddress);
        if (address != null) {
            address.markAsDone();
            view.updateNotes("Adresse " + selectedAddress + " wurde als erledigt markiert.");
            view.updateStatusButton("Erledigt");
        } else {
            view.updateNotes("Fehler beim Markieren der Adresse.");
        }
    }

    // Methode zum Aktualisieren der Datenbank (Excel-Import etc.)
    public void updateDatabase() {
        // Logik zum Aktualisieren der Datenbank, z.B. durch Excel-Import
        view.updateNotes("Datenbank wurde erfolgreich aktualisiert.");
    }
}