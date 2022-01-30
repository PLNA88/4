public interface Budynek {
    double powierzchnia(double powBudynku, double powPodworka, double powParkingu);
    String adresBudynku(String miejscowosc, String ulica, String nrDomu, String nrLokalu, String kodPocztowy);
    void liczbaOkien(int valueOkna);
    void liczbaMieszkancow(int valueMieszkancy);
    void kolorDomu(KolorEnum kolor);
    double wyliczCene(double powierzchnia, double cena);
    int ileRoslin(int drzewa, int krzewy);
}