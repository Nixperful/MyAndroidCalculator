package cosw.escuelaing.edu.co.mycalculator;

public class Operator {

    void Operator(){
    }


    float sum(float a, float b){
        return a+b;
    }
    float sub(float a, float b){
        return a-b;
    }

    float mult(float a, float b){
        return a*b;
    }
    float div(float a, float b){
        return a/b;
    }
    float sen(float a){
        return (float) Math.sin(a);
    }
    float cos(float a){
        return (float)Math.cos(a);
    }

    float tan(float a){
        return (float) Math.tan(a);
    }

    float pow(float a, float b){
        return (float) Math.pow(a,b);
    }

    float sqrt(float a){
        return (float) Math.sqrt(a);
    }


}
