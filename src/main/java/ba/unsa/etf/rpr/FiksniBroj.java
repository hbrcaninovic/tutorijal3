package ba.unsa.etf.rpr;

import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj{


    private Grad grad;
    private String broj;

    FiksniBroj(Grad grad,String broj)
    {
        if(grad==null) throw new BrojException("Pozivni broj za fiksni telefon nije OK");
        this.grad=grad;
        this.broj=broj;
    }

    /** Geteri*/
    public Grad getGrad() {
        return grad;
    }

    public String getBroj() {
        return broj;
    }

    /** Metoda za ispis fiksnog broja */
    @Override
    public String ispisi() {
        if(grad!=null && broj!=null) return grad.getPozivniBroj()+"/"+broj;
        return null;
    }

    /** Kreira i vrraca hash kod od parametara */
    @Override
    public int hashCode() {
        return Objects.hash(grad,broj);
    }
}
