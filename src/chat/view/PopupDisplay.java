package chat.view;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class PopupDisplay
{
	private ImageIcon icon;
	private String windowTitle;
	
	/**
	 * these methods set up the pop up that shows at the beginning of the chat bot.
	 */
	public PopupDisplay()
	{
		icon = new ImageIcon(getClass().getResource("images/Mr t.png"));
		windowTitle = "ChatBot says...";
	}
	public void displayText(String message)
	{
		JOptionPane.showMessageDialog(null,  message, windowTitle, JOptionPane.INFORMATION_MESSAGE, icon);
	}
	
	public String collectResponse(String question)
	{
		String answer = "";
		
		answer += JOptionPane.showInputDialog(null, question, windowTitle, JOptionPane.PLAIN_MESSAGE, icon, null, "");
		
		return answer;
		
	}
}
