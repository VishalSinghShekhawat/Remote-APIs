package com.springlearn.connection.with.Remote.APIs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {
    @Autowired
    RestTemplate restTemplate;


    @GetMapping("get-Info")
    public Object getMovieInfo(){
        String url = "https://www.omdbapi.com/?i=tt3896198&apikey=bd25e6b0";
        Object response = restTemplate.getForObject(url,Object.class);
        return response;
    }

    @GetMapping("get-Customised-Info")
    public MovieResponse getCustomisedInfo(){
        String url = "https://www.omdbapi.com/?i=tt3896198&apikey=bd25e6b0";
        MovieResponse response = restTemplate.getForObject(url,MovieResponse.class);
        return response;
    }


    // Calling local APIs
    @GetMapping("/get-Student/{id}")
    public Object getStudent(@PathVariable("id") int regNo){
        String url = "http://localhost:9999/student/get/"+regNo;
        Object response = restTemplate.getForObject(url,Object.class);
        return response;
    }
}
