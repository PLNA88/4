public class Dom implements Budynek {
    private double powBudynku;
    private double powPodworka;
    private double powParkingu;
    private String miejscowosc;
    private String ulica;
    private String nrDomu;
    private String nrLokalu;
    private String kodPocztowy;
    private int valueOkna;
    private int valueMieszkancy;
    private KolorEnum kolor;
    private double cena;
    private int drzewa;
    private int krzewy;

    public Dom(
            double powBudynku, double powPodworka, double powParkingu,
            String miejscowosc, String ulica, String nrDomu, String nrLokalu, String kodPocztowy,
            int valueOkna, int valueMieszkancy, KolorEnum kolor, double cena, int drzewa, int krzewy)
    {
        this.powBudynku = powBudynku; this.powPodworka = powPodworka; this.powParkingu = powParkingu;
        this.miejscowosc = miejscowosc; this.ulica = ulica; this.nrDomu = nrDomu; this.nrLokalu = nrLokalu; this.kodPocztowy = kodPocztowy;
        this.valueOkna = valueOkna; this.valueMieszkancy = valueMieszkancy;
        this.kolor = kolor; this.cena = cena; this.drzewa = drzewa; this.krzewy = krzewy;
    }


    public double getPowBudynku() {
        return powBudynku;
    }
    public double getPowPodworka() {
        return powPodworka;
    }
    public double getPowParkingu() {
        return powParkingu;
    }
    public String getMiejscowosc() {
        return miejscowosc;
    }
    public String getUlica() {
        return ulica;
    }
    public String getNrDomu() {
        return nrDomu;
    }
    public String getNrLokalu() {
        return nrLokalu;
    }
    public String getKodPocztowy() {
        return kodPocztowy;
    }
    public int getValueOkna() {
        return valueOkna;
    }
    public int getValueMieszkancy() {
        return valueMieszkancy;
    }
    public KolorEnum getKolor() {
        return kolor;
    }
    public double getCena() {
        return cena;
    }
    public int getDrzewa() {
        return drzewa;
    }
    public int getKrzewy() {
        return krzewy;
    }


    public void setPowBudynku(double powBudynku) {
        this.powBudynku = powBudynku;
    }
    public void setPowPodworka(double powPodworka) {
        this.powPodworka = powPodworka;
    }
    public void setPowParkingu(double powParkingu) {
        this.powParkingu = powParkingu;
    }
    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }
    public void setUlica(String ulica) {
        this.ulica = ulica;
    }
    public void setNrDomu(String nrDomu) {
        this.nrDomu = nrDomu;
    }
    public void setNrLokalu(String nrLokalu) {
        this.nrLokalu = nrLokalu;
    }
    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }
    public void setValueOne(int valueOkna) {
        this.valueOkna = valueOkna;
    }
    public void setValueMieszkancy(int valueMieszkancy) {
        this.valueMieszkancy = valueMieszkancy;
    }
    public void setKolor(KolorEnum kolor) {
        this.kolor = kolor;
    }
    public void setCena(double cena) {
        this.cena = cena;
    }
    public void setDrzewa(int drzewa) {
        this.drzewa = drzewa;
    }
    public void setKrzewy(int krzewy) {
        this.krzewy = krzewy;
    }


    @Override
    public double powierzchnia(double powBudynku, double powPodworka, double powParkingu) {
        return powBudynku + powPodworka + powParkingu;
    }

    @Override
    public String adresBudynku(String miejscowosc, String ulica, String nrDomu, String nrLokalu, String kodPocztowy) {
        return ulica + " " + nrDomu + "/" + nrLokalu + " " + miejscowosc + " " + kodPocztowy;
    }

    @Override
    public void liczbaOkien(int valueOkna) {
    }

    @Override
    public void liczbaMieszkancow(int valueMieszkancy) {
    }

    @Override
    public void kolorDomu(KolorEnum kolor) {
    }

    @Override
    public double wyliczCene(double powierzchnia, double cena) {
        return powierzchnia * cena;
    }

    @Override
    public int ileRoslin(int drzewa, int krzewy) {
        return drzewa + krzewy;
    }

    @Override
    public String toString(){
        return "Powierzchnia: " + (powBudynku+powPodworka+powParkingu) +
                "m2. Adres: " + ulica + " " + nrDomu + "/" + nrLokalu + " " + miejscowosc + " " + kodPocztowy +
                ". Ilość okien: " + valueOkna + ". Ilość mieszkańców: " + valueMieszkancy + ". Ilość roślin: " + (drzewa+krzewy) +
                ". Kolor budynku: " + kolor + ". Cena: " + ((powBudynku+powPodworka+powParkingu)*cena) + "PLN.";
    }
}