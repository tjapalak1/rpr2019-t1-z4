package ba.unsa.etf.rpr;

public class Supermarket
{
    private int max=1000;
    private int broj_trenutnih;
    private Artikl[] artikli;

    Supermarket()
    {
        this.artikli=new Artikl[1000];
        this.broj_trenutnih=0;
    }
    public void dodajArtikl(Artikl artikl)
    {
        this.artikli[this.broj_trenutnih++]=new Artikl(artikl.getNaziv(),artikl.getCijena(),artikl.getKod());
    }

    public Artikl[] getArtikli()
    {
        return this.artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod)
    {
        int pozicija=-1;
        Artikl pomocni=new Artikl("1",2,"1");

        for(int i=0;i<broj_trenutnih;i++)
        {
            if(kod.equals(this.artikli[i].getKod()))
            {
                pozicija=i;
                pomocni=new Artikl(this.artikli[i].getNaziv(),this.artikli[i].getCijena(),kod);
                break;
            }
        }
        if(pozicija!=-1)
        {

                for(int j=pozicija;j<this.broj_trenutnih-1;j++)
                {
                    this.artikli[j]=this.artikli[j+1];
                }
            this.artikli[broj_trenutnih-1]=null;
            this.broj_trenutnih-=1;
            return pomocni;
        }

        return null;
    }


}
