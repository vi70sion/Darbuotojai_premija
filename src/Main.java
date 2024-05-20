public class Main {
    public static void main(String[] args) {

//        Sukurkite klasę Darbuotojas, kuri turėtų laukus vardas, pavarde, atlyginimas.
//        Parašykite metodą, kuris padidins atlyginimą tam tikru procentu. Sukurkite sąrašą
//        darbuotojų ir parašykite funkciją, kuri padidins atlyginimus visiems darbuotojams ir atspausdins jų informaciją.

        Darbuotojas[] sarasas = new Darbuotojas[5];
        sarasas[0] = new Darbuotojas("Vardas1", "Pavardė1", 1200.00);
        sarasas[1] = new Darbuotojas("Vardas2", "Pavardė2", 790.50);
        sarasas[2] = new Darbuotojas("Vardas3", "Pavardė3", 1050.90);
        sarasas[3] = new Darbuotojas("Vardas4", "Pavardė4", 950.00);
        sarasas[4] = new Darbuotojas("Vardas5", "Pavardė5", 1500.00);
        int procentas = 15;
        System.out.println("Atlyginimas pakeltas " + procentas + " procentų: ");
        Darbuotojas.padidintiAtlyginima(procentas, sarasas);
        for(Darbuotojas item: sarasas){
            System.out.println(item);
        }

    }
}