class TestProgramLenkeliste{
    public static void main(String[] args) {
        Lenkeliste<String> nyListe = new Lenkeliste<>();
        Stabel<String> stabel = new Stabel<>();

        for (int i = 0; i<10;i++){
            nyListe.leggTil("A"+i);
            stabel.leggPaa("B"+i);
        }
        /*System.out.println("Listen har "+ nyListe.stoerrelse()+" elementer.");
        for(int i= 0; i < nyListe.stoerrelse(); i++){
            System.out.println("element "+i+": "+nyListe.fjern());
        }*/
        System.out.println(nyListe.fjern());//Nå er det en kø- endre legg til
        System.out.println(nyListe.fjern());
        System.out.println(nyListe.fjern());
        System.out.println(nyListe.fjern(6));
        System.out.println(nyListe.hent(1));
        System.out.println("STABEL");
        System.out.println(stabel.taAv());//Nå er det en kø- endre legg til
        System.out.println(stabel.taAv());
        System.out.println(stabel.fjern());
        System.out.println(stabel.fjern(6));
        System.out.println(stabel.hent(1));
        //System.out.println(nyListe.antallNoder);
    }
}
