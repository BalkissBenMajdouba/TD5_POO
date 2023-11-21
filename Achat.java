package td5;
import java.util.Scanner;

public class Achat {
    static Article[] tabA = new Article[4];

    public static void main(String[] args) {
        tabA[0] = new Vetement(123, "Jupe bleue taille S", 39.0f, 2, "bleue", "S");
        tabA[1] = new ProduitElec(145, "TV Led 80cm", 1450.0f, 0, "TV");
        tabA[2] = new Vetement(178, "Pantalon noir taille M", 42.0f, 5, "noir", "M");
        tabA[3] = new ProduitGC(191, "Pâtes", 0.41f, 18);

        float mtTot = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < tabA.length; i++) {
            System.out.print("vous voulez acheter combien de " + tabA[i].libelle + " ? : ");
            
            int qtAch = sc.nextInt();

            if (tabA[i].estDispo(qtAch)) {
            	 System.out.println();
                System.out.println("Cet article est dispo:");
                tabA[i].decrire();
                float pTTC = tabA[i].calculPrixTTC();

                if (tabA[i].appartientPromo()) {
                    System.out.println("Prix avec promo : " + pTTC);
                } else {
                    System.out.println("Prix sans promo: " + pTTC);
                }

                mtTot += pTTC;
            } else {
            	 System.out.println();
                 System.out.println("Cet article est pas dispo:");
              
                tabA[i].decrire();
                tabA[i].approvisionner(5);
                        }
        }
        System.out.println();
        System.out.println("MtTot: " + mtTot + " DT");
        System.out.println("*** Net2aked ml ajout ***");
        tabA[2].decrire();
        
    }
}
