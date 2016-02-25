package Business.ExtendedClasses;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhishek
 */
public class WorkRequestHistoryDir {
    
    private ArrayList<WorkRequestHistory> workRequestHisList;

    public WorkRequestHistoryDir() {
        
        workRequestHisList = new ArrayList<>();
    }
    
    public WorkRequestHistory addHistory()
    {
        WorkRequestHistory wrh = new WorkRequestHistory();
        workRequestHisList.add(wrh);
        return wrh;
    }

    public ArrayList<WorkRequestHistory> getWorkRequestHisList() {
        return workRequestHisList;
    }

    public void setWorkRequestHisList(ArrayList<WorkRequestHistory> workRequestHisList) {
        this.workRequestHisList = workRequestHisList;
    }
    
    
    
    
    
}
