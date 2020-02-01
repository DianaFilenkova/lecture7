package lv.diana.learnstring;

public class TestStringClass {
    public static void main(String[] args) {
        String str = "    In d  ex    ";
        String strClass = new String("Index parm");

        System.out.println(str);

        System.out.println("String like obj "+strClass);

        int stringLength = str.length();

        System.out.println(stringLength);

        System.out.println(str.charAt(4));


        System.out.println(str.toLowerCase());


        System.out.println(str.toUpperCase());


        System.out.println(str.trim());

        System.out.println(str.replace(" ", ""));

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "NotHello";






        System.out.println(s1 == s2);
        System.out.println(s1 == s1);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(!s1.equals(s2));
        System.out.println(!s2.equals(s3));


        String strObje = "star";
        String checkObje = "start";

        if(strObje.equals(checkObje)){
            System.out.println("Race start");
        }else{
            System.out.println("Not start");
        }
    }

}

