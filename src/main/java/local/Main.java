package local;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URI;

public class Main {

    public static void main(String[] args) {
        String scxTestUrl = "https://backoffice-be.research-test.skoda-auto.com/proxy/export/report/external/exportFeedbacks/7BFD93A8F7314E8389BB18EEE2D0EE03/100/260/01.01.2025/20.01.2025";
        HttpURLConnection connection = null;

        try {
            URI uri = new URI(scxTestUrl);  // Convert the string to a URL object
            URL url = uri.toURL();
            connection = (HttpURLConnection) url.openConnection(); // Open a connection
            connection.setRequestMethod("GET"); // Specify it's a GET request
            int responseCode = connection.getResponseCode();
            System.out.println("Response code: " + responseCode);

        } catch (Exception e) {
            e.printStackTrace(); // If anything goes wrong, print the error
        }


    }

}