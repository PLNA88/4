public class Student implements StudentI{
    private String imie;
    private String nazwisko;
    private int wiek;
    private String wydzial;
    private String kierunek;
    private int indeks;


    public Student(String imie, String nazwisko, int wiek, String wydzial, String kierunek, int indeks){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.wydzial = wydzial;
        this.kierunek = kierunek;
        this.indeks = indeks;
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
    public String getWydzial() {
        return wydzial;
    }
    public String getKierunek() {
        return kierunek;
    }
    public int getIndeks() {
        return indeks;
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
    public void setWydzial(String wydzial) {
        this.wydzial = wydzial;
    }
    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }
    public void setIndeks(int indeks) {
        this.indeks = indeks;
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
    public String wydzial(String wydzial) {
        return null;
    }
    @Override
    public String kierunek(String kierunek) {
        return null;
    }
    @Override
    public int indeks(int indeks) {
        return 0;
    }


    @Override
    public String toString(){
        return "Student: imie: " + imie + ", nazwisko: " + nazwisko + ", wiek: " + wiek + ", wydział: " + wydzial + ", kierunek: " + kierunek + ", numer indeksu: " + indeks;
    }
}