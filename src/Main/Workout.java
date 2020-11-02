package Main;

public class Workout {

    public static void main(String[] args) {


        System.out.println(StrReverse("dd"));
        System.out.println(StrReverse("dghhhh"));
        System.out.println(StrReverse("dffffffghhhh"));





    }


    public static String StrReverse(String str) {

        String reverse="";

        for(int i=str.length()-1; i >= 0; i--)

            reverse += str.toCharArray()[i];



        return  reverse;

    }

}



