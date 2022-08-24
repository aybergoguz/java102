public class Player {

    public String name;
    public int id;
    public static String game = "CS";

    public Player(String name , int id){

        this.name=name;
        this.id=id;
    }

    public static void showName(){
        Player player2 = new Player("a", 2);
        System.out.println(player2.name);
    }
}