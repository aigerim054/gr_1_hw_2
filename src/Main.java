import java.util.Random;
public class Main {
    public static void main(String[] args) {
        goWalk(35,18);
        goWalk(26, -10);
        goWalk(16,6);
        goWalk(38,-2);
        goWalk(generateRandomAge(),19);

    }
    public static int generateRandomAge(){
        Random random = new Random();
        int first = 1;
        int last = 100;
        int result = random.nextInt(last-first) + first;
        return result;
    }
      public static void goWalk (int ageOfPeople, int temperature){

      if (ageOfPeople < 45 && ageOfPeople > 20
              && temperature > -20 && temperature < 30){
          System.out.println("Можно идти гулять");
      }
      else if (ageOfPeople < 20
        && temperature < 28 && temperature > 0){
          System.out.println("Можно идти гулять");
    }
      else if (ageOfPeople > 45 && temperature < 25
              && temperature > -10) {
        System.out.println("Можно ии  гулять");}
            else System.out.println("Оставайтесь дома");
}}
