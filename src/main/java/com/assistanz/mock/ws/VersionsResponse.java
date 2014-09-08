
package com.assistanz.mock.ws;

/**
 * The response from the REST API for Versions call
 * @author Sujai SD <sujai@assistanz.com>
 */
public class VersionsResponse {
    
    /**
     * List of Version available in the server.
     */
    private Versions versions;

    public Versions getVersions() {
        return versions;
    }

    public void setVersions(Versions versions) {
        this.versions = versions;
    }
    
}
