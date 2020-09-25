package hu.kincstar.javasetraining.pendrives;

import java.util.List;

public class Pendrives {

    // lehetnének static-ek, csak a feladat nem így kérte

    public Pendrive best(List<Pendrive> pendrives){
        if(pendrives == null || pendrives.size() == 0){
            throw new IllegalArgumentException("pendrives is null or empty");
        }

        Pendrive bestPendrive = pendrives.get(0);

        for (int i = 1; i < pendrives.size(); i++) {
            Pendrive currentPendrive = pendrives.get(i);
            if(bestPendrive.comparePricePerCapacity(currentPendrive) > 0){
                bestPendrive = currentPendrive;
            }
        }

        return bestPendrive;
    }

    public Pendrive cheapest(List<Pendrive> pendrives){
        if(pendrives == null || pendrives.size() == 0){
            throw new IllegalArgumentException("pendrives is null or empty");
        }

        Pendrive cheapestPendrive = pendrives.get(0);

        for (int i = 1; i < pendrives.size(); i++) {
            Pendrive currentPendrive = pendrives.get(i);
            if(currentPendrive.cheaperThan(cheapestPendrive)){
                cheapestPendrive = currentPendrive;
            }
        }

        return cheapestPendrive;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendrives, int percent, int capacity){
        if(pendrives == null || pendrives.size() == 0){
            throw new IllegalArgumentException("pendrives is null or empty");
        }

        for (Pendrive currentPendrive :
                pendrives) {
            if(currentPendrive.getCapacity() == capacity){
                currentPendrive.risePrice(percent);
            }
        }
    }
}
