package src;

class loops {

    public static void loop(){
        for (int i=0; i<=5; i++){
            System.out.println(i);
        }

        int num = 5;

        while (num!=0){
            System.out.println("num="+num--);
        }

        do {
            System.out.println("num is zero.");
            ++num;
        }while(num == 0);
    }
    public static void if_else(){
        int num = 2;
        if (num >=1){
            System.out.println("\nnum is non zero.");
            --num;
            if (num%2==0){
                System.out.println("num is even");
            }
            else {
                System.out.println("num is odd");
            }
        }
        else{
            System.out.println("num is zero or negative.");
            if (num<0){
                System.out.println("num is negative.");
            }
            else{
                System.out.println("num is zero.");
            }
        }
    }
    public static void main(String[] args){
        loop();
        if_else();
    }
}


