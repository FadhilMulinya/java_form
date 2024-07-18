import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Main extends Applet implements ActionListener {
    String name = " ", gender = " ";
    int age;
    
    TextField n = new TextField(10);
    
    CheckboxGroup g = new CheckboxGroup();
    
    Checkbox m = new Checkbox("Male", g, true);
    Checkbox f = new Checkbox("Female", g , false);
    
    Choice c = new Choice();
    
    Label l1 = new Label("Enter Name :- ");
    Label l2 = new Label("Enter Gender :- ");
    Label l3 = new Label("Enter Age :- ");
    
    Button b1 = new Button("Submit ");
    
    @Override
    public void init(){
        //TODO Auto-generated method stub
        super.init();
        
        add(l1);
        add(n);
        add(l2);
        add(m);
        add(f);
        add(l3);
        
        c.add("18");
        c.add("19");
        c.add("20");
        c.add("21");
        
        add(c);
        add(b1);
        
        b1.addActionListeners(this);
    }
    
    @Override
    
    public void paint(Graphics g){
        //TODO Auto-generated method stub
        super.paint(g);
        
        g.drawingString("Name :- "+name , 20, 120);
        g.drawingString("Gender :- "+gender , 20, 140);
        g.drawingString("Age :- "+age , 20, 160);
        
    }
    
    @Override
    
    public void actionPerformed(ActionEvent arg0){
        //TODO Auto-generated method stub
        
        name = n.getText();
        gender=g.getSelectedCheckbox().getLabel();
        age= integer.parseInt(c.getSelectedItem());
        
        
        repaint();
    }
}