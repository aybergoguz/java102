public class Main{

    public static void main(String[] args) {
        
        Out out =new Out();
        out.run();
        System.out.println("-----------");
        Out.In in = out.new In();
        in.run();
        System.out.println("-----------");

        IcIceStatic.OnundaIcindeki.run();

        System.out.println("-----------");

        Local local = new Local();
        local.run();

        System.out.println("-----------");

        Anomymus anomymus = new Anomymus(){

            //public int a =20;

            @Override
            public void run(){
                System.out.println("Anonim olarak yazilmis run metodu.");
                System.out.println(this.a);
                print();
            }

            public void print(){

                System.out.println("print netodu");
            }

            
        };
        anomymus.run();
        //anomymus.print(); olmaz
    }
}

