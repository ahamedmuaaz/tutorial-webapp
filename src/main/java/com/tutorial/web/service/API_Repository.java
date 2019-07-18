package com.tutorial.web.service;

import com.tutorial.web.data.Tutorial;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class API_Repository {
    static RestTemplate  restTemplate = new RestTemplate();

    public static void add(){
        ResponseEntity<List<Tutorial>> response = restTemplate.exchange(
                "http://localhost:8090/add",
                HttpMethod.POST,
                null,
                new ParameterizedTypeReference<List<Tutorial>>(){});
        List<Tutorial> employees = response.getBody();

        System.out.println(employees);
    }

    public void update(){
        ResponseEntity<List<Tutorial>> response = restTemplate.exchange(
                "http://localhost:8090/update",
                HttpMethod.POST,
                null,
                new ParameterizedTypeReference<List<Tutorial>>(){});
        List<Tutorial> employees = response.getBody();

        System.out.println(employees);
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

        for (Tutorial t:employees) System.out.println(t.getName());

        System.out.println(employees);
        return employees;

    }

}




