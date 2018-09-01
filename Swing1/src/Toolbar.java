import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener
{
	private JButton hellobtn;
	private JButton goodbye;
	private StringListener textListener;
	
	public Toolbar()
	{
		hellobtn=new JButton("Hello");
		goodbye=new JButton("GoodBye");
		
		hellobtn.addActionListener(this);
		goodbye.addActionListener(this);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(hellobtn);
		add(goodbye);
		
	}
	
	public void setStringListener(StringListener listener)
	{
		this.textListener=listener;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton clicked=(JButton)e.getSource();
		
		if(clicked==hellobtn)
		{
			textListener.emitText("Hello\n");
		}
		else if(clicked==goodbye)
		{
			textListener.emitText("Goodbye\n");
		}
		
	}
	
	
	
	
}
