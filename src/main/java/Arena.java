import com.sun.xml.internal.ws.server.DefaultResourceInjector;
import java.util.Scanner;

public class Arena {
    // combat entre les deux robots//

        public static Robot fight(Robot R1, Robot R2) {
            Robot win , lost = null;
            while(!R1.isDead() && !R2.isDead()){
                R1.fire(R2);
                R2.fire(R1);
            }

            //je check les robots vivants//
            win = R1.isDead()?R2:R1;
            lost = R1.isDead()?R1:R2;
            System.out.println("Le robot "+lost.getNom() + " a ete touche par le robot  "+lost.getNom());
            return  win;
        }

        public  static void  main(String[] args) {

// methode de combat entre le robot D2R2 et Data//

            // initialisation et déclaration des Robots Data et D2R2//
            Robot D2R2, Data = null;
            System.out.println("COMBAT DES ROBOTS ");
            System.out.println("- creation des robots par default");
            D2R2 = new Robot("D2R2");
            Data = new Robot("Data");

            // déclaration de Arena
            System.out.println(D2R2);

            // le tir sur le Robot data //
            D2R2.fire(Data);

            //combat entre le robot D2R2 et Data//
            Arena.fight(D2R2 ,Data);

            //les points finaux du combat//
            System.out.println("GAME OVER");
            System.out.println(" - Robot D2D2 : "+D2R2.getlife() +" points de vie ");
            System.out.println(" - Robot Data: "+Data.getlife() +" points de vie ");

        }
}
