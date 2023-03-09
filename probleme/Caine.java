package probleme;

import java.util.Scanner;

public class Caine extends Animal{
    private boolean agresiv;

    public Caine()
    {
        super();
        Scanner in= new Scanner(System.in);
        System.out.println("Este agresiv(da-> true; nu->false): ");
        agresiv=in.nextBoolean();
        //in.close();
    }
    public boolean isAgresiv()
    {
        return agresiv;

    }
}
