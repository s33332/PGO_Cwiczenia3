import java.util.ArrayList;

public class BibliotekaMuzyczna {

    private String nazwa;
    private String wlasciciel;

    private ArrayList<String> listaUtworow = new ArrayList<>();
    private ArrayList<Playlista> listaPlaylist = new ArrayList<>();

    public BibliotekaMuzyczna(String nazwa, String wlasciciel) {
        this.nazwa = nazwa;
        this.wlasciciel = wlasciciel;
    }

    public void dodajUtwor(String nowyUtwor){
        listaUtworow.add(nowyUtwor);
    }

    public void usunUtwor(String utwor){
        listaUtworow.remove(utwor);
    }

    public void wyswietlUtwory(){
        for(String utwor : listaUtworow){
            System.out.println(utwor);
        }
    }

    public void utworzPlayliste(String nazwa){
        Playlista playlista = new Playlista(nazwa);
        this.listaPlaylist.add(playlista);
    }
    private Playlista znajdzPlayliste(String nazwa){
        for(int i = 0; i < listaPlaylist.size(); i++){
            Playlista p=listaPlaylist.get(i);
            if(p.getNazwa().equals(nazwa)){
                return p;
            }
        }
        return null;
    }

    public void dodajUtworDoPlaylisty(String utwor, String nazwaPlaylisty){
        Playlista p=znajdzPlayliste(nazwaPlaylisty);
        if(p == null){
            throw new IllegalArgumentException("Taka playlista nie istnieje.");
        }
        p.dodajUtwor(utwor);
    }

    public void wyszukajUtwory(String fraza){
        System.out.println("Wyniki wyszukiwania dla frazy:" + fraza);
        for (String utwor : listaUtworow) {
            if (utwor.toLowerCase().equals(fraza.toLowerCase())) {
                System.out.println(utwor);
            }
        }
    }

    public void wyswietlPlayliste(String nazwaPlaylisty){
        for (Playlista playlist : listaPlaylist){
            if(playlist.getNazwa().equals(nazwaPlaylisty)){
                playlist.wyswietlPlayliste();
                return;
            }
        }
    }

    public void wyswietlWszystkiePlaylisty(){
        System.out.println("Wszystkie playlisty: ");
        for (Playlista playlist : listaPlaylist){
            System.out.println(playlist.getNazwa());
        }
    }

    public int getLiczbaUtworow(){
        return listaUtworow.size();
    }

    public int getLiczbaPlaylist(){
        return listaPlaylist.size();
    }


}
