package 패턴공부.스트라티지패턴;

interface startegy {
    public void search ();
}

class searchall implements startegy{
    public void search (){
        System.out.println("search all");
    }
}
class searchimage implements startegy{
    public void search (){
        System.out.println("search image");
    }
}
class searchnews implements startegy{
    public void search (){
        System.out.println("search news");
    }
}
class searchmap implements startegy{
    public void search (){
        System.out.println("search map");
    }
}
