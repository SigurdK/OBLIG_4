class Narkotisk extends Legemiddel {
    // tar også inn styrke i konstruktøren
    protected int styrke;

    public Narkotisk(String navn, double pris, double virkestoff, int s){
        super(navn,pris,virkestoff);
        styrke = s;
    }
    public int hentNarkotiskStyrke(){
        return styrke;
    }
    public String toString(){
        return "\nLEGEMIDDEL\nType: Narkotisk"+"\nNavn: "+navn+"\nID: "+Id+"\nPris: "+pris+"\nVirkestoff (mg): "+virkestoff+"\nStyrke: "+styrke;
    }
}
