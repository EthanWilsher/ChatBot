package chat.controller;

import chat.model.Chatbot;
import chat.view.*;


public class ChatbotController
{
	private PopupDisplay display;
	private Chatbot chatbot;
	private ChatFrame appFrame;
	
	public ChatbotController()
	{
		chatbot = new Chatbot("Ethan Wilsher");
		//View initialized after Model
		display = new PopupDisplay();
		appFrame = new ChatFrame(this);
	}
	
	public void start()
	{
		display.displayText("Welcome to Chatbot");
		

	}
	
	/**
	 * This method gets the users input then uses process conversation to make a string to return.
	 * @param chat is the text that is also getting returned.
	 * @return This method then returns a valid value 
	 */
	
	private String popupChat(String chat)
	{
		String chatbotSays = ""; //Assigns a valid value to a variable that will be returned for the method.
		
		chatbotSays += chatbot.processConversation(chat);
		
		return chatbotSays;
	}
	
	public String interactWithChatbot (String input)
	{
		String chatbotSays = "";
		
		if(chatbot.quitChecker(input))
		{
			close();
		}
	
		chatbotSays += chatbot.processConversation(input);
		
		return chatbotSays;
	}
	
	public String useCheckers(String text)
	{
		String response = "";
		
		
		if(chatbot.contentChecker(text))
		{
			response += "THis text matches the special content\n";
		}
		if(chatbot.cuteAnimalMemeChecker(text))
		{
			response += "";
		}
		if(chatbot.shoppingListChecker(text))
		{
			response += "";
		}
		if(chatbot.movieTitleChecker(text))
		{
			response += "";
		}
		if(chatbot.movieGenreChecker(text))
		{
			response += "";
		}
		if(chatbot.htmlTagChecker(text))
		{
			response += "";
		}
		if(chatbot.userNameChecker(text))
		{
			response += "";
		}
		//continue with all checkers except length and quick checker
		return response;
		
	}
	
	private void close()
	{
		display.displayText("Goodbye");
		System.exit(0);
	}
	
	public Chatbot getChatbot()
	{
		return chatbot;
	}
	
	public PopupDisplay getDisplay()
	{
		return display;
	}
	
	

}
