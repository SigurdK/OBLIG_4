abstract class Legemiddel {
    //Har en statisk variabel Id countersom holder orden på antall objekter av legemiddel
    protected String navn;
    protected double pris;
    protected double virkestoff;
    protected int Id;
    private static int IdCounter;

    public Legemiddel(String n, double p, double v){
        navn = n;
        pris = p;
        virkestoff = v;
        Id = IdCounter++; //Øker Id til et nytt object av Legemiddel med 1 for hver gang det opprettes.
    }
    public int hentId(){
        return Id;
    }
    public String hentNavn(){
        return navn;
    }
    public double hentPris(){
        return pris;
    }
    public double hentVirkestoff(){
        return virkestoff;
    }
    public void settNyPris(double nyPris){
        pris = nyPris;
    }
    abstract public String toString();
}
