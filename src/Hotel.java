import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Hotel {
    private int nrMaximAnimale;
    private int suprafataMaxima;
    private ArrayList<Pisica>pisici;
    private ArrayList<Caine>caini;

    public Hotel(Animal a) {
        int agresiv=0;
        this.nrMaximAnimale = nrMaximAnimale;
        Scanner s=new Scanner(System.in);
            System.out.println("Nume propietar=");
            a.setNumeProprietar(s.nextLine());
            System.out.println("Rasa=");
            a.setRasa(s.nextLine());
            System.out.println("SuprafataMinima=");
            a.setSuprafataMinima(s.nextInt());
        if( a instanceof Caine) {
            System.out.println("Daca cainele este agresiv tastati 1, altfel 0");
            agresiv=s.nextInt();

            if(agresiv==0)
                ((Caine) a).setEsteAgresiv(true);
            else ((Caine) a).setEsteAgresiv(false);
            caini.add((Caine) a);
        }
        else if(a instanceof Pisica)
        {
            System.out.println("Pisica are ochii:");
            ((Pisica) a).setCuloareOchi(s.nextLine());
            pisici.add((Pisica) a);
        }

    }
    public void sosireAnimal(Animal a, int suprafata) throws Exception
    {
        if(a instanceof Caine)
        {
            if(suprafata-suprafataOcupata()>=a.getSuprafataMinima())
                caini.add((Caine)a);
            else throw new Exception("Nu este loc!");
        }
        else if( a instanceof Pisica)
        {
            if(suprafata-suprafataOcupata()>=a.getSuprafataMinima())
                pisici.add((Pisica)a);
            else throw new Exception("Nu este loc!");
        }
    }
    private int suprafataOcupata()
    {
        int suprafata=0;
        for(Pisica x: pisici)
            suprafata+=x.getSuprafataMinima();
        for(Caine x: caini)
            suprafata+=x.getSuprafataMinima();
        return suprafata;
    }
    public void plecare( Animal a)
    {
        if( a instanceof  Caine)
            caini.remove(a);
        else if( a instanceof Pisica)
            pisici.remove(a);
    }
    public int cainiAgresivi()
    { int nr=0;
        for( Caine x: caini)
        {
            if(x.isEsteAgresiv())
                nr++;
        }
        return nr;
    }
    public int culoareOchiPisici( String culoare)
    {int nr=0;
        for(Pisica x:pisici)
        {
            if( x.getCuloareOchi().equals(culoare))
                nr++;
        }
        return nr;
    }
    public void detalii()
    {
        ArrayList<Animal> a=new ArrayList<>();
        a.addAll(pisici);
        a.addAll(caini);
        Collections.sort(a);
        for( Animal x: a)
        {
            System.out.println(x.getNumeProprietar());
        }
    }



}
