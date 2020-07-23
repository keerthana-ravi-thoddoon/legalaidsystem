/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Schedule.Schedule;
import Business.UserAccount.UserAccount;

/**
 *
 * @author raunak
 */
public class Employee {

    private String name;
    private int id;
    private static int count = 1;
    private String specialty;
    private Schedule schedule;
    private UserAccount assistant;
    private EmployeeDirectory lawyerDirectory;

    public Employee() {
        id = count;
        count++;
        schedule = new Schedule();
        assistant = new UserAccount();
        lawyerDirectory = new EmployeeDirectory();
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public UserAccount getAssistant() {
        return assistant;
    }

    public void setAssistant(UserAccount assistant) {
        this.assistant = assistant;
    }

    public EmployeeDirectory getLawyerDirectory() {
        return lawyerDirectory;
    }

    public void setLawyerDirectory(EmployeeDirectory lawyerDirectory) {
        this.lawyerDirectory = lawyerDirectory;
    }

    @Override
    public String toString() {
        return name;
    }
}
