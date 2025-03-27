package com.obinna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import oshi.SystemInfo;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class); // Use org.slf4j.Logger
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Welcome to MySysInfo, the System Information App.");
        logger.info("Initializing System...");
        printSysInfo();
        printSysInfo2();
        logger.info("System info...completed.");
    }

    private static void printSysInfo() {
        System.out.println("Printing System Information...");
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        String osArch = System.getProperty("os.arch");
        String javaVersion = System.getProperty("java.version");
        String javaVendor = System.getProperty("java.vendor");

        System.out.println("Operating System Information:");
        System.out.println("OS Name: " + osName);
        System.out.println("Version: " + osVersion);
        System.out.println("Architecture: " + osArch);
        System.out.println("Java Information:");
        System.out.println("Version: " + javaVersion);
        System.out.println("Vendor: " + javaVendor);
    }

    private static void printSysInfo2() {
        System.out.println("Printing OSHI-obtained System Information...");
        SystemInfo si = new SystemInfo();
        System.out.println("Operating System Information:");
        System.out.println("Name: " + si.getOperatingSystem().getFamily());
        System.out.println("Manufacturer: " + si.getOperatingSystem().getManufacturer());
        System.out.println("Architecture: " + si.getOperatingSystem().getBitness() + " bits");
        System.out.println("Hardware Information:");
        System.out.println("Processor cores: " + si.getHardware().getProcessor().getLogicalProcessorCount());
        System.out.println("Memory: " + si.getHardware().getMemory().getTotal() + " bytes");
    }
}

