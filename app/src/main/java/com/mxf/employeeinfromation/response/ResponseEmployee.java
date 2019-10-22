
package com.mxf.employeeinfromation.response;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class ResponseEmployee {

    @SerializedName("ServiceRequest1")
    private ServiceRequest1 serviceRequest1;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public ServiceRequest1 getServiceRequest1() {
        return serviceRequest1;
    }

    public void setServiceRequest1(ServiceRequest1 serviceRequest1) {
        this.serviceRequest1 = serviceRequest1;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
