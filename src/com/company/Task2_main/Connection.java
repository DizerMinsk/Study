package com.company.Task2_main;

import java.util.Date;

/**
 * Created by Nick on 03.02.2016.
 */
public class Connection {

    Date startDate;
    Date endDate;
    boolean isSent;
    boolean isRead;
    Communication_tools toolSender;
    Communication_tools toolReceiver;

    Connection (Date startDate, Communication_tools toolSender, Communication_tools toolReceiver)
    {
        this.startDate = startDate;
        this.toolSender = toolSender;
        this.toolReceiver = toolReceiver;
    }

    Connection()
    {}


    @Override
    public String toString() {
        return "Call from: "+toolSender.owner.getName()+" "+toolSender.owner.getSurName()+" to " +
                toolReceiver.owner.getName()+" "+toolReceiver.owner.getSurName()+" Duration="+(endDate.getTime()-startDate.getTime());
    }
}
