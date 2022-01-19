public class Humain {
    private String nom;
    private String boissonFavorite="Eau";

    public Humain(String nom_de_humain){
        this.nom=nom_de_humain;
    }

    public String quel_est_ton_nom(){
        return this.nom;

    }


    void parler(String texte){
        System.out.println(this.nom+"-"+texte);


    }
    void sePresenter(){
        System.out.println("Bonjour : " +this.nom+" je voudrais de l' "+this.boissonFavorite);
    }
    void boire(){
        System.out.println("Ah ! un bon verre d' " +this.boissonFavorite+" ! GLOUPS !");

    }
}
