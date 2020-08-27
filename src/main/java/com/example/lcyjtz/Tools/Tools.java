package com.example.lcyjtz.Tools;

import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * This is a utility class that handles the process of reading files and uploading data to the database
 */
@RestController
public class Tools {
    /**
     *
     * @param path
     * @return
     */
    public String RoughlyTheContent(String path) {
        StringBuilder result = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String s;
            while ((s = br.readLine()) != null) {
                result.append(s);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}
