/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Schedule;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author keert
 */
public class DailySchedule {
    private Date date;
    private ArrayList<TimeSlot> timeSlotList;
    
    public DailySchedule(Date date) {
        this.date = date;
        timeSlotList = new ArrayList<TimeSlot>();
        timeSlotList.add(new TimeSlot(" 8am- 9am"));
        timeSlotList.add(new TimeSlot(" 9am-10am"));
        timeSlotList.add(new TimeSlot("10am-11am"));
        timeSlotList.add(new TimeSlot("11am-12pm"));
        timeSlotList.add(new TimeSlot(" 2pm- 3pm"));
        timeSlotList.add(new TimeSlot(" 3pm- 4pm"));
        timeSlotList.add(new TimeSlot(" 4pm- 5pm"));
        timeSlotList.add(new TimeSlot(" 5pm- 6pm"));
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<TimeSlot> getTimeSlotList() {
        return timeSlotList;
    }

    public void setTimeSlotList(ArrayList<TimeSlot> timeSlotList) {
        this.timeSlotList = timeSlotList;
    }
    
    @Override
    public String toString() {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = fmt.format(date);
        return strDate;
    }
}
