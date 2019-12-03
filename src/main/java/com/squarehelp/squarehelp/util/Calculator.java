package com.squarehelp.squarehelp.util;

import com.squarehelp.squarehelp.models.User;
import com.squarehelp.squarehelp.models.Verification;
import com.squarehelp.squarehelp.repositories.UserRepository;

import java.util.Date;

/*
 * Calculator class is used to compute calculations throughout the site.
 */
public class Calculator {


    public static int calcMoneySaved(int cigCost, int totSmokeFree) {
        return (cigCost * totSmokeFree);
    }

    public static int relapseCheck(Date relapseDate, int days){
        if(relapseDate != null){
            int reset = 0;
            return reset;
        }else {
            return days;
        }
    }


    public static int userPointsCalculator(int day, int uPoints){
        int dailyPoints = 1;

        if(day != 0){
            int out = dailyPoints * day;

            return out;
        }else {
           int roundPoints = Math.round((uPoints / 2));

            return roundPoints;
        }
    }


    public static int avgPointsCalculator(int totalPoints, int totalUsers) {
        double d1 = totalPoints;
        double d2 = totalUsers;

        if (d1 != 0 & d2 != 0) {
            int out = (int) Math.round(d1 / d2);

            return out;
        } else {
            return totalPoints;
        }
    }

    public static void veriApproval(Boolean isApproved, Boolean isPending, UserRepository userDao, Long id, String veriDateCreated, int uPoints){
        int dailyPoints = 1;
        int roundPoints = Math.round((uPoints / 2));

//        if(veriApprove == true ){
//            return;
//        }
        //     if the request is not pending and was not approved, run this...
        if(isPending != true && isApproved == false){
            User user = userDao.findUserById(id);
            user.getSmokerInfo().setDay_quit_smoking(veriDateCreated);
            user.getSmokerInfo().setPoints(roundPoints);
            userDao.save(user);
        }
    }

}