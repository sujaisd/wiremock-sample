import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;

import java.io.IOException;

public class HttpFetcher {

    public String fetchAsString(String url) throws ClientProtocolException, IOException {
        return Request.Get(url).execute().returnContent().toString();
    }

}
