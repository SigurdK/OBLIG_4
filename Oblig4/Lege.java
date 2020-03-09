class Lege {
    //lege tar inn et navn, og kan returnere både type og navn.
    protected String navn;
    public Lege(String n){
        navn = n;
    }
    public String hentNavn(){
        return navn;
    }
    public String typeLege(){
        return "Lege";
    }
    public String toString(){
        return "\nLegens navn: "+this.hentNavn();
    }


}
