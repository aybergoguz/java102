public class Main{

    public static void main(String[] args) {
  
        Player player1 =new Player("Muhittin", 1);

        System.out.println(player1.name);
        System.out.println(player1.game);
        System.out.println(Player.game);
        System.out.println();
        Player.showName();

        Course mat = new Course("Matematik", "101", 70);
        Course kim = new Course("Kimya", "102", 80);
        Course fiz =new Course("Fizik", "103", 90);

        Course [] dersler ={mat,fiz,kim};
        Calculate.calculateAvarage(dersler);
        Calculate.dersIsimleriniYazdir(dersler);
    
    }
}