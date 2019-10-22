
package com.mxf.employeeinfromation.response;



import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class Rowset {

    @SerializedName("z_ALPH_15")
    private String zALPH15;
    @SerializedName("z_DL01_642")
    private String zDL01642;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getZALPH15() {
        return zALPH15;
    }

    public void setZALPH15(String zALPH15) {
        this.zALPH15 = zALPH15;
    }

    public String getZDL01642() {
        return zDL01642;
    }

    public void setZDL01642(String zDL01642) {
        this.zDL01642 = zDL01642;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
