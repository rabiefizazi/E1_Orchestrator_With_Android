
package com.mxf.employeeinfromation.response;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class Data {

    @SerializedName("gridData")
    private GridData gridData;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public GridData getGridData() {
        return gridData;
    }

    public void setGridData(GridData gridData) {
        this.gridData = gridData;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
