
package com.mxf.employeeinfromation.response;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GridData {

    private Integer id;
    private String fullGridId;
    @SerializedName("columns")
    private Columns columns;
    @SerializedName("rowset")
    private List<Rowset> rowset = null;
    @SerializedName("summary")
    private Summary summary;
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

    public Columns getColumns() {
        return columns;
    }

    public void setColumns(Columns columns) {
        this.columns = columns;
    }

    public List<Rowset> getRowset() {
        return rowset;
    }

    public void setRowset(List<Rowset> rowset) {
        this.rowset = rowset;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
