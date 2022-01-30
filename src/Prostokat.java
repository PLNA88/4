public class Prostokat extends Figura{
    private int dlugosc;
    private int szerokosc;
    private String figura;

    public Prostokat(int dlugosc, int szerokosc, String figura){
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.figura = nazwaFigury(figura);
    }

    public int getDlugosc() {
        return dlugosc;
    }
    public int getSzerokosc() {
        return szerokosc;
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }
    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }

    @Override
    float pole(){
        return (dlugosc*szerokosc);
    }
    @Override
    float obwod(){
        return (dlugosc * 2 + szerokosc * 2);
    }
    @Override
    String nazwaFigury(String figura){
        return "To jest figura: prostokąt.";
    }

    @Override
    public String toString(){
        return figura + " Długość: " + dlugosc + ", szerokość: " + szerokosc + ", pole: " + pole() + ", obwód: " + obwod();
    }
}