public class FinnMaxVerdi {
    public static void main(String[] args) {
        int[] liste = {16,3,8,9,2,7,6};
        int maksVerdi = liste[0];
        for (int i = 1; i<7; i++){
            if (liste[i]>maksVerdi){
                maksVerdi = liste[i];
            }
        }
        System.out.println("min algoritme : "+ maksVerdi+"\n");
        int[] liste2 = {16,3,8,9,2,7,6};
        int maksVerdi1 = liste[0];
        for (int j = 1; j < 7; j++){
            int verdi = liste2[j]; // dette er unødvendig synes jeg!
            if (verdi>maksVerdi1){
                maksVerdi1 = verdi;
            }
        }
        System.out.println("Lengre kode. Resultat : "+maksVerdi1+"\n");
        System.out.print("\"tallene i liste 2 :\"");
        for (int k = 0; k< liste2.length;k++){
            System.out.print(liste2[k]);
        }
        System.out.println("Test-1");

        System.out.println("Test-2 Fra andre data maskin");
    }
}

