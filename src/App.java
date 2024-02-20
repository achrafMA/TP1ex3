import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Vehicule []vehicules=new Vehicule[5];
        vehicules[0]=new Voiture("n1",3000000,"m1",2023);
        vehicules[1]=new Avion("n2",2000000,"c1",2023);
        vehicules[2]=new Voiture("n3",3500000,"m3",2023);
        vehicules[3]=new Avion("n4",7855550,"c2",2023);
        vehicules[4]=new Voiture("n5",600000,"m1",2023);

        for (Vehicule v:vehicules){
            v.emettreSon();
        }
        Voiture v1= new Voiture("DACIA",16000,"sandero",2022);
        Voiture v2= new Voiture("DACIA",16000,"sandero",2022);

        if (v1.equals(v2)) {
            System.out.println("V1 = V2");
        } else {
            System.out.println("V1 != V2");
        }

/*
        for (Voiture v:voitures){
            if (v!=null)
            v.afficherInfo();
        }
        for (Voiture v:voitures){
            if (v!=null)
                v.afficherInfo();
        }
*/

    }
}
