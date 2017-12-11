package chat.controller;

import chat.model.*;
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
			response += "This matches the cute memes\n";
		}
		if(chatbot.shoppingListChecker(text))
		{
			response += "this matched the things on my shopping list\n";
		}
		if(chatbot.movieTitleChecker(text))
		{
			response += "this matches the movies i was thinking\n";
		}
		if(chatbot.movieGenreChecker(text))
		{
			response += "the genre of these movies matches\n";
		}
		if(chatbot.htmlTagChecker(text))
		{
			response += " this matches the html tag needed\n";
		}
		if(chatbot.userNameChecker(text))
		{
			response += "This is a good username\n";
		}
		//continue with all checkers except length and quick checker
		return response;
		
	}
	
	private void close()
	{
		display.displayText("Goodbye");
		System.exit(0);
	}
	
	private String popupChat(String chat)
	{
		String chatbotSays = ""; //Assigns a valid value to a variable that will be returned for the method.
		
		chatbotSays += chatbot.processConversation(chat);
		
		return chatbotSays;
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
