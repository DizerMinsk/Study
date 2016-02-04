package com.company.Task2_from_chapters;

/**
 * Created by Nick on 26.01.2016.
 */
public interface Main_interface {

    //boolean wash (int weight, Washpowder washpowder);

    //boolean clean_up (Room room);

    //boolean cook(Food food);

    //boolean change_the_bulb (Bulb bulb, Room room);

    boolean wash (int weight, String washpowder);

    boolean clean_up (String room);

    boolean cook(String food);

    boolean change_the_bulb (String bulb, String room);


    //закоментировал код, который правильней:) для дел по дому надо передавать объекты, но не очень хочется плодить пустые классы в пакете


}
