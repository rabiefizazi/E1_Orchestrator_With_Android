
package com.mxf.employeeinfromation.response;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FAGridData {

    private Integer id;
    private String fullGridId;
    @SerializedName("columns")
    private FAColumns columns;
    @SerializedName("rowset")
    private List<FARowset> rowset = null;
    @SerializedName("summary")
    private FASummary summary;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullGridId() {
        return fullGridId;
    }

    public void setFullGridId(String fullGridId) {
        this.fullGridId = fullGridId;
    }

    public FAColumns getFAColumns() {
        return columns;
    }

    public void setFAColumns(FAColumns columns) {
        this.columns = columns;
    }

    public List<FARowset> getFARowset() {
        return rowset;
    }

    public void setFARowset(List<FARowset> rowset) {
        this.rowset = rowset;
    }

    public FASummary getFASummary() {
        return summary;
    }

    public void setFASummary(FASummary summary) {
        this.summary = summary;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
