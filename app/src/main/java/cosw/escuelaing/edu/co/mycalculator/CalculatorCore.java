package cosw.escuelaing.edu.co.mycalculator;

public class CalculatorCore {


    float mainValue;
    float [] stack;

    Operator optr;

    void CalculatorCore(){
        optr=new Operator();
        stack=new float[]{};
    }

    void addStack(float number){
        stack[stack.length]=number;
    }

    void reset(){
        stack=new float[]{};
    }

    float addFunction(){
        float val = optr.sum(stack[stack.length],stack[stack.length]-1);
        operationCompleted(val);
        return val;
    }
    float subtFunction(){
        float val = optr.sub(stack[stack.length],stack[stack.length]-1);
        operationCompleted(val);
        return val;
    }

    void operationCompleted(float val){
        stack[stack.length]=stack[stack.length]+1;
        stack[stack.length]=val;
    }







}
