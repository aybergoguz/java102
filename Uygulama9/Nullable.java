public class Nullable <T extends Number>{

    private final T value;

    public T getValue() {
        return value;
    }

    public Nullable(T value) {
        this.value = value;
    }

    public boolean isNull(){
        return this.getValue() == null;
    }

    public void run(){

        if(isNull()) {
            System.out.println("Bu desiken 'null' dur.");
        }else{
            System.out.println(this.getValue());
        }
    }
    
}
