import java.util.ArrayList;
import java.util.List;

public class TeamFactory {

    public static Team createFenerbahce() {
        Team team = new Team("Fenerbahçe");

        // Kaleciler
        team.addPlayer(new Player("Altay Bayındır", "Kaleci", 15, 14, 13, 18, 0, 0, 0, 0, 0, 0, 19, 18));
        team.addPlayer(new Player("Berke Özer", "Kaleci", 14, 13, 12, 17, 0, 0, 0, 0, 0, 0, 18, 17));
        team.addPlayer(new Player("Osman Özdemir", "Kaleci", 13, 12, 11, 16, 0, 0, 0, 0, 0, 0, 17, 16));

        // Savunma
        team.addPlayer(new Player("Nazım Sangaré", "Savunma", 14, 13, 14, 0, 16, 15, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Serdar Aziz", "Savunma", 16, 15, 14, 0, 17, 18, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Ercan Kızıl", "Savunma", 15, 14, 14, 0, 16, 17, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Ferdi Kadıoğlu", "Savunma", 15, 14, 13, 0, 16, 15, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Bright Osayi-Samuel", "Savunma", 14, 13, 12, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Filip Novak", "Savunma", 15, 14, 13, 0, 16, 15, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Serkan Asan", "Savunma", 14, 13, 12, 0, 15, 14, 0, 0, 0, 0, 0, 0));

        // Orta Saha
        team.addPlayer(new Player("Ozan Tufan", "Orta Saha", 16, 15, 14, 0, 0, 0, 17, 16, 0, 0, 0, 0));
        team.addPlayer(new Player("Mert Hakan Yandaş", "Orta Saha", 15, 14, 13, 0, 0, 0, 18, 17, 0, 0, 0, 0));
        team.addPlayer(new Player("Mesut Özil", "Orta Saha", 16, 15, 14, 0, 0, 0, 19, 18, 0, 0, 0, 0));
        team.addPlayer(new Player("Luis Gustavo", "Orta Saha", 17, 16, 15, 0, 0, 0, 18, 17, 0, 0, 0, 0));
        team.addPlayer(new Player("Ali Kaan Güngör", "Orta Saha", 15, 14, 13, 0, 0, 0, 19, 18, 0, 0, 0, 0));
        team.addPlayer(new Player("Salih Uçan", "Orta Saha", 14, 13, 12, 0, 0, 0, 17, 16, 0, 0, 0, 0));

        // Hücum
        team.addPlayer(new Player("Enner Valencia", "Hücum", 15, 14, 13, 0, 0, 0, 0, 0, 18, 16, 0, 0));
        team.addPlayer(new Player("Mame Thiam", "Hücum", 14, 13, 12, 0, 0, 0, 0, 0, 17, 15, 0, 0));
        team.addPlayer(new Player("Serdar Dursun", "Hücum", 14, 13, 12, 0, 0, 0, 0, 0, 16, 14, 0, 0));
        team.addPlayer(new Player("Joshua King", "Hücum", 15, 14, 13, 0, 0, 0, 0, 0, 18, 17, 0, 0));
        team.addPlayer(new Player("Muhammed Gümüşkaya", "Hücum", 14, 13, 12, 0, 0, 0, 0, 0, 17, 15, 0, 0));

        return team;
    }


    public static Team createGalatasaray() {
        Team team = new Team("Galatasaray");

        // Kaleciler
        team.addPlayer(new Player("Fernando Muslera", "Kaleci", 16, 15, 14, 18, 0, 0, 0, 0, 0, 0, 20, 19));
        team.addPlayer(new Player("Okan Kocuk", "Kaleci", 15, 14, 13, 17, 0, 0, 0, 0, 0, 0, 19, 18));
        team.addPlayer(new Player("İsmail Çipe", "Kaleci", 14, 13, 12, 16, 0, 0, 0, 0, 0, 0, 18, 17));

        // Savunma
        team.addPlayer(new Player("Marcão", "Savunma", 16, 15, 14, 0, 17, 16, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Victor Nelsson", "Savunma", 15, 14, 13, 0, 16, 15, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Sacha Boey", "Savunma", 14, 13, 12, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Kaan Ayhan", "Savunma", 15, 14, 13, 0, 16, 15, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Emre Taşdemir", "Savunma", 14, 13, 12, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Kazımcan Karataş", "Savunma", 14, 13, 12, 0, 15, 14, 0, 0, 0, 0, 0, 0));

        // Orta Saha
        team.addPlayer(new Player("Tanguy Ndombele", "Orta Saha", 16, 15, 14, 0, 0, 0, 18, 17, 0, 0, 0, 0));
        team.addPlayer(new Player("Lucas Torreira", "Orta Saha", 15, 14, 13, 0, 0, 0, 19, 18, 0, 0, 0, 0));
        team.addPlayer(new Player("Sofiane Feghouli", "Orta Saha", 14, 13, 12, 0, 0, 0, 17, 16, 0, 0, 0, 0));
        team.addPlayer(new Player("Kerem Aktürkoğlu", "Orta Saha", 15, 14, 13, 0, 0, 0, 18, 17, 0, 0, 0, 0));
        team.addPlayer(new Player("Yunus Akgün", "Orta Saha", 14, 13, 12, 0, 0, 0, 17, 16, 0, 0, 0, 0));
        team.addPlayer(new Player("Okan Yılmaz", "Orta Saha", 13, 12, 11, 0, 0, 0, 16, 15, 0, 0, 0, 0));

        // Hücum
        team.addPlayer(new Player("Mauro Icardi", "Hücum", 15, 14, 13, 0, 0, 0, 0, 0, 19, 17, 0, 0));
        team.addPlayer(new Player("Kerem Aktürkoğlu", "Hücum", 14, 13, 12, 0, 0, 0, 0, 0, 18, 16, 0, 0));
        team.addPlayer(new Player("Emre Akbaba", "Hücum", 13, 12, 11, 0, 0, 0, 0, 0, 17, 15, 0, 0));
        team.addPlayer(new Player("Bafetimbi Gomis", "Hücum", 16, 15, 14, 0, 0, 0, 0, 0, 19, 18, 0, 0));
        team.addPlayer(new Player("Halil Dervişoğlu", "Hücum", 15, 14, 13, 0, 0, 0, 0, 0, 18, 16, 0, 0));

        return team;
    }


    public static Team createTrabzonspor() {
        Team team = new Team("Trabzonspor");

        // Kaleciler
        team.addPlayer(new Player("Uğurcan Çakır", "Kaleci", 16, 15, 14, 18, 0, 0, 0, 0, 0, 0, 20, 19));
        team.addPlayer(new Player("Erce Kardeşler", "Kaleci", 15, 14, 13, 17, 0, 0, 0, 0, 0, 0, 19, 18));
        team.addPlayer(new Player("Cihan Aydın", "Kaleci", 14, 13, 12, 16, 0, 0, 0, 0, 0, 0, 18, 17));

        // Savunma
        team.addPlayer(new Player("Vitor Hugo", "Savunma", 16, 15, 14, 0, 17, 16, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Hüseyin Türkmen", "Savunma", 15, 14, 13, 0, 16, 15, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Edgar Ie", "Savunma", 14, 13, 12, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Marek Hamsik", "Savunma", 14, 13, 12, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Berkay Özcan", "Savunma", 14, 13, 12, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Serkan Asan", "Savunma", 14, 13, 12, 0, 15, 14, 0, 0, 0, 0, 0, 0));

        // Orta Saha
        team.addPlayer(new Player("Manolis Siopis", "Orta Saha", 16, 15, 14, 0, 0, 0, 18, 17, 0, 0, 0, 0));
        team.addPlayer(new Player("Abdülkadir Ömür", "Orta Saha", 15, 14, 13, 0, 0, 0, 19, 18, 0, 0, 0, 0));
        team.addPlayer(new Player("Dorukhan Toköz", "Orta Saha", 14, 13, 12, 0, 0, 0, 17, 16, 0, 0, 0, 0));
        team.addPlayer(new Player("Eduardo", "Orta Saha", 14, 13, 12, 0, 0, 0, 17, 16, 0, 0, 0, 0));
        team.addPlayer(new Player("Djaniny Tavares", "Orta Saha", 14, 13, 12, 0, 0, 0, 17, 16, 0, 0, 0, 0));
        team.addPlayer(new Player("Kamil Jablonski", "Orta Saha", 13, 12, 11, 0, 0, 0, 16, 15, 0, 0, 0, 0));

        // Hücum
        team.addPlayer(new Player("Anastasios Bakasetas", "Hücum", 15, 14, 13, 0, 0, 0, 0, 0, 19, 17, 0, 0));
        team.addPlayer(new Player("Trezeguet", "Hücum", 14, 13, 12, 0, 0, 0, 0, 0, 18, 16, 0, 0));
        team.addPlayer(new Player("Gervinho", "Hücum", 14, 13, 12, 0, 0, 0, 0, 0, 17, 15, 0, 0));
        team.addPlayer(new Player("Enner Valencia", "Hücum", 15, 14, 13, 0, 0, 0, 0, 0, 18, 16, 0, 0));
        team.addPlayer(new Player("Kamil Jablonski", "Hücum", 15, 14, 13, 0, 0, 0, 0, 0, 17, 15, 0, 0));

        return team;
    }


    public static Team createGoztepe() {
        Team team = new Team("Göztepe");

        // Kaleciler
        team.addPlayer(new Player("İrfan Can Eğribayat", "Kaleci", 15, 14, 13, 17, 0, 0, 0, 0, 0, 0, 19, 18));
        team.addPlayer(new Player("Serkan Kırıntılı", "Kaleci", 14, 13, 12, 16, 0, 0, 0, 0, 0, 0, 18, 17));
        team.addPlayer(new Player("Mert Günok", "Kaleci", 13, 12, 11, 15, 0, 0, 0, 0, 0, 0, 17, 16));

        // Savunma
        team.addPlayer(new Player("David Pereira da Costa", "Savunma", 15, 14, 13, 0, 16, 15, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Rıdvan Yılmaz", "Savunma", 14, 13, 12, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Jean-Armel Kana-Biyik", "Savunma", 14, 13, 12, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Gökhan Karadeniz", "Savunma", 14, 13, 12, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Stiven Mendoza", "Savunma", 14, 13, 12, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Kamil Korta", "Savunma", 13, 12, 11, 0, 14, 13, 0, 0, 0, 0, 0, 0));

        // Orta Saha
        team.addPlayer(new Player("Paulo Oliveira", "Orta Saha", 15, 14, 13, 0, 0, 0, 18, 17, 0, 0, 0, 0));
        team.addPlayer(new Player("Demba Ba", "Orta Saha", 14, 13, 12, 0, 0, 0, 17, 16, 0, 0, 0, 0));
        team.addPlayer(new Player("Gustavo Colman", "Orta Saha", 14, 13, 12, 0, 0, 0, 16, 15, 0, 0, 0, 0));
        team.addPlayer(new Player("Emre Çolak", "Orta Saha", 14, 13, 12, 0, 0, 0, 16, 15, 0, 0, 0, 0));
        team.addPlayer(new Player("Berkan Kutlu", "Orta Saha", 13, 12, 11, 0, 0, 0, 15, 14, 0, 0, 0, 0));
        team.addPlayer(new Player("Gustavo Blanco", "Orta Saha", 13, 12, 11, 0, 0, 0, 15, 14, 0, 0, 0, 0));

        // Hücum
        team.addPlayer(new Player("Lamine Diack", "Hücum", 15, 14, 13, 0, 0, 0, 0, 0, 19, 17, 0, 0));
        team.addPlayer(new Player("Saba Lobjanidze", "Hücum", 14, 13, 12, 0, 0, 0, 0, 0, 18, 16, 0, 0));
        team.addPlayer(new Player("Milan Gajić", "Hücum", 13, 12, 11, 0, 0, 0, 0, 0, 17, 15, 0, 0));
        team.addPlayer(new Player("Burak Yılmaz", "Hücum", 15, 14, 13, 0, 0, 0, 0, 0, 18, 16, 0, 0));
        team.addPlayer(new Player("Yasin Öztekin", "Hücum", 14, 13, 12, 0, 0, 0, 0, 0, 17, 15, 0, 0));

        return team;
    }


    public static Team createBesiktas() {
        Team team = new Team("Beşiktaş");

        // Kaleciler
        team.addPlayer(new Player("Mert Günok", "Kaleci", 15, 14, 13, 17, 0, 0, 0, 0, 0, 0, 19, 18));
        team.addPlayer(new Player("Ersin Destanoğlu", "Kaleci", 14, 13, 12, 16, 0, 0, 0, 0, 0, 0, 18, 17));
        team.addPlayer(new Player("Kadir Yılmaz", "Kaleci", 13, 12, 11, 15, 0, 0, 0, 0, 0, 0, 17, 16));

        // Savunma
        team.addPlayer(new Player("Welinton", "Savunma", 16, 15, 14, 0, 17, 16, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Romain Saïss", "Savunma", 15, 14, 13, 0, 16, 15, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Atiba Hutchinson", "Savunma", 14, 13, 12, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Kaan Ayhan", "Savunma", 14, 13, 12, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Victor Ruiz", "Savunma", 14, 13, 12, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Mert Günok", "Savunma", 13, 12, 11, 0, 14, 13, 0, 0, 0, 0, 0, 0));

        // Orta Saha
        team.addPlayer(new Player("Joseph Paintsil", "Orta Saha", 16, 15, 14, 0, 0, 0, 18, 17, 0, 0, 0, 0));
        team.addPlayer(new Player("Alex Teixeira", "Orta Saha", 15, 14, 13, 0, 0, 0, 19, 18, 0, 0, 0, 0));
        team.addPlayer(new Player("Gökhan Töre", "Orta Saha", 14, 13, 12, 0, 0, 0, 17, 16, 0, 0, 0, 0));
        team.addPlayer(new Player("Ljajić", "Orta Saha", 14, 13, 12, 0, 0, 0, 16, 15, 0, 0, 0, 0));
        team.addPlayer(new Player("Salih Uçan", "Orta Saha", 13, 12, 11, 0, 0, 0, 15, 14, 0, 0, 0, 0));
        team.addPlayer(new Player("Aboubakar", "Orta Saha", 13, 12, 11, 0, 0, 0, 15, 14, 0, 0, 0, 0));

        // Hücum
        team.addPlayer(new Player("Cyle Larin", "Hücum", 15, 14, 13, 0, 0, 0, 0, 0, 19, 17, 0, 0));
        team.addPlayer(new Player("Vincent Aboubakar", "Hücum", 14, 13, 12, 0, 0, 0, 0, 0, 18, 16, 0, 0));
        team.addPlayer(new Player("Mohammed Kudus", "Hücum", 13, 12, 11, 0, 0, 0, 0, 0, 17, 15, 0, 0));
        team.addPlayer(new Player("Kenan Karaman", "Hücum", 15, 14, 13, 0, 0, 0, 0, 0, 18, 16, 0, 0));
        team.addPlayer(new Player("Larin", "Hücum", 14, 13, 12, 0, 0, 0, 0, 0, 17, 15, 0, 0));

        return team;
    }

    public static Team createAntalyaspor() {
        Team team = new Team("Antalyaspor");

        // Kaleciler
        team.addPlayer(new Player("Boffin", "Kaleci", 15, 14, 13, 17, 0, 0, 0, 0, 0, 0, 19, 18));
        team.addPlayer(new Player("Ferhat Kaplan", "Kaleci", 14, 13, 12, 16, 0, 0, 0, 0, 0, 0, 18, 17));
        team.addPlayer(new Player("Samed Yılmaz", "Kaleci", 13, 12, 11, 15, 0, 0, 0, 0, 0, 0, 17, 16));

        // Savunma
        team.addPlayer(new Player("Sami Sözdemir", "Savunma", 15, 14, 13, 0, 17, 16, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Serkan Asan", "Savunma", 14, 13, 12, 0, 16, 15, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Uğur Çiftçi", "Savunma", 14, 13, 12, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Veysel Sarı", "Savunma", 13, 12, 11, 0, 14, 13, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Rıdvan Yılmaz", "Savunma", 15, 14, 13, 0, 16, 15, 0, 0, 0, 0, 0, 0));

        // Orta Saha
        team.addPlayer(new Player("Fredy", "Orta Saha", 16, 15, 14, 0, 0, 0, 18, 17, 0, 0, 0, 0));
        team.addPlayer(new Player("Amilton", "Orta Saha", 15, 14, 13, 0, 0, 0, 19, 18, 0, 0, 0, 0));
        team.addPlayer(new Player("Hüseyin Türkmen", "Orta Saha", 14, 13, 12, 0, 0, 0, 17, 16, 0, 0, 0, 0));
        team.addPlayer(new Player("Gökdeniz Bayrakdar", "Orta Saha", 14, 13, 12, 0, 0, 0, 16, 15, 0, 0, 0, 0));
        team.addPlayer(new Player("Yusuf Erdoğan", "Orta Saha", 13, 12, 11, 0, 0, 0, 15, 14, 0, 0, 0, 0));
        team.addPlayer(new Player("Gökhan Ünal", "Orta Saha", 13, 12, 11, 0, 0, 0, 15, 14, 0, 0, 0, 0));

        // Hücum
        team.addPlayer(new Player("Haji Wright", "Hücum", 15, 14, 13, 0, 0, 0, 0, 0, 19, 17, 0, 0));
        team.addPlayer(new Player("Elvis Manu", "Hücum", 14, 13, 12, 0, 0, 0, 0, 0, 18, 16, 0, 0));
        team.addPlayer(new Player("Joaquín Correa", "Hücum", 13, 12, 11, 0, 0, 0, 0, 0, 17, 15, 0, 0));
        team.addPlayer(new Player("Gökdeniz Bayrakdar", "Hücum", 15, 14, 13, 0, 0, 0, 0, 0, 18, 16, 0, 0));
        team.addPlayer(new Player("Gökhan Ünal", "Hücum", 14, 13, 12, 0, 0, 0, 0, 0, 17, 15, 0, 0));

        return team;
    }

    public static Team createAnkaragucu() {
        Team team = new Team("Ankaragücü");

        // Kaleciler
        team.addPlayer(new Player("Korcan Çelikay", "Kaleci", 14, 15, 13, 18, 0, 0, 0, 0, 0, 0, 18, 17));
        team.addPlayer(new Player("Ricardo Friedrich", "Kaleci", 13, 14, 12, 17, 0, 0, 0, 0, 0, 0, 17, 16));
        team.addPlayer(new Player("Mert Topuz", "Kaleci", 12, 13, 11, 16, 0, 0, 0, 0, 0, 0, 16, 15));

        // Defanslar
        team.addPlayer(new Player("Pinto", "Savunma", 13, 14, 12, 0, 16, 17, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Atakan Çankaya", "Savunma", 15, 14, 13, 0, 17, 16, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Stelios Kitsiou", "Savunma", 14, 13, 12, 0, 15, 16, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Michal Pazdan", "Savunma", 14, 15, 13, 0, 17, 16, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Atila Turan", "Savunma", 13, 12, 12, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Tiago Pinto", "Savunma", 14, 13, 11, 0, 16, 15, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Zvonimir Sarlija", "Savunma", 13, 14, 12, 0, 16, 15, 0, 0, 0, 0, 0, 0));

        // Orta Sahalar
        team.addPlayer(new Player("Endri Çekiçi", "Orta Saha", 16, 14, 13, 0, 0, 0, 17, 16, 0, 0, 0, 0));
        team.addPlayer(new Player("İbrahim Akdağ", "Orta Saha", 14, 15, 13, 0, 0, 0, 16, 15, 0, 0, 0, 0));
        team.addPlayer(new Player("Torgeir Børven", "Orta Saha", 15, 13, 12, 0, 0, 0, 18, 16, 0, 0, 0, 0));
        team.addPlayer(new Player("Saba Lobjanidze", "Orta Saha", 14, 13, 11, 0, 0, 0, 17, 15, 0, 0, 0, 0));
        team.addPlayer(new Player("Sedat Ağçay", "Orta Saha", 13, 14, 12, 0, 0, 0, 16, 14, 0, 0, 0, 0));
        team.addPlayer(new Player("Assane Dioussé", "Orta Saha", 14, 13, 11, 0, 0, 0, 16, 15, 0, 0, 0, 0));
        team.addPlayer(new Player("Alper Potuk", "Orta Saha", 14, 12, 13, 0, 0, 0, 17, 15, 0, 0, 0, 0));
        team.addPlayer(new Player("Sabit Bilgiç", "Orta Saha", 12, 13, 11, 0, 0, 0, 16, 14, 0, 0, 0, 0));
        team.addPlayer(new Player("Daniel Łukasik", "Orta Saha", 14, 13, 12, 0, 0, 0, 16, 15, 0, 0, 0, 0));

        // Hücumcular
        team.addPlayer(new Player("Joseph Paintsil", "Hücum", 16, 14, 13, 0, 0, 0, 0, 0, 17, 15, 0, 0));
        team.addPlayer(new Player("Emre Güral", "Hücum", 14, 13, 12, 0, 0, 0, 0, 0, 16, 14, 0, 0));
        team.addPlayer(new Player("Aliou Badji", "Hücum", 15, 14, 13, 0, 0, 0, 0, 0, 17, 16, 0, 0));
        team.addPlayer(new Player("Saba Lobjanidze", "Hücum", 14, 13, 12, 0, 0, 0, 0, 0, 16, 14, 0, 0));
        team.addPlayer(new Player("Luka Adzic", "Hücum", 13, 12, 11, 0, 0, 0, 0, 0, 15, 13, 0, 0));
        team.addPlayer(new Player("Zvonimir Kozulj", "Hücum", 14, 13, 12, 0, 0, 0, 0, 0, 16, 14, 0, 0));

        return team;
    }

    public static Team createKonyaspor() {
        Team team = new Team("Konyaspor");

        // Kaleciler
        team.addPlayer(new Player("Ibrahim Sehic", "Kaleci", 16, 15, 14, 19, 0, 0, 0, 0, 0, 0, 18, 17));
        team.addPlayer(new Player("Ertuğrul Taşkıran", "Kaleci", 15, 14, 13, 18, 0, 0, 0, 0, 0, 0, 17, 16));
        team.addPlayer(new Player("Ahmet Güven", "Kaleci", 14, 13, 12, 17, 0, 0, 0, 0, 0, 0, 16, 15));

        // Savunma oyuncuları
        team.addPlayer(new Player("Nejc Skubic", "Savunma", 14, 13, 12, 0, 17, 16, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Abdülkerim Bardakçı", "Savunma", 15, 14, 13, 0, 18, 17, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Ahmet Çalık", "Savunma", 14, 13, 12, 0, 16, 15, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Guilherme", "Savunma", 14, 13, 12, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Konrad Michalak", "Savunma", 13, 12, 11, 0, 14, 13, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Anil Sahin", "Savunma", 13, 12, 11, 0, 14, 13, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Ali Turan", "Savunma", 14, 13, 12, 0, 16, 15, 0, 0, 0, 0, 0, 0));

        // Orta saha oyuncuları
        team.addPlayer(new Player("Amir Hadžiahmetović", "Orta Saha", 16, 15, 14, 0, 0, 0, 18, 17, 0, 0, 0, 0));
        team.addPlayer(new Player("Levan Shengelia", "Orta Saha", 14, 13, 12, 0, 0, 0, 17, 16, 0, 0, 0, 0));
        team.addPlayer(new Player("Sokol Cikalleshi", "Orta Saha", 14, 13, 12, 0, 0, 0, 16, 15, 0, 0, 0, 0));
        team.addPlayer(new Player("Bytyqi Zymer", "Orta Saha", 14, 13, 12, 0, 0, 0, 18, 17, 0, 0, 0, 0));
        team.addPlayer(new Player("Endri Çekiçi", "Orta Saha", 15, 14, 13, 0, 0, 0, 18, 17, 0, 0, 0, 0));
        team.addPlayer(new Player("Ismael Diomande", "Orta Saha", 15, 14, 13, 0, 0, 0, 17, 16, 0, 0, 0, 0));
        team.addPlayer(new Player("Uğur Demirok", "Orta Saha", 14, 13, 12, 0, 0, 0, 17, 16, 0, 0, 0, 0));
        team.addPlayer(new Player("Volkan Fındıklı", "Orta Saha", 14, 13, 12, 0, 0, 0, 16, 15, 0, 0, 0, 0));

        // Hücum oyuncuları
        team.addPlayer(new Player("Artem Kravets", "Hücum", 15, 14, 13, 0, 0, 0, 0, 0, 18, 17, 0, 0));
        team.addPlayer(new Player("Jevtovic Marko", "Hücum", 14, 13, 12, 0, 0, 0, 0, 0, 16, 15, 0, 0));
        team.addPlayer(new Player("Omer Ali Sahiner", "Hücum", 14, 13, 12, 0, 0, 0, 0, 0, 17, 16, 0, 0));
        team.addPlayer(new Player("Ahmet Karademir", "Hücum", 13, 12, 11, 0, 0, 0, 0, 0, 16, 15, 0, 0));
        team.addPlayer(new Player("Eren Albayrak", "Hücum", 13, 12, 11, 0, 0, 0, 0, 0, 15, 14, 0, 0));
        team.addPlayer(new Player("Samuel Eduok", "Hücum", 14, 13, 12, 0, 0, 0, 0, 0, 17, 16, 0, 0));
        team.addPlayer(new Player("Zlatko Tripic", "Hücum", 13, 12, 11, 0, 0, 0, 0, 0, 15, 14, 0, 0));

        return team;
    }

    public static Team createKayserispor() {
        Team team = new Team("Kayserispor");

        // Kaleciler
        team.addPlayer(new Player("Lung", "Kaleci", 15, 14, 13, 18, 0, 0, 0, 0, 0, 0, 19, 18));
        team.addPlayer(new Player("Doğan Alemdar", "Kaleci", 14, 13, 12, 17, 0, 0, 0, 0, 0, 0, 18, 17));
        team.addPlayer(new Player("İsmail Çipe", "Kaleci", 13, 12, 11, 16, 0, 0, 0, 0, 0, 0, 17, 16));

        // Defanslar
        team.addPlayer(new Player("Miguel Lopes", "Savunma", 14, 15, 13, 0, 16, 17, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Cristian Sapunaru", "Savunma", 15, 14, 13, 0, 17, 16, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Manuel Fernandes", "Savunma", 14, 13, 12, 0, 15, 16, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Mert Kula", "Savunma", 14, 13, 12, 0, 16, 15, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Yasir Subaşı", "Savunma", 13, 12, 11, 0, 14, 13, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Ömer Bayram", "Savunma", 13, 14, 12, 0, 16, 15, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Attamah", "Savunma", 14, 13, 12, 0, 15, 14, 0, 0, 0, 0, 0, 0));

        // Orta Sahalar
        team.addPlayer(new Player("Bernard Mensah", "Orta Saha", 15, 14, 13, 0, 0, 0, 17, 16, 0, 0, 0, 0));
        team.addPlayer(new Player("Hasan Hüseyin Acar", "Orta Saha", 14, 13, 12, 0, 0, 0, 16, 15, 0, 0, 0, 0));
        team.addPlayer(new Player("Pedro Henrique", "Orta Saha", 16, 14, 13, 0, 0, 0, 18, 17, 0, 0, 0, 0));
        team.addPlayer(new Player("Gustavo Campanharo", "Orta Saha", 14, 13, 12, 0, 0, 0, 17, 15, 0, 0, 0, 0));
        team.addPlayer(new Player("Harrison Manzala", "Orta Saha", 13, 12, 11, 0, 0, 0, 16, 14, 0, 0, 0, 0));
        team.addPlayer(new Player("Zoran Kvrzic", "Orta Saha", 14, 13, 12, 0, 0, 0, 17, 16, 0, 0, 0, 0));
        team.addPlayer(new Player("İlhan Parlak", "Orta Saha", 13, 12, 11, 0, 0, 0, 16, 14, 0, 0, 0, 0));
        team.addPlayer(new Player("Nurettin Korkmaz", "Orta Saha", 12, 11, 10, 0, 0, 0, 15, 13, 0, 0, 0, 0));
        team.addPlayer(new Player("Emre Demir", "Orta Saha", 14, 13, 12, 0, 0, 0, 16, 15, 0, 0, 0, 0));

        // Hücumcular
        team.addPlayer(new Player("Wilfried Kanga", "Hücum", 16, 15, 14, 0, 0, 0, 0, 0, 17, 16, 0, 0));
        team.addPlayer(new Player("Deniz Türüç", "Hücum", 15, 14, 13, 0, 0, 0, 0, 0, 16, 15, 0, 0));
        team.addPlayer(new Player("Muğdat Çelik", "Hücum", 14, 13, 12, 0, 0, 0, 0, 0, 15, 14, 0, 0));
        team.addPlayer(new Player("Umut Bulut", "Hücum", 14, 13, 12, 0, 0, 0, 0, 0, 16, 14, 0, 0));
        team.addPlayer(new Player("Mame Thiam", "Hücum", 13, 12, 11, 0, 0, 0, 0, 0, 15, 13, 0, 0));
        team.addPlayer(new Player("Joseph Attamah", "Hücum", 14, 13, 12, 0, 0, 0, 0, 0, 16, 15, 0, 0));

        return team;
    }
    public static Team createBursaspor() {
        Team team = new Team("Bursaspor");

        // Kaleciler
        team.addPlayer(new Player("Ataberk Dadakdeniz", "Kaleci", 15, 14, 13, 17, 0, 0, 0, 0, 0, 0, 18, 16));
        team.addPlayer(new Player("Deniz Aydın", "Kaleci", 14, 13, 12, 16, 0, 0, 0, 0, 0, 0, 17, 15));
        team.addPlayer(new Player("Canberk Yurdakul", "Kaleci", 13, 12, 11, 15, 0, 0, 0, 0, 0, 0, 16, 14));

        // Savunma oyuncuları
        team.addPlayer(new Player("Onur Atasayar", "Savunma", 14, 13, 12, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Burak Altıparmak", "Savunma", 15, 14, 13, 0, 16, 15, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Cüneyt Köz", "Savunma", 14, 13, 12, 0, 14, 13, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Furkan Emre Ünver", "Savunma", 13, 12, 11, 0, 14, 13, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Aykut Akgün", "Savunma", 13, 12, 11, 0, 13, 12, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Rüştü Hanlı", "Savunma", 14, 13, 12, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Eren Güler", "Savunma", 14, 13, 12, 0, 16, 15, 0, 0, 0, 0, 0, 0));

        // Orta saha oyuncuları
        team.addPlayer(new Player("İsmail Çokçalış", "Orta Saha", 15, 14, 13, 0, 0, 0, 17, 16, 0, 0, 0, 0));
        team.addPlayer(new Player("Taha Altıkardeş", "Orta Saha", 14, 13, 12, 0, 0, 0, 16, 15, 0, 0, 0, 0));
        team.addPlayer(new Player("Eren Tozlu", "Orta Saha", 13, 12, 11, 0, 0, 0, 15, 14, 0, 0, 0, 0));
        team.addPlayer(new Player("Emirhan Aydoğan", "Orta Saha", 15, 14, 13, 0, 0, 0, 18, 17, 0, 0, 0, 0));
        team.addPlayer(new Player("Ramazan Keskin", "Orta Saha", 14, 13, 12, 0, 0, 0, 16, 15, 0, 0, 0, 0));
        team.addPlayer(new Player("Kerem Şen", "Orta Saha", 14, 13, 12, 0, 0, 0, 17, 16, 0, 0, 0, 0));
        team.addPlayer(new Player("Tuğbey Akgün", "Orta Saha", 13, 12, 11, 0, 0, 0, 15, 14, 0, 0, 0, 0));
        team.addPlayer(new Player("Özer Hurmacı", "Orta Saha", 15, 14, 13, 0, 0, 0, 18, 17, 0, 0, 0, 0));

        // Hücum oyuncuları
        team.addPlayer(new Player("Ali Akman", "Hücum", 16, 15, 14, 0, 0, 0, 0, 0, 18, 17, 0, 0));
        team.addPlayer(new Player("Burak Kapacak", "Hücum", 15, 14, 13, 0, 0, 0, 0, 0, 17, 16, 0, 0));
        team.addPlayer(new Player("Berkay Aydınlık", "Hücum", 14, 13, 12, 0, 0, 0, 0, 0, 16, 15, 0, 0));
        team.addPlayer(new Player("Recep Aydın", "Hücum", 13, 12, 11, 0, 0, 0, 0, 0, 15, 14, 0, 0));
        team.addPlayer(new Player("Hasan Ayaroğlu", "Hücum", 14, 13, 12, 0, 0, 0, 0, 0, 16, 15, 0, 0));
        team.addPlayer(new Player("Mert Yılmaz", "Hücum", 13, 12, 11, 0, 0, 0, 0, 0, 15, 14, 0, 0));

        return team;
    }

    public static Team createKaragumruk() {
        Team team = new Team("Karagümrük");
        team.addPlayer(new Player("Aykut Özer", "Kaleci", 12, 11, 10, 14, 0, 0, 0, 0, 0, 0, 15, 14));
        team.addPlayer(new Player("Jure Balkovec", "Savunma", 12, 11, 12, 0, 14, 13, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Ervin Zukanović", "Savunma", 13, 12, 11, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Lucas Biglia", "Orta Saha", 13, 12, 11, 0, 0, 0, 14, 13, 0, 0, 0, 0));
        team.addPlayer(new Player("Efe Tatlı", "Orta Saha", 11, 10, 9, 0, 0, 0, 13, 12, 0, 0, 0, 0));
        team.addPlayer(new Player("Yannis Salibur", "Hücum", 12, 11, 10, 0, 0, 0, 0, 0, 13, 12, 0, 0));
        team.addPlayer(new Player("Bertolacci", "Orta Saha", 13, 12, 11, 0, 0, 0, 14, 13, 0, 0, 0, 0));
        team.addPlayer(new Player("Erhun Oztumer", "Orta Saha", 11, 10, 9, 0, 0, 0, 13, 12, 0, 0, 0, 0));
        team.addPlayer(new Player("Alassane Ndao", "Hücum", 12, 11, 10, 0, 0, 0, 0, 0, 13, 12, 0, 0));
        team.addPlayer(new Player("Mame Thiam", "Hücum", 12, 11, 10, 0, 0, 0, 0, 0, 14, 13, 0, 0));
        team.addPlayer(new Player("Jimmy Durmaz", "Orta Saha", 11, 10, 9, 0, 0, 0, 13, 12, 0, 0, 0, 0));
        team.addPlayer(new Player("Ahmed Musa", "Hücum", 12, 11, 10, 0, 0, 0, 0, 0, 14, 13, 0, 0));
        team.addPlayer(new Player("Emre Colak", "Orta Saha", 11, 10, 9, 0, 0, 0, 13, 12, 0, 0, 0, 0));
        team.addPlayer(new Player("Mevlüt Erdinç", "Hücum", 11, 10, 9, 0, 0, 0, 0, 0, 13, 12, 0, 0));
        team.addPlayer(new Player("Adem Ljajic", "Orta Saha", 12, 11, 10, 0, 0, 0, 14, 13, 0, 0, 0, 0));
        team.addPlayer(new Player("Kerim Frei", "Orta Saha", 10, 9, 8, 0, 0, 0, 12, 11, 0, 0, 0, 0));
        team.addPlayer(new Player("Alper Potuk", "Orta Saha", 11, 10, 9, 0, 0, 0, 13, 12, 0, 0, 0, 0));
        team.addPlayer(new Player("Burak Bekaroğlu", "Savunma", 11, 10, 9, 0, 13, 12, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Vegard Forren", "Savunma", 12, 11, 10, 0, 14, 13, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Fatih Karagümrük", "Orta Saha", 11, 10, 9, 0, 0, 0, 13, 12, 0, 0, 0, 0));
        team.addPlayer(new Player("Enzo Roco", "Savunma", 12, 11, 10, 0, 14, 13, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Muhammed Enes Durmus", "Orta Saha", 10, 9, 8, 0, 0, 0, 12, 11, 0, 0, 0, 0));
        team.addPlayer(new Player("Karamoko Cissé", "Hücum", 12, 11, 10, 0, 0, 0, 0, 0, 14, 13, 0, 0));
        team.addPlayer(new Player("Ramazan Civelek", "Savunma", 11, 10, 9, 0, 13, 12, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Efe Tatlı", "Orta Saha", 10, 9, 8, 0, 0, 0, 12, 11, 0, 0, 0, 0));
        team.addPlayer(new Player("Samed Karakoç", "Savunma", 11, 10, 9, 0, 13, 12, 0, 0, 0, 0, 0, 0));

        return team;
    }

    public static Team createRizespor() {
        Team team = new Team("Rizespor");
        team.addPlayer(new Player("Gökhan Akkan", "Kaleci", 12, 11, 10, 15, 0, 0, 0, 0, 0, 0, 17, 15));
        team.addPlayer(new Player("Fernando Boldrin", "Savunma", 13, 12, 12, 0, 14, 13, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Dario Melnjak", "Savunma", 13, 12, 11, 0, 14, 13, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Yassine Meriah", "Savunma", 14, 13, 12, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Fabricio Baiano", "Orta Saha", 12, 11, 10, 0, 0, 0, 14, 13, 0, 0, 0, 0));
        team.addPlayer(new Player("Konrad Michalak", "Orta Saha", 13, 12, 11, 0, 0, 0, 15, 14, 0, 0, 0, 0));
        team.addPlayer(new Player("Loïc Rémy", "Orta Saha", 14, 13, 12, 0, 0, 0, 16, 15, 0, 0, 0, 0));
        team.addPlayer(new Player("Damjan Djokovic", "Orta Saha", 12, 11, 10, 0, 0, 0, 14, 13, 0, 0, 0, 0));
        team.addPlayer(new Player("Milan Škoda", "Hücum", 13, 12, 11, 0, 0, 0, 0, 0, 16, 14, 0, 0));
        team.addPlayer(new Player("Aminu Umar", "Hücum", 12, 11, 10, 0, 0, 0, 0, 0, 15, 13, 0, 0));
        // Additional players to reach 25:
        team.addPlayer(new Player("Mithat Pala", "Orta Saha", 11, 10, 9, 0, 0, 0, 13, 12, 0, 0, 0, 0));
        team.addPlayer(new Player("Ali Adnan", "Savunma", 12, 11, 10, 0, 13, 12, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Koray Altınay", "Savunma", 13, 12, 11, 0, 14, 13, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Selim Ay", "Savunma", 14, 13, 12, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Alper Potuk", "Orta Saha", 12, 11, 10, 0, 0, 0, 14, 13, 0, 0, 0, 0));
        team.addPlayer(new Player("Deniz Kadah", "Hücum", 13, 12, 11, 0, 0, 0, 0, 0, 15, 13, 0, 0));
        team.addPlayer(new Player("Godfred Donsah", "Orta Saha", 12, 11, 10, 0, 0, 0, 14, 13, 0, 0, 0, 0));
        team.addPlayer(new Player("Yan Sasse", "Orta Saha", 12, 11, 10, 0, 0, 0, 13, 12, 0, 0, 0, 0));
        team.addPlayer(new Player("Musa Çağıran", "Orta Saha", 12, 11, 10, 0, 0, 0, 14, 13, 0, 0, 0, 0));
        team.addPlayer(new Player("Samudio", "Hücum", 13, 12, 11, 0, 0, 0, 0, 0, 15, 13, 0, 0));
        team.addPlayer(new Player("Ogün Bayrak", "Orta Saha", 11, 10, 9, 0, 0, 0, 13, 12, 0, 0, 0, 0));
        team.addPlayer(new Player("Kemal Rüzgar", "Hücum", 12, 11, 10, 0, 0, 0, 0, 0, 14, 12, 0, 0));
        team.addPlayer(new Player("Emirhan Topçu", "Savunma", 12, 11, 10, 0, 13, 12, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Bahadır Öztürk", "Savunma", 13, 12, 11, 0, 14, 13, 0, 0, 0, 0, 0, 0));

        return team;
    }

    public static Team createAlanyaspor() {
        Team team = new Team("Alanyaspor");
        team.addPlayer(new Player("Marafona", "Kaleci", 14, 13, 12, 17, 0, 0, 0, 0, 0, 0, 18, 17));
        team.addPlayer(new Player("Juanfran", "Savunma", 13, 12, 11, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Steven Caulker", "Savunma", 14, 13, 12, 0, 16, 15, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Fabrício Baiano", "Orta Saha", 14, 13, 12, 0, 0, 0, 16, 15, 0, 0, 0, 0));
        team.addPlayer(new Player("Efecan Karaca", "Orta Saha", 13, 12, 11, 0, 0, 0, 15, 14, 0, 0, 0, 0));
        team.addPlayer(new Player("Davidson", "Hücum", 14, 13, 12, 0, 0, 0, 0, 0, 16, 15, 0, 0));
        team.addPlayer(new Player("Salih Uçan", "Orta Saha", 14, 13, 12, 0, 0, 0, 16, 15, 0, 0, 0, 0));
        team.addPlayer(new Player("Anastasios Bakasetas", "Orta Saha", 15, 14, 13, 0, 0, 0, 17, 16, 0, 0, 0, 0));
        team.addPlayer(new Player("Khouma Babacar", "Hücum", 14, 13, 12, 0, 0, 0, 0, 0, 15, 14, 0, 0));
        team.addPlayer(new Player("Adam Bareiro", "Hücum", 13, 12, 11, 0, 0, 0, 0, 0, 14, 13, 0, 0));
        team.addPlayer(new Player("Manolis Siopis", "Orta Saha", 12, 11, 10, 0, 0, 0, 14, 13, 0, 0, 0, 0));
        team.addPlayer(new Player("François Moubandje", "Savunma", 12, 11, 10, 0, 14, 13, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Georgios Tzavellas", "Savunma", 13, 12, 11, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Berkan Kutlu", "Orta Saha", 13, 12, 11, 0, 0, 0, 15, 14, 0, 0, 0, 0));
        team.addPlayer(new Player("Daniel Candeias", "Orta Saha", 12, 11, 10, 0, 0, 0, 14, 13, 0, 0, 0, 0));
        team.addPlayer(new Player("Fatih Aksoy", "Savunma", 12, 11, 10, 0, 14, 13, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Umut Güneş", "Orta Saha", 11, 10, 9, 0, 0, 0, 13, 12, 0, 0, 0, 0));
        team.addPlayer(new Player("Onur Bulut", "Savunma", 11, 10, 9, 0, 13, 12, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Kaan Kanak", "Savunma", 12, 11, 10, 0, 14, 13, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Efkan Bekiroglu", "Orta Saha", 11, 10, 9, 0, 0, 0, 13, 12, 0, 0, 0, 0));
        team.addPlayer(new Player("Ceyhun Gülselam", "Orta Saha", 10, 9, 8, 0, 0, 0, 12, 11, 0, 0, 0, 0));
        team.addPlayer(new Player("Tayfur Bingöl", "Savunma", 12, 11, 10, 0, 14, 13, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Musa Çağıran", "Orta Saha", 11, 10, 9, 0, 0, 0, 13, 12, 0, 0, 0, 0));
        team.addPlayer(new Player("Umut Güneş", "Orta Saha", 10, 9, 8, 0, 0, 0, 12, 11, 0, 0, 0, 0));
        team.addPlayer(new Player("Fatih Karagümrük", "Orta Saha", 11, 10, 9, 0, 0, 0, 13, 12, 0, 0, 0, 0));

        return team;
    }

    public static Team createBasaksehir() {
        Team team = new Team("Başakşehir");

        // Starting XI
        team.addPlayer(new Player("Volkan Babacan", "Kaleci", 14, 13, 12, 17, 0, 0, 0, 0, 0, 0, 18, 17));
        team.addPlayer(new Player("Rafael", "Savunma", 15, 14, 13, 0, 16, 15, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Alexandru Epureanu", "Savunma", 16, 15, 14, 0, 17, 16, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Léo Duarte", "Savunma", 14, 13, 13, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Hasan Ali Kaldırım", "Savunma", 15, 14, 13, 0, 16, 15, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Mehmet Topal", "Orta Saha", 14, 13, 12, 0, 0, 0, 16, 15, 0, 0, 0, 0));
        team.addPlayer(new Player("Danijel Aleksić", "Orta Saha", 15, 14, 13, 0, 0, 0, 17, 16, 0, 0, 0, 0));
        team.addPlayer(new Player("İrfan Can Kahveci", "Orta Saha", 16, 15, 14, 0, 0, 0, 18, 17, 0, 0, 0, 0));
        team.addPlayer(new Player("Edin Višća", "Orta Saha", 17, 16, 15, 0, 0, 0, 18, 17, 0, 0, 0, 0));
        team.addPlayer(new Player("Enzo Crivelli", "Hücum", 15, 14, 13, 0, 0, 0, 0, 0, 17, 16, 0, 0));
        team.addPlayer(new Player("Demba Ba", "Hücum", 16, 15, 14, 0, 0, 0, 0, 0, 18, 17, 0, 0));

        // Bench & Reserves
        team.addPlayer(new Player("Mert Günok", "Kaleci", 13, 12, 11, 16, 0, 0, 0, 0, 0, 0, 17, 16));
        team.addPlayer(new Player("Uğur Uçar", "Savunma", 13, 12, 11, 0, 14, 13, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Carlos Ponck", "Savunma", 14, 13, 12, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Junior Caiçara", "Savunma", 15, 14, 13, 0, 16, 15, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Azubuike Okechukwu", "Orta Saha", 13, 12, 11, 0, 0, 0, 15, 14, 0, 0, 0, 0));
        team.addPlayer(new Player("Deniz Türüç", "Orta Saha", 14, 13, 12, 0, 0, 0, 16, 15, 0, 0, 0, 0));
        team.addPlayer(new Player("Mahmut Tekdemir", "Orta Saha", 14, 13, 12, 0, 0, 0, 16, 15, 0, 0, 0, 0));
        team.addPlayer(new Player("Berkay Özcan", "Orta Saha", 13, 12, 11, 0, 0, 0, 15, 14, 0, 0, 0, 0));
        team.addPlayer(new Player("Fredrik Gulbrandsen", "Hücum", 14, 13, 12, 0, 0, 0, 0, 0, 16, 15, 0, 0));
        team.addPlayer(new Player("Emre Kaplan", "Savunma", 12, 11, 10, 0, 13, 12, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Kerim Frei", "Orta Saha", 13, 12, 11, 0, 0, 0, 15, 14, 0, 0, 0, 0));
        team.addPlayer(new Player("Robinho", "Hücum", 15, 14, 13, 0, 0, 0, 0, 0, 17, 16, 0, 0));
        team.addPlayer(new Player("Atabey Çiçek", "Hücum", 12, 11, 10, 0, 0, 0, 0, 0, 14, 12, 0, 0));
        team.addPlayer(new Player("Sergen Yalçın", "Orta Saha", 12, 11, 10, 0, 0, 0, 14, 13, 0, 0, 0, 0));

        return team;
    }

    public static Team createEyüpspor() {
        Team team = new Team("Eyüpspor");
        team.addPlayer(new Player("Francois", "Kaleci", 14, 13, 12, 17, 0, 0, 0, 0, 0, 0, 18, 17));
        team.addPlayer(new Player("Semih Kaya", "Savunma", 14, 13, 12, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Gökhan Karadeniz", "Savunma", 13, 12, 11, 0, 14, 13, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("İsmail Yüksek", "Savunma", 12, 11, 10, 0, 13, 12, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Ömer Faruk Beyaz", "Orta Saha", 13, 12, 11, 0, 0, 0, 14, 13, 0, 0, 0, 0));
        team.addPlayer(new Player("Serkan Kırıntılı", "Kaleci", 13, 12, 11, 17, 0, 0, 0, 0, 0, 0, 17, 16));
        team.addPlayer(new Player("Kubilay Kanatsızkuş", "Orta Saha", 14, 13, 12, 0, 0, 0, 15, 14, 0, 0, 0, 0));
        team.addPlayer(new Player("Emin Bayram", "Savunma", 12, 11, 10, 0, 14, 13, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Burak Kapacak", "Orta Saha", 13, 12, 11, 0, 0, 0, 14, 13, 0, 0, 0, 0));
        team.addPlayer(new Player("Gökhan Gönül", "Savunma", 13, 12, 11, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Berkay Özcan", "Orta Saha", 12, 11, 10, 0, 0, 0, 13, 12, 0, 0, 0, 0));
        team.addPlayer(new Player("Emre Mor", "Hücum", 13, 12, 11, 0, 0, 0, 0, 0, 14, 13, 0, 0));
        team.addPlayer(new Player("Aydın Karabulut", "Orta Saha", 12, 11, 10, 0, 0, 0, 12, 11, 0, 0, 0, 0));
        team.addPlayer(new Player("Tyronne Ebuehi", "Savunma", 12, 11, 10, 0, 14, 13, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Aatif Chahechouhe", "Orta Saha", 12, 11, 10, 0, 0, 0, 13, 12, 0, 0, 0, 0));
        team.addPlayer(new Player("Serdar Gürler", "Hücum", 13, 12, 11, 0, 0, 0, 0, 0, 15, 14, 0, 0));
        team.addPlayer(new Player("Göztepe", "Hücum", 12, 11, 10, 0, 0, 0, 0, 0, 14, 13, 0, 0));
        team.addPlayer(new Player("Batuhan Karadeniz", "Hücum", 13, 12, 11, 0, 0, 0, 0, 0, 14, 13, 0, 0));
        team.addPlayer(new Player("Emirhan Kayar", "Orta Saha", 11, 10, 9, 0, 0, 0, 12, 11, 0, 0, 0, 0));
        team.addPlayer(new Player("Salih Uçan", "Orta Saha", 12, 11, 10, 0, 0, 0, 13, 12, 0, 0, 0, 0));
        team.addPlayer(new Player("Ömer Yalçın", "Savunma", 12, 11, 10, 0, 14, 13, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Ali Yavuz Kol", "Hücum", 11, 10, 9, 0, 0, 0, 0, 0, 13, 12, 0, 0));
        team.addPlayer(new Player("Yusuf Emre", "Savunma", 11, 10, 9, 0, 13, 12, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Alper Potuk", "Orta Saha", 10, 9, 8, 0, 0, 0, 12, 11, 0, 0, 0, 0));

        return team;
    }

    public static Team createBodrumspor() {
        Team team = new Team("Bodrumspor");

        // Starting XI
        team.addPlayer(new Player("Oğuzhan Çapar", "Kaleci", 13, 12, 11, 16, 0, 0, 0, 0, 0, 0, 17, 16));
        team.addPlayer(new Player("Burak Yılmaz", "Savunma", 13, 12, 11, 0, 14, 13, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Serdar Özkan", "Savunma", 14, 13, 12, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Hakan Özmert", "Savunma", 15, 14, 13, 0, 16, 15, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Mehmet Zeki Çelik", "Savunma", 14, 13, 12, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Okan Derici", "Orta Saha", 13, 12, 11, 0, 0, 0, 14, 13, 0, 0, 0, 0));
        team.addPlayer(new Player("Mert Korkmaz", "Orta Saha", 14, 13, 12, 0, 0, 0, 15, 14, 0, 0, 0, 0));
        team.addPlayer(new Player("Selçuk İnan", "Orta Saha", 15, 14, 13, 0, 0, 0, 16, 15, 0, 0, 0, 0));
        team.addPlayer(new Player("Ahmet Yılmaz", "Orta Saha", 14, 13, 12, 0, 0, 0, 15, 14, 0, 0, 0, 0));
        team.addPlayer(new Player("Fatih Kısakürek", "Orta Saha", 13, 12, 11, 0, 0, 0, 14, 13, 0, 0, 0, 0));
        team.addPlayer(new Player("Emre Öztürk", "Hücum", 15, 14, 13, 0, 0, 0, 0, 0, 17, 16, 0, 0));

        // Bench & Reserves
        team.addPlayer(new Player("Furkan Yıldırım", "Kaleci", 12, 11, 10, 15, 0, 0, 0, 0, 0, 0, 16, 15));
        team.addPlayer(new Player("Aykut Kocaman", "Savunma", 12, 11, 10, 0, 13, 12, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Ersin Aydın", "Savunma", 13, 12, 11, 0, 14, 13, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Kadir Kardaş", "Savunma", 12, 11, 10, 0, 13, 12, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Erdem Yılmaz", "Savunma", 13, 12, 11, 0, 14, 13, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Onur Aydın", "Orta Saha", 12, 11, 10, 0, 0, 0, 13, 12, 0, 0, 0, 0));
        team.addPlayer(new Player("Barış Çetin", "Orta Saha", 13, 12, 11, 0, 0, 0, 14, 13, 0, 0, 0, 0));
        team.addPlayer(new Player("Emrah Yıldırım", "Orta Saha", 12, 11, 10, 0, 0, 0, 13, 12, 0, 0, 0, 0));
        team.addPlayer(new Player("Ahmet Can", "Orta Saha", 13, 12, 11, 0, 0, 0, 14, 13, 0, 0, 0, 0));
        team.addPlayer(new Player("Murat Duman", "Hücum", 12, 11, 10, 0, 0, 0, 0, 0, 14, 13, 0, 0));
        team.addPlayer(new Player("Sami Gün", "Hücum", 11, 10, 9, 0, 0, 0, 0, 0, 13, 12, 0, 0));
        team.addPlayer(new Player("Caner Cengiz", "Hücum", 12, 11, 10, 0, 0, 0, 0, 0, 14, 13, 0, 0));
        team.addPlayer(new Player("Mehmet Tuncer", "Hücum", 13, 12, 11, 0, 0, 0, 0, 0, 15, 14, 0, 0));
        team.addPlayer(new Player("Hüseyin Koç", "Hücum", 11, 10, 9, 0, 0, 0, 0, 0, 12, 11, 0, 0));
        team.addPlayer(new Player("Berkay Yavuz", "Orta Saha", 10, 9, 8, 0, 0, 0, 12, 11, 0, 0, 0, 0));

        return team;
    }

    public static Team createKasimpasa() {
        Team team = new Team("Kasımpaşa");
        team.addPlayer(new Player("Ertaç Özbir", "Kaleci", 15, 14, 13, 18, 0, 0, 0, 0, 0, 0, 19, 18));
        team.addPlayer(new Player("Titi", "Savunma", 14, 13, 12, 0, 16, 15, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Vitor Hugo", "Savunma", 13, 12, 11, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Hakan Arslan", "Savunma", 14, 13, 12, 0, 16, 15, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Jorrit Hendrix", "Orta Saha", 15, 14, 13, 0, 0, 0, 17, 16, 0, 0, 0, 0));
        team.addPlayer(new Player("Gökhan İnler", "Orta Saha", 14, 13, 12, 0, 0, 0, 16, 15, 0, 0, 0, 0));
        team.addPlayer(new Player("Mubarak Wakaso", "Orta Saha", 14, 13, 12, 0, 0, 0, 16, 15, 0, 0, 0, 0));
        team.addPlayer(new Player("Emre Kılınç", "Hücum", 15, 14, 13, 0, 0, 0, 0, 0, 18, 17, 0, 0));
        team.addPlayer(new Player("Khalid Boutaib", "Hücum", 14, 13, 12, 0, 0, 0, 0, 0, 17, 16, 0, 0));
        team.addPlayer(new Player("Aatif Chahechouhe", "Hücum", 13, 12, 11, 0, 0, 0, 0, 0, 16, 15, 0, 0));
        team.addPlayer(new Player("Cevher Toktaş", "Savunma", 12, 11, 10, 0, 14, 13, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("İsmail Köybaşı", "Savunma", 12, 11, 10, 0, 13, 12, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Celil Yüksel", "Orta Saha", 12, 11, 10, 0, 0, 0, 13, 12, 0, 0, 0, 0));
        team.addPlayer(new Player("Sinan Kaloğlu", "Orta Saha", 11, 10, 9, 0, 0, 0, 12, 11, 0, 0, 0, 0));
        team.addPlayer(new Player("Ogün Güçer", "Savunma", 11, 10, 9, 0, 12, 11, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Anıl Kocaman", "Orta Saha", 11, 10, 9, 0, 0, 0, 11, 10, 0, 0, 0, 0));
        team.addPlayer(new Player("Eren Elmalı", "Savunma", 10, 9, 8, 0, 11, 10, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Hüseyin Türkmen", "Savunma", 10, 9, 8, 0, 12, 11, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Ferhat Öztorun", "Savunma", 10, 9, 8, 0, 13, 12, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Onur Kıvrak", "Kaleci", 11, 10, 9, 17, 0, 0, 0, 0, 0, 0, 15, 14));
        team.addPlayer(new Player("Muhammet Demir", "Hücum", 12, 11, 10, 0, 0, 0, 0, 0, 16, 15, 0, 0));
        team.addPlayer(new Player("Hüseyin Yıldız", "Hücum", 11, 10, 9, 0, 0, 0, 0, 0, 15, 14, 0, 0));
        team.addPlayer(new Player("Ali Kuçik", "Hücum", 11, 10, 9, 0, 0, 0, 0, 0, 14, 13, 0, 0));
        team.addPlayer(new Player("Murat Yıldırım", "Hücum", 12, 11, 10, 0, 0, 0, 0, 0, 15, 14, 0, 0));

        return team;
    }

    public static Team createHatayspor() {
        Team team = new Team("Hatayspor");

        // Starting XI
        team.addPlayer(new Player("Yusuf Mert", "Kaleci", 14, 13, 12, 17, 0, 0, 0, 0, 0, 0, 18, 17));
        team.addPlayer(new Player("Alperen Uysal", "Savunma", 15, 14, 13, 0, 16, 15, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Mustafa Öztürk", "Savunma", 14, 13, 12, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Hüseyin Arslan", "Savunma", 13, 12, 11, 0, 14, 13, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Ali Demir", "Savunma", 14, 13, 12, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Okan Çelik", "Orta Saha", 15, 14, 13, 0, 0, 0, 16, 15, 0, 0, 0, 0));
        team.addPlayer(new Player("Kenan Yıldız", "Orta Saha", 14, 13, 12, 0, 0, 0, 15, 14, 0, 0, 0, 0));
        team.addPlayer(new Player("Mert Çetin", "Orta Saha", 15, 14, 13, 0, 0, 0, 16, 15, 0, 0, 0, 0));
        team.addPlayer(new Player("Selim Ege", "Orta Saha", 14, 13, 12, 0, 0, 0, 15, 14, 0, 0, 0, 0));
        team.addPlayer(new Player("Emre Yavuz", "Orta Saha", 13, 12, 11, 0, 0, 0, 14, 13, 0, 0, 0, 0));
        team.addPlayer(new Player("Serdar Gürler", "Hücum", 15, 14, 13, 0, 0, 0, 0, 0, 17, 16, 0, 0));

        // Bench & Reserves
        team.addPlayer(new Player("Gökhan Aydın", "Kaleci", 13, 12, 11, 16, 0, 0, 0, 0, 0, 0, 17, 16));
        team.addPlayer(new Player("Erkan Özer", "Savunma", 13, 12, 11, 0, 14, 13, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Hakan Yılmaz", "Savunma", 14, 13, 12, 0, 15, 14, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Burak Can", "Savunma", 12, 11, 10, 0, 13, 12, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Ali Yılmaz", "Savunma", 13, 12, 11, 0, 14, 13, 0, 0, 0, 0, 0, 0));
        team.addPlayer(new Player("Caner Kalkan", "Orta Saha", 12, 11, 10, 0, 0, 0, 13, 12, 0, 0, 0, 0));
        team.addPlayer(new Player("Onur Karaman", "Orta Saha", 13, 12, 11, 0, 0, 0, 14, 13, 0, 0, 0, 0));
        team.addPlayer(new Player("Emre Koç", "Orta Saha", 12, 11, 10, 0, 0, 0, 13, 12, 0, 0, 0, 0));
        team.addPlayer(new Player("Barış Özer", "Orta Saha", 13, 12, 11, 0, 0, 0, 14, 13, 0, 0, 0, 0));
        team.addPlayer(new Player("Mert Yılmaz", "Hücum", 13, 12, 11, 0, 0, 0, 0, 0, 15, 14, 0, 0));
        team.addPlayer(new Player("Ahmet Aydın", "Hücum", 12, 11, 10, 0, 0, 0, 0, 0, 14, 13, 0, 0));
        team.addPlayer(new Player("Mehmet Demir", "Hücum", 13, 12, 11, 0, 0, 0, 0, 0, 15, 14, 0, 0));
        team.addPlayer(new Player("Sercan Yılmaz", "Hücum", 12, 11, 10, 0, 0, 0, 0, 0, 14, 13, 0, 0));
        team.addPlayer(new Player("Mustafa Güneş", "Hücum", 11, 10, 9, 0, 0, 0, 0, 0, 13, 12, 0, 0));
        team.addPlayer(new Player("Ahmet Tuncer", "Hücum", 12, 11, 10, 0, 0, 0, 0, 0, 14, 13, 0, 0));

        return team;
    }



}



