
package com.mxf.employeeinfromation.response;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FAServiceRequest1 {

    @SerializedName("fs_P1204_W1204C")
    private FAFsP1204W1204C FAfsP1204W1204C;
    private Integer stackId;
    private Integer stateId;
    private String rid;
    private String currentApp;
    private String timeStamp;
    private List<Object> sysErrors = null;
    private List<Object> links = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public FAFsP1204W1204C getFAFsP1204W1204C() {
        return FAfsP1204W1204C;
    }

    public void setFAFsP1204W1204C(FAFsP1204W1204C fsP1204W1204C) {
        this.FAfsP1204W1204C = FAfsP1204W1204C;
    }

    public Integer getStackId() {
        return stackId;
    }

    public void setStackId(Integer stackId) {
        this.stackId = stackId;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getCurrentApp() {
        return currentApp;
    }

    public void setCurrentApp(String currentApp) {
        this.currentApp = currentApp;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public List<Object> getSysErrors() {
        return sysErrors;
    }

    public void setSysErrors(List<Object> sysErrors) {
        this.sysErrors = sysErrors;
    }

    public List<Object> getLinks() {
        return links;
    }

    public void setLinks(List<Object> links) {
        this.links = links;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
