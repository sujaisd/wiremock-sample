package com.assistanz.mock.ws;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;

import java.io.IOException;

public class HttpFetcher {

    /**
     * The URL for the REST server.
     */
    private String url;

    /**
     * Initializes the connection between server for the given URL. The same
     * connection will be used across all the other activities.
     *
     * @param url
     */
    public HttpFetcher(String url) {
        this.url = url;
    }

    /**
     * The list of all the Version provided from the REST service.
     *
     * @return list from web service.
     *
     * @throws org.apache.http.client.ClientProtocolException
     * @throws java.io.IOException
     */
    public Versions getVersions() throws ClientProtocolException, IOException {
        //Get the content from the URL (should be JSON)
        String response = Request.Get(url).execute().returnContent().toString();
        //Convert the JSON to Versions object
        Gson gson = new GsonBuilder().create();
        VersionsResponse versionsResponse = gson.fromJson(response, VersionsResponse.class);
        //Returnt the converted Versions list
        return versionsResponse.getVersions();
    }

    public String fetchAsString(String url) throws ClientProtocolException, IOException {
        return Request.Get(url).execute().returnContent().toString();
    }

}
