
package com.mxf.employeeinfromation.response;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class FARowset {

    private String zEQST32;
    @SerializedName("z_DL01_29")
    private String zDL0129;
    @SerializedName("z_LOC_30")
    private String zLOC30;
    @SerializedName("z_DL01_41")
    private String zDL0141;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public String getZEQST32() {
        return zEQST32;
    }

    public void setZEQST32(String zEQST32) {
        this.zEQST32 = zEQST32;
    }

    public String getZDL0129() {
        return zDL0129;
    }

    public void setZDL0129(String zDL0129) {
        this.zDL0129 = zDL0129;
    }

    public String getZLOC30() {
        return zLOC30;
    }

    public void setZLOC30(String zLOC30) {
        this.zLOC30 = zLOC30;
    }

    public String getZDL0141() {
        return zDL0141;
    }

    public void setZDL0141(String zDL0141) {
        this.zDL0141 = zDL0141;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
