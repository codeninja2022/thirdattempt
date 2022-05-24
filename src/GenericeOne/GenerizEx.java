package GenericeOne;

public class GenerizEx <T,U>{
    T OBJ1;
    U OBJ2;
    GenerizEx(T OBJ1,U OBJ2)
    {
        this.OBJ1=OBJ1;
        this.OBJ2=OBJ2;

    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String args[])
    {
        //GenerizEx<Integer,String> GE1=new GenerizEx<>(10,"hello");
//System.out.println(GE1.getGen());
        GenerizEx<Integer,String> GE2=new GenerizEx<>(20,"hey");
//GE2.getGen();
    }
}
