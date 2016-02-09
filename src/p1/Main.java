package p1;

public class Main {

    public static void main(String[] args) {
        Balloon[] thing = new Balloon[5];


	    //build balloon object
        thing[0] = new Balloon();
        //thing1.size = 10;
        //thing1.color = "Blue";
        //System.out.printf("thing2 size: %d\nthing2 color: %s", thing[0].size, thing[0].color);

        thing[1] = new Balloon(15, "red");
        //thing2.size = 20;
        //thing2.color = "Green";
        thing[2] = new Balloon(12, "eggshell");
        System.out.printf("Number of balloons: %d", Balloon.getQuantity());
        int i = 0;
        for (Balloon each : thing) {
            if (each != null)
                //uses getSize and getColor methods to show values of private variables
                System.out.printf("\nthing" + i + " size: %d\nthing" + i + " color: %s", each.getSize(), each.getColor());
                i++;
            //System.out.printf("\nthing2 size: %d\nthing2 color: %s", thing[1].size, thing[1].color);
        }
    }
}

class Balloon {
    private int size;
    private String color;
    private static int quantity = 0;

    Balloon(){
        //default values
        size = 11;
        color = "cyan";
        quantity++;
    }
    Balloon(int arg1, String arg2){
        size = arg1;
        color = arg2;
        quantity++;
    }
    String getColor(){
        return color;
    }
    int getSize(){
        return size;
    }
    //must be static if returning static variable
    static int getQuantity(){
        return quantity;
    }
}