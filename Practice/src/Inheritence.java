class Box {
    private double width;
    private double height;
    private double bredth;
    // Construct clone of an object
     Box(Box superbox) { // pass object to constructor
        width = superbox.width;
        height = superbox.height;
        bredth = superbox.bredth;
    }
    // constructor used when all dimension specified
    Box(double w, double b, double h) {
        width = w;
        height = h;
        bredth = b;
    }
    // constructor used when no dimension specified
     Box() { // use -1 to indicate uninitialized box
        width = -1;
        height = -1;
        bredth = -1;
    }
    // constructor used when cube is created
    Box(double len) {
        width = height = bredth = len;
    }
    // compute and return volume
    double volume() {
        return width*height*bredth;
    }
}
// BoxWeight now fully implements all constructor
class BoxWeight extends Box {
    double weight; // weight of box
    // constructor clone of an object
    BoxWeight(BoxWeight subob) { // pass object to constructor
        super(subob);
        weight = subob.weight;
    }
    // constructor when all parameter are specified
    BoxWeight(double width, double height, double bredth, double mass) {
        super(width, height, bredth);
        weight = mass;
    }
    // default constructor
    BoxWeight() {
        super();
        weight = -1;
    }
    // constructor used when cube is created
    BoxWeight(double length, double m) {
        super(length);
        weight = m;
    }
}
class InheritenceDemo {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10,20,15,24);
        BoxWeight mybox2 = new BoxWeight(2,3,4,0.076);
        BoxWeight mybox3 = new BoxWeight(); // default
        BoxWeight mycube = new BoxWeight(3,2);
        BoxWeight myclone = new BoxWeight(mybox2);
        double vol;

        System.out.println();

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is: "+vol);
        System.out.println("Weight of mybox1 is: "+mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is: "+vol);
        System.out.println("Weight of mybox2 is: "+mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Volume of mybox3 is: "+vol);
        System.out.println("Weight of mybox3 is: "+mybox3.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Volume of myclone is: "+vol);
        System.out.println("Weight of myclone is: "+myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Volume of mycube is: "+vol);
        System.out.println("Weight of mycube is: "+mycube.weight);
        System.out.println();
    }
}
