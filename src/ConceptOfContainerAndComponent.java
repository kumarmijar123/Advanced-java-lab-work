import javax.swing.JButton;
import javax.swing.JFrame;// Swing

public class ConceptOfContainerAndComponent {
           JFrame frame;//object frame created in memory
           JButton button;//reference-no memory allocation
           JButton button1;
        
           
           public ConceptOfContainerAndComponent() {
        	   frame = new JFrame();
        	   button = new JButton("Clilck me");//memory allocated-instatiation
        	   button1 = new JButton("Naya button");
        	   frame.add(button);//component added to container
        	   frame.add(button1);
        	   frame.setTitle("First Window");
        	   frame.setBounds(300,300,400,400);//shown 400,400 of screen position
        	   frame.setLayout(null); //no defaultlayout(BorderLayout)
        	   button.setBounds(50,20,200,200);//width,height,x,y of jframe
        	   button1.setBounds(50,230,200,200);
        	   frame.setSize(300,600);//width and height
        	   frame.setVisible(true);//showing frame above screen
           }
           
           
           public static void main(String[] args) {
        	   new ConceptOfContainerAndComponent();//constructor called
           }
}
