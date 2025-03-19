package model;

public class Address {

    private String adressCodeSubcode;
    private String region;
    private String geplanteFertigstellung;
    private boolean fertigstellungErfolgt;
    private String strasse;
    private String plz;
    private String netzbetreiber;
    private String status;
    private int anzahlAnschluesse;
    private boolean vertragOderAngebotGesendet;
    private String provisionsKategorie;
    private String kgNummer;
    private String baufirma;
    private String vertriebsstart;
    private String vertriebsende;
    private int preis;
    private boolean outdoorPauschale;
    private Notizen notizen;

    // Getter und Setter
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

    public String getGeplanteFertigstellung() {
        return geplanteFertigstellung;
    }

    public void setGeplanteFertigstellung(String geplanteFertigstellung) {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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

    public String getVertriebsstart() {
        return vertriebsstart;
    }

    public void setVertriebsstart(String vertriebsstart) {
        this.vertriebsstart = vertriebsstart;
    }

    public String getVertriebsende() {
        return vertriebsende;
    }

    public void setVertriebsende(String vertriebsende) {
        this.vertriebsende = vertriebsende;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public boolean isOutdoorPauschale() {
        return outdoorPauschale;
    }

    public void setOutdoorPauschale(boolean outdoorPauschale) {
        this.outdoorPauschale = outdoorPauschale;
    }

    public Notizen getNotizen() {
        return notizen;
    }

    public void setNotizen(Notizen notizen) {
        this.notizen = notizen;
    }

    // Notizen Klasse (als Beispiel)
    public static class Notizen {
        private String noteText;

        public String getNoteText() {
            return noteText;
        }

        public void setNoteText(String noteText) {
            this.noteText = noteText;
        }
    }
}
