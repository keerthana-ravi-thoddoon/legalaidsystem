/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Application.Application;
import Business.Employee.Employee;
import Business.Problem.ProblemHistory;
import Business.Role.Role;
import Business.ScheduleRequest.ScheduleRequestQueue;

/**
 *
 * @author raunak
 */
public class UserAccount {

    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private ProblemHistory problemHis;
    private ScheduleRequestQueue scheduleRequestQueue;
    private Application application;
    private int total;
    private int helpful;

    public UserAccount() {
        problemHis = new ProblemHistory();
        scheduleRequestQueue = new ScheduleRequestQueue();
        total = 0;
        helpful = 0;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public ProblemHistory getProblemHis() {
        return problemHis;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public ScheduleRequestQueue getScheduleRequestQueue() {
        return scheduleRequestQueue;
    }

    public void setScheduleRequestQueue(ScheduleRequestQueue scheduleRequestQueue) {
        this.scheduleRequestQueue = scheduleRequestQueue;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getHelpful() {
        return helpful;
    }

    public void setHelpful(int helpful) {
        this.helpful = helpful;
    }

    @Override
    public String toString() {
        return employee.getName();
    }
}
