public class Local {
    
    public void run(){

        class Yerel{

            private int a;
            public Yerel(int a){
                this.a = a;
            }
            public int getA() {
                return a;
            }
            public void setA(int a) {
                this.a = a;
            }
        }

        Yerel yerel =new Yerel(15);
        yerel.setA( yerel.getA()+1);

        System.out.println("local sinif calisti.");
        System.out.println(yerel.getA());

    }
    
}
