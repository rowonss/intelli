package 휴먼자바.무기교체;

public class punch extends attack{

    public punch(){
        this.name = "펀치";
        this.attpoint = 5;
        System.out.println(this.name+"을(를) 장착하였습니다!");
    }

    @Override
    public void attack (){
        System.out.println(this.name+"로(으로) 공격");
    }
}
