
package com.mxf.employeeinfromation.response;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class FAResponseEmployee {

    @SerializedName("ServiceRequest1")
    private FAServiceRequest1 serviceRequest1;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public FAServiceRequest1 getFAServiceRequest1() {
        return serviceRequest1;
    }

    public void setFAServiceRequest1(FAServiceRequest1 serviceRequest1) {
        this.serviceRequest1 = serviceRequest1;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
