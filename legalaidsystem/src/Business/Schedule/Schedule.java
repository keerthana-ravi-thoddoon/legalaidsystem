/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Schedule;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author keert
 */
public class Schedule {
    private ArrayList<DailySchedule> dailyScheduleList;
    
    public Schedule() {
        dailyScheduleList = new ArrayList<DailySchedule>();
    }

    public ArrayList<DailySchedule> getDailyScheduleList() {
        return dailyScheduleList;
    }

    public void setDailyScheduleList(ArrayList<DailySchedule> dailyScheduleList) {
        this.dailyScheduleList = dailyScheduleList;
    }
    
    public DailySchedule createDailySchedule(Date date){
        DailySchedule ds = new DailySchedule(date);
        dailyScheduleList.add(ds);
        return ds;
    }
    
}
