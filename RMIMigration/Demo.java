package com.RMIMigration;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        /* *//*      List<List<Object>> data = List.of(
                List.of("UHN2OITsaikiRC01", "Bundle-Ether510", List.of(
                        List.of("name", "TwentyFiveGigE0/0/0/38"),
                        List.of("name", "TwentyFiveGigE0/0/0/39")
                )),
                List.of("UHN2OITsaikiRC01", "Bundle-Ether100", List.of(
                        List.of("name", "TwentyFiveGigE0/0/2/3/1"),
                        List.of("name", "TwentyFiveGigE0/0/2/3/0")
                ))
        );*//*


         *//* String data = "[UHN2OITsaikiRC01, Bundle-Ether510, [{name: TwentyFiveGigE0/0/0/38}, {name: TwentyFiveGigE0/0/0/39}]], " +
                "[UHN2OITsaikiRC01, Bundle-Ether100, [{name: TwentyFiveGigE0/0/2/3/1}, {name: TwentyFiveGigE0/0/2/3/0}]]";

        String[] splitstring = data.split(", ");

        for(int i =0 ; i<splitstring.length ; i++){
            System.out.println(splitstring[i]);
        }*//*

        List<String> dataList = Arrays.asList(
                "[UHN2OITsaikiRC01, Bundle-Ether510, [{name: TwentyFiveGigE0/0/0/38}, {name: TwentyFiveGigE0/0/0/39}]]",
                "[UHN2OITsaikiRC01, Bundle-Ether100, [{name: TwentyFiveGigE0/0/2/3/1}, {name: TwentyFiveGigE0/0/2/3/0}]]"
        );

        for(int i =0 ; i<dataList.size() ; i++){
            System.out.println("List : "+dataList.get(i));
            List<String> router =Arrays.asList(dataList.get(i));
            for(int j =0 ; j<router.size(); j++){
                System.out.println("Data: "+router.get(0));
            }
        }

List<String> d= Arrays.asList("[UHN2OITsaikiRC01, Bundle-Ether100, [{name: TwentyFiveGigE0/0/2/3/1}, {name: TwentyFiveGigE0/0/2/3/0}]]");
     for(int i = 0 ; i<d.size() ; i++){
         System.out.println(d[i]);
     }
}
*/


    }}