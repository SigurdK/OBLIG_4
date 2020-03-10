class Pasient {
    protected String fodselsnummer;
    protected int ID;
    private static int IdCounter = 0;
    protected String navn;
    Stabel<Resept> stabel = new Stabel<Resept>();

    public Pasient(String n, String FN){
        navn = n;
        fodselsnummer = FN;
        ID = IdCounter++;
    }
    public void leggTilResept(Resept r){
        stabel.leggPaa(r);
    }
    public Resept taUtResept(){
        return stabel.taAv();
    }
    public Stabel hentReseptListe(){
        return stabel;
    }
    public String toString(){
        return "Pasientens navn: "+navn+"\nPasientens fodselsnummer: "+fodselsnummer+"\nPasientens ID: "+ ID;
    }
}
