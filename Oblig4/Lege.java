public class Lege implements Comparable<Lege>{

    protected String navn;
    Lenkeliste<Resept> utskrevedeResepter = new Lenkeliste<>();

    public Lege(String n){
        navn = n;
    }

    public int compareTo(Lege annen){
        return navn.compareTo(annen.navn);
    }

    public Lenkeliste<Resept> hentReseptListe(){
        return utskrevedeResepter;
    }

    public void skrivReseptlisteLiten(){
        for (Resept resept : utskrevedeResepter){
            resept.skrivReseptLiten();
        }
    }
    public int narkoTeller(){
        int teller = 0;
        for (Resept resept : utskrevedeResepter){
            if (resept.hentLegemiddel() instanceof Narkotisk){
                teller++;
            }
        }
        return teller;
    }

    public void skrivReseptListe(){
        for (Resept resept : utskrevedeResepter){
            System.out.println(resept);
        }
    }

    public String hentNavn(){
        return navn;
    }
    public String typeLege(){
        return "Lege";
    }
    public HvitResept skrivHvitResept(Legemiddel legemiddel, Pasient pasient, int reit) throws UlovligUtskrift {
        if (legemiddel instanceof Narkotisk) {
            throw new UlovligUtskrift(this, legemiddel);
        } else {
            HvitResept resepten = new HvitResept(legemiddel, this, pasient, reit);
            utskrevedeResepter.leggTil(resepten);
            //pasient.leggTilResept(resepten);
            return resepten;
        }
    }
    public MillitaerResept skrivMillitaerResept(Legemiddel legemiddel, Pasient pasient, int reit) throws UlovligUtskrift{
        if (legemiddel instanceof Narkotisk) {
            throw new UlovligUtskrift(this, legemiddel);
        } else {
            MillitaerResept resepten = new MillitaerResept(legemiddel, this, pasient, reit);
            utskrevedeResepter.leggTil(resepten);
            //pasient.leggTilResept(resepten);
            return resepten;
        }
    }
    public PResept skrivPResept(Legemiddel legemiddel, Pasient pasient) throws UlovligUtskrift{
        if (legemiddel instanceof Narkotisk) {
            throw new UlovligUtskrift(this, legemiddel);
        } else {
            PResept resepten = new PResept(legemiddel, this, pasient);
            utskrevedeResepter.leggTil(resepten);
            //pasient.leggTilResept(resepten);
            return resepten;
        }

    }
    public BlaaResept skrivBlaaResept(Legemiddel legemiddel, Pasient pasient, int reit) throws UlovligUtskrift{
        if (legemiddel instanceof Narkotisk) {
            throw new UlovligUtskrift(this, legemiddel);
        } else {
            BlaaResept resepten = new BlaaResept(legemiddel, this, pasient, reit);
            utskrevedeResepter.leggTil(resepten);
            //pasient.leggTilResept(resepten);
            return resepten;
        }
    }
    public String printTilFil(){
        return navn+","+0;
    }

    public String toString(){
        return "\nLegens navn: "+this.hentNavn();
    }
}
