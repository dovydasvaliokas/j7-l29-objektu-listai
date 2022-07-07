public class Preke {
    // Kintamieji / parametrai / fields
    private int id;
    private String pavadinimas;
    private String aprasymas;
    private double kaina;
    private int kiekisSandelyje;
    private String kategorija;
    private String medziaga;

    // Konstruktoriai
    public Preke() {
    }

    public Preke(int id, String pavadinimas, String aprasymas, double kaina, int kiekisSandelyje, String kategorija, String medziaga) {
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.aprasymas = aprasymas;
        this.kaina = kaina;
        this.kiekisSandelyje = kiekisSandelyje;
        this.kategorija = kategorija;
        this.medziaga = medziaga;
    }

    // Klasės metodai / funkcijos
    public boolean arYraSandelyje() {
        return kiekisSandelyje > 0;
    }



    // Getteriai setteriai

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public String getAprasymas() {
        return aprasymas;
    }

    public void setAprasymas(String aprasymas) {
        this.aprasymas = aprasymas;
    }

    public double getKaina() {
        return kaina;
    }

    public void setKaina(double kaina) {
        this.kaina = kaina;
    }

    public int getKiekisSandelyje() {
        return kiekisSandelyje;
    }

    public void setKiekisSandelyje(int kiekisSandelyje) {
        this.kiekisSandelyje = kiekisSandelyje;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public String getMedziaga() {
        return medziaga;
    }

    public void setMedziaga(String medziaga) {
        this.medziaga = medziaga;
    }

    // toString() metodas

    @Override
    public String toString() {
        return "Preke{" +
                "id=" + id +
                ", pavadinimas='" + pavadinimas + '\'' +
                ", aprasymas='" + aprasymas + '\'' +
                ", kaina=" + kaina +
                ", kiekisSandelyje=" + kiekisSandelyje +
                ", kategorija='" + kategorija + '\'' +
                ", medziaga='" + medziaga + '\'' +
                '}';
    }
}
