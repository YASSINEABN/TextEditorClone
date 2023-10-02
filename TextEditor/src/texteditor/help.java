package texteditor;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class help extends JFrame{
	help(){
setTitle("About");
ImageIcon img= new ImageIcon(getClass().getResource("blocnotes.png"));
setIconImage(img.getImage());
setBounds(100,100,500,400);
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

setLayout(null);

JLabel icon = new JLabel(new ImageIcon(getClass().getResource("blocnotes.png")));
icon.setBounds(100, 50, 80, 80);
add(icon);
JLabel text = new JLabel("<html>Hello All if u facing any problem just send msg <br> <br>yazidhalim002@gmail.com <hr>anoire.yassine@gmail.com</html>");
text.setBounds(100, 50, 350, 300);
add(text);







	}
	public static void main(String[] args) {
		new help().setVisible(true);
	}

}
