package com.eventticketing.event_ticketing_system.utils;

import com.eventticketing.event_ticketing_system.dto.request.ConfigurationRequestDTO;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConfigUtils {

    // Save Configuration to a file
    public static void saveConfiguration(ConfigurationRequestDTO configurationRequestDTO, String filePath) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(configurationRequestDTO, writer); // Serialize and write to file
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to save configuration: " + e.getMessage());
        }
    }

    // Load Configuration from a file
    public static ConfigurationRequestDTO loadConfiguration(String filePath) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(filePath)) {
            return gson.fromJson(reader, ConfigurationRequestDTO.class); // Deserialize JSON from file
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load configuration: " + e.getMessage());
        }
    }
}
