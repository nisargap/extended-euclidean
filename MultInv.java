// Nisarga Patel, CMSC 443 HW
// I apologize for the non-descriptive variable names
// but they are the same ones defined in the formal algorithm
public class MultInv {
    
    public static int multiInv(int a, int b) {
        
        int a0 = a;
        int b0 = b;
        int t0 = 0;
        int t = 1;
        double div = a0 / (double) b0;
        
        int q = (int)Math.floor(div);
        
        int r = a0 - q * b0;
        
        // counts number of loop iterations
        int iterations = 0;
        
        while(r > 0){
            
            ++iterations;
            int temp = (t0 - q * t) % a;
            t0 = t;
            t = temp;
            a0 = b0;
            b0 = r;
            q = (int)Math.floor(a0 / (double) b0);
            r = a0 - q * b0;
            
        }
        if(b0 != 1){
            
            System.out.println("b has no inverse modulo a");
            return -1;
            
        }
        
        System.out.println("b has an inverse modulo a: " + t);
        System.out.println("The number of iterations were: " + iterations);
        return t;
        
        
    }
    
    public static void main(String[] args) {
        
        
        // some tests
        multiInv(939193, 28);
        multiInv(99, 101);
        multiInv(101, 99);
        
        
    }
    
    
}