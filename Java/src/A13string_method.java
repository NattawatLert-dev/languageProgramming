public class A13string_method {
    public static void main(String[] args) {

        String name = "Nattawat";
        String name1 = "    Nattwat      ";

        System.out.println("##################");
        int length = name.length();
        System.out.println("length of string : " + length); // 8

        char letter = name.charAt(0);
        System.out.println(letter); // N

        int index = name.indexOf("t");
        System.out.println(index); // 2

        int lastIndex = name.lastIndexOf("t");
        System.out.println(lastIndex); // 7

        name = name.toUpperCase();
        System.out.println(name); // NATTAWAt

        name = name.toLowerCase();
        System.out.println(name); // nattawat

        name1 = name1.trim();
        System.out.println(name1); // Nattawat

        name = name.replace("a", "o");
        System.out.println(name); // Nottowot

        if(name.isEmpty()){
            System.out.println("Your name i empty");
        }else{
            System.out.println("Hello " + name);
        }

        if(name.contains(" ")){
            System.out.println("Your name contains a space");
        }else{
            System.out.println("YOur name DOESN'T contain any spaces");
        }

        if(name.equals("password")){ // equalsIgnoreCase ไม่สนใจ พิมพ์ เล็ก พิมพ์ใหญ่
            System.out.println("Your name cant't be password");
        }else{
            System.out.println("Hello " + name);
        }




    }
}
