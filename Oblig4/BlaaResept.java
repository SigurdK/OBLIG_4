public class BlaaResept extends Resept {

    public BlaaResept(Legemiddel legeMiddel, Lege utskrevenLege, Pasient pasient, int reit){
        super(legeMiddel,  utskrevenLege,  pasient,  reit);
    }
    public String farge(){
        return "Blaa";
    }
    public double prisAaBetale(){
        return legemiddel.hentPris()*0.25;
    }
    @Override
    public String printTilFil(){
        return Id+","+utskrivendeLege.hentNavn()+","+pasient.hentNavn()+","+"blaa"+","+reit;

    }
    public String toString(){

        return "\nResepten er "+this.farge() +" og gjelder legemiddelet: \n"+legemiddel+"\n\npris per legemiddel med denne resepten: "+this.prisAaBetale()+"\nUtskrivende " +utskrivendeLege.typeLege()+" er: "+utskrivendeLege.hentNavn()+"\nPasientens Navn: "+pasient.hentNavn()+"\nPasientens ID: "+pasient.hentID()+"\nAntall ganger igjen(reit): "+reit+"\nReseptens ID: "+Id+"\n";
    }
}
