package Day1;

class Computer {
    public void playMusic(){
        System.out.println("Music Playing");
    }
    public String getMeAPen(int cost){
       if(cost >= 10)
       return "pen";
       else 
       return "Nothing";
    }
}

public class Method {

    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(10);
        System.out.println(str);
    }
}