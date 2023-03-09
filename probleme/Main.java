package probleme;

public class Main {
    public static void main(String[] args) {
        Hotel hotel= new Hotel();
        Caine c1= new Caine();
        Caine c2= new Caine();
        Caine c3= new Caine();
        Pisica p1= new Pisica();
        Pisica p2= new Pisica();
        //Pisica p3= new Pisica();
        hotel.adauga(c1);
        hotel.adauga(c2);
        hotel.adauga(c3);
        hotel.adauga(p1);
        hotel.adauga(p2);
        //hotel.adauga(p3);
        hotel.pleaca(p1);
        hotel.pleaca(c3);
        System.out.println("nr caini agresivi: "+hotel.nrCainiAgresivi());
        System.out.println("nr pisici cu ochii de culoare verde: "+hotel.nrPisiciCuloare("verde"));
        hotel.detalii();


    }
}
