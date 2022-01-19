

public class Dame extends Humain {
    private String couleur = "rouge"; 
    private boolean kidnapper = false;
    private boolean etat =false;

    public Dame(){
        super("Dame");
       
    }

    
    void libertation()
    {
        if (etat ==true)
        {
            System.out.println("Merci de m'avoir libéré !");
        }
    }
    void kidnapper()
    {
        if (kidnapper == true) 
        {
            System.out.println("HURELEMENT !!");
        }
    }
    void changementRobe()
    {
        if (couleur != "rouge")
        {
        System.out.println("Regardez ma nouvelle robe "+couleur+" !");
        }
    }
    public boolean isKidnapper() 
    {
        return kidnapper;
    }


    public void setKidnapper(boolean kidnapper)
     {
        this.kidnapper = kidnapper;
    } 
}
