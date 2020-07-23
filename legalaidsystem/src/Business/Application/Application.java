/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Application;

import Business.UserAccount.UserAccount;

/**
 *
 * @author kranthikumar
 */
public class Application {

    private String fname;
    private String mname;
    private String lname;
    private String aline1;
    private String aline2;
    private String city;
    private String state;
    private int zip;
    private int income;
    private int number;
    private String problemDescription;
    private String status;
    private UserAccount applicant;
    private UserAccount lawyer;
    private String picturePath;

    public Application() {
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAline1() {
        return aline1;
    }

    public void setAline1(String aline1) {
        this.aline1 = aline1;
    }

    public String getAline2() {
        return aline2;
    }

    public void setAline2(String aline2) {
        this.aline2 = aline2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UserAccount getApplicant() {
        return applicant;
    }

    public void setApplicant(UserAccount applicant) {
        this.applicant = applicant;
    }

    public UserAccount getLawyer() {
        return lawyer;
    }

    public void setLawyer(UserAccount lawyer) {
        this.lawyer = lawyer;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return fname;
    }
}