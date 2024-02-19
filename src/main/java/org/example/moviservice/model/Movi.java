package org.example.moviservice.model;

import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Movi {

    private String title;
    private String year;
    private String imdbID;
    private String type;

    public String searchPage(String query) throws IOException {
        String url = "https://www.omdbapi.com/?s=" + query + "&page=1&apikey=19b0b951";
        URL apiUrl = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String jsonContent = "";
        String line;
        while ((line = reader.readLine()) != null) {
            jsonContent += line;
        }
        reader.close();
        System.out.println(jsonContent);
        return jsonContent;
    }

    public String getTitle()
    {
        return this.title;
    }
    public String getYear()
    {
        return this.year;
    }
    public String getType()
    {
        return this.type;
    }
    public String getImdbID()
    {
        return this.imdbID;
    }

}
