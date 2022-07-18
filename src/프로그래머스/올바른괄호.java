package 프로그래머스;

public class 올바른괄호 {
    public static void main(String[] args) {
        String a = "()()";
        answer(a);
    }

    public static boolean answer(String s){

        int count = 0;

        for(int i=0; i<s.length(); i++){
            String zxc = String.valueOf(s.charAt(i));
            if(zxc.equals("(")){
                count += 1;
            }
            else if(zxc.equals(")")){
                if(count != 0){
                    count -=1;
                } else {
                    return false;
                }
            }
        }
        if(count != 0){
            return false;
        }

        return true;
    }
}
