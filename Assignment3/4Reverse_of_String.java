public class Reverse_of_String {
    public static String reverse(String str){
        if(str.isEmpty()){
            return str;
        }
        return str.charAt(str.length()-1)+reverse(str.substring(0,str.length()-1));
    }
    public static void main(String[] args) {
        String str="abcd";
        System.out.println(reverse(str));
    }
}
