public class Main {
    public static void main(String[] args) {
        League league = new League();

        // Takımları oluştur
        Team fenerbahce = TeamFactory.createFenerbahce();
        Team galatasaray = TeamFactory.createGalatasaray();
        Team trabzonspor = TeamFactory.createTrabzonspor();
        Team goztepe = TeamFactory.createGoztepe();
        Team besiktaş = TeamFactory.createBesiktas();
        Team antalyaspor = TeamFactory.createAntalyaspor();
        Team ankaragücü = TeamFactory.createAnkaragucu();
        Team konyaspor = TeamFactory.createKonyaspor();
        Team kayserispor = TeamFactory.createKayserispor();
        Team bursaspor = TeamFactory.createBursaspor();
        Team karagümrük = TeamFactory.createKaragumruk();
        Team rizespor = TeamFactory.createRizespor();
        Team başakşehir = TeamFactory.createBasaksehir();
        Team alanya = TeamFactory.createAlanyaspor();
        Team eyüpspor = TeamFactory.createEyüpspor();
        Team bodrumspor = TeamFactory.createBodrumspor();
        Team hatayspor = TeamFactory.createHatayspor();
        Team kasımpaşa = TeamFactory.createKasimpasa();


        // Takımları lige ekle
        league.addTeam(fenerbahce);
        league.addTeam(galatasaray);
        league.addTeam(trabzonspor);
        league.addTeam(goztepe);
        league.addTeam(besiktaş);
        league.addTeam(antalyaspor);
        league.addTeam(konyaspor);
        league.addTeam(ankaragücü);
        league.addTeam(bursaspor);
        league.addTeam(kayserispor);
        league.addTeam(rizespor);
        league.addTeam(karagümrük);
        league.addTeam(alanya);
        league.addTeam(başakşehir);
        league.addTeam(bodrumspor);
        league.addTeam(eyüpspor);
        league.addTeam(hatayspor);
        league.addTeam(kasımpaşa);

        // Fixtür oluştur ve ligi oyna
        league.generateFixtures();
        league.playLeague();



    }
}
