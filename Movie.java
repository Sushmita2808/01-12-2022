package com.spring.data.jpa.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name="movie_title", nullable = false, length = 225)
	private String title;

	@Column(name = "movie_release")
	private int year_of_release;
	
	
	@ManyToMany(mappedBy = "movies")
	private List<Actor> actors = new ArrayList<Actor>() ;
	
	@ManyToOne
	@JoinColumn(name="genre_id")
	private Genre genres;


	public Movie() {
		super();
		
	}
	

	public Movie(long id, String title, int year_of_release, List<Actor> actors, Genre genres) {
		super();
		this.id = id;
		this.title = title;
		this.year_of_release = year_of_release;
		this.actors= actors;
		this.genres = genres;
	}

	
	public Movie(String title, int year_of_release, List<Actor> actors, Genre genres) {
		super();
		this.title = title;
		this.year_of_release = year_of_release;
		this.actors = actors;
		this.genres = genres;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getYear_of_release() {
		return year_of_release;
	}


	public void setYear_of_release(int year_of_release) {
		this.year_of_release = year_of_release;
	}


	public List<Actor> getActors() {
		return actors;
	}


	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}


	public Genre getGenres() {
		return genres;
	}


	public void setGenres(Genre genres) {
		this.genres = genres;
	}


	@Override
	public String toString() {
		return "\n Movie [id=" + id + ", title=" + title + ", year_of_release=" + year_of_release + ", actors=" + actors
				+ ", genres=" + genres + "]";
	}
	


}
