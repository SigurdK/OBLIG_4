abstract class Resept {
    //har en static variabel Idcounter, som setter id for objektet som opprettes.
    //tar også inn en id for pasienten.
    protected int Id;
    private static int IdCounter;
    protected int reit;
    protected Legemiddel legemiddel;
    protected Lege utskrivendeLege;
    protected int pasientId;

    public Resept (Legemiddel lM, Lege uL, int pI, int r){

        legemiddel = lM;
        utskrivendeLege = uL;
        pasientId = pI;
        reit = r;
        Id = IdCounter++;
    }
    public int hentId(){
        return Id;
    }
    public Legemiddel hentLegemiddel(){
        return legemiddel;
    }
    public Lege hentUtsrivendeLege(){
        return utskrivendeLege;
    }
    public int hentPasientId(){
        return pasientId;
    }
    public int hentReit(){
        return reit;
    }
    //sjekker om resepten kan brukes, dersom det går så synker reit med 1, eller returerers false.
    public boolean bruk(){
        if (reit == 0){
            return false;
        }else {
            reit --;
            return true;
        }
    }
    //har noen funksjoner som skal implementeres i alle sub-klassene.
    abstract public String farge();
    abstract public double prisAaBetale();
    abstract public String toString();

}
