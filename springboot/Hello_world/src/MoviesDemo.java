import java.util.ArrayList;

public class MoviesDemo {
    public static void main(String[] args) {
   Movie movie1 = new Movie("Hum Saath Saath Hain" , "Sooraj Barjhtya",1998,4.5);
        Movie movie2 = new Movie("Hum Aapke Hain Kaun" , "Sooraj Barjhtya",1998,4.8);
        Movie movie3 = new Movie("Dilwale Dulhaniyan le Jaayenge" , "Karan Johar",2001,3.5);
        Movie movie4 = new Movie("Kuch Kuch Hota Hai" , "Karan Johar",2000,4.0);
        System.out.println("Movie name : "+ movie1.getTitle());
        ArrayList<String> list = new ArrayList<>();
        list.add("Bhoolbhulayia");
        list.add("Luka Chuppi");
        list.add("Pyaar ka punchnaama");
        Actor actor1 = new Actor("Kartik Aryan", 1989,"Indian" ,list);
        Actor actor2 = new Actor("Rohit Saraf", 1996,"Indian" ,list);
        Actor actor3 = new Actor("Prajakta Koli", 1995,"Indian",list);
        Actor actor4 = new Actor("Amir Khan", 1979,"Indian", list);






    }
}


