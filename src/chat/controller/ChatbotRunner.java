package chat.controller;

import chat.view.PopupDisplay;
import chat.model.Chatbot;

/**
 * this method is the one that starts the program up.
 * @author ewil1026
 *
 */
public class ChatbotRunner
{
	public static void main(String [] args)
	{
		ChatbotController myApp = new ChatbotController();
		myApp.start();
		
	}
}
