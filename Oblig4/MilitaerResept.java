class MilitaerResept extends HvitResept {
    //100% rabatert pris på resepter slik at pros å betale returnerer 0.

    public MilitaerResept(Legemiddel legeMiddel, Lege utskrevenLege, Pasient pasient, int reit){
        super(legeMiddel,  utskrevenLege,  pasient,  reit);
    }
    public String farge(){
        return "Hvit";
    }
    public double prisAaBetale(){
        return 0;
    }
    public String toString(){

        return "\nResepten er "+this.farge() +" og gjelder legemiddelet: \n"+legemiddel+"\n\npris per legemiddel med denne resepten: "+this.prisAaBetale()+"\nUtskrivende " +utskrivendeLege.typeLege()+" er: "+utskrivendeLege.hentNavn()+"\nPasientens ID: "+pasient+"\nAntall ganger igjen(reit): "+reit+"\nReseptens ID: "+Id+"\n";
    }

}
