import java.net.*;

public class  DefaultHTTPClientExmpl {

    public static void main(String[] args) throws IOException {

        try {
            URL url = new URL("http://www.w3.org/pub/WWW/TheProject.html HTTP/1.1");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
