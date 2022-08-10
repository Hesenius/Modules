package zoo.visitor;

import zoo.tours.api.Tour;
import zoo.tours.reservations.Tourfinder;

import java.util.List;

public class Tourist {
    public static void main(String[] args) {
        Tour tour = Tourfinder.findSingleTour();
        System.out.println("Single tour: " + tour);

        List<Tour> tours = Tourfinder.findAllTours();
        System.out.println("# tours:  " + tours.size());
    }
}
