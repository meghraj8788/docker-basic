import java.io.*;
import java.net.*;

public class Main {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://python-app:5000/message");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String msg = in.readLine();
            in.close();
            System.out.println(msg + " Meghraj");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
