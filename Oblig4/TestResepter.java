class TestResepter {
    public static void main(String[] args) {
        //opppretter instans av alle objekter.
        Vanlig vanlig1 = new Vanlig("Strepsil",20,1);
        Narkotisk narkotisk1 = new Narkotisk("Valium",599,20,3);
        Vanedannende vanedannende1 = new Vanedannende("Heroin",100,10,25);


        Lege lege = new Lege("Hans Gunnar Ekjold");
        Spesialist spesialist = new Spesialist("Peter Pan",5);

        PResept presept = new PResept(narkotisk1,lege,1);
        BlaaResept blaaresept = new BlaaResept(vanedannende1,lege,2,2);
        MilitaerResept militaer = new MilitaerResept(narkotisk1,spesialist,3,2);
        HvitResept hvitresept = new HvitResept(vanlig1,spesialist,4,10);
        //Tester ulike funksjoner for resepter med å printe ut informasjon.

        System.out.println(presept.prisAaBetale());
        System.out.println(presept.bruk());
        System.out.println(presept.bruk());
        System.out.println(presept.hentReit());
        System.out.println(presept.farge());
        System.out.println(blaaresept.prisAaBetale());
        System.out.println(blaaresept.hentLegemiddel());
        System.out.println(blaaresept.hentPasientId());
        System.out.println(blaaresept.farge());
        System.out.println(presept.hentId());
        System.out.println(blaaresept.hentId());
        System.out.println("NYLINJE\n");
        System.out.println(militaer.hentId());
        System.out.println(militaer.prisAaBetale());

    }
}
