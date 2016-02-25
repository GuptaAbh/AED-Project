/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ExtendedClasses;

import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Abhishek
 */
public class WorkRequestHistory {
    
    private Date AssignedDate;
    private Date conpletedDate;
    private int timeDuration;
    private UserAccount receiver;
    private Organization receiverOrganization;
    private String comment;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    

    public Date getAssignedDate() {
        return AssignedDate;
    }

    public void setAssignedDate(Date AssignedDate) {
        this.AssignedDate = AssignedDate;
    }

    public Date getConpletedDate() {
        return conpletedDate;
    }

    public void setConpletedDate(Date conpletedDate) {
        this.conpletedDate = conpletedDate;
    }

    public int getTimeDuration() {
        return timeDuration;
    }

    public void setTimeDuration(int timeDuration) {
        this.timeDuration = timeDuration;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public Organization getReceiverOrganization() {
        return receiverOrganization;
    }

    public void setReceiverOrganization(Organization receiverOrganization) {
        this.receiverOrganization = receiverOrganization;
    }
    
    
    
    
    
    
    
    
}
