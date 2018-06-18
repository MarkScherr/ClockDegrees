/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.clockdegrees;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author mrsch
 */
public class App {
    public static void main(String[] args) {


            LocalDateTime time = LocalDateTime.of(2018, Month.MARCH, 1, 6, 0);
            double  minute = time.getMinute();
            double hour = time.getHour();
            System.out.println(hour + " " + minute);
            double hourDegree= 0;
            double minuteDegree = 0;
            
             minuteDegree = minute*6;
             hourDegree = hour * 30.0 + ((minuteDegree)/360.0);
             
             double degreesBetween = Math.abs(hourDegree-minuteDegree);
             
             System.out.println(degreesBetween);
            
            
            
            
            
    }

    
    
}
