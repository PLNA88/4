public class Kwadrat extends Figura{

    private int dlugosc;
    private String figura;

    public Kwadrat(int dlugosc, String figura){
        this.dlugosc = dlugosc;
        this.figura = nazwaFigury(figura);
    }

    public int getDlugosc() {
        return dlugosc;
    }
    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    @Override
    float pole(){
        return (dlugosc^2);
    }
    @Override
    float obwod(){
        return (dlugosc*4);
    }
    @Override
    String nazwaFigury(String figura){
        return "To jest figura: kwadrat.";
    }

    @Override
    public String toString(){
        return figura + " Długość: " + dlugosc + ", pole: " + pole() + ", obwód: " + obwod();
    }
}