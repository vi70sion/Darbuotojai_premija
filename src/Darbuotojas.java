public class Darbuotojas {

    private String vardas, pavarde;
    private double atlyginimas;

    public Darbuotojas(String vardas, String pavarde, double atlyginimas) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.atlyginimas = atlyginimas;
    }

    public String getVardas() { return vardas; }
    public String getPavarde() { return pavarde; }
    public double getAtlyginimas() { return atlyginimas; }
    public void setVardas(String vardas) { this.vardas = vardas; }
    public void setPavarde(String pavarde) { this.pavarde = pavarde; }
    public void setAtlyginimas(double atlyginimas) { this.atlyginimas = atlyginimas; }


    public static void padidintiAtlyginima(int procentas, Darbuotojas[] sarasas){
        for(Darbuotojas item: sarasas){
            item.setAtlyginimas(item.getAtlyginimas() * (((double) procentas) / 100 + 1));
           }
    }

    @Override
    public String toString(){
        return vardas + " " + pavarde + ", atlyginimas " + String.format( "%.2f", atlyginimas );
    }

}
