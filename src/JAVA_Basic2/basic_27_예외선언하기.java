package JAVA_Basic2;

import java.io.*;

public class basic_27_예외선언하기 {
    public static void main(String[] args) {
        try {
            File f = createFile("asd.txt");
            System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다");
        } catch (Exception e) {
            System.out.println(e.getMessage() + " 다시 입력해 주시기 바랍니다");
        }
    }

    static File createFile(String filename) throws Exception {
        if (filename == null || filename.equals("")){
            throw new Exception("파일이름이 유효하지 않습니다");
        }
        File f = new File(filename);
        f.createNewFile();
        return f;
    }
}
