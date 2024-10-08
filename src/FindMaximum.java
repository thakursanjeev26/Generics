public class FindMaximum {

    public static <T extends Comparable<T>>T findMax(T a,T b,T c){
        T max = a;

        if(b.compareTo(max)>0){
            max=b;
        }

        if(c.compareTo(max)>0){
            max=c;
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println("Welcome To Generics");

        Integer a1=10,b1=20,c1=30;

        System.out.println("Maximum_Of_3_Integers: "+findMax(a1,b1,c1));

        Float x1=10.5f,y1=20.8f,z1=30.2f;

        System.out.println("Maximum_Of_3_Float: "+findMax(x1,y1,z1));

        String s1="Apple",s2="Banana",s3="Peach";

        System.out.println("Maximum_Of_3_Strings: "+findMax(s1,s2,s3));


    }
}
