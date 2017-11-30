package chat.view;

<<<<<<< HEAD
import javax.swing.JFrame;
import chat.controller.ChatbotController;
=======
import chat.controller.ChatbotController;
import javax.swing.JFrame;

>>>>>>> adding-GUI

public class ChatFrame extends JFrame
{
	private ChatbotController appController;
<<<<<<< HEAD
//	private ChatPanel appPanel;
=======
	private ChatPanel appPanel;
>>>>>>> adding-GUI
	
	public ChatFrame(ChatbotController appController)
	{
		super();
		this.appController = appController;
<<<<<<< HEAD
//		appPanel = new ChatPanel(appController);
		setupFrame();
=======
		appPanel = new ChatPanel(appController);
		setupFrame();
		
>>>>>>> adding-GUI
	}
	
	private void setupFrame()
	{
		this.setSize(500,500);
<<<<<<< HEAD
		this.setTitle("Chatbot 2017");
//		this.setContentPane(appPanel);
		this.setResizable(false);
		this.setVisible(true);
	}
	

=======
		this.setTitle("ChatBot");
		this.setContentPane(appPanel);
		this.setResizable(false);
		this.setVisible(true);
	}
>>>>>>> adding-GUI
}
