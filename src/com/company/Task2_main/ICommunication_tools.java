package com.company.Task2_main;

/**
 * Created by Nick on 28.01.2016.
 */
public interface ICommunication_tools {

    Connection makeConnection(Communication_tools toolSender, Communication_tools toolReceiver, String Password);
    boolean changeOwner (Communication_tools tool, Human owner, String oldPassword);
    boolean changePassword (Communication_tools tool, String oldPassword, String newPassword);

    //смари, сделал интерфейс, в нем три метода
}
