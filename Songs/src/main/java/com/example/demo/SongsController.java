package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/SongsSwagger")
public class SongsController {

	private static List<SongsEntity> songs=new ArrayList<>();
	
	@GetMapping
	public List <SongsEntity> getSong() {
	return songs;
}
@PostMapping
public SongsEntity addsong(@RequestBody SongsEntity song) {
	songs.add(song);
	return song;
}
	

}
