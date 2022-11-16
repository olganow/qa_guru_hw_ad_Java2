package ru.ya.olganow.Array;


public class ApartmentExample {

    public static void main(String[] args){

        Apartmemt cherry = new Apartmemt(100, "GreenMoon", true, 21, 1,5);
        cherry.setFinishes(new String[]{"Rough finish", "Decoration", "Decoration and furniture"});

        Apartmemt blueberry  = new Apartmemt(100, "GreenMoon", false, 121, 2,5);
        blueberry.setFinishes(new String[]{"Rough finish", "Decoration and furniture"});

         System.out.println("Cherry option for finishes  " + cherry.finishes.length);
        for (int i = 0; i < cherry.finishes.length; i++) {
            System.out.println("Cherry options of finishes : " + cherry.finishes[i]);
        }

        System.out.println("Blubery option for finishes  " + blueberry.finishes.length);
        for(String finishes : blueberry.finishes){
            System.out.println("Bluberry options of finishes : " + finishes);
        }

    }

}
