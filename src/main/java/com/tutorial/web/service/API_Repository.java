package com.tutorial.web.service;

import com.tutorial.web.data.Tutorial;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class API_Repository {

    static RestTemplate  restTemplate = new RestTemplate();

    public static void add(Tutorial tut){

        restTemplate.postForObject("http://localhost:8090/add",tut,Tutorial.class);
    }

    public static Tutorial findOneById(int id){
        Tutorial found=restTemplate.getForObject("http://localhost:8090/find?id="+id,Tutorial.class);
        return found;

    }


    public static void delete(int id){

        restTemplate.getForEntity("http://localhost:8090/delete?id="+id,String.class);

    }

    public static List<Tutorial> View(){
        ResponseEntity<List<Tutorial>> response = restTemplate.exchange(
                "http://localhost:8090/",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Tutorial>>(){});
        List<Tutorial> employees = response.getBody();

        return employees;

    }

}




