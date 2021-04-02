package Cinema;

import helper.Movie;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CinemaA extends CinemaHall{

    @Override
    public Map<Date, Movie> getMovies(List<Date> date) {
        Map<Date,Movie> map= new HashMap<>();
        for(int i=0;i<date.size();i++){

        }
        return null;
    }
}
