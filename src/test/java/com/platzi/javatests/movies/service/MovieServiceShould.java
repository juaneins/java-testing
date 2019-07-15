package com.platzi.javatests.movies.service;

import com.platzi.javatests.movies.data.MovieRepository;
import com.platzi.javatests.movies.model.Genre;
import com.platzi.javatests.movies.model.Movie;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertThat;

public class MovieServiceShould {

	private MovieService movieService;

	@Before
	public void setup() {
		MovieRepository movieRepository = Mockito.mock(MovieRepository.class);

		Mockito.when(movieRepository.findAll())
				.thenReturn(Arrays.asList(
						new Movie(1, "Dark Knight", 152, Genre.ACTION),
						new Movie(2, "Memento", 113, Genre.THRILLER),
						new Movie(3, "There's Something About Mary", 119, Genre.COMEDY),
						new Movie(4, "Super 8", 112, Genre.THRILLER), 
						new Movie(5, "Scream", 111, Genre.HORROR),
						new Movie(6, "Home Alone", 103, Genre.COMEDY), 
						new Movie(7, "Matrix", 136, Genre.ACTION),
						new Movie(8, "Superman", 180, Genre.THRILLER)
						));

		movieService = new MovieService(movieRepository);
	}

	@Test
	public void returnMoviesByGenre() {

		Collection<Movie> movies = movieService.findMoviesByGenre(Genre.COMEDY);
		//List<Integer> movieIds = getMovieIds(movies);
		assertThat(getMovieIds(movies), CoreMatchers.is(Arrays.asList(3, 6)));
	}

	@Test
	public void returnMoviesByLength() {
		Collection<Movie> movies = movieService.findMoviesByLength(119);
		//List<Integer> movieIds = getMovieIds(movies);
		assertThat(getMovieIds(movies), CoreMatchers.is(Arrays.asList(2,3,4,5,6)));
	}

	@Test
	public void returnMoviesByName() {
		Collection<Movie> movies = movieService.findMoviesByName("super");
		assertThat(getMovieIds(movies), CoreMatchers.is(Arrays.asList(4,8)));
	}

	private List<Integer> getMovieIds(Collection<Movie> movies) {
		//return movies.stream().map(movie -> movie.getId()).collect(Collectors.toList());
		return movies.stream().map(Movie::getId).collect(Collectors.toList());
	}

}
