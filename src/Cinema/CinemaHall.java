package Cinema;

import helper.Address;
import helper.Audi;
import helper.Movie;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public abstract class CinemaHall {
    int CinemaHallID;
    String CinemaHallName;
    Address address;
    List<Audi> lisOfAuditorim;
    List<Movie> movies;
    public abstract Map<Date, Movie> getMovies(List<Date> date);
}
