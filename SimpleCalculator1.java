import java.awt.event.*;
import javax.swing.*; // brings swing tools into our program

class SimpleCalculator1 implements ActionListener{//tell java how to handle button clicks
    
      JFrame f;
      JTextField Display;
      JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
      JButton bAdd,bSub,bMul,bDiv,bEqual,bClear;
      
      int num1=0,num2=0;
      String operator="";

      SimpleCalculator1(){

       f=new JFrame("my frist swing window"); //for creating windows
       f.setSize(400,400);
       f.setLayout(null); //manual positioning
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // program may still run in background so avoid the confusing we are closing the window properly
      
       //Displaybox
       Display=new JTextField(); //creates a text box(calculator screen)
       Display.setBounds(40,30,220,30); 
       f.add(Display);
       
       b0=new JButton("0");
       b0.setBounds(40,80,50,40);
       f.add(b0);

       b1=new JButton("1");
       b1.setBounds(100,80,50,40);
       f.add(b1);
       
       b2=new JButton("2");
       b2.setBounds(160,80,50,40);
       f.add(b2);
       
       b3=new JButton("3");
       b3.setBounds(40,130,50,40);
       f.add(b3);
       
       b4=new JButton("4");
       b4.setBounds(100,130,50,40);
       f.add(b4);

       b5=new JButton("5");
       b5.setBounds(160,130,50,40);
       f.add(b5);

       b6=new JButton("6");
       b6.setBounds(40,180,50,40);
       f.add(b6);

       b7=new JButton("7");
       b7.setBounds(100,180,50,40);
       f.add(b7);

       b8=new JButton("8");
       b8.setBounds(160,180,50,40);
       f.add(b8);

       b9=new JButton("9");
       b9.setBounds(40,230,50,40);
       f.add(b9);

       bAdd=new JButton("+");
       bAdd.setBounds(100,230,50,40);
       f.add(bAdd);

       bSub=new JButton("-");
       bSub.setBounds(160,230,50,40);
       f.add(bSub);

       bMul=new JButton("*");
       bMul.setBounds(40,280,50,40);
       f.add(bMul);

       bDiv=new JButton("/");
       bDiv.setBounds(100,280,50,40);
       f.add(bDiv);
       bEqual=new JButton("=");
       bEqual.setBounds(160,280,50,40);
       f.add(bEqual);

       bClear=new JButton("C");
       bClear.setBounds(40,330,170,40);
       f.add(bClear);

       b0.addActionListener(this); //listen to click
       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       b4.addActionListener(this);
       b5.addActionListener(this);
       b6.addActionListener(this);
       b7.addActionListener(this);
       b8.addActionListener(this);
       b9.addActionListener(this);
       bAdd.addActionListener(this);
       bSub.addActionListener(this);
       bMul.addActionListener(this);
       bDiv.addActionListener(this);
       bEqual.addActionListener(this);
       bClear.addActionListener(this);

       f.setVisible(true);
      }

      public void actionPerformed(ActionEvent e){ //automatically called when button clicked //
       
        if(e.getSource()==b0){
        Display.setText(Display.getText()+"0"); // display.getText() -> Gets what is already on the screen
       }
       if(e.getSource()==b1){
        Display.setText(Display.getText()+"1");
       }
       if(e.getSource()==b2){
        Display.setText(Display.getText()+"2");
       }
       if(e.getSource()==b3){
        Display.setText(Display.getText()+"3");
       }
       if(e.getSource()==b4){
        Display.setText(Display.getText()+"4");
       }
       if(e.getSource()==b5){
        Display.setText(Display.getText()+"5");
       }
       if(e.getSource()==b6){
        Display.setText(Display.getText()+"6");
       }
       if(e.getSource()==b7){
        Display.setText(Display.getText()+"7");
       }
       if(e.getSource()==b8){
        Display.setText(Display.getText()+"8");
       }
       if(e.getSource()==b9){
        Display.setText(Display.getText()+"9");
       }

       if(e.getSource()==bAdd){
        num1=Integer.parseInt(Display.getText()); //parseInt is used to convert string to integer
        operator="+";
        Display.setText("");
       }
       
       if(e.getSource()==bSub){
        num1=Integer.parseInt(Display.getText());
        operator="-";
        Display.setText("");
       }

       if(e.getSource()==bMul){
        num1=Integer.parseInt(Display.getText());
        operator="*";
        Display.setText("");
       }
      
       if(e.getSource()==bDiv){
        num1=Integer.parseInt(Display.getText());
        operator="/";
        Display.setText("");
       }

       if(e.getSource()==bEqual)
        {
        num2=Integer.parseInt(Display.getText()); //get second number
       

        if(operator.equals("+")){ //check  if operation is addition
          int result=num1+num2; 
           Display.setText(String.valueOf(result)); //show result
       }
        
       if(operator.equals("-")){
        int result=num1-num2;
        Display.setText(String.valueOf(result));
       }

       if(operator.equals("*")){
        int result=num1*num2;
        Display.setText(String.valueOf(result));
       }

       if(operator.equals("/")){
        if(num2==0){
          Display.setText("Error");
        }
        else{
          int result=num1/num2;
          Display.setText(String.valueOf(result));
        }
       }
        }

        if(e.getSource()==bClear){
          Display.setText("");
          num1=0;
          num2=0;
          operator="";
        }

      }
    
    public static void main(String[] args){
        new SimpleCalculator1();

}
}