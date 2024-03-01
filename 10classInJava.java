public class classInJava{
    public static void main(String[] args) {
        rectangle a=new  rectangle();
        a.setData(10, 20);
        System.out.println(a.getArea());
    }
}

class rectangle{
    double a,b;
    void setData(int a, int b){
        this.a=a;
        this.b=b;
    }
    double getArea(){
        double area=a*b;
        return area;
    }
}