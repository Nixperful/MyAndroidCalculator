package cosw.escuelaing.edu.co.mycalculator;

import java.util.LinkedList;
import java.util.List;

public class CalculatorCore {


    float mainValue;
    List<Float> stack=new LinkedList<>();

    Operator optr;

    public void CalculatorCore(){
        this.optr=new Operator();
        this.stack = new LinkedList<>();

    }

    void addStack(float number){
        stack.add(number);
    }

    void reset(){
        stack.clear();
    }
/*
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
*/






}
