package com.mxf.employeeinfromation.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EmployeeReposnseWrapper {


    private TestJson testJson;

    public TestJson getTestJson() {
        return testJson;
    }

    public void setTestJson(TestJson testJson) {
        this.testJson = testJson;
    }
}
