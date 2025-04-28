import java.util.Scanner;

public class Work{

static Scanner input = new Scanner(System.in);
//-----------------------------------------------------------------------------------------------------------------------------
public static void main(String[] args){

String message = """
		--Hello user--
	 Welcome to your phone Setup
     press 1 to start:

""";
System.out.println(message);

int select = input.nextInt();

switch(select){
case 1:
menu();
}
}
//-----------------------------------------------------------------------------------------------------------------------------
public static void menu(){
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

""";
System.out.println(menuMessage);

 Scanner input = new Scanner(System.in);
 int select = input.nextInt();

 switch (select) {
 case 1: phonebook();
 case 2: messages();
 case 3: chat();
 case 4: callRegister();
 case 5: tone();
 case 6: settings();
 case 7: callDivert();
 case 8: games();
 case 9: calculator();
 case 10: remainders();
 case 11: clock();
 case 12: profiles();
 case 13: simService();
 }
}

//------------------------------------------------------------------------------------------------------------------------------------------
public static void phonebook(){
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
	int select = input.nextInt();

	switch(select){

	case 1:System.out.println("Welcome to Search");
	message = """
    	press a number:

	0: Return to phonebook

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0: phonebook();
	}
	break;

	case 2:
 	System.out.println("Welcome to Service Nos");
	message = """
    	press a number:

	0: Return to phonebook

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0: phonebook();
	}

	break;

	case 3:
 	System.out.println("Welcome to Add name");
	message = """
    	press a number:

	0: Return to phonebook

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0: phonebook();
	}

	break;

	case 4:
 	System.out.println("Welcome to Erase");
	message = """
    	press a number:

	0: Return to phonebook

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0: phonebook();
	}


	break;

	case 5:
 	System.out.println("Welcome to Edit");
	message = """
    	press a number:

	0: Return to phonebook

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0: phonebook();
	}


	break;

	case 6:
 	System.out.println("Welcome to Assign tone");
	message = """
    	press a number:

	0: Return to phonebook

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0: phonebook();
	}


	break;

	case 7:
 	System.out.println("Welcome to Send b'card");
	message = """
    	press a number:

	0: Return to phonebook

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0: phonebook();
	}


	break;

	case 8:
 	System.out.println("Welcome to Options");

	   	message = """
    	   	press a number:

	   	1: Type of view
	  	2: Memory status
		0: Return to phonebook
	   	""";
	   	System.out.println(message);
	   	select = input.nextInt();
	
	   	switch(select){
	   	case 1:
 	   	System.out.println("Welcome to Type of view");
		message = """
    		press a number:

		0: Return to phonebook

		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
		case 0: phonebook();
		}


	   	break;

	   	case 2:
 	   	System.out.println("Welcome to Memory status");
		message = """
    		press a number:

		0: Return to phonebook

		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
		case 0: phonebook();
		}


	   	break;

		case 0: phonebook();
	   	}
	break;

	case 9:
 	System.out.println("Welcome to Speed dials");
	message = """
    	press a number:

	0: Return to phonebook

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0: phonebook();
	}


	break;

	case 10:
 	System.out.println("Welcome to Voice tags");
	message = """
    	press a number:

	0: Return to phonebook

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0: phonebook();
	}


	break;
	
	case 0:
	menu();
	
 break;
}
}

//---------------------------------------------------------------------------------------------------------------------------------------------



public static void messages(){
 System.out.println("Welcome to Message");

	String message = """
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
	System.out.println(message);
	int select = input.nextInt();

	switch(select){
	
	case 1:
 	System.out.println("Welcome to Write message");
	message = """
    	press a number:

	0: Return to messages

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0: messages();
	}

	break;

	case 2:
 	System.out.println("Welcome to Inbox");
	message = """
    	press a number:

	0: Return to messages

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0: messages();
	}


	break;

	case 3:
 	System.out.println("Welcome to Outbox");
	message = """
    	press a number:

	0: Return to messages

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0: messages();
	}


	break;

	case 4:
 	System.out.println("Welcome to Picture message");
	message = """
    	press a number:

	0: Return to messages

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0: messages();
	}


	break;

	case 5:
 	System.out.println("Welcome to Templates");
	message = """
    	press a number:

	0: Return to messages

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0: messages();
	}


	break;

	case 6:
 	System.out.println("Welcome to Smileys");
	message = """
    	press a number:

	0: Return to messages

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0: messages();
	}


	break;

	case 7:
 	System.out.println("Welcome to Message settings");

		message = """
    		press a number:

		1: Set 1
		2: Common
		0: Return to messages

		""";
		System.out.println(message);
		select = input.nextInt();
		
		switch(select){
			case 1:
 			System.out.println("Welcome to Set 1");

				message = """
    				press a number:

				1: Message centre number
				2: Message sent as
				3: Message validity
				0: Return to messages
				""";
				System.out.println(message);
				select = input.nextInt();
		
				switch(select){
				
					case 1:
 					System.out.println("Welcome to Message centre number");
					message = """
    					press a number:

					0: Return to messages

					""";
					System.out.println(message);
					select = input.nextInt();

					switch(select){
					case 0: messages();
					}


					break;

					case 2:
 					System.out.println("Welcome to Message sent as");
					message = """
    					press a number:

					0: Return to messages

					""";
					System.out.println(message);
					select = input.nextInt();

					switch(select){
					case 0: messages();
					}


					break;

					case 3:
 					System.out.println("Welcome to Message validity");
					message = """
    					press a number:

					0: Return to messages

					""";
					System.out.println(message);
					select = input.nextInt();

					switch(select){
					case 0: messages();
					}

					case 0: messages();
					break;
				}
			break;

			case 2:
 			System.out.println("Welcome to Common");
			
			message = """
    				press a number:

				1: Delivery report
				2: Reply via same centre
				3: Character support
				0: Return to message
				""";
				System.out.println(message);
				select = input.nextInt();
		
				switch(select){
				
					case 1:
 					System.out.println("Welcome to Delivery report");
					message = """
    					press a number:

					0: Return to messages

					""";
					System.out.println(message);
					select = input.nextInt();

					switch(select){
					case 0: messages();
					}


					break;

					case 2:
 					System.out.println("Welcome to Reply via same centre");
					message = """
    					press a number:

					0: Return to messages

					""";
					System.out.println(message);
					select = input.nextInt();

					switch(select){
					case 0: messages();
					}


					break;

					case 3:
 					System.out.println("Welcome to Character support");
					message = """
    					press a number:

					0: Return to messages

					""";
					System.out.println(message);
					select = input.nextInt();
	
					switch(select){
					case 0: messages();
					}


					break;
				}
			break;
			
			case 0: messages();
		}
	break;
	
	case 8:
 	System.out.println("Welcome to Info service");
	message = """
    	press a number:

	0: Return to messages

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0: messages();
	}


	break;

	case 9:
 	System.out.println("Welcome to Voice mailbox number");
	message = """
    	press a number:

	0: Return to messages

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0: messages();
	}


	break;

	case 10:
 	System.out.println("Welcome to Service command editor");
	message = """
    	press a number:

	0: Return to messages

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0: messages();
	}


	break;
	
	case 0:
	menu();
	break;
	}


}

//-----------------------------------------------------------------------------------------------------------------------------------------

public static void chat(){
 System.out.println("Welcome to Chat");
 
 	String message = """
    	press a number:

	0: Return to menu

	""";
	System.out.println(message);
	int select = input.nextInt();

	switch(select){
	case 0:
	menu();
 break;
	}

}

//----------------------------------------------------------------------------------------------------------------------------
 public static void callRegister(){
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
	int select = input.nextInt();

	switch(select){
	
	case 1:
	System.out.println("Welcome to Missed calls");
	message = """
    	press a number:

	0: Return to call register

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0:
	callRegister();
	}

	break;
	
	case 2:
	System.out.println("Welcome to Recieving calls");
	message = """
    	press a number:

	0: Return to call register

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0:
	callRegister();
	}


	break;
	
	case 3:
	System.out.println("Welcome to Dialled numbers");
	message = """
    	press a number:

	0: Return to call register

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0:
	callRegister();
	}


	break;
	
	case 4:
	System.out.println("Welcome to Erase recent call lists");
	message = """
    	press a number:

	0: Return to call register

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0:
	callRegister();
	}


	break;
	
	case 5:
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
			select = input.nextInt();

			switch(select){
			case 1:
			System.out.println("Last call duration");
			message = """
    			press a number:

			0: Return to call register

			""";
			System.out.println(message);
			select = input.nextInt();

			switch(select){
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
			select = input.nextInt();

			switch(select){
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
			select = input.nextInt();

			switch(select){
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
			select = input.nextInt();

			switch(select){
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
			select = input.nextInt();

			switch(select){
			case 0:
			callRegister();
			}


			break;

			case 0: callRegister();
			
			}
		

	break;
	
	case 6:
	System.out.println("Welcome to Show call costs");

			message = """
    			press a number:

			1: Last call cost
			2: All calls' cost
			3: Clear counters
			0: Return to call register

			""";
			System.out.println(message);

			select = input.nextInt();

			switch(select){
			case 1:
			System.out.println("Last call cost");
			message = """
    			press a number:

			0: Return to call register

			""";
			System.out.println(message);
			select = input.nextInt();

			switch(select){
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
			select = input.nextInt();

			switch(select){
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
			select = input.nextInt();

			switch(select){
			case 0:
			callRegister();
			}


			break;
			
			case 0: callRegister();
			}
		
	break;
	
	case 7:
	System.out.println("Welcome to call cost settings");

			message = """
    			press a number:

			1: Call cost limit
			2: Show costs in
			0: Return to call register

			""";
			System.out.println(message);
			select = input.nextInt();

			switch(select){
			case 1:
			System.out.println("Call cost limit");
			message = """
    			press a number:

			0: Return to call register

			""";
			System.out.println(message);
			select = input.nextInt();

			switch(select){
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
			select = input.nextInt();

			switch(select){
			case 0:
			callRegister();
			}


			break;
			
			case 0: callRegister();
			}
	break;
	
	case 8:
	System.out.println("Welcome to Prepaid credit");
	message = """
    	press a number:

	0: Return to call register

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 0:
	callRegister();
	}


	break;

	case 0:
	menu();
	
 break;
	}


}

//-------------------------------------------------------------------------------------------------------------------------------
 public static void tone(){
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
	int select = input.nextInt();

	switch(select){
	
	case 1:
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
	}


	break;
	
	case 2:
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
	}


	break;
	
	case 3:
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
	}


	break;
	
	case 4:
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
	}


	break;

	case 5:
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
	}


	break;

	
	case 6:
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
	}


	break;

	
	case 7:
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
	}


	break;

	
	case 8:
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
	}


	break;

	case 9:
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
	}


	break;

	case 0:
	menu();

 break;
	}

}

//---------------------------------------------------------------------------------------------------------------------------------------------
 public static void settings(){
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
	int select = input.nextInt();

	switch(select){
	
	case 1:
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
		}
		break;
	
		case 2:
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
		}
		break;
	
		case 3:
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
		}
		break;
	
		case 4:
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
		}
		break;

		case 5:
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
		}
		break;

		case 6:
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
		}
		break;

		case 0: settings();

		}
	break;
	
	case 2:
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
		}
		break;
	
		case 2:
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
		}
		break;
	
		case 3:
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
		}
		break;
	
		case 4:
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
		}
		break;

		case 5:
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
		}
		break;

		case 6:
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
		}
		break;

		case 0: settings();

		}
	break;
	
	case 3:
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
		}
		break;
	
		case 2:
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
		}
		break;
	
		case 3:
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
		}
		break;
	
		case 4:
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
		}
		break;

		case 5:
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
		}
		break;

		case 6:
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
		}
		break;
	
		case 0: settings();
		}
	break;
	
	case 4:
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
	}


	break;

	case 0:
	menu();
	
	break;
	}

 
}

//----------------------------------------------------------------------------------------------------------------------------------------------------------
 public static void callDivert(){
 System.out.println("Welcome to Call divert");
  
 	String message = """
    	press a number:

	0: Return to main menu
	""";
	System.out.println(message);
	int select = input.nextInt();

	switch(select){
	case 0:
	menu();
 break;
	}


}
//-----------------------------------------------------------------------------------------------------------------------------------------------------
 public static void games(){
 System.out.println("Welcome to Games");
  
 	String message = """
    	press a number:

	0: Return to main menu
	""";
	System.out.println(message);
	int select = input.nextInt();

	switch(select){
	case 0:
	menu();

 break;
	}

}

//---------------------------------------------------------------------------------------------------------------------------------------------------
 public static void calculator(){
 System.out.println("Welcome to Calculator");
  
 	String message = """
    	press a number:

	0: Return to main menu
	""";
	System.out.println(message);
	int select = input.nextInt();

	switch(select){
	case 0:
	menu();
 break;
	}

}

//-------------------------------------------------------------------------------------------------------------------------------------------

 public static void remainders(){
 System.out.println("Welcome to Remainders");
  
 	String message = """
    	press a number:

	0: Return to main menu
	""";
	System.out.println(message);
	int select = input.nextInt();

	switch(select){
	case 0:
	menu();
 break;
	}

}

//------------------------------------------------------------------------------------------------------------------------------------------------
 public static void clock(){
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
	int select = input.nextInt();

	switch(select){
	
	case 1:
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
		}
	break;
	
	case 2:
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
		}
	break;
	
	case 3:
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
		}
	break;
	
	case 4:
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
		}
	break;

	case 5:
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
		}
	break;

	case 6:
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
		}
	break;

	case 0:
	menu();
 break;
	}

}


//------------------------------------------------------------------------------------------------------------------------------------
public static void profiles(){
 System.out.println("Welcome to Profile");
 
 	String message = """
    	press a number:

	0: Return to main menu
	""";
	System.out.println(message);
	int select = input.nextInt();

	switch(select){
	case 0:
	menu();
 break;
	}

}

//------------------------------------------------------------------------------------------------------------------------------------
public static void simService(){
 System.out.println("Welcome to SIM service");
 
 	String message = """
    	press a number:

	0: Return to main menu
	""";
	System.out.println(message);
	int select = input.nextInt();

	switch(select){
	case 0:
	menu();
 break;
	}


}




}

