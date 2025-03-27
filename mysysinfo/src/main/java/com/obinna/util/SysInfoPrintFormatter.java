package com.obinna.util;

public class SysInfoPrintFormatter {
    public static void printSysInfo(String osName, String osVersion, String osArch, String javaVersion, String javaVendor) {
        System.out.println("Operating System Information:");
        System.out.println("Name: " + osName);
        System.out.println("Version: " + osVersion);
        System.out.println("Architecture: " + osArch);
        System.out.println("Java Information:");
        System.out.println("Version: " + javaVersion);
        System.out.println("Vendor: " + javaVendor);
    }
}
