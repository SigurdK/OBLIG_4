class Hovedprogram {
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

        //Test av toString av alle objektklassene.
        System.out.println(narkotisk1);
        System.out.println(vanedannende1);
        System.out.println(vanlig1);
        System.out.println(lege);
        System.out.println(spesialist);
        System.out.println(presept);
        System.out.println(blaaresept);
        System.out.println(militaer);
        System.out.println(hvitresept);
    }
}
