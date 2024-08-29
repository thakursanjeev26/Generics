public class FindMaximum {

    public static Integer findMax(Integer a,Integer b,Integer c){

        Integer max = a;

        if(b.compareTo(max)>0){
            max=b;
        }

        if(c.compareTo(max)>0){
            max=c;
        }

        return max;

    }

    public static Float findMax(Float a,Float b,Float c){

        Float max = a;

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


    }
}
