package chat.view;

import chat.controller.ChatbotController;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.JButton;



public class ChatPanel extends JPanel
{
	private ChatbotController appController;
//	private JPanel panel;
	private JTextArea responseArea;
	private JTextField input;
	private JButton button;
	private SpringLayout layout;
	
	public ChatPanel(ChatbotController appController)
	{
		super();
		this.appController = appController;
//		panel = new JPanel();
//		responseArea = new JTextArea();
//		input = new JTextField();
//		layout = new SpringLayout();
//		button = new JButton();
//				
	}
	

}
