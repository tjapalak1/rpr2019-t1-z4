package ba.unsa.etf.rpr;

public class Artikl
{
    private String naziv;
    private int cijena;
    private String kod;

    Artikl(String naziv,int cijena,String kod)
    {
        this.naziv=naziv;
        this.cijena=cijena;
        this.kod=kod;
    }

    public String getNaziv() {
        return this.naziv;
    }
    public int getCijena()
    {
        return this.cijena;
    }
    public String getKod()
    {
        return this.kod;
    }

}
