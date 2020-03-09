class Spesialist extends Lege implements Godkjenningsfritak{
    //Spesialist tar også inn en kontrollId i konstruktøren.
    //Spesialist implementerer også interface


    public Spesialist(String navn, int kI){
        super(navn);
        kontrollID = kI;
    }

    public int hentKontrollID(){
        return kontrollID;
    }
    
    public String typeLege(){
        return "Spesialist";
    }

    public String toString(){
        return "\nSpesialistens navn: "+this.hentNavn()+"\nKontrollID: " + this.hentKontrollID();
    }
}
