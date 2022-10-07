package com.example.backend.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class IdService {

    public static String generateId(){
        return UUID.randomUUID().toString();
    }


}
