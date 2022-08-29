public class IcIceStatic {
  public static int b=1;  
    
    public static class OnundaIcindeki{
        public static int b=10;
        public static void run(){
            int b =5;
            System.out.println(b);
            System.out.println(OnundaIcindeki.b);
            System.out.println(IcIceStatic.b);
            
        }

    }
    public void run(){

        OnundaIcindeki.run();
    }
}
