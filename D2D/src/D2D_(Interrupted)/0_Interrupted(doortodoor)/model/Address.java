package model;

public class Address {
    private String adrCdSubCd;
    private String region;
    private String constructionCompletionPlanned;
    private boolean constructionCompletionOccurred;
    private String street;
    private String zipCode;
    private String ano;
    private String status;
    private int numberOfHomes;
    private boolean contractOrOfferSent;
    private String commissionCategory;
    private String kgNumber;
    private String constructionCompany;
    private String d2dStart;
    private String d2dEnd;
    private double price;
    private boolean outdoorPackage;
    private String notes;

    // Konstruktor
    public Address(String adrCdSubCd, String region, String constructionCompletionPlanned,
                   boolean constructionCompletionOccurred, String street, String zipCode, String ano,
                   int numberOfHomes, boolean contractOrOfferSent, String commissionCategory, String kgNumber,
                   String constructionCompany, String d2dStart, String d2dEnd, double price, boolean outdoorPackage) {
        this.adrCdSubCd = adrCdSubCd;
        this.region = region;
        this.constructionCompletionPlanned = constructionCompletionPlanned;
        this.constructionCompletionOccurred = constructionCompletionOccurred;
        this.street = street;
        this.zipCode = zipCode;
        this.ano = ano;
        this.status = "Offen";
        this.numberOfHomes = numberOfHomes;
        this.contractOrOfferSent = contractOrOfferSent;
        this.commissionCategory = commissionCategory;
        this.kgNumber = kgNumber;
        this.constructionCompany = constructionCompany;
        this.d2dStart = d2dStart;
        this.d2dEnd = d2dEnd;
        this.price = price;
        this.outdoorPackage = outdoorPackage;
        this.notes = "";
    }

    // Getter und Setter für alle Felder
    public String getAdrCdSubCd() { return adrCdSubCd; }
    public void setAdrCdSubCd(String adrCdSubCd) { this.adrCdSubCd = adrCdSubCd; }

    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }

    public String getConstructionCompletionPlanned() { return constructionCompletionPlanned; }
    public void setConstructionCompletionPlanned(String constructionCompletionPlanned) { this.constructionCompletionPlanned = constructionCompletionPlanned; }

    public boolean isConstructionCompletionOccurred() { return constructionCompletionOccurred; }
    public void setConstructionCompletionOccurred(boolean constructionCompletionOccurred) { this.constructionCompletionOccurred = constructionCompletionOccurred; }

    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }

    public String getZipCode() { return zipCode; }
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }

    public String getAno() { return ano; }
    public void setAno(String ano) { this.ano = ano; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public int getNumberOfHomes() { return numberOfHomes; }
    public void setNumberOfHomes(int numberOfHomes) { this.numberOfHomes = numberOfHomes; }

    public boolean isContractOrOfferSent() { return contractOrOfferSent; }
    public void setContractOrOfferSent(boolean contractOrOfferSent) { this.contractOrOfferSent = contractOrOfferSent; }

    public String getCommissionCategory() { return commissionCategory; }
    public void setCommissionCategory(String commissionCategory) { this.commissionCategory = commissionCategory; }

    public String getKgNumber() { return kgNumber; }
    public void setKgNumber(String kgNumber) { this.kgNumber = kgNumber; }

    public String getConstructionCompany() { return constructionCompany; }
    public void setConstructionCompany(String constructionCompany) { this.constructionCompany = constructionCompany; }

    public String getD2dStart() { return d2dStart; }
    public void setD2dStart(String d2dStart) { this.d2dStart = d2dStart; }

    public String getD2dEnd() { return d2dEnd; }
    public void setD2dEnd(String d2dEnd) { this.d2dEnd = d2dEnd; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public boolean isOutdoorPackage() { return outdoorPackage; }
    public void setOutdoorPackage(boolean outdoorPackage) { this.outdoorPackage = outdoorPackage; }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }

    // Methode, um den Status auf "Erledigt" zu setzen
    public void markAsDone() {
        this.status = "Erledigt";
    }
}