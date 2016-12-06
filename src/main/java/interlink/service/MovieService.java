package interlink.service;

import interlink.dao.MovieDao;
import interlink.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieDao movieDao;

    public List<Movie> getAllMovie(){
        return movieDao.getAllLists();
    }
}
