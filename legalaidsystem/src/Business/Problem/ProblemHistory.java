/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Problem;

import java.util.ArrayList;

/**
 *
 * @author keert
 */
public class ProblemHistory {

    private ArrayList<Problem> problemList;

    public ProblemHistory() {
        problemList = new ArrayList();
    }

    public ArrayList<Problem> getProblemList() {
        return problemList;
    }
}
