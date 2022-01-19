public class Brigand extends Humain{
    
public Brigand (){
 super("Brigand");
}

private String look = "mechant";
private int nbDameEnlever = 0;
private boolean capturer = false;
private int prime=100;
void capturé()
{
    if (capturer==true){

        System.out.println("Damned, je suis fait ! "+(nomCowboy)+", tu m’as eu !" );

    }
}
/*
void kidnapper()
{
if(kidnapper()==true){ 
    System.out.println("Ah ah ! (getNameDame), tu es mienne d´esormais !");
}

}
*/

}
