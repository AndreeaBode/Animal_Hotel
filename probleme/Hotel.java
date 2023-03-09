package probleme;

import javax.swing.*;
import java.util.List;
import java.util.TreeSet;

public class Hotel {

    private Camera cameraCaini;
    private Camera cameraPisici;

    public Hotel()
    {
        cameraCaini= new Camera();
        cameraPisici= new Camera();
    }

    public void adauga(Caine caine)
    {

        try{
            cameraCaini.adaugaAnimal(caine);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Nu avem loc!");
        }
    }
    public void adauga(Pisica pisica)
    {

        try{
            cameraPisici.adaugaAnimal(pisica);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Nu avem loc!");
        }
    }
    public void pleaca(Caine caine)
    {
        cameraCaini.pleacaAnimal(caine);
    }
    public void pleaca(Pisica pisica)
    {
        cameraPisici.pleacaAnimal(pisica);
    }
    public int nrCainiAgresivi()
    {
        int nr=0;
        for(Animal c: cameraCaini.getAnimale())
        {
            if((c instanceof Caine) && (((Caine)c).isAgresiv()))
                nr++;
        }
        return nr;
    }
    public int nrPisiciCuloare(String culoare)
    {
        int nr=0;
        for(Animal p: cameraPisici.getAnimale())
        {
            if((p instanceof Pisica) && ((Pisica)p).getCuloareOchi().compareTo(culoare)==0)
                nr++;
        }
        return nr;
    }
    public void detalii()
    {
        TreeSet<Animal> animals= new TreeSet<>();

        for(Animal c:cameraCaini.getAnimale())
        {
            animals.add(c);
        }
        for(Animal p:cameraPisici.getAnimale())
        {
            animals.add(p);
        }
        for(Animal animal:animals)
        {
            System.out.println(animal);
        }



    }



}
