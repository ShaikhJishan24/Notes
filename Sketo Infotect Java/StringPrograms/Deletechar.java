package StringPrograms;

public class Deletechar {

    public static void main(String[] args) {
        
        String src = "welcome to my youtube channel" ;
        System.out.println("String before removing character : " + src);

        int pos = 11;

        String newsrc = src.substring(0, pos) + src.substring(pos + 1);

        System.out.println("String After removing character : " + newsrc);

    }
    
}
