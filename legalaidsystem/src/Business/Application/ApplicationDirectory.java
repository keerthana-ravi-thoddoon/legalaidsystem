/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Application;

import java.util.ArrayList;

/**
 *
 * @author kranthikumar
 */
public class ApplicationDirectory {

    private ArrayList<Application> applicationList;

    public ApplicationDirectory() {
        applicationList = new ArrayList();
    }

    public ArrayList<Application> getApplicationList() {
        return applicationList;
    }

    public Application createApplication(String fname, String lname, int income, String problemDescription, String status) {
        Application application = new Application();
        application.setFname(fname);
        application.setLname(lname);
        application.setIncome(income);
        application.setProblemDescription(problemDescription);
        application.setStatus(status);
        applicationList.add(application);
        return application;
    }
}