import java.awt.*; import java.awt.event.*; 
public class GridLayoutExample1 {  
public static void main(String[] args) {  
    Frame f=new Frame("GridLayout Example");  
    Button b1=new Button("B1");
    Button b2=new Button("B2");
    Button b3=new Button("B3");
    Button b4=new Button("B4");
    Button b5=new Button("B5");
Button b6=new Button("B6");
    Button b7=new Button("B7");
    Button b8=new Button("B8");
 Button b9=new Button("B9");
f.setLayout(new GridLayout(1,1));
     f.add(b1);f.add(b2);f.add(b3); 
     f.add(b4);f.add(b5);f.add(b6); 
     f.add(b7);f.add(b8);f.add(b9); 
   f.setSize(300,300); 
       f.setVisible(true);   
f.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      }); 
}  
}