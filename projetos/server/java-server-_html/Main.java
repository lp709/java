import com.sun.net.httpserver.HttpServer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        HttpServer server = HttpServer.create(new java.net.InetSocketAddress(709), 0);

        server.createContext("/lp", exchange -> {
            //url = http://localhost:709/lp

            String html = "<h1>Hello world from java server</h1>";
            byte[] response = html.getBytes();
            exchange.sendResponseHeaders(200, response.length);
            exchange.getResponseBody().write(response);
            exchange.close();

        });

        server.start();

    }
}
