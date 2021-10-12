package com.logical;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter date format (dd mm yyyy)");

		int dd=sc.nextInt();
        int mm=sc.nextInt();
        int yyyy=sc.nextInt();

        int yy=yyyy-1;
        int days=dd;

        days=days+yy*365;

        days=days+(yy/400+yy/4-yy/100);

        int months[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};

		if(yyyy%400==0||yyyy%4==0&&yyyy%100!=0)
    {
        months[2]=29;
    }

		for (int i = 0; i < mm; i++)
    {
        days=days+months[i];

    }

    String dname[]= {"0","1","2","3","4","5","6"};

		System.out.println(dname[days%7]);

}

}
