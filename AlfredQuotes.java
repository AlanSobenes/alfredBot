import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE

        return "Hello, " + name + " lovely to see you. How are you?";
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return "The current Date is " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        int intIndex = conversation.indexOf("Alexis");
        int intIndex2 = conversation.indexOf("Alfred");
        if(intIndex != -1){
            return conversation + "Right away, sir. She certainly isn't sophisticated enough for that.";
        }else if(intIndex2 != -1){
            return conversation + "At your service. As you wish, naturally.";
        }else{
            return conversation + "Right. And with that I shall retire."; 
        }
        // YOUR CODE HERE
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}