import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherApp {

    public static void main(String[] args) {

        try {
            String apiUrl =
                    "https://api.open-meteo.com/v1/forecast" +
                            "?latitude=18.52&longitude=73.85&current_weather=true";

            URL url = new URL(apiUrl);
            HttpURLConnection connection =
                    (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(connection.getInputStream()));

            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            JsonObject jsonObject =
                    JsonParser.parseString(response.toString()).getAsJsonObject();

            JsonObject currentWeather =
                    jsonObject.getAsJsonObject("current_weather");

            double temperature = currentWeather.get("temperature").getAsDouble();
            double windSpeed = currentWeather.get("windspeed").getAsDouble();
            int windDirection = currentWeather.get("winddirection").getAsInt();

            System.out.println("Weather Report");
            System.out.println("------------------------");
            System.out.println("City            : Pune");
            System.out.println("Temperature     : " + temperature + " °C");
            System.out.println("Wind Speed      : " + windSpeed + " km/h");
            System.out.println("Wind Direction  : " + windDirection + "°");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
