public class coba{
    public static void main(String [] args){
        double x, y, z1, z2, z3, z4;
        
        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        
        System.out.println("x : ");
        x = in1.nextDouble();
        System.out.println("y : ");
        y = in2.nextDouble();
        
        z1 = x + y;
        z2 = x - y;
        z3 = x * y;
        z4 = x / y;
        
        System.out.println("Penjumlahan : " + z1);
        System.out.println("Pengurangan : " + z2);
        System.out.println("Perkalian : " + z3);
        System.out.println("Pembagian : " + z4);
    }
}