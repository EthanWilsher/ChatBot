package chat.view;


import javax.swing.JFrame;
import chat.controller.ChatbotController;


public class ChatFrame extends JFrame
{
	private ChatbotController appController;
	private ChatPanel appPanel;
	
	/**
	 * This establishes the controller and allows the program to call for setupFrame and do all the parent methods programming.
	 * @param appController
	 */
	public ChatFrame(ChatbotController appController)
	{
		super();
		this.appController = appController;
		appPanel = new ChatPanel(appController);
		setupFrame();
		
	}
	
	/**
	 * this method is used to set up the information for the frame.
	 */
	private void setupFrame()
	{
		this.setSize(500, 500);
		this.setTitle("Chattabotta");
		this.setContentPane(appPanel);
		this.setResizable(false);
		this.setVisible(true);
	}

	

	

	
}

