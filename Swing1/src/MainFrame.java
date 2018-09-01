import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	private JButton btn;
	private TextPanel textPanel;
	private Toolbar toolbar;
	FormPanel formPanel;
	
	public MainFrame() {
		// TODO Auto-generated constructor stub
		super("App");
		
		setLayout(new BorderLayout());
		
		btn=new JButton("Click me!");
		textPanel=new TextPanel();
		toolbar=new Toolbar();
		formPanel=new FormPanel();
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textPanel.appendText("Hello"+"\n");
				
			}
		});
		
		toolbar.setStringListener(new StringListener() {
			
			@Override
			public void emitText(String text) {
				// TODO Auto-generated method stub
				textPanel.appendText(text);
			}
		});
		
		formPanel.setFormListener(new FormListener() {
			
			@Override
			public void formEvent(FormEvent e) {
				// TODO Auto-generated method stub
				textPanel.appendText(e.getName()+":"+e.getPass()+"\n");
			}
		});
		
		
		
		add(btn,BorderLayout.SOUTH);
		add(textPanel,BorderLayout.CENTER);
		add(toolbar,BorderLayout.NORTH);
		add(formPanel,BorderLayout.WEST);
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	
}
