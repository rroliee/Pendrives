package hu.kincstar.javasetraining.pendrives;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Pendrive> pendrives = new ArrayList<>(){{
           add(new Pendrive("P0", 1, 899));
           add(new Pendrive("P1", 2, 1100));
           add(new Pendrive("P2", 4, 2000));
           add(new Pendrive("P3", 32, 7000));
           add(new Pendrive("P4", 64, 10000));
        }};

        Pendrives p = new Pendrives();

        System.out.println(p.best(pendrives));
        System.out.println(p.cheapest(pendrives));

        p.risePriceWhereCapacity(pendrives, 15, 64);
        p.risePriceWhereCapacity(pendrives, 15, 1);

        System.out.println(p.best(pendrives));
        System.out.println(p.cheapest(pendrives));
    }
}
