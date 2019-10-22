
package com.mxf.employeeinfromation.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceRequest1 {

    @SerializedName("fs_P0801_W0801A")
    private FsP0801W0801A fsP0801W0801A;
    private Integer stackId;
    private Integer stateId;
    private String rid;
    private String currentApp;
    private String timeStamp;
    private List<Object> sysErrors = null;
    private List<Object> links = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public FsP0801W0801A getFsP0801W0801A() {
        return fsP0801W0801A;
    }

    public void setFsP0801W0801A(FsP0801W0801A fsP0801W0801A) {
        this.fsP0801W0801A = fsP0801W0801A;
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
