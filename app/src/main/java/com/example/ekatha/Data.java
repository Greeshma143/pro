package com.example.ekatha;

public class Data
{
    String unitname,place,username,passwd,repasswd;
    int unitno,mobno;

    public Data() {
    }

    public Data(String unitname, String place, String username, String passwd, String repasswd, int unitno, int mobno) {
        this.unitname = unitname;
        this.place = place;
        this.username = username;
        this.passwd = passwd;
        this.repasswd = repasswd;
        this.unitno = unitno;
        this.mobno = mobno;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getRepasswd() {
        return repasswd;
    }

    public void setRepasswd(String repasswd) {
        this.repasswd = repasswd;
    }

    public int getUnitno() {
        return unitno;
    }

    public void setUnitno(int unitno) {
        this.unitno = unitno;
    }

    public int getMobno() {
        return mobno;
    }

    public void setMobno(int mobno) {
        this.mobno = mobno;
    }
}
