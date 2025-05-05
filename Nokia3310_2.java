import java.util.Scanner;

public class Nokia3310_2{

static Scanner input = new Scanner(System.in);
//-----------------------------------------------------------------------------------------------------------------------------
public static void main(String[] args){
int select = 0;
do{
String message = """
		--Hello user--
	 Welcome to your phone Setup
     press 1 to start:

""";
System.out.println(message);

select = input.nextInt();

switch(select){
case 1:
menu();
default: System.out.println("Invalid - Try again");
}
}while(select != 1);
}

//-----------------------------------------------------------------------------------------------------------------------------
public static void menu(){
 int select = 0;
do{
String menuMessage = """
		--Hello user--
	 Welcome to your phone Menu
     press any of the following to start:

1: Phone book
2: Message
3: Chat
4: Call register
5: Tone
6: Settings
7: Call divert
8: Games
9: Calculator
10: Remainders
11: Clock
12: Profiles
13: SIM service
0: Exit
""";
System.out.println(menuMessage);

 Scanner input = new Scanner(System.in);
select = input.nextInt();

 switch (select) {
 case 1: phonebook(); break;
 case 2: messages(); break;
 case 3: chat(); break;
 case 4: callRegister(); break;
 case 5: tone(); break;
 case 6: settings(); break;
 case 7: callDivert(); break;
 case 8: games(); break;
 case 9: calculator(); break;
 case 10: remainders(); break;
 case 11: clock(); break;
 case 12: profiles(); break;
 case 13: simService(); break;
 case 0: break;

default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
}

//------------------------------------------------------------------------------------------------------------------------------------------
public static void phonebook(){
int selectPhonebook = 0;
do{
 System.out.println("Welcome to Phone book");

	String message = """
    	press a number:

	1: Search
	2: Service Nos
	3: Add name
	4: Erase
	5: Edit
	6: Assign tone
	7: Send b'card
	8: Options
	9: Speed dials
	10: Voice tags
	0: Return to main menu

	""";
	System.out.println(message);
	selectPhonebook = input.nextInt();

	switch(selectPhonebook){

	case 1:System.out.println("Welcome to Search");
do{
	message = """
    	press a number:

	0: Return to phonebook

	""";
	System.out.println(message);
	selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: phonebook();

	default: System.out.println("Invalid - Try again");
 }
}while(selectPhonebook != 0);
	break;

	case 2:
do{
 	System.out.println("Welcome to Service Nos");
	message = """
    	press a number:

	0: Return to phonebook

	""";
	System.out.println(message);
	selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: phonebook();

default: System.out.println("Invalid - Try again");
 }
}while(selectPhonebook != 0);

	break;

	case 3:
do{
 	System.out.println("Welcome to Add name");
	message = """
    	press a number:

	0: Return to phonebook

	""";
	System.out.println(message);
	selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: phonebook();

default: System.out.println("Invalid - Try again");
 }
}while(selectPhonebook != 0);

	break;

	case 4:
do{
 	System.out.println("Welcome to Erase");
	message = """
    	press a number:

	0: Return to phonebook

	""";
	System.out.println(message);
	selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: phonebook();

default: System.out.println("Invalid - Try again");
 }
}while(selectPhonebook != 0);


	break;

	case 5:
do{
 	System.out.println("Welcome to Edit");
	message = """
    	press a number:

	0: Return to phonebook

	""";
	System.out.println(message);
	selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: phonebook();

default: System.out.println("Invalid - Try again");
 }
}while(selectPhonebook != 0);


	break;

	case 6:
do{
 	System.out.println("Welcome to Assign tone");
	message = """
    	press a number:

	0: Return to phonebook

	""";
	System.out.println(message);
	selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: phonebook();

default: System.out.println("Invalid - Try again");
 }
}while(selectPhonebook != 0);


	break;

	case 7:
do{
 	System.out.println("Welcome to Send b'card");
	message = """
    	press a number:

	0: Return to phonebook

	""";
	System.out.println(message);
	selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: phonebook();

default: System.out.println("Invalid - Try again");
 }
}while(selectPhonebook != 0);


	break;

	case 8:
do{
 	System.out.println("Welcome to Options");

	   	message = """
    	   	press a number:

	   	1: Type of view
	  	2: Memory status
		0: Return to phonebook
	   	""";
	   	System.out.println(message);
	   	selectPhonebook = input.nextInt();
	
	   	switch(selectPhonebook){
	   	case 1:
do{
 	   	System.out.println("Welcome to Type of view");
		message = """
    		press a number:

		0: Return to phonebook

		""";
		System.out.println(message);
		selectPhonebook = input.nextInt();

		switch(selectPhonebook){
		case 0: phonebook();

		default: System.out.println("Invalid - Try again");
 }
}while(selectPhonebook != 0);
		
		break;

	   	case 2:
do{
 	   	System.out.println("Welcome to Memory status");
		message = """
    		press a number:

		0: Return to phonebook

		""";
		System.out.println(message);
		selectPhonebook = input.nextInt();

		switch(selectPhonebook){
		case 0: phonebook();

		default: System.out.println("Invalid - Try again");
 }
}while(selectPhonebook != 0);
		
		break;
		case 0: phonebook();

	default: System.out.println("Invalid - Try again");
 }
}while(selectPhonebook != 0);
	break;

	case 9:
do{
 	System.out.println("Welcome to Speed dials");
	message = """
    	press a number:

	0: Return to phonebook

	""";
	System.out.println(message);
	selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: phonebook();

default: System.out.println("Invalid - Try again");
 }
}while(selectPhonebook != 0);


	break;

	case 10:
do{
 	System.out.println("Welcome to Voice tags");
	message = """
    	press a number:

	0: Return to phonebook

	""";
	System.out.println(message);
	selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: phonebook();

default: System.out.println("Invalid - Try again");
 }
}while(selectPhonebook != 0);
	break;
	case 0:
	menu();
	
default: System.out.println("Invalid - Try again");
 }
}while(selectPhonebook != 0);
}

//---------------------------------------------------------------------------------------------------------------------------------------------



public static void messages(){
int selectMessage = 0;
do{
 System.out.println("Welcome to Message");

	String messageMessage = """
    	press a number:

	1: Write message
	2: Inbox
	3: Outbox
	4: Picture message
	5: Templates
	6: Smileys
	7: Message settings
	8: Info service
	9: Voice mailbox number
	10: Service command editor
	0: Return to main menu

	""";
	System.out.println(messageMessage);
	selectMessage = input.nextInt();

	switch(selectMessage){
	
	case 1:
do{
 	System.out.println("Welcome to Write message");
	messageMessage = """
    	press a number:

	0: Return to messages

	""";
	System.out.println(messageMessage);
	selectMessage = input.nextInt();

	switch(selectMessage){
	case 0: messages();
default: System.out.println("Invalid - Try again");
 }
}while(selectMessage != 0);

	break;

	case 2:
do{
 	System.out.println("Welcome to Inbox");
	messageMessage = """
    	press a number:

	0: Return to messages

	""";
	System.out.println(messageMessage);
	selectMessage = input.nextInt();

	switch(selectMessage){
	case 0: messages();

default: System.out.println("Invalid - Try again");
 }
}while(selectMessage != 0);


	break;

	case 3:
do{
 	System.out.println("Welcome to Outbox");
	messageMessage = """
    	press a number:

	0: Return to messages

	""";
	System.out.println(messageMessage);
	selectMessage = input.nextInt();

	switch(selectMessage){
	case 0: messages();

default: System.out.println("Invalid - Try again");
 }
}while(selectMessage != 0);


	break;

	case 4:
do{
 	System.out.println("Welcome to Picture message");
	messageMessage = """
    	press a number:

	0: Return to messages

	""";
	System.out.println(messageMessage);
	selectMessage = input.nextInt();

	switch(selectMessage){
	case 0: messages();

default: System.out.println("Invalid - Try again");
 }
}while(selectMessage != 0);


	break;

	case 5:
do{
 	System.out.println("Welcome to Templates");
	messageMessage = """
    	press a number:

	0: Return to messages

	""";
	System.out.println(messageMessage);
	selectMessage = input.nextInt();

	switch(selectMessage){
	case 0: messages();

default: System.out.println("Invalid - Try again");
 }
}while(selectMessage != 0);


	break;

	case 6:
do{
 	System.out.println("Welcome to Smileys");
	messageMessage = """
    	press a number:

	0: Return to messages

	""";
	System.out.println(messageMessage);
	selectMessage = input.nextInt();

	switch(selectMessage){
	case 0: messages();

default: System.out.println("Invalid - Try again");
 }
}while(selectMessage != 0);


	break;

	case 7:
do{
 	System.out.println("Welcome to Message settings");

		messageMessage = """
    		press a number:

		1: Set 1
		2: Common
		0: Return to messages

		""";
		System.out.println(messageMessage);
		selectMessage = input.nextInt();
		
		switch(selectMessage){
			
			case 1:
do{
 			System.out.println("Welcome to Set 1");

				messageMessage = """
    				press a number:

				1: Message centre number
				2: Message sent as
				3: Message validity
				0: Return to messages
				""";
				System.out.println(messageMessage);
				selectMessage = input.nextInt();
		
				switch(selectMessage){

					
				
					case 1:
do{
 					System.out.println("Welcome to Message centre number");
					messageMessage = """
    					press a number:

					0: Return to messages

					""";
					System.out.println(messageMessage);
					selectMessage = input.nextInt();

					switch(selectMessage){
					case 0: messages();

					default: System.out.println("Invalid - Try again");
 }
}while(selectMessage != 0);


					break;

					case 2:
do{
 					System.out.println("Welcome to Message sent as");
					messageMessage = """
    					press a number:

					0: Return to messages

					""";
					System.out.println(messageMessage);
					selectMessage = input.nextInt();

					switch(selectMessage){
					case 0: messages();

					default: System.out.println("Invalid - Try again");
 }
}while(selectMessage != 0);


					break;

					case 3:
do{
 					System.out.println("Welcome to Message validity");
					messageMessage = """
    					press a number:

					0: Return to messages

					""";
					System.out.println(messageMessage);
					selectMessage = input.nextInt();

					switch(selectMessage){
					case 0: messages();

					default: System.out.println("Invalid - Try again");
 }
}while(selectMessage != 0);

					case 0: messages();
					break;

				default: System.out.println("Invalid - Try again");
 }
}while(selectMessage != 0);

			break;

			case 2:
do{
 			System.out.println("Welcome to Common");
			
			messageMessage = """
    				press a number:

				1: Delivery report
				2: Reply via same centre
				3: Character support
				0: Return to message
				""";
				System.out.println(messageMessage);
				selectMessage = input.nextInt();
		
				switch(selectMessage){
				
					case 1:
do{
 					System.out.println("Welcome to Delivery report");
					messageMessage = """
    					press a number:

					0: Return to messages

					""";
					System.out.println(messageMessage);
					selectMessage = input.nextInt();

					switch(selectMessage){
					case 0: messages();

					default: System.out.println("Invalid - Try again");
 }
}while(selectMessage != 0);


					break;

					case 2:
do{
 					System.out.println("Welcome to Reply via same centre");
					messageMessage = """
    					press a number:

					0: Return to messages

					""";
					System.out.println(messageMessage);
					selectMessage = input.nextInt();

					switch(selectMessage){
					case 0: messages();

					default: System.out.println("Invalid - Try again");
 }
}while(selectMessage != 0);


					break;

					case 3:
do{
 					System.out.println("Welcome to Character support");
					messageMessage = """
    					press a number:

					0: Return to messages

					""";
					System.out.println(messageMessage);
					selectMessage = input.nextInt();
	
					switch(selectMessage){
					case 0: messages();

					default: System.out.println("Invalid - Try again");
 }
}while(selectMessage != 0);


					break;
				default: System.out.println("Invalid - Try again");
 }
}while(selectMessage != 0);
			
break;
			case 0: messages();

		default: System.out.println("Invalid - Try again");
 }
}while(selectMessage != 0);
	break;
	
	case 8:
do{
 	System.out.println("Welcome to Info service");
	messageMessage = """
    	press a number:

	0: Return to messages

	""";
	System.out.println(messageMessage);
	selectMessage = input.nextInt();

	switch(selectMessage){
	case 0: messages();

default: System.out.println("Invalid - Try again");
 }
}while(selectMessage != 0);


	break;

	case 9:
do{
 	System.out.println("Welcome to Voice mailbox number");
	messageMessage = """
    	press a number:

	0: Return to messages

	""";
	System.out.println(messageMessage);
	selectMessage = input.nextInt();

	switch(selectMessage){
	case 0: messages();

default: System.out.println("Invalid - Try again");
 }
}while(selectMessage != 0);


	break;

	case 10:
do{
 	System.out.println("Welcome to Service command editor");
	messageMessage = """
    	press a number:

	0: Return to messages

	""";
	System.out.println(messageMessage);
	selectMessage = input.nextInt();

	switch(selectMessage){
	case 0: messages();

default: System.out.println("Invalid - Try again");
 }
}while(selectMessage != 0);


	break;
	
	case 0:
	menu();

default: System.out.println("Invalid - Try again");
 }
}while(selectMessage != 0);

	
}

//-----------------------------------------------------------------------------------------------------------------------------------------

public static void chat(){
int selectChat = 0;
do{
 System.out.println("Welcome to Chat");
 
 	String messageChat = """
    	press a number:

	0: Return to menu

	""";
	System.out.println(messageChat);
	selectChat = input.nextInt();

	switch(selectChat){
	case 0:
	menu();

default: System.out.println("Invalid - Try again");
 }
}while(selectChat != 0);

}

//----------------------------------------------------------------------------------------------------------------------------
 public static void callRegister(){
int selectcall = 0;
do{
 System.out.println("Welcome to Call register");

	String message = """
    	press a number:

	1: Missed calls
	2: Recieving calls
	3: Dialled numbers
	4: Erase recent call lists
	5: Show call duration
	6: Show call costs
	7: call cost settings
	8: Prepaid credit
	0: Return to main menu

	""";
	System.out.println(message);
	selectcall = input.nextInt();

	switch(selectcall){
	
	case 1:
do{
	System.out.println("Welcome to Missed calls");
	message = """
    	press a number:

	0: Return to call register

	""";
	System.out.println(message);
	selectcall = input.nextInt();

	switch(selectcall){
	case 0:
	callRegister();

	default: System.out.println("Invalid - Try again");
 }
}while(selectcall != 0);
	break;

	case 2:
do{
	System.out.println("Welcome to Recieving calls");
	message = """
    	press a number:

	0: Return to call register

	""";
	System.out.println(message);
	selectcall = input.nextInt();

	switch(selectcall){
	case 0:
	callRegister();
	default: System.out.println("Invalid - Try again");
 }
}while(selectcall != 0);
	break;

	case 3:
do{
	System.out.println("Welcome to Dialled numbers");
	message = """
    	press a number:

	0: Return to call register

	""";
	System.out.println(message);
	selectcall = input.nextInt();

	switch(selectcall){
	case 0:
	callRegister();
	default: System.out.println("Invalid - Try again");
 }
}while(selectcall != 0);
	break;

	case 4:
do{
	System.out.println("Welcome to Erase recent call lists");
	message = """
    	press a number:

	0: Return to call register

	""";
	System.out.println(message);
	selectcall = input.nextInt();

	switch(selectcall){
	case 0:
	callRegister();
default: System.out.println("Invalid - Try again");
 }
}while(selectcall != 0);
	break;

	case 5:
do{
	System.out.println("Welcome to show call duration");
		
			message = """
    			press a number:

			1: Last call duration
			2: All calls' duration
			3: Received calls' duration
			4: Dialled calls' duration
			5: Clear timers
			0: Return to call register

			""";
			System.out.println(message);
			selectcall = input.nextInt();

			switch(selectcall){
			case 1:
			System.out.println("Last call duration");
			message = """
    			press a number:

			0: Return to call register

			""";
			System.out.println(message);
			selectcall = input.nextInt();

			switch(selectcall){
			case 0:
			callRegister();
			}


			break;
			
			case 2:
			System.out.println("All calls' duration");
			message = """
    			press a number:

			0: Return to call register

			""";
			System.out.println(message);
			selectcall = input.nextInt();

			switch(selectcall){
			case 0:
			callRegister();
			}


			break;
			
			case 3:
			System.out.println("Received calls' duration");
			message = """
    			press a number:

			0: Return to call register

			""";
			System.out.println(message);
			selectcall = input.nextInt();

			switch(selectcall){
			case 0:
			callRegister();
			}


			break;
			
			case 4:
			System.out.println("Dialled calls' duration");
			message = """
    			press a number:

			0: Return to call register

			""";
			System.out.println(message);
			selectcall = input.nextInt();

			switch(selectcall){
			case 0:
			callRegister();
			}


			break;
			
			case 5:
			System.out.println("Clear timers");
			message = """
    			press a number:

			0: Return to call register

			""";
			System.out.println(message);
			selectcall = input.nextInt();

			switch(selectcall){
			case 0:
			callRegister();
			}


			break;

			case 0: callRegister();
			
	default: System.out.println("Invalid - Try again");
 }
}while(selectcall != 0);
	break;

	case 6:
do{
	System.out.println("Welcome to Show call costs");

			message = """
    			press a number:

			1: Last call cost
			2: All calls' cost
			3: Clear counters
			0: Return to call register

			""";
			System.out.println(message);

			selectcall = input.nextInt();

			switch(selectcall){
			case 1:
			System.out.println("Last call cost");
			message = """
    			press a number:

			0: Return to call register

			""";
			System.out.println(message);
			selectcall = input.nextInt();

			switch(selectcall){
			case 0:
			callRegister();
			}


			break;
			
			case 2:
			System.out.println("All calls' cost");
			message = """
    			press a number:

			0: Return to call register

			""";
			System.out.println(message);
			selectcall = input.nextInt();

			switch(selectcall){
			case 0:
			callRegister();
			}


			break;
			
			case 3:
			System.out.println("Clear counters");
			message = """
    			press a number:

			0: Return to call register

			""";
			System.out.println(message);
			selectcall = input.nextInt();

			switch(selectcall){
			case 0:
			callRegister();
			}


			break;
			
			case 0: callRegister();
default: System.out.println("Invalid - Try again");
 }
}while(selectcall != 0);
	break;

	case 7:
do{
	System.out.println("Welcome to call cost settings");

			message = """
    			press a number:

			1: Call cost limit
			2: Show costs in
			0: Return to call register

			""";
			System.out.println(message);
			selectcall = input.nextInt();

			switch(selectcall){
			case 1:
			System.out.println("Call cost limit");
			message = """
    			press a number:

			0: Return to call register

			""";
			System.out.println(message);
			selectcall = input.nextInt();

			switch(selectcall){
			case 0:
			callRegister();
			}


			break;
			
			case 2:
			System.out.println("Show costs in");
			message = """
    			press a number:

			0: Return to call register

			""";
			System.out.println(message);
			selectcall = input.nextInt();

			switch(selectcall){
			case 0:
			callRegister();
			}


			break;
			
			case 0: callRegister();
default: System.out.println("Invalid - Try again");
 }
}while(selectcall != 0);
	break;

	case 8:
do{
	System.out.println("Welcome to Prepaid credit");
	message = """
    	press a number:

	0: Return to call register

	""";
	System.out.println(message);
	selectcall = input.nextInt();

	switch(selectcall){
	case 0:
	callRegister();
default: System.out.println("Invalid - Try again");
 }
}while(selectcall != 0);
	
	case 0:
	menu();
	
default: System.out.println("Invalid - Try again");
 }
}while(selectcall != 0);

}

//-------------------------------------------------------------------------------------------------------------------------------
 public static void tone(){
int select = 0;
do{
 System.out.println("Welcome to Tone");
	String message = """
    	press a number:

	1: Ringing tone
	2: Ringing volume
	3: Incoming call alert
	4: Composer
	5: Message alert tone
	6: Keypad tones
	7: Warning and game tones
	8: Viberating alert
	9: Screen saver
	0: Return to main menu

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	
	case 1:
do{
	System.out.println("Ringing tone");
	message = """
    	press a number:

	0: Return to tone

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0:
	tone();
default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
	break;

	case 2:
do{
	System.out.println("Ringing volume");
	message = """
    	press a number:

	0: Return to tone

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0:
	tone();
	default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
	break;

	case 3:
do{
	System.out.println("Incoming call alert");
	message = """
    	press a number:

	0: Return to tone

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0:
	tone();
default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
	break;

	case 4:
do{
	System.out.println("Composer");
	message = """
    	press a number:

	0: Return to tone

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0:
	tone();
default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
	break;

	case 5:
do{
	System.out.println("Message alert tone");
	message = """
    	press a number:

	0: Return to tone

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0:
	tone();
default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
	break;

	case 6:
do{
	System.out.println("Keypad tones");
	message = """
    	press a number:

	0: Return to tone

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0:
	tone();
	default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
	break;
	
	case 7:
do{
	System.out.println("Warning and game tones");
	message = """
    	press a number:

	0: Return to tone

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0:
	tone();
default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
	break;
	
	case 8:
do{
	System.out.println("Viberating alert");
	message = """
    	press a number:

	0: Return to tone

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0:
	tone();
default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
	break;

	case 9:
do{
	System.out.println("Screen saver");
	message = """
    	press a number:

	0: Return to tone

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0:
	tone();
default: System.out.println("Invalid - Try again");
 }
}while(select != 0);

	case 0:
	menu();

default: System.out.println("Invalid - Try again");
 }
}while(select != 0);

}

//---------------------------------------------------------------------------------------------------------------------------------------------
 public static void settings(){
int select = 0;
do{
 System.out.println("Welcome to Settings");

	String message = """
    	press a number:

	1: Call Settings
	2: Phone settings
	3: Security settings
	4: Restore factory settings
	0: Return to main menu	

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	
	case 1:
do{
	System.out.println("Call Settings");

		message = """
    		press a number:

		1: Automatic redial
		2: Speed dialing
		3: Call waiting options
		4: Own number sending
		5: Phone line in use
		6: Automatic answer
		0: Return to settings

		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
	
		case 1:
do{
		System.out.println("Automatic redial");
		message = """
    		press a number:

		0: Return to settings

		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
		case 0:
		settings();
		default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
		break;
	
		case 2:
do{
		System.out.println("Speed dialing");
		message = """
    		press a number:

		0: Return to settings

		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
		case 0:
		settings();
		default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
		break;
	
		case 3:
do{
		System.out.println("Call waiting options");
		message = """
    		press a number:

		0: Return to settings

		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
		case 0:
		settings();
		default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
		break;
	
		case 4:
do{
		System.out.println("Own number sending");
		message = """
    		press a number:

		0: Return to settings

		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
		case 0:
		settings();
	default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
		break;

		case 5:
do{
		System.out.println("Phone line in use");
		message = """
    		press a number:

		0: Return to settings

		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
		case 0:
		settings();
		default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
		break;

		case 6:
do{
		System.out.println("Automatic answer");
		message = """
    		press a number:

		0: Return to settings

		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
		case 0:
		settings();
		default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
		break;

		case 0: settings();

	default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
	break;

	case 2:
do{
	System.out.println("Phone settings");

		message = """
    		press a number:

		1: Language
		2: Cell info display
		3: Welcome note
		4: Network selection
		5: Lights
		6: Confirm SIM service action
		0: Return to settings
		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
	
		case 1:
do{
		System.out.println("Language");
		message = """
    		press a number:

		0: Return to settings

		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
		case 0:
		settings();
	default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
		break;
	
		case 2:
do{
		System.out.println("Cell info display");
		message = """
    		press a number:

		0: Return to settings

		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
		case 0:
		settings();
	default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
		break;
	
		case 3:
do{
		System.out.println("Welcome note");
		message = """
    		press a number:

		0: Return to settings

		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
		case 0:
		settings();
	default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
		break;
	
		case 4:
do{
		System.out.println("Network selection");
		message = """
    		press a number:

		0: Return to settings

		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
		case 0:
		settings();
	default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
		break;

		case 5:
do{
		System.out.println("Lights");
		message = """
    		press a number:

		0: Return to settings

		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
		case 0:
		settings();
	default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
		break;

		case 6:
do{
		System.out.println("Confirm SIM service action");
		message = """
    		press a number:

		0: Return to settings

		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
		case 0:
		settings();
	default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
		break;

		case 0: settings();

	default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
	break;

	case 3:
do{
	System.out.println("Security settings");

		message = """
    		press a number:

		1: PIN code request
		2: Call barring service
		3: Fixed dialling
		4: Closed user group
		5: Phone security
		6: Change access codes
		0: Return to settings
		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
	
		case 1:
do{
		System.out.println("PIN code request");
		message = """
    		press a number:

		0: Return to settings

		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
		case 0:
		settings();
	default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
		break;
	
		case 2:
do{
		System.out.println("Call barring service");
		message = """
    		press a number:

		0: Return to settings

		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
		case 0:
		settings();
	default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
		break;
	
		case 3:
do{
		System.out.println("Fixed dialling");
		message = """
    		press a number:

		0: Return to settings

		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
		case 0:
		settings();
	default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
		break;
	
		case 4:
do{
		System.out.println("Closed user group");
		message = """
    		press a number:

		0: Return to settings

		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
		case 0:
		settings();
	default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
		break;

		case 5:
do{
		System.out.println("Phone security");
		message = """
    		press a number:

		0: Return to settings

		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
		case 0:
		settings();
default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
		break;

		case 6:
do{
		System.out.println("Change access codes");
		message = """
    		press a number:

		0: Return to settings

		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
		case 0:
		settings();
default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
		break;
	
		case 0: settings();
	default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
	break;

	case 4:
do{
	System.out.println("Restore factory settings");
	message = """
    	press a number:

	0: Return to settings

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0:
	settings();
	default: System.out.println("Invalid - Try again");
 }
}while(select != 0);

	case 0:
	menu();
	
	default: System.out.println("Invalid - Try again");
 }
}while(select != 0);

 
}

//----------------------------------------------------------------------------------------------------------------------------------------------------------
 public static void callDivert(){
int select = 0;
do{
 System.out.println("Welcome to Call divert");
  
 	String message = """
    	press a number:

	0: Return to main menu
	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0:
	menu();
default: System.out.println("Invalid - Try again");
 }
}while(select != 0);


}
//-----------------------------------------------------------------------------------------------------------------------------------------------------
 public static void games(){
int select = 0;
do{
 System.out.println("Welcome to Games");
  
 	String message = """
    	press a number:

	0: Return to main menu
	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0:
	menu();

default: System.out.println("Invalid - Try again");
 }
}while(select != 0);

}

//---------------------------------------------------------------------------------------------------------------------------------------------------
 public static void calculator(){
int select = 0;
do{
 System.out.println("Welcome to Calculator");
  
 	String message = """
    	press a number:

	0: Return to main menu
	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0:
	menu();
default: System.out.println("Invalid - Try again");
 }
}while(select != 0);

}

//-------------------------------------------------------------------------------------------------------------------------------------------

 public static void remainders(){
int select = 0;
do{
 System.out.println("Welcome to Remainders");
  
 	String message = """
    	press a number:

	0: Return to main menu
	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0:
	menu();
default: System.out.println("Invalid - Try again");
 }
}while(select != 0);

}

//------------------------------------------------------------------------------------------------------------------------------------------------
 public static void clock(){
int select = 0;
do{
 System.out.println("Welcome to Clock");

	String message = """
    	press a number:

	1: Alarm clock
	2: Clock settings
	3: Date settings
	4: Stopwatch
	5: Countdown timer
	6: Auto update of date and time
	0: Return to main menu

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	
	case 1:
do{
	System.out.println("Alarm clock");
		message = """
    		press a number:

		0: Return to clock

		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
		case 0:
		clock();
		
default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
	break;
	

	case 2:
do{
	System.out.println("Clock settings");
		message = """
    		press a number:

		0: Return to clock

		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
		case 0:
		clock();
		
default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
	break;
	
	case 3:
do{
	System.out.println("Date settings");
		message = """
    		press a number:

		0: Return to clock

		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
		case 0:
		clock();
		
default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
	break;
	
	case 4:
do{
	System.out.println("Stopwatch");
		message = """
    		press a number:

		0: Return to clock

		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
		case 0:
		clock();
		
default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
	break;

	case 5:
do{
	System.out.println("Countdown timer");
		message = """
    		press a number:

		0: Return to clock

		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
		case 0:
		clock();
		
default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
	break;

	case 6:
do{
	System.out.println("Auto update of date and time");
		message = """
    		press a number:

		0: Return to clock

		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
		case 0:
		clock();
		
default: System.out.println("Invalid - Try again");
 }
}while(select != 0);
	break;

	case 0:
	menu();
default: System.out.println("Invalid - Try again");
 }
}while(select != 0);

}


//------------------------------------------------------------------------------------------------------------------------------------
public static void profiles(){
int select = 0;
do{
 System.out.println("Welcome to Profile");
 
 	String message = """
    	press a number:

	0: Return to main menu
	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0:
	menu();
 default: System.out.println("Invalid - Try again");
 }
}while(select != 0);

}

//------------------------------------------------------------------------------------------------------------------------------------
public static void simService(){
int select = 0;
do{
 System.out.println("Welcome to SIM service");
 
 	String message = """
    	press a number:

	0: Return to main menu
	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0:
	menu();
default: System.out.println("Invalid - Try again");
 }
}while(select != 0);


}




}