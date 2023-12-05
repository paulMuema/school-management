package com.example.schoolmanagement;

public class Student_info {
    String fName, lName, sId;

    public Student_info() {
    }

    public Student_info(String fName, String lName, String sId) {
        this.fName = fName;
        this.lName = lName;
        this.sId = sId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }
}
