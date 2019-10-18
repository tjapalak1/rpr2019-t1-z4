package ba.unsa.etf.rpr;

public class Korpa
{
    private int max=50;
    private int broj_trenutnih;
    private Artikl[] artikli;

    Korpa()
    {
        this.artikli=new Artikl[50];
        this.broj_trenutnih=0;
    }

    public boolean dodajArtikl(Artikl artikl)
    {
        if(this.broj_trenutnih==50)
            return false;
        this.artikli[this.broj_trenutnih++]=new Artikl(artikl.getNaziv(),artikl.getCijena(),artikl.getKod());
        return true;
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
            for(int i=pozicija;i<this.broj_trenutnih;i++)
            {
                for(int j=i+1;j<this.broj_trenutnih-1;j++)
                {
                    this.artikli[j]=this.artikli[j+1];
                }
            }
            this.broj_trenutnih--;
            return pomocni;
        }

        return null;
    }

    public int dajUkupnuCijenuArtikala()
    {
        int cijena=0;
        for(int i=0;i<this.broj_trenutnih;i++)
        {
            cijena+=this.artikli[i].getCijena();
        }
        return cijena;
    }



}
