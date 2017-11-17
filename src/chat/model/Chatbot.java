package chat.model;

import java.util.List;
import java.time.LocalTime;
import java.util.ArrayList;

public class Chatbot
{
	private List<Movie> movieList;
	private List<String> shoppingList;
	private List<String> cuteAnimalMemes;
	private String[] verbs;
	private String[] topics;
	private String[] followUps;
	private String[] questions;
	private String username;
	private String content;
	private String intro;
	private LocalTime currentTime;

	public Chatbot(String username)
	{
		this.movieList = new ArrayList<Movie>();
		this.shoppingList = new ArrayList<String>();
		this.cuteAnimalMemes = null;
		this.currentTime = null;
		this.questions = new String[10];
		this.username = username;
		this.content = null;
		this.intro = null;
		this.currentTime = null;
		this.topics = new String[7];
		this.verbs = new String[4];
		this.followUps = new String[5];

		buildVerbs();
		buildTopics();
		buildFollowups();
		buildQuestions();
		buildShoppingList();
	}

	private void buildVerbs()
	{
		verbs[0] = "like";
		verbs[1] = "dislike";
		verbs[2] = "am ambivalent about";
		verbs[3] = "am thinking about";
	}

	private void buildTopics()
	{
		topics[0] = "School";
		topics[1] = "Cooking";
		topics[2] = "Baking";
		topics[3] = "Cars";
		topics[4] = "Video Games";
		topics[5] = "TV Shows";
		topics[6] = "Sports";
	}

	private void buildFollowups()
	{

	}

	private void buildMovieList()
	{

	}

	private void buildShoppingList()
	{

	}

	private void buildCuteAnimal()
	{
		cuteAnimalMemes.add("otter");
		cuteAnimalMemes.add("pupper");
		cuteAnimalMemes.add("kittie");
		
	}

	private void buildQuestions()
	{
		questions[0] = "How was your day?";
		questions[1] = "What did you eat for breakfast?";
		questions[2] = "What did you eat for lunch?";
		questions[3] = "What did you eat for dinner?";
		questions[4] = "What's your favorite soda?";
		questions[5] = "What's your favorite candy bar?";
		questions[6] = "How is your school going?";
		questions[7] = "Where was your last vacation?";
		questions[8] = "Who is your favorite actor?";
		questions[9] = "What color are your pants?";
	}

	/**
	 * The process conversation method takes the users input and runs it through a bunch of checkers to figure out what it should send back.
	 * @param input The users supplied text.  
	 * @return THe user then receives a string made from their input and other code.
	 */
	
	public String processConversation(String input)
	{
		String chatbotResponse = "";
		chatbotResponse += "You said: " + "\n" + input + "\n";
		chatbotResponse += buildChatbotResponse();

		return chatbotResponse;
	}

	/**
	 * Builds a random response using the chatbot's sentence part arrays.
	 * @return Returns a random response of the chatbot.
	 */
	
	private String buildChatbotResponse()
	{
		String response = "I";
		int random = (int) (Math.random() * verbs.length);

		response += verbs[random];

		random = (int) (Math.random() * topics.length);
		response += " " + topics[random] + ".\n";

		random = (int) (Math.random() * questions.length);
		response += questions[random];
		
		random = (int) (Math.random() * 2);
		if (random % 2 == 0)
		{
			random = (int) (Math.random() * movieList.size());
			response += "\n" + movieList.get(random).getTitle() + " is not as good as The Emoji Movie.";
		}
		
		

		return response;

	}

	public boolean lengthChecker(String input)
	{
		return false;
	}

	public boolean htmlTagChecker(String input)
	{
		return false;
	}

	public boolean userNameChecker(String input)
	{
		return false;
	}

	public boolean contentChecker(String contentCheck)
	{
		return false;
	}

	/**
	 * Checks if the user typed something that relates to the checker.
	 * @param input The users response to what animal meme is cute.
	 * @return The response returns true if the response worked with the checker.
	 */
	
	
	public boolean cuteAnimalMemeChecker(String input)
	{
		int index = 0;

		for (index = 0; index < cuteAnimalMemes.size(); index += 1)
		{
			if (input.contains("otter") || input.contains("kittie") || input.contains("pupper"))
			{
				return true;
			}

		}

		return false;
	}

	
	public boolean shoppingListChecker(String shoppingItem)
	{
		int index = 0;

		for (index = 0; index < shoppingList.size(); index += 1)
		{
			if (shoppingItem.contains("protien") || shoppingItem.contains("veggies") || shoppingItem.contains("snacks"))
			{
				return true;
			}
		}

		return false;
	}

	public boolean movieTitleChecker(String title)
	{
		return false;
	}

	public boolean movieGenreChecker(String genre)
	{
		return false;
	}

	public boolean quitChecker(String exitString)
	{
		return false;
	}

	public boolean keyboardMashChecker(String sample)
	{
		return false;
	}

	public List<Movie> getMovieList()
	{
		return movieList;
	}

	public List<String> getShoppingList()
	{
		return shoppingList;
	}

	public List<String> getCuteAnimalMemes()
	{
		return cuteAnimalMemes;
	}

	public String[] getQuestions()
	{
		return null;
	}

	public String[] getVerbs()
	{
		return verbs;
	}

	public String[] getTopics()
	{
		return topics;
	}

	public String[] getFollowUps()
	{
		return followUps;
	}

	public String getUsername()
	{
		return username;
	}

	public String getContent()
	{
		return content;
	}

	public String getIntro()
	{
		return null;
	}

	public LocalTime getCurrentTime()
	{
		return null;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public void setContent(String content)
	{
		this.content = content;
	}
}
