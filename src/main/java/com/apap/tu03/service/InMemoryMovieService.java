package com.apap.tu03.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.apap.tu03.model.MovieModel;


@Service
public class InMemoryMovieService implements MovieService {
	private List<MovieModel> archiveMovie;
	
	public InMemoryMovieService() {
		archiveMovie = new ArrayList<>();
	}

	@Override
	public void addMovie(MovieModel movie) {
		// TODO Auto-generated method stub
		archiveMovie.add((MovieModel) movie);
		
	}

	@Override
	public List<MovieModel> getMovieList() {
		// TODO Auto-generated method stub
		return archiveMovie;
	}

	@Override
	public MovieModel getMovieDetail(String id) {
		// TODO Auto-generated method stub
		
		if(archiveMovie != null) {
			return archiveMovie.get(Integer.parseInt(id) - 1);
		}
		return null;
	}
	
	
}
