package cosw.escuelaing.edu.co.mycalculator;

import android.util.Log;

import java.util.LinkedList;
import java.util.List;

public class CalculatorCore {


    float mainValue;
    List<Float> stack=new LinkedList<>();

    Operator optr= new Operator();

    public void CalculatorCore(){

    }

    void addStack(float number){
        stack.add(number);
    }

    void reset(){
        stack.clear();
    }

    List<Float> getStack(){
        return stack;
    }

    void addFunction(){
        if(stack.size()>=2) {
            float val = optr.sum(stack.get(stack.size() - 2), stack.get(stack.size() - 1));
            operationCompleted(val,2);
        }
    }

    void subtFunction(){
        if(stack.size()>=2) {
            float val = optr.sub(stack.get(stack.size() - 2), stack.get(stack.size() - 1));
            operationCompleted(val,2);
        }
    }

    void multFunction(){
        if(stack.size()>=2) {
            float val = optr.mult(stack.get(stack.size() - 2), stack.get(stack.size() - 1));
            operationCompleted(val,2);
        }
    }

    void divFunction(){
        if(stack.size()>=2) {
            float val = optr.div(stack.get(stack.size() - 2), stack.get(stack.size() - 1));
            operationCompleted(val,2);
        }
    }

    void sinFunction(){
        if(stack.size()>=1) {
            float val = optr.sen(stack.get(stack.size() - 1));
            operationCompleted(val,1);
        }
    }

    void cosFunction(){
        if(stack.size()>=1) {
            float val = optr.cos(stack.get(stack.size() - 1));
            operationCompleted(val,1);
        }
    }

    void tanFunction(){
        if(stack.size()>=1) {
            float val = optr.tan(stack.get(stack.size() - 1));
            operationCompleted(val,1);
        }
    }

    void operationCompleted(float val,int operations){

        for (int i=0;i<operations;i++){
            stack.remove(stack.size()-1);
        }

        stack.add(val);

    }

    void sqrtFunction(){
        if(stack.size()>=1) {
            float val = optr.sqrt(stack.get(stack.size() - 1));
            operationCompleted(val,1);
        }
    }
    void powFunction(){
        if(stack.size()>=2) {
            float val = optr.pow(stack.get(stack.size()-2),stack.get(stack.size() - 1));
            operationCompleted(val,2);
        }
    }







}
