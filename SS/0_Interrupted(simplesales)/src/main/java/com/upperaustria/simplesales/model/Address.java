package com.upperaustria.simplesales.model;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Address {
    private String          adressCodeSubcode;           // adrcd-subcd
    private String          region;                      // Region
    private LocalDate       geplanteFertigstellung;      // Fertigstellung Bau (aktueller Plan)
    private boolean         fertigstellungErfolgt;       // Fertigstellung Bau erfolgt
    private String          strasse;                     // Straße (wird aus "Adresse" extrahiert)
    private String          plz;                         // Postleitzahl (wird aus "Adresse" extrahiert)
    private String          netzbetreiber;               // ANO
    private AddressStatus   status;                      // Status (parsed from CSV string)
    private int             anzahlAnschluesse;           // Anzahl der Homes
    private boolean         vertragOderAngebotGesendet;  // Vertrag auf Adresse vorhanden oder L1-Angebot gesendet
    private String          provisionsKategorie;         // Provisions-Kategorie
    private String          kgNummer;                    // KG Nummer
    private String          baufirma;                    // Baufirma
    private LocalDate       vertriebsstart;              // D2D-Vertrieb Start
    private LocalDate       vertriebsende;               // D2D-Vertrieb Ende
    private double          preis;                       // Preis Standardprodukt (€)
    private boolean         outdoorPauschale;            // Outdoor-Pauschale vorhanden
    private Note            notizen;                     // Notizen

    // Standardkonstruktor
    public Address(String adressCodeSubcode, String region, LocalDate geplanteFertigstellung,
                   boolean fertigstellungErfolgt, String strasse, String plz, String netzbetreiber,
                   AddressStatus status, int anzahlAnschluesse, boolean vertragOderAngebotGesendet,
                   String provisionsKategorie, String kgNummer, String baufirma,
                   LocalDate vertriebsstart, LocalDate vertriebsende, double preis,
                   boolean outdoorPauschale, Note notizen) {
        this.adressCodeSubcode = adressCodeSubcode;
        this.region = region;
        this.geplanteFertigstellung = geplanteFertigstellung;
        this.fertigstellungErfolgt = fertigstellungErfolgt;
        this.strasse = strasse;
        this.plz = plz;
        this.netzbetreiber = netzbetreiber;
        this.status = status;
        this.anzahlAnschluesse = anzahlAnschluesse;
        this.vertragOderAngebotGesendet = vertragOderAngebotGesendet;
        this.provisionsKategorie = provisionsKategorie;
        this.kgNummer = kgNummer;
        this.baufirma = baufirma;
        this.vertriebsstart = vertriebsstart;
        this.vertriebsende = vertriebsende;
        this.preis = preis;
        this.outdoorPauschale = outdoorPauschale;
        this.notizen = (notizen != null) ? notizen : new Note();
    }

    // (Getter und Setter ...)
    public String getAdressCodeSubcode() {
        return adressCodeSubcode;
    }

    public void setAdressCodeSubcode(String adressCodeSubcode) {
        this.adressCodeSubcode = adressCodeSubcode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public LocalDate getGeplanteFertigstellung() {
        return geplanteFertigstellung;
    }

    public void setGeplanteFertigstellung(LocalDate geplanteFertigstellung) {
        this.geplanteFertigstellung = geplanteFertigstellung;
    }

    public boolean isFertigstellungErfolgt() {
        return fertigstellungErfolgt;
    }

    public void setFertigstellungErfolgt(boolean fertigstellungErfolgt) {
        this.fertigstellungErfolgt = fertigstellungErfolgt;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getNetzbetreiber() {
        return netzbetreiber;
    }

    public void setNetzbetreiber(String netzbetreiber) {
        this.netzbetreiber = netzbetreiber;
    }

    public AddressStatus getStatus() {
        return status;
    }

    public void setStatus(AddressStatus status) {
        this.status = status;
    }

    public int getAnzahlAnschluesse() {
        return anzahlAnschluesse;
    }

    public void setAnzahlAnschluesse(int anzahlAnschluesse) {
        this.anzahlAnschluesse = anzahlAnschluesse;
    }

    public boolean isVertragOderAngebotGesendet() {
        return vertragOderAngebotGesendet;
    }

    public void setVertragOderAngebotGesendet(boolean vertragOderAngebotGesendet) {
        this.vertragOderAngebotGesendet = vertragOderAngebotGesendet;
    }

    public String getProvisionsKategorie() {
        return provisionsKategorie;
    }

    public void setProvisionsKategorie(String provisionsKategorie) {
        this.provisionsKategorie = provisionsKategorie;
    }

    public String getKgNummer() {
        return kgNummer;
    }

    public void setKgNummer(String kgNummer) {
        this.kgNummer = kgNummer;
    }

    public String getBaufirma() {
        return baufirma;
    }

    public void setBaufirma(String baufirma) {
        this.baufirma = baufirma;
    }

    public LocalDate getVertriebsstart() {
        return vertriebsstart;
    }

    public void setVertriebsstart(LocalDate vertriebsstart) {
        this.vertriebsstart = vertriebsstart;
    }

    public LocalDate getVertriebsende() {
        return vertriebsende;
    }

    public void setVertriebsende(LocalDate vertriebsende) {
        this.vertriebsende = vertriebsende;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public boolean isOutdoorPauschale() {
        return outdoorPauschale;
    }

    public void setOutdoorPauschale(boolean outdoorPauschale) {
        this.outdoorPauschale = outdoorPauschale;
    }

    public Note getNotizen() {
        return notizen;
    }

    public void setNotizen(Note notizen) {
        this.notizen = notizen;
    }

    // Methode, um den Status auf "Erledigt" zu setzen
    public void markAsDone() {
        this.status = AddressStatus.ERLEDIGT;
    }


    @Override
    public String toString() {
        return "Address{" +
                "adressCodeSubcode='" + adressCodeSubcode + '\'' +
                ", region='" + region + '\'' +
                ", geplanteFertigstellung=" + geplanteFertigstellung +
                ", fertigstellungErfolgt=" + fertigstellungErfolgt +
                ", strasse='" + strasse + '\'' +
                ", plz='" + plz + '\'' +
                ", netzbetreiber='" + netzbetreiber + '\'' +
                ", status=" + status +
                ", anzahlAnschluesse=" + anzahlAnschluesse +
                ", vertragOderAngebotGesendet=" + vertragOderAngebotGesendet +
                ", provisionsKategorie='" + provisionsKategorie + '\'' +
                ", kgNummer='" + kgNummer + '\'' +
                ", baufirma='" + baufirma + '\'' +
                ", vertriebsstart=" + vertriebsstart +
                ", vertriebsende=" + vertriebsende +
                ", preis=" + preis +
                ", outdoorPauschale=" + outdoorPauschale +
                ", notizen=" + notizen +
                '}';
    }

    /**
     * Erzeugt ein Address-Objekt aus einer CSV-Zeile.
     * Erwartet wird die folgende Spaltenreihenfolge (Tab-separiert):
     *  0: adrcd-subcd
     *  1: Region
     *  2: Fertigstellung Bau (aktueller Plan)
     *  3: Fertigstellung Bau erfolgt
     *  4: Adresse (Format: "Straße, PLZ, Stadt")
     *  5: ANO
     *  6: Status
     *  7: Anzahl der Homes
     *  8: Vertrag auf Adresse vorhanden oder L1-Angebot gesendet
     *  9: Provisions-Kategorie
     * 10: KG Nummer
     * 11: Baufirma
     * 12: D2D-Vertrieb Start
     * 13: D2D-Vertrieb Ende
     * 14: Preis Standardprodukt (€)
     * 15: Outdoor-Pauschale vorhanden
     *
     * @param csvLine die CSV-Zeile
     * @return ein Address-Objekt
     */
    public static Address fromCsv(String csvLine) {
        String[] tokens = csvLine.split("\t");

        // 0. Adresse-Code Subcode
        String adressCodeSubcode = tokens[0].trim();
        // 1. Region
        String region = tokens[1].trim();
        // 2. Geplante Fertigstellung
        LocalDate geplanteFertigstellung = parseDate(tokens[2].trim());
        // 3. Fertigstellung erfolgt (boolean)
        boolean fertigstellungErfolgt = Boolean.parseBoolean(tokens[3].trim());
        // 4. Adresse: Split into street and postal code (and optionally city)
        String fullAddress = tokens[4].trim();
        String[] addressParts = fullAddress.split(",");
        String strasse = addressParts.length > 0 ? addressParts[0].trim() : "";
        String plz = addressParts.length > 1 ? addressParts[1].trim() : "";
        // (Die Stadt könnte addressParts[2] sein, wird hier aber nicht gespeichert.)
        
        // 5. Netzbetreiber (ANO)
        String netzbetreiber = tokens[5].trim();
        // 6. Status: parse using a helper method (beispielsweise "100 In Betrieb")
        AddressStatus status = parseStatus(tokens[6].trim());
        // 7. Anzahl der Homes
        int anzahlAnschluesse = Integer.parseInt(tokens[7].trim());
        // 8. Vertrag oder Angebot gesendet (1=true, 0=false)
        boolean vertragOderAngebotGesendet = "1".equals(tokens[8].trim());
        // 9. Provisions-Kategorie
        String provisionsKategorie = tokens[9].trim();
        // 10. KG Nummer
        String kgNummer = tokens[10].trim();
        // 11. Baufirma
        String baufirma = tokens[11].trim();
        // 12. D2D-Vertrieb Start
        LocalDate vertriebsstart = parseDate(tokens[12].trim());
        // 13. D2D-Vertrieb Ende (kann leer sein)
        LocalDate vertriebsende = tokens[13].trim().isEmpty() ? null : parseDate(tokens[13].trim());
        // 14. Preis Standardprodukt (€)
        double preis = Double.parseDouble(tokens[14].trim());
        // 15. Outdoor-Pauschale vorhanden ("Ja"/"Nein")
        boolean outdoorPauschale = tokens[15].trim().equalsIgnoreCase("ja");

        // Notizen are not provided in CSV – default to an empty Note.
        Note notizen = new Note();

        return new Address(adressCodeSubcode, region, geplanteFertigstellung, fertigstellungErfolgt,
                strasse, plz, netzbetreiber, status, anzahlAnschluesse, vertragOderAngebotGesendet,
                provisionsKategorie, kgNummer, baufirma, vertriebsstart, vertriebsende, preis,
                outdoorPauschale, notizen);
    }

    // Helper-Methode, um ein Datum zu parsen (erwartetes Format: yyyy-MM-dd)
    private static LocalDate parseDate(String dateStr) {
        try {
            return LocalDate.parse(dateStr);
        } catch (DateTimeParseException e) {
            // Bei ungültigem Datum kann man alternativ null zurückgeben oder eine Exception werfen
            return null;
        }
    }

    // Helper-Methode, um den Status aus dem CSV-String zu parsen.
    private static AddressStatus parseStatus(String statusStr) {
        // Beispiel: wenn der String "In Betrieb" enthält, setzen wir IN_BETRIEB.
        // Passen Sie diese Logik an, falls Sie weitere Statuswerte haben.
        if (statusStr.contains("In Betrieb")) {
            return AddressStatus.IN_BETRIEB;
        } else if (statusStr.contains("Erledigt")) {
            return AddressStatus.ERLEDIGT;
        }
        // Default
        return AddressStatus.OFFEN;
    }

}
