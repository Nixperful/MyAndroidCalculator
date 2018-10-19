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
            operationCompleted(val);
        }
    }

    void subtFunction(){
        if(stack.size()>=2) {
            float val = optr.sub(stack.get(stack.size() - 2), stack.get(stack.size() - 1));
            operationCompleted(val);
        }
    }

    void multFunction(){
        if(stack.size()>=2) {
            float val = optr.mult(stack.get(stack.size() - 2), stack.get(stack.size() - 1));
            operationCompleted(val);
        }
    }

    void divFunction(){
        if(stack.size()>=2) {
            float val = optr.div(stack.get(stack.size() - 2), stack.get(stack.size() - 1));
            operationCompleted(val);
        }
    }

    void operationCompleted(float val){

        stack.remove(stack.size()-1);

        stack.remove(stack.size()-1);

        stack.add(val);

    }







}
