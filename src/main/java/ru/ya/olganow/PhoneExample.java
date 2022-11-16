package ru.ya.olganow;

import ru.ya.olganow.Map.Contact;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PhoneExample {
    public static void main(String[] args){
        Phone samsung = new Phone(900, "samsung", true);
        samsung.setSupportedOSVersion(new String[]{"12", "13"});

        Phone iPhone = new Phone(1900, "Iphone", false);
        iPhone.setSupportedOSVersion(new String[]{"14", "15","17"});



    //    System.out.println("Supported OS count: " + iPhone.supportedOSVersion.length);
        for (int i = 0; i < iPhone.supportedOSVersion.length; i++) {
            System.out.println("1OS  version : " + iPhone.supportedOSVersion[i]);
        }


        for(String osVersion : iPhone.supportedOSVersion){
            System.out.println("2OS  version : " + osVersion);
        }

        int arrIndex = 0;
        while (arrIndex < iPhone.supportedOSVersion.length){
            System.out.println("3OS  version : " + iPhone.supportedOSVersion[arrIndex]);
            arrIndex++;
        }


        iPhone.setSupportedOfColours(List.of("White","Black", "Yellow"));
        iPhone.setSupportedOfSizes(Set.of("100","200","300"));
        iPhone.setAddressBook(Map.of(
                "Dima", new Contact("8-800-555-35-35"),
                "Vas", new Contact("8-800-555-36-75")
        ));

        System.out.println("Supported OS count: " + iPhone.supportedOfColours.size());
        for (int i = 0; i < iPhone.supportedOfColours.size(); i++) {
            System.out.println("3OS  version : " + iPhone.supportedOfColours.get(i));
        }

        for(String colours : iPhone.supportedOfColours){
            System.out.println("4OS  version : " + colours);
        }

        for(String size : iPhone.supportedOfSizes){
            System.out.println("5OS  version : " +  size);
        }



//        do{
//
//          System.out.println("");
//         }
//        while (false);{
//            System.out.println("3OS  version : " + iPhone.supportedOSVersion[arrIndex]);
//            arrIndex++;
//        }


        Phone sony = new Phone();
        sony.setPhoneName("Sony XPEDIA");
        sony.setPrice(880);
        sony.setAndroidPhone(true);

//
//        System.out.println(samsung.getPhoneName());
//        System.out.println(iPhone.getPhoneName());


        Set<String> keySet = iPhone.addressBook.keySet();
        Collection<Contact> values = iPhone.addressBook.values();
        Set<Map.Entry <String, Contact>> entries = iPhone.addressBook.entrySet();
        for (Map.Entry <String, Contact> entry :entries){
            if (entry.getKey().equals("Dima")){
                System.out.println("Димин контакт:" +  entry.getValue().toString());
            }
        }

    }
}
