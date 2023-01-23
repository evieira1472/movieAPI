package com.evercode.movie.api.movieAPI;

import com.evercode.movie.api.movieAPI.services.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;


@SpringBootApplication
public class MovieApiApplication {

	@Autowired
	private FileService fileService;


	public static void main(String[] args) {
		SpringApplication.run(MovieApiApplication.class, args);
	}

	@PostConstruct
	public void buildData() {
		fileService.buildDataFile();
	}

}
