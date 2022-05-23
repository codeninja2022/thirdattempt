package GenericeOne;

public class Genericz <T>{
    T obj;
    Genericz(T obj){
        this.obj=obj;

    }
    public T getObj()
    {
        return this.obj;

    }
    public static void main(String args[])
    {
        Genericz<Integer> GI=new Genericz(20);
        System.out.println(GI.getObj());
        Genericz<String> GI1= new Genericz<String>("hello");
        System.out.println(GI1.getObj());
    }

}
