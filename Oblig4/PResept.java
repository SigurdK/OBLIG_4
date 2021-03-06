class PResept extends Resept {
    //108 kr mindre for resepter ikke under 0
    //alltid 3 reit, tar derfor ikke inn i konstruktøren, men opretter 3 direkte i super.
    //bruker pris som en intern variabel. 
    private double pris;

    public PResept(Legemiddel legeMiddel, Lege utskrevenLege, int pasientId){
        super(legeMiddel,  utskrevenLege,  pasientId,  3);
    }
    public String farge(){
        return "Hvit";
    }
    public double prisAaBetale(){
        pris = legemiddel.hentPris()-108;
        if (pris > 0){
            return pris;
        }else {return 0;}
    }
    public String toString(){
        return "\nResepten er "+this.farge() +" og gjelder legemiddelet: \n"+legemiddel+"\n\npris per legemiddel med denne resepten: "+this.prisAaBetale()+ "\nUtskrivende " + utskrivendeLege.typeLege()+ " er: "+utskrivendeLege.hentNavn()+"\nPasientens ID: "+pasientId+"\nAntall ganger igjen(reit): "+reit+"\nReseptens ID: "+Id+"\n";
    }

}
