class BlaaResept extends Resept{
    // gir 75% rabatt på legemiddel. pros å betale ganges derfor med 0.25.

    public BlaaResept(Legemiddel legeMiddel, Lege utskrevenLege, int pasientId, int reit){
        super(legeMiddel,  utskrevenLege,  pasientId,  reit);
    }
    public String farge(){
        return "Blaa";
    }
    public double prisAaBetale(){
        return legemiddel.hentPris()*0.25;
    }
    public String toString(){

        return "\nResepten er "+this.farge() +" og gjelder legemiddelet: \n"+legemiddel+"\n\npris per legemiddel med denne resepten: "+this.prisAaBetale()+"\nUtskrivende " +utskrivendeLege.typeLege()+" er: "+utskrivendeLege.hentNavn()+"\nPasientens ID: "+pasientId+"\nAntall ganger igjen(reit): "+reit+"\nReseptens ID: "+Id+"\n";
    }
}
