package week9;
public class a2 {
    // 成员变量
    double radius;

    // 无参构造方法
    public a2() {
        radius = 1;
    }

    // 带参数的构造方法
    public a2(double newRadius) {
        radius = newRadius;
    }

    // 获取圆的面积
    public double getArea() {
        return radius * radius * Math.PI;
    }


    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // 设置半径
    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    // 主方法
    public static void main(String[] args) {
        a2 Circle1 = new a2();
        System.out.println("The area of the circle of radius " + Circle1.radius + " is " + Circle1.getArea());

        a2 Circle2 = new a2(25);
        System.out.println("The area of the circle of radius " + Circle2.radius + " is " + Circle2.getArea());

        a2 Circle3 = new a2(75);
        System.out.println("The area of the circle of radius " + Circle3.radius + " is " + Circle3.getArea());

        Circle2.setRadius(100);
        System.out.println("The area of the circle of radius " + Circle2.radius + " is " + Circle2.getArea());
    }
}