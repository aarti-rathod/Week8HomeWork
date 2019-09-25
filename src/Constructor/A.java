package Constructor;

/**
 * Created by JANVI on 23/09/2019.
 */

    public class A{


        int a,b;
        char s;

        public A() {
            System.out.println("-----Calculator Constructor -----");
        }

        public A(int a, int b, char s) {
            this.a = a;
            this.b = b;
            this.s = s;

            if(s=='+'){
                System.out.println("Addition :"+(a+b) );
            }

            if(s=='-'){
                System.out.println("Substrction : "+(a-b));
            }

            if(s=='*'){
                System.out.println("Multiplication: "+(a*b));
            }

            if(s=='/'){
                System.out.println("Division : "+(a/b));
            }

        }
    }
