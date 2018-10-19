package cosw.escuelaing.edu.co.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class CalculatorView extends AppCompatActivity {
    Button button00;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonPoint;

    Button buttonEquals,buttonDel;
    Button buttonOK,buttonAc;
    Button buttonAdd,buttonSubt;
    Button buttonMult;
    Button buttonDiv;
    Button buttonSign;
    Button buttonSin, buttonCos, buttonTan;
    Button buttonSqrt, buttonPow;


    EditText mainPanel;
    TextView operationPanel;

    CalculatorCore coreCalc;

    String resumeString;
    Boolean isInError;
    CalculatorView self;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_view);
        coreCalc=new CalculatorCore();
        isInError=false;
        self=this;
        componentsInitialization();
        characterListenersInitialization();
        actionListenersInitialization();
        operationPanel.setText("Stack:");

    }


    void componentsInitialization() {
        button00= (Button) findViewById((R.id.button00));
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonPoint = (Button) findViewById(R.id.buttonPoint);

        mainPanel = (EditText) findViewById(R.id.answerText);
        operationPanel= (TextView) findViewById(R.id.operation);

        buttonEquals = (Button) findViewById(R.id.buttonEquals);
        buttonDel= (Button) findViewById(R.id.buttonDel);
        buttonOK = (Button) findViewById(R.id.buttonOK);
        buttonAc = (Button) findViewById(R.id.buttonAc);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSubt = (Button) findViewById(R.id.buttonSubt);
        buttonMult = (Button) findViewById(R.id.buttonMult);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonSign = (Button) findViewById(R.id.buttonSign);
        buttonSin = (Button) findViewById(R.id.buttonSin);
        buttonCos = (Button) findViewById(R.id.buttonCos);
        buttonTan = (Button) findViewById(R.id.buttonTan);
        buttonSqrt = (Button) findViewById(R.id.buttonSqrt);
        buttonPow = (Button) findViewById(R.id.buttonPow);


    }

    void actionListenersInitialization(){


        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPanel.setText(coreCalc.getStack().get(coreCalc.getStack().size()-1)+"");
            }
        });

        buttonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                okAction();
            }
        });

        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mainPanel.getEditableText().length()>0) {
                    String var = mainPanel.getEditableText() + "";
                    mainPanel.setText(var.substring(0, var.length() - 1));
                }
            }
        });

        buttonAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetAction();
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coreCalc.addFunction() ;
                self.refreshPanel();
            }
        });

        buttonSubt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coreCalc.subtFunction();
                self.refreshPanel();
            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coreCalc.multFunction();
                self.refreshPanel();
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coreCalc.divFunction();
                self.refreshPanel();
            }
        });

        buttonSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coreCalc.sinFunction();
                self.refreshPanel();
            }
        });
        buttonCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coreCalc.cosFunction();
                self.refreshPanel();
            }
        });
        buttonTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coreCalc.tanFunction();
                self.refreshPanel();
            }
        });
        buttonSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((mainPanel.getEditableText()+"").startsWith("-")){
                    mainPanel.setText((mainPanel.getEditableText()+"").substring(1,mainPanel.getEditableText().length()));
                }
                else{
                    mainPanel.setText("-"+mainPanel.getEditableText()+" ");
                }

            }
        });


    }


    void characterListenersInitialization(){
        button00.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mainPanel.setText(mainPanel.getEditableText()+(String)"00");
                                    }
        });

        button0.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           mainPanel.setText(mainPanel.getEditableText()+(String)"0");
                                       }
                                   }
        );

        button1.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           mainPanel.setText(mainPanel.getEditableText() + (String)"1");
                                       }
                                   }
        );

        button2.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           mainPanel.setText(mainPanel.getEditableText() +(String) "2");
                                       }
                                   }
        );

        button3.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           mainPanel.setText(mainPanel.getEditableText() +(String) "3");
                                       }
                                   }
        );

        button4.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           mainPanel.setText(mainPanel.getEditableText() +(String) "4");
                                       }
                                   }
        );

        button5.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           mainPanel.setText(mainPanel.getEditableText() + (String)"5");
                                       }
                                   }
        );

        button6.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           mainPanel.setText(mainPanel.getEditableText() +(String) "6");
                                       }
                                   }
        );

        button7.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           mainPanel.setText(mainPanel.getEditableText() +(String) "7");
                                       }
                                   }
        );
        button8.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           mainPanel.setText(mainPanel.getEditableText()+(String) "8");
                                       }
                                   }
        );
        button9.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           mainPanel.setText(mainPanel.getEditableText()+ (String)"9");
                                       }
                                   }
        );
        buttonPoint.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           mainPanel.setText(mainPanel.getEditableText() + (String)".");
                                       }
                                   }
        );
    }


    void okAction() {

        String var= mainPanel.getEditableText()+"";
        try {

            mainPanel.setText("");
            float value= Float.parseFloat(var);
            coreCalc.addStack((float)value);
            if (isInError) {
                operationPanel.setText((String) (resumeString + " " + value));
            }
            else{ operationPanel.setText((String) (operationPanel.getText() + " " + value));}
            isInError=false;
        }catch(Exception e) {
            if (!isInError) {
                resumeString=operationPanel.getText()+"";
                isInError=true;
                operationPanel.setText("SYNTAX ERROR");
            }
            else{
                mainPanel.setText("");
            }

        }
    }

    void resetAction(){
        coreCalc.reset();
        refreshPanel();
        mainPanel.setText("");
    }

    void refreshPanel(){
        List<Float> values= coreCalc.getStack();
        String stack="Stack:";
        for (int i=0;i<values.size();i++){
            stack=stack+" "+values.get(i);
        }
        operationPanel.setText(stack);
    }



}
