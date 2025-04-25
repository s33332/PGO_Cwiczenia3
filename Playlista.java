import java.util.ArrayList;

public class Playlista {

    private String nazwa;
    private ArrayList<String> utwory = new ArrayList<>();

    public Playlista(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void dodajUtwor(String nowyUtwor){
        if(!utwory.contains(nowyUtwor)){
            utwory.add(nowyUtwor);
        }
    }

    public void usunUtwor(String nowyUtwor){
        utwory.remove(nowyUtwor);
    }

    public void wyswietlUtwory(){
        for(String utwor : utwory){
            System.out.println(utwor);
        }
    }

    public void wyswietlPlayliste(){
        System.out.println("Playlista: " + nazwa);
        for (String utwor : utwory) {
            System.out.println(utwor);
        }
    }
}
