package InheritanceHW;

/**
 * Created by JANVI on 23/09/2019.
 */

//Parent Class


public class Logic {


  int a, b;

    public Logic(int x, int y) {
        this.a = x;
        this.b = y;
    }

    int add()
    {
       return a+b;
    }


    int  mul()
    {
         return a*b;
      }

    int  sub(){
        return  a-b;
      }

    double div(){
        return a/b;
    }

}
