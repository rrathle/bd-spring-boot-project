package com.bloomtech.springboot.model;

import java.util.Objects;

// tjso calss wil hold data being sent iun an HTTP request
// a pojo normally used in HTTP request
public class theDataForRequest {
    String theData; // the data to send the request

    public theDataForRequest() {}// always have a default constructor for a pojo
    public theDataForRequest(String theData) {
        this.theData = theData;
    }

    public String getTheData() {
        return theData;
    }

    public void setTheData(String theData) {
        this.theData = theData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof theDataForRequest that)) return false;
        return Objects.equals(getTheData(), that.getTheData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTheData());
    }

    @Override
    public String toString() {
        return "theDataForRequest{" +
                "theData='" + theData + '\'' +
                '}';
    }
}
