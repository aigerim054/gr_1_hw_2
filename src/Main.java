import java.util.Random;
public class Main {
    public static void main(String[] ags) {
        System.out.println(goWalk(35, 18));
        System.out.println(goWalk(26, -10));
        System.out.println(goWalk(16, 6));
        System.out.println( goWalk(38, -2));
        System.out.println( goWalk(generateRandomAge(), 19));

    }
    public static int generateRandomAge(){
        Random random = new Random();
        int first = 1;
        int last = 100;
        int result = random.nextInt(last-first) + first;
        return result;
    }
      public static String goWalk (int ageOfPeople, int temperature){

      if (ageOfPeople < 45 && ageOfPeople > 20
              && temperature > -20 && temperature < 30){
          return "Можно идти гулять";
      }
      else if (ageOfPeople < 20
        && temperature < 28 && temperature > 0){
          return "Можно идти гулять";
    }
      else if (ageOfPeople > 45 && temperature < 25
              && temperature > -10) {
       return "Можно ии  гулять";}
            else return "Оставайтесь дома";
}}
