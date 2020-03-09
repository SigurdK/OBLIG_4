class Lege implements Comparable<Lege>{
    //lege tar inn et navn, og kan returnere både type og navn.
    protected String navn;
    protected int kontrollID = 0;
    protected Lenkeliste<Resept> utskrevneResepter = new Lenkeliste();

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
    // public compareTo() {} --hvis denne må skrives, kan den skrives her.

    public void hentResepter() {
      System.out.println("Her kommer alle de utskrevne reseptene til" + navn);
      // her må vi skrive funksjonalitet til å iterere gjennom en lenkeliste med utskrift.
    }

    public HvitResept skrivHvitResept(Legemiddel legemiddel, Pasient pasient, int reit) throws UlovligUtskrift {
      if (legemiddel instanceof Narkotisk && kontrollID == 0) {
        throw new UlovligUtskrift(this,legemiddel);
      } else {
        HvitResept resept = new HvitResept(legemiddel, this, pasient, reit);
        return resept;
        }
    }
    public MilitaerResept skrivMilitaerResept(Legemiddel legemiddel, Pasient pasient, int reit) throws UlovligUtskrift {
      if (legemiddel instanceof Narkotisk && kontrollID == 0) {
        throw new UlovligUtskrift(this,legemiddel);
      } else {
        MilitaerResept resept = new MilitaerResept(legemiddel, this, pasient, reit);
        return resept;
      }
    }
    public PResept skrivPResept(Legemiddel legemiddel, Pasient pasient, int reit) throws UlovligUtskrift {
      if (legemiddel instanceof Narkotisk && kontrollID == 0) {
        throw new UlovligUtskrift(this,legemiddel);
      } else {
        PResept resept = new PResept(legemiddel, this, pasient, reit);
        return resept;
      }
    }
    public BlaaResept skrivBlaaResept(Legemiddel legemiddel, Pasient pasient, int reit) throws UlovligUtskrift {
      if (legemiddel instanceof Narkotisk && kontrollID == 0) {
        throw new UlovligUtskrift(this,legemiddel);
      } else {
        BlaaResept resept = new BlaaResept(legemiddel, this, pasient, reit);
        return resept;
        }
      }
}
