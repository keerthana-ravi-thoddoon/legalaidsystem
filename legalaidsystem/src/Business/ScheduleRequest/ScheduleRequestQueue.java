/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ScheduleRequest;

import java.util.ArrayList;

/**
 *
 * @author keert
 */
public class ScheduleRequestQueue {
    private ArrayList<ScheduleRequest> scheduleRequestList;

    public ScheduleRequestQueue() {
        scheduleRequestList = new ArrayList();
    }

    public ArrayList<ScheduleRequest> getScheduleRequestList() {
        return scheduleRequestList;
    }
    
}
