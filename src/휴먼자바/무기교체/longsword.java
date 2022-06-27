package 휴먼자바.무기교체;

public class longsword extends attack{

    public longsword(){
        this.name = "롱소드";
        this.attpoint = 5;
        System.out.println(this.name+"을(를) 장착하였습니다!");
    }

    @Override
    public void attack (){
        System.out.println(this.name+"로(으로) 공격");
    }
}
