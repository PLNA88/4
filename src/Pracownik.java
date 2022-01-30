public class Pracownik implements PracownikI{
    private String imie;
    private String nazwisko;
    private int wiek;
    private String stanowisko;
    private String departament;
    private int kodPracownika;


    public Pracownik(String imie, String nazwisko, int wiek, String stanowisko, String departament, int kodPracownika){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
        this.departament = departament;
        this.kodPracownika = kodPracownika;
    }


    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public int getWiek() {
        return wiek;
    }
    public String getStanowisko() {
        return stanowisko;
    }
    public String getDepartament() {
        return departament;
    }
    public int getKodPracownika() {
        return kodPracownika;
    }


    public void setImie(String imie) {
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }
    public void setDepartament(String departament) {
        this.departament = departament;
    }
    public void setKodPracownika(int kodPracownika) {
        this.kodPracownika = kodPracownika;
    }


    @Override
    public String imie(String imie) {
        return null;
    }
    @Override
    public String nazwisko(String nazwisko) {
        return null;
    }
    @Override
    public int wiek(int wiek) {
        return 0;
    }
    @Override
    public String stanowisko(String stanowisko) {
        return null;
    }
    @Override
    public String departament(String departament) {
        return null;
    }
    @Override
    public int kodPracownika(int kodPracownika) {
        return 0;
    }


    @Override
    public String toString(){
        return "Pracownik: imie: " + imie + ", nazwisko: " + nazwisko + ", wiek: " + wiek + ", stanowisko: " + stanowisko + ", departament: " + departament + ", kod: " + kodPracownika;
    }
}