public class AllOperators{
    public static void main(String args[]){

        // Unary Operator Example 1
        System.out.println("\n Umary Operator Examples \n");

        int x = 10;
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);

        // Unary Operator Example 2

        int a = 10;
        int b = 10;
        System.out.println(a++ + ++a);
        System.out.println(b++ + b++);

        // Unary Operator Example 3

        int c = 10;
        int d = -10;
        boolean t = true;
        boolean f = false;
        
        System.out.println(~c); //Minus of total positive value which starts from 0
        System.out.println(~d); //Positive of total minus, positive starts from 0
        System.out.println(!t); // opposite of boolean value
        System.out.println(!f);

        // Arithmetic Operators Example 1d
        System.out.println("\n Arithmetic Operators Examples \n");
        int y = 10;
        int z = 5;
        System.out.println(y+z);
        System.out.println(y-z);
        System.out.println(y*z);
        System.out.println(y/z);
        System.out.println(y%z);

        // Arithmetic Operator Example: Expression
        
        System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2);


        System.out.println("\n Left Shift Operator Examples \n");
        // Java Left Shift Operator
        //is used to shift all of the bits in a value to the left side of a specified number of times.
        
        System.out.println(10<<2); // 10*2^2=10*4=40  
        System.out.println(10<<3); // 10*2^3=10*8=80  
        System.out.println(20<<2); // 20*2^2=20*4=80  
        System.out.println(15<<4); // 15*2^4=15*16=240  
        
        System.out.println("\n Right Shift Operator Examples \n");
        // Java Right Shift Operator

        System.out.println(20>>2);
        System.out.println(10>>2);
        System.out.println(30>>2);

        //For positive number, >> and >>> works same  
        System.out.println(20>>2);  
        System.out.println(20>>>2);  

        // SEARCH MORE ABOUT THIS CHANGES PARITY BIT
        //For negative number, >>> changes parity bit (MSB) to 0  
        System.out.println(-20>>2);  
        System.out.println(-20>>>2);  
        
        /* Logical && checks the second condition only when the first condition is true
         * while Bitwise & checks both conditions regardless of if the first condintion is true
         * or not.
         */

         System.out.println("\n Logical and Bitwise AND operator \n");
         // Java logical AND, Bitwise AND Example 1

        int p = 10;
        int q = 5;
        int r = 20;

        System.out.println(p<q && p<r);
        System.out.println(p<q & p<r);

        System.out.println(p<q && p++<r);
        System.out.println(p);
        System.out.println(p<q & p++<r);
        System.out.println(p);

        System.out.println("\n Logical and Bitwise OR Operators \n");
        // Java logical OR, Bitwise OR

        /* Logical || doesn't check the second condition if the first condition is true while 
        Bitwise | checks both condition regardless of if the first condition is true or false */
        
        System.out.println(p<q || p<r);
        System.out.println(p<q | p<r);
        System.out.println(p<r || p++ < q);
        System.out.println(p);
        System.out.println(p<r | p++<q);
        System.out.println(p);

        System.out.println("\n Tenary Operator Examples\n");
        // Java Tenary operator is like a replacement of if-else-then statement
        // It is the only operator that takes three operands

        int u = 10;
        int v = 20;

        int min = (u<v)?v:u;
        System.out.println(min);

        int man = (u>v)? u:v;
        System.out.println(man);

        System.out.println("\n Assignment Operator Examples\n");
        // Java Assignment operator
        u +=4;
        v -=4;
        System.out.println(u);
        System.out.println(v);

        int w = 10;
        w += 3;
        System.out.println(w);
        w -=4;
        System.out.println(w);
        w *=2;
        System.out.println(w);
        w /=2;
        System.out.println(w);

        short n = 10;
        short m = 20;

        n = (short)(n + m);

        System.out.println(n);

    }
}