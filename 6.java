// hierarchial inheritance
class Car {
    String engine = "v8";

    static Car x = new Car();

    class audi extends Car{
        String color = "red";
    }
    class alto extends Car{
        String color = "white";
    }
    class mustang extends Car{
        String color = "yellow";
    }

    public static void main(String[] args){
        mustang m = x.new mustang();
        alto a = x.new alto();
        audi d = x.new audi();
        System.out.println("color of mustang is : " + m.color);
        System.out.println("color of alto is : " + a.color);
        System.out.println("color of audi is : " + d.color);
    }
}
