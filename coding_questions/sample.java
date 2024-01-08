package coding_questions;

public class sample {
    
    public static void main(String[] args) {
    String s = "abcdef";
    // ab,bc,cd

    char ch =s.charAt(0);

    char k = ',';

    String newStr = ch + "";

    for(int i=1;i<s.length()-1;i++){
        char c = s.charAt(i);

        newStr = newStr + c + k +c;
        
    }

    System.out.println(newStr+s.charAt(s.length()-1));

    }
    

    



    




    

}
