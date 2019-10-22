
package com.mxf.employeeinfromation.response;

import java.util.HashMap;
import java.util.Map;

public class Summary {

    private Integer records;
    private Boolean moreRecords;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getRecords() {
        return records;
    }

    public void setRecords(Integer records) {
        this.records = records;
    }

    public Boolean getMoreRecords() {
        return moreRecords;
    }

    public void setMoreRecords(Boolean moreRecords) {
        this.moreRecords = moreRecords;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
