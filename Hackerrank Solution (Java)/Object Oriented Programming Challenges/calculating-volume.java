
class Calculate {
    static Scanner scan = new Scanner(System.in);
    static Calculate output = new Calculate();

    public static Calculate do_calc() {
        return output;
    }
    
    public int get_int_val() throws IOException, NumberFormatException {
        int x = scan.nextInt();
        if (x <= 0) {
            throw new NumberFormatException("All the values must be positive");
        }
        return x;
    }
    
    public double get_double_val() throws IOException, NumberFormatException  {
        double x = scan.nextDouble();
        if (x <= 0) {
            throw new NumberFormatException("All the values must be positive");
        }
        return x;
    }
    
    public double get_volume(int a) { // cube
        return a * a * a;
    }
    
    public double get_volume(int l, int b , int h) { // cuboid
        return l * b * h;
    }
    
    public double get_volume(double r) { // hemisphere
        return (2 * Math.PI * r * r * r) / 3;
    }
    
    public double get_volume(double r, double h) { // cylinder
        return  Math.PI * (r * r) * h;
    }
    
    void display(double value) {
        System.out.format("%.3f%n", value);
    }
}