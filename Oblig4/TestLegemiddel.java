class TestLegemiddel {
    public static void main(String[] args) {
        Narkotisk narkotisk1 = new Narkotisk("Valium",599,20,3);
        Vanedannende vanedannende1 = new Vanedannende("Heroin",249,10,5);
        Narkotisk narkotisk2 = new Narkotisk("Paracett",50,5,2);
        Vanlig vanlig1 = new Vanlig("Strepsil",20,1);
        vanlig1.settNyPris(8);

/*      Dette er brukt for å teste funksjoner, men nederst har jeg gjort omm til toString printing.
        System.out.println("NARKOTISK LEGEMIDDEL: ");
        System.out.println("ID: "+narkotisk2.hentId());
        System.out.println("Navn på Legemiddel: "+narkotisk2.hentNavn());
        System.out.println("Pris: "+narkotisk2.hentPris());
        System.out.println("Virkestoff i mg: "+narkotisk2.hentVirkestoff());
        System.out.println("Narkotisk Styrke: "+narkotisk2.hentNarkotiskStyrke());

        System.out.println("\nVANEDANNENDE LEGEMIDDEL: ");
        System.out.println("ID: "+vanedannende1.hentId());
        System.out.println("Navn på Legemiddel: "+vanedannende1.hentNavn());
        System.out.println("Pris: "+vanedannende1.hentPris());
        System.out.println("Virkestoff i mg: "+vanedannende1.hentVirkestoff());
        System.out.println("Narkotisk Styrke: "+vanedannende1.hentVanedannendeStyrke());

        System.out.println("\nVANLIG LEGEMIDDEL: ");
        System.out.println("ID: "+vanlig1.hentId());
        System.out.println("Navn på Legemiddel: "+vanlig1.hentNavn());
        System.out.println("Pris: "+vanlig1.hentPris());
        System.out.println("Virkestoff i mg: "+vanlig1.hentVirkestoff());
*/
        System.out.println(narkotisk1);
        System.out.println(vanedannende1);
        System.out.println(vanlig1);

    }
}
