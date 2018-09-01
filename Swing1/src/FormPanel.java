import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class FormPanel extends JPanel {
	
	private JLabel usernamelbl;
	private JLabel passwordlbl;
	private JTextField username;
	private JTextField password;
	private JButton submit;
	private FormListener formlistener;
	private FormEvent ev;
	private JList agelist;
	private JComboBox empCombo;
	private JCheckBox citizen;
	
	public FormPanel() {
		// TODO Auto-generated constructor stub
		Dimension dim=getPreferredSize();
		
		dim.width=280;
		setPreferredSize(dim);
		
		
		usernamelbl=new JLabel("Username:- ");
		passwordlbl=new JLabel("Password:- ");
		username=new JTextField(10);
		password=new JTextField(10);
		submit=new JButton("SUBMIT");
		agelist=new JList<>();
		empCombo=new JComboBox<>();
		citizen=new JCheckBox("India");
		
		DefaultListModel ageModel=new DefaultListModel();
		DefaultComboBoxModel empModel=new DefaultComboBoxModel();
		
		ageModel.addElement("Under 18");
		ageModel.addElement("18 to 65");
		ageModel.addElement("above 65");
		agelist.setModel(ageModel);
			
		empModel.addElement("manager");
		empModel.addElement("worker");
		empCombo.setModel(empModel);
		
		Border listborder=BorderFactory.createEtchedBorder();
		Border inner=BorderFactory.createTitledBorder("Add Person");
		Border outer=BorderFactory.createEmptyBorder(5, 5, 5, 5);
		
		setBorder(BorderFactory.createCompoundBorder(outer,inner));
		agelist.setBorder(listborder);
		submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String user=username.getText();
				String pass=password.getText();
				String ageCat=(String)agelist.getSelectedValue();
				
				ev=new FormEvent(this,user,pass);
				System.out.println(ageCat);
				//if(formlistener!=null)
				//{
					formlistener.formEvent(ev);
				//}
				
			}
		});
		
		
		setBackground(Color.LIGHT_GRAY);
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc=new GridBagConstraints();
		
		gc.weightx=1;
		gc.weighty=0.1;
		
		gc.gridx=0;
		gc.gridy=0;
		gc.fill=GridBagConstraints.NONE;
		gc.anchor=GridBagConstraints.LINE_END;
		add(usernamelbl,gc);
				
		gc.gridx=1;
		gc.gridy=0;
		gc.anchor=GridBagConstraints.LINE_START;
		add(username,gc);
			
		gc.weightx=1;
		gc.weighty=0.1;
			
		gc.gridx=0;
		gc.gridy=1;
		gc.anchor=GridBagConstraints.LINE_END;
		add(passwordlbl,gc);
		
		gc.gridx=1;
		gc.gridy=1;
		
		gc.anchor=GridBagConstraints.LINE_START;
		add(password,gc);
		
		/*gc.gridx=1;
		gc.gridy=2;
		gc.anchor=GridBagConstraints.LINE_START;
		add(agelist,gc);
		
		
		gc.weightx=1;
		gc.weighty=0.1;
		
		gc.gridx=1;
		gc.gridy=3;
		gc.anchor=GridBagConstraints.LINE_START;
		add(empCombo,gc);
		
		
		gc.gridx=1;
		gc.gridy=4;
		gc.anchor=GridBagConstraints.LINE_START;
		add(citizen,gc);
		*/
		gc.gridx=1;
		gc.gridy=5;
		gc.anchor=GridBagConstraints.LINE_START;
		add(submit,gc);
		
	}

	
	public void setFormListener(FormListener l)
	{
		this.formlistener=l;
		
	}
	
	
}
