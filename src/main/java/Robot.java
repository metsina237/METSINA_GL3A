public class Robot {

    private String nom;
    private int life;

    //initialisation du robot //

    Robot(String nom){
        if(nom.equals("")){
            System.out.println("Entrer un nom");
            System.exit(1);
        }
        this.nom = nom;
        this.life = 10;
    }

    public String getNom() {
        return nom;
    }

    public int getlife() {
        return life;
    }

    public void setVie(int life) {
        this.life = life;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

// perte de deux  points sur le robot sur  qu'on tire//

    public  boolean fire(Robot R){
        if(!R.isDead() && R.getlife() >=2){
            R.setVie(R.getlife() - 2);
            return true;
        } else
            R.setVie(0);

        return  false;
    }
    public boolean isDead(){
        return this.getlife() == 0;
    }

    @Override
    public String toString(){
        return  "Robot "+this.getNom();
    }
}
