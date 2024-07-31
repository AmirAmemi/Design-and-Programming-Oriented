public class Main {
    public static void main(String[] args) {
        DonneesMeteo dm = new DonneesMeteo();
        AffichageConditions ac = new AffichageConditions();
        dm.attach(ac);
        dm.SetMusures(18, 70, 2000);
        ac.update(18, 70);
        ac.afficher();


    }
}
