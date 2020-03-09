class HvitResept extends Resept {
    //Hvit resept gir ingen prisreduksjon, og returnerer derfor legemiddelets pris.
    
    public HvitResept(Legemiddel legeMiddel, Lege utskrevenLege, int pasientId, int reit){
        super(legeMiddel,  utskrevenLege,  pasientId,  reit);
    }
    public String farge(){
        return "Hvit";
    }
    public double prisAaBetale(){
        return legemiddel.hentPris();
    }
    public String toString(){

        return "\nResepten er "+this.farge() +" og gjelder legemiddelet: \n"+legemiddel+"\n\npris per legemiddel med denne resepten: "+this.prisAaBetale()+"\nUtskrivende " +utskrivendeLege.typeLege()+" er: "+utskrivendeLege.hentNavn()+"\nPasientens ID: "+pasientId+"\nAntall ganger igjen(reit): "+reit+"\nReseptens ID: "+Id+"\n";
    }


}
