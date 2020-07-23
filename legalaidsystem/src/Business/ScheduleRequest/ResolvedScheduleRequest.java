/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ScheduleRequest;

/**
 *
 * @author keert
 */
public class ResolvedScheduleRequest extends ScheduleRequest{
    private String feedback;

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
   
}
