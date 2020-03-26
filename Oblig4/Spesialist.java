public class Spesialist extends Lege implements Godkjenningsfritak{
    private int kontrollId;

    public Spesialist(String navn, int kI){
        super(navn);
        kontrollId = kI;
    }
    @Override
    public int hentKontrollId(){
        return kontrollId;
    }
    public String typeLege(){
        return "Spesialist";
    }
    public String toString(){
        return "\nSpesialistens navn: "+this.hentNavn()+"\nKontrollId: " + this.hentKontrollId();
    }
    @Override
    public HvitResept skrivHvitResept(Legemiddel legemiddel, Pasient pasient, int reit){
        HvitResept resepten = new HvitResept(legemiddel, this, pasient, reit);
        utskrevedeResepter.leggTil(resepten);
        return resepten;
    }
    @Override
    public MillitaerResept skrivMillitaerResept(Legemiddel legemiddel, Pasient pasient, int reit) {
        MillitaerResept resepten = new MillitaerResept(legemiddel, this, pasient, reit);
        utskrevedeResepter.leggTil(resepten);
        return resepten;
    }
    @Override
    public PResept skrivPResept(Legemiddel legemiddel, Pasient pasient) {
        PResept resepten = new PResept(legemiddel, this, pasient);
        utskrevedeResepter.leggTil(resepten);
        return resepten;
    }
    @Override
    public BlaaResept skrivBlaaResept(Legemiddel legemiddel, Pasient pasient, int reit){
        BlaaResept resepten = new BlaaResept(legemiddel, this, pasient, reit);
        utskrevedeResepter.leggTil(resepten);
        return resepten;
    }
    @Override
    public String printTilFil(){
        return navn+","+kontrollId;
    }
}
