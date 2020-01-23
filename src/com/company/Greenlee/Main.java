package com.company.Greenlee;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner String = new Scanner(System.in);

        String month = String.nextLine();

        switch (month) {
            case "January":
                System.out.println("Your sign is possibly Capricorn or Sagittarius");
                break;
            case "February":
                System.out.println("Your sign is possibly Capricorn or Aquarius");
                break;
            case "March":
                System.out.println("Your sign is possibly Aquarius or Pisces.");
                break;
            case "April":
                System.out.println("Your sign is possibly Pisces or Aries.");
                break;
            case "May":
                System.out.println("Your sign is possibly Aries or Taurus.");
                break;
            case "June":
                System.out.println("Your sign is possibly Taurus or Gemini.");
                break;
            case "July":
                System.out.println("Your sign is possibly Gemini or Cancer.");
                break;
            case "August":
                System.out.println("Your sign is possibly Cancer or Leo.");
                break;
            case "September":
                System.out.println("Your sign is possibly Leo or Virgo.");
                break;
            case "October":
                System.out.println("Your sign is possibly Virgo or Libra.");
                break;
            case "November":
                System.out.println("Your sign is possibly Libra or Scorpio or Ophiuchus.");
                break;
            case "December":
                System.out.println("Your sign is possibly Ophiuchus or Sagittarius.");
                break;
            default:
                System.out.println("null.");
        }
    }
}
