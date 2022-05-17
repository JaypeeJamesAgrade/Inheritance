public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Battle Begin!");
        System.out.println("Wizards and Warlocks");
        System.out.println("Both Fighter Have 200 HP and 200 Mana");
        System.out.println("~~~~~~~~~~~~~~~~~~");

        Wizard Cecilion = new Wizard("Cecilion");
        Warlock Dyrroth = new Warlock("Dyrroth");
        Cecilion.Batimpact(Dyrroth);
        Cecilion.Sanguineclaws(Dyrroth);
        Dyrroth.Burststrike(Cecilion);
        Cecilion.Batsfeast(Dyrroth);
        Dyrroth.Abysmstrike(Cecilion);
        Cecilion.Regen(Cecilion);
        Dyrroth.Regen(Dyrroth);
        Cecilion.Sanguineclaws(Dyrroth);
        Dyrroth.Burststrike(Cecilion);
        Cecilion.Batimpact(Dyrroth);

    }
}