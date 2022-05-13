public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Battle Begin!");
        System.out.println("Wizard and Warlock");
        System.out.println("Both Characters Have 500 HP and 500 Mana");
        System.out.println("~~~~~~~~~~~~");

        Wizards Naruto = new Wizards("Naruto");
        Warlocks Sasuke = new Warlocks("Sasuke");
        Naruto.Rasengan(Sasuke);
        Naruto.Shadowclonejutsu(Sasuke);
        Sasuke.Chidori(Naruto);
        Naruto.Rasenshuriken(Sasuke);
        Sasuke.Amaterasu(Naruto);
        Sasuke.Heavenlyhandpower(Naruto);
        Sasuke.sixpathshealing (Naruto);
        Naruto.Sagemodenatureenergy(Sasuke);
        Sasuke.IndrasArrow (Naruto);
        Naruto.Ashuramoderasengan(Sasuke);

    }
}
