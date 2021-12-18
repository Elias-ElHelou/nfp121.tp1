package question2;

public class Test{

    public static void main(String[] args){
        Picture pic=new Picture();
        pic.draw();//par défaut le soleil est jaune
        
        Picture picture=new Picture();
        picture.draw();
        
        picture.setColor(); //si on veut changer la couleur de la soleil au bleu
        picture.coucher(); //methode pour coucher le soleil bleue
        
    }
}
