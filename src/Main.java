public class Main{
    public static void main(String[] args){
        Circle[] circles = new Circle[3];
        circles[0]=new Circle(5.0);
        circles[1]=new Circle(7.0);
        circles[2]=new Circle(6.0);

        for(Circle c:circles){
            c.resize(Math.random()*100);
        }
        for (Circle c:circles){
            System.out.println(c);
        }
    }
}