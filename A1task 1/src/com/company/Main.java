package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i= 0;
        Scanner sc= new Scanner(System.in);
        System.out.println("1- Ipv4 to decimal");
        System.out.println("2- Decimal to IpV4");
        i = sc.nextInt();
        sc.nextLine();

        switch (i) {
            case 1:  System.out.print("Enter an IpV4: ");
                String ipv4= sc.nextLine();
                sc.nextLine();
                System.out.println("IpV4 in decimal: "+ipv4ToLong(ipv4));
                break;
            case 2: System.out.print("Enter a decimal IpV4: ");
                Long decimal= sc.nextLong();
                sc.nextLine();
                System.out.print("decimal in IpV4: "+longToIp(decimal));
                break;
        }
    }

    public static long ipv4ToLong(String ipAddress) {

        String[] ipAddressInArray = ipAddress.split("\\.");

        long result = 0;
        for (int i = 0; i < ipAddressInArray.length; i++) {

            int power = 3 - i;
            int ip = Integer.parseInt(ipAddressInArray[i]);
            result += ip * Math.pow(256, power);

        }

        return result;
    }

    public static String longToIp(long ip) {
        StringBuilder result = new StringBuilder(15);

        for (int i = 0; i < 4; i++) {

            result.insert(0,Long.toString(ip & 0xff));

            if (i < 3) {
                result.insert(0,'.');
            }

            ip = ip >> 8;
        }
        return result.toString();
    }
}


