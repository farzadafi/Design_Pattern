package main.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GlassViewEngine {
    public String render(String path) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return path + " View file rendered with glass view engine";
    }
}
