package com.RMIMigration;

import java.util.List;

public class Check {
    public static void main(String[] args) {
        List<List<Object>> data = List.of(
                List.of("UHN2OITsaikiRC01", "Bundle-Ether510", List.of(
                        List.of("name", "TwentyFiveGigE0/0/0/38"),
                        List.of("name", "TwentyFiveGigE0/0/0/39")
                )),
                List.of("UHN2OITsaikiRC01", "Bundle-Ether100", List.of(
                        List.of("name", "TwentyFiveGigE0/0/2/3/1"),
                        List.of("name", "TwentyFiveGigE0/0/2/3/0")
                ))
        );

        for (List<Object> item : data) {
            String deviceName = (String) item.get(0);
            String bundleName = (String) item.get(1);
            List<List<Object>> interfaces = (List<List<Object>>) item.get(2);

            System.out.println("Device: " + deviceName + ", Bundle: " + bundleName);

            for (List<Object> interfaceData : interfaces) {
                String interfaceName = (String) interfaceData.get(1);
                System.out.println("  Interface: " + interfaceName);
            }
        }
    }
}
