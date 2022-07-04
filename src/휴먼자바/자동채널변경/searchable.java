package 휴먼자바.자동채널변경;

interface searchable {

    int[] channel = {10, 20, 25, 120};

<<<<<<< HEAD


=======
>>>>>>> github/master
    static int change(int x){
        int k=0;
        for(int i=0; i<channel.length; i++){
            if(Math.abs(k-x)>Math.abs(channel[i]-x)){
                k=channel[i];
            }
        }
        return k;
    }

}
