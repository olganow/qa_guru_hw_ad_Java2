package ru.ya.olganow;

import ru.ya.olganow.Map.Contact;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Phone {
    int price;
    String phoneName;
    boolean isAndroidPhone;
    String[] supportedOSVersion;

    List<String> supportedOfColours;
    Set<String> supportedOfSizes;

    Map<String, Contact> addressBook;

    public Phone(int price, String phoneName, boolean isAndroidPhone) {
        this.price = price;
        this.phoneName = phoneName;
        this.isAndroidPhone = isAndroidPhone;
    }

    public Phone() {
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public void setAndroidPhone(boolean androidPhone) {
        isAndroidPhone = androidPhone;
    }

    public String getPhoneName(){
        return phoneName;
    }

    public void setSupportedOSVersion(String[] supportedOSVersion) {
        this.supportedOSVersion = supportedOSVersion;
    }

    public void setSupportedOfColours(List<String> supportedOfColours) {
        this.supportedOfColours = supportedOfColours;
    }

    public void setSupportedOfSizes(Set<String> supportedOfSizes) {
        this.supportedOfSizes = supportedOfSizes;
    }

    public void setAddressBook(Map<String, Contact> addressBook) {
        this.addressBook = addressBook;
    }
}
