package com.logical;


public class CouponNumber {
    public static void main(String[] args) {

        //char array to get characters for coupon
        char[] chars = "abcdefghijklmnop135654535".toCharArray();

         //length of coupen
        int max = 100000000;

         //random value
        int random = (int)(Math.random()*max);
        StringBuffer sb = new StringBuffer();

        while (random > 0) {
            sb.append(chars[random % chars.length]);
            random /= chars.length;

        }

        String couponCode = sb.toString();
        System.out.println("Coupon Code: " + couponCode);
    }
}
