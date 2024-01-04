package org.choongang.admin.config.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.RequiredArgsConstructor;
import org.choongang.admin.config.entities.Configs;
import org.choongang.admin.config.repositories.ConfigsRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConfigSaveService {
    private final ConfigsRepository repository;

    public <T> void save(String code, T data) {
        Configs configs = repository.findById(code).orElseGet(Configs::new);

        ObjectMapper om = new ObjectMapper();
        om.registerModule(new JavaTimeModule());

        try {
            String jsonString = om.writeValueAsString(data);
            configs.setData(jsonString);
            repository.saveAndFlush(configs);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
