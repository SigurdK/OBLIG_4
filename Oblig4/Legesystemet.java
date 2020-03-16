import java.io.File;
import java.util.Scanner;

public class Legesystemet {

    Lenkeliste<Pasient> pasientene = new Lenkeliste<>();
    Lenkeliste<Legemiddel> legemiddlene = new Lenkeliste<>();
    Lenkeliste<Lege> legene = new Lenkeliste<>();

    //Sorter legeListen med instanceOf

    public Legesystemet(){
    }

    public void skrivUtPasienter(){
        for(Pasient pasienter : pasientene){
            System.out.println(pasienter);
        }
    }
    public void skrivUtLeger(){
        for(Lege lege : legene){
            System.out.println(lege);
            lege.skrivReseptListe();
        }
    }
    public void skrivUtLegemiddler(){
        for(Legemiddel legemiddel : legemiddlene){
            System.out.println(legemiddel);
        }
    }

    public void leseFraFil(String filnavn) throws Exception{

        Scanner fil = new Scanner(new File(filnavn));
        String sjanger = "";

        while (fil.hasNextLine()) {
            if (fil.hasNextLine()){
               sjanger =  fil.nextLine().split(" ")[1];
            }


            if (sjanger.equals("Pasienter")) {

                while (!fil.hasNext("#")) {
                    String[] linje2 = fil.nextLine().split(",");
                    Pasient pasient = new Pasient(linje2[0], linje2[1]);
                    pasientene.leggTil(pasient);
                }

            }else if (sjanger.equals("Legemidler")) {

                while (!fil.hasNext("#")){
                    String[] linje2 = fil.nextLine().split(",");
                    String navn = linje2[0];
                    int pris = Integer.parseInt(linje2[2]);
                    int virkestoff = Integer.parseInt(linje2[3]);
                    int styrke = Integer.parseInt(linje2[3]);
                    String type = linje2[1];

                    switch (type) {
                        case "narkotisk":
                            Narkotisk narkotisk = new Narkotisk(navn, pris, virkestoff, styrke);
                            legemiddlene.leggTil(narkotisk);
                            break;
                        case "vanedannende":
                            Vanedannende vanedannende = new Vanedannende(navn, pris, virkestoff, styrke);
                            legemiddlene.leggTil(vanedannende);
                            break;
                        case "vanlig":
                            Vanlig vanlig = new Vanlig(navn, pris, virkestoff);
                            legemiddlene.leggTil(vanlig);
                            break;
                    }
                }
            }else if (sjanger.equals("Leger")){

                while (!fil.hasNext("#")){
                    String[] linje2 = fil.nextLine().split(",");
                    String navn = linje2[0];
                    int kontrollID = Integer.parseInt(linje2[1]);
                    if (kontrollID==0){
                        Lege lege = new Lege(navn);
                        legene.leggTil(lege);
                    }else{
                        Spesialist spesialist = new Spesialist(navn,kontrollID);
                        legene.leggTil(spesialist);
                    }
                }
            }else if(sjanger.equals("Resepter")){
                while (fil.hasNextLine()){
                    String[] linje2 = fil.nextLine().split(",");
                    String navn = linje2[1];
                    int pasientID = Integer.parseInt(linje2[2]);
                    String type = linje2[3];

                    int reit=0;
                    if (!(type.equals("p"))){ //opprette en throw ecxeption
                        reit = Integer.parseInt(linje2[4]);
                    }
                    int legemiddelNummer = Integer.parseInt(linje2[0]);

                    Lege legen = null;
                    Pasient pasienten = null;
                    Legemiddel legemiddelet = null;

                    for (Lege lege : legene){
                        if (navn.equals(lege.hentNavn())){
                            legen = lege;
                        }
                    }
                    for (Pasient pasient : pasientene){
                        if (pasientID == pasient.hentID()){
                            pasienten = pasient;
                        }
                    }
                    for (Legemiddel legemiddel : legemiddlene){
                        if (legemiddelNummer == legemiddel.hentId()){
                            legemiddelet = legemiddel;
                        }
                    }
                    switch (type) {
                        case "hvit":
                            assert legen != null;
                            legen.skrivHvitResept(legemiddelet, pasienten, reit);
                            break;
                        case "blaa":
                            assert legen != null;
                            legen.skrivBlaaResept(legemiddelet, pasienten, reit);
                            break;
                        case "millitaer":
                            assert legen != null;
                            legen.skrivMillitaerResept(legemiddelet, pasienten, reit);
                            break;
                        case "p":
                            assert legen != null;
                            legen.skrivPResept(legemiddelet, pasienten);
                            break;
                    }
                }
            }
        }
    }
}
