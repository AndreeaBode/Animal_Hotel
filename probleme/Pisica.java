package probleme;

import java.awt.*;
import java.util.Scanner;

public class Pisica extends Animal{
    private String culoareOchi;
    public Pisica()
    {
        super();
        Scanner in= new Scanner(System.in);
        System.out.println("Culoarea ochilor: ");
        culoareOchi=in.nextLine();
        //in.close();
    }

    public String getCuloareOchi()
    {
        return culoareOchi;
    }
}
