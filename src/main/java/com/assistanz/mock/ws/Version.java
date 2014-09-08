package com.assistanz.mock.ws;

import java.util.Date;

/**
 * The version of the REST API.
 * 
 * @author Sujai SD <sujai@assistanz.com>
 */
public class Version {
    
    /**
     * Identifier for the version.
     */
    private String id;
    
    /**
     * Status of the version. Is the version supported or not.
     */
    private String status;
    
    /**
     * Last updated date
     */
    private Date updated;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}
