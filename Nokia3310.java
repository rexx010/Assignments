import java.util.Scanner;

public class Nokia3310{
public static void main(String[] args){

String message = """
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
System.out.println(message);

 Scanner input = new Scanner(System.in);
 int select = input.nextInt();

switch(select){
 case 1:
 System.out.println("Welcome to Phone book");

	message = """
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

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 1:
 	System.out.println("Welcome to Search");
	break;

	case 2:
 	System.out.println("Welcome to Service Nos");
	break;

	case 3:
 	System.out.println("Welcome to Add name");
	break;

	case 4:
 	System.out.println("Welcome to Erase");
	break;

	case 5:
 	System.out.println("Welcome to Edit");
	break;

	case 6:
 	System.out.println("Welcome to Assign tone");
	break;

	case 7:
 	System.out.println("Welcome to Send b'card");
	break;

	case 8:
 	System.out.println("Welcome to Options");

	   	message = """
    	   	press a number:

	   	1: Type of view
	  	2: Memory status

	   	""";
	   	System.out.println(message);
	   	select = input.nextInt();
	
	   	switch(select){
	   	case 1:
 	   	System.out.println("Welcome to Type of view");
	   	break;

	   	case 2:
 	   	System.out.println("Welcome to Memory status");
	   	break;
	   	}
	break;

	case 9:
 	System.out.println("Welcome to Speed dials");
	break;

	case 10:
 	System.out.println("Welcome to Voice tags");
	break;
	
	}
 break;

 case 2:
 System.out.println("Welcome to Message");

	message = """
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

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	
	case 1:
 	System.out.println("Welcome to Write message");
	break;

	case 2:
 	System.out.println("Welcome to Inbox");
	break;

	case 3:
 	System.out.println("Welcome to Outbox");
	break;

	case 4:
 	System.out.println("Welcome to Picture message");
	break;

	case 5:
 	System.out.println("Welcome to Templates");
	break;

	case 6:
 	System.out.println("Welcome to Smileys");
	break;

	case 7:
 	System.out.println("Welcome to Message settings");

		message = """
    		press a number:

		1: Set 1
		2: Common

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

				""";
				System.out.println(message);
				select = input.nextInt();
		
				switch(select){
				
					case 1:
 					System.out.println("Welcome to Message centre number");
					break;

					case 2:
 					System.out.println("Welcome to Message sent as");
					break;

					case 3:
 					System.out.println("Welcome to Message validity");
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

				""";
				System.out.println(message);
				select = input.nextInt();
		
				switch(select){
				
					case 1:
 					System.out.println("Welcome to Delivery report");
					break;

					case 2:
 					System.out.println("Welcome to Reply via same centre");
					break;

					case 3:
 					System.out.println("Welcome to Character support");
					break;
				}
			break;
		}
	break;
	
	case 8:
 	System.out.println("Welcome to Info service");
	break;

	case 9:
 	System.out.println("Welcome to Voice mailbox number");
	break;

	case 10:
 	System.out.println("Welcome to Service command editor");
	break;

	}

 break;

 case 3:
 System.out.println("Welcome to Chat");
 break;

 case 4:
 System.out.println("Welcome to Call register");

	message = """
    	press a number:

	1: Missed calls
	2: Recieving calls
	3: Dialled numbers
	4: Erase recent call lists
	5: Show call duration
	6: Show call costs
	7: call cost settings
	8: Prepaid credit

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	
	case 1:
	System.out.println("Welcome to Missed calls");
	break;
	
	case 2:
	System.out.println("Welcome to Recieving calls");
	break;
	
	case 3:
	System.out.println("Welcome to Dialled numbers");
	break;
	
	case 4:
	System.out.println("Welcome to Erase recent call lists");
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

			""";
			System.out.println(message);
			select = input.nextInt();

			switch(select){
			case 1:
			System.out.println("Last call duration");
			break;
			
			case 2:
			System.out.println("All calls' duration");
			break;
			
			case 3:
			System.out.println("Received calls' duration");
			break;
			
			case 4:
			System.out.println("Dialled calls' duration");
			break;
			
			case 5:
			System.out.println("Clear timers");
			break;
			
			}
		

	break;
	
	case 6:
	System.out.println("Welcome to Show call costs");

			message = """
    			press a number:

			1: Last call cost
			2: All calls' cost
			3: Clear counters

			""";
			System.out.println(message);
			select = input.nextInt();

			switch(select){
			case 1:
			System.out.println("Last call cost");
			break;
			
			case 2:
			System.out.println("All calls' cost");
			break;
			
			case 3:
			System.out.println("Clear counters");
			break;
			
			}
		
	break;
	
	case 7:
	System.out.println("Welcome to call cost settings");

			message = """
    			press a number:

			1: Call cost limit
			2: Show costs in

			""";
			System.out.println(message);
			select = input.nextInt();

			switch(select){
			case 1:
			System.out.println("Call cost limit");
			break;
			
			case 2:
			System.out.println("Show costs in");
			break;
			
			}
	break;
	
	case 8:
	System.out.println("Welcome to Prepaid credit");
	break;
	
	}

 break;

 case 5:
 System.out.println("Welcome to Tone");
	message = """
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

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	
	case 1:
	System.out.println("Ringing tone");
	break;
	
	case 2:
	System.out.println("Ringing volume");
	break;
	
	case 3:
	System.out.println("Incoming call alert");
	break;
	
	case 4:
	System.out.println("Composer");
	break;

	case 5:
	System.out.println("Message alert tone");
	break;

	
	case 6:
	System.out.println("Keypad tones");
	break;

	
	case 7:
	System.out.println("Warning and game tones");
	break;

	
	case 8:
	System.out.println("Viberating alert");
	break;

	case 9:
	System.out.println("Screen saver");
	break;

	}
 break;

 case 6:
 System.out.println("Welcome to Settings");

	message = """
    	press a number:

	1: Call Settings
	2: Phone settings
	3: Security settings
	4: Restore factory settings
	
	""";
	System.out.println(message);
	select = input.nextInt();

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
		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
	
		case 1:
		System.out.println("Automatic redial");
		break;
	
		case 2:
		System.out.println("Speed dialing");
		break;
	
		case 3:
		System.out.println("Call waiting options");
		break;
	
		case 4:
		System.out.println("Own number sending");
		break;

		case 5:
		System.out.println("Phone line in use");
		break;

		case 6:
		System.out.println("Automatic answer");
		break;

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
		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
	
		case 1:
		System.out.println("Language");
		break;
	
		case 2:
		System.out.println("Cell info display");
		break;
	
		case 3:
		System.out.println("Welcome note");
		break;
	
		case 4:
		System.out.println("Network selection");
		break;

		case 5:
		System.out.println("Lights");
		break;

		case 6:
		System.out.println("Confirm SIM service action");
		break;

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
		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
	
		case 1:
		System.out.println("PIN code request");
		break;
	
		case 2:
		System.out.println("Call barring service");
		break;
	
		case 3:
		System.out.println("Fixed dialling");
		break;
	
		case 4:
		System.out.println("Closed user group");
		break;

		case 5:
		System.out.println("Phone security");
		break;

		case 6:
		System.out.println("Change access codes");
		break;

		}
	break;
	
	case 4:
	System.out.println("Restore factory settings");
	break;

	}

 break;

 case 7:
 System.out.println("Welcome to Call divert");
 break;

 case 8:
 System.out.println("Welcome to Games");
 break;

 case 9:
 System.out.println("Welcome to Calculator");
 break;

 case 10:
 System.out.println("Welcome to Remainders");
 break;

 case 11:
 System.out.println("Welcome to Clock");

	message = """
    	press a number:

	1: Alarm clock
	2: Clock settings
	3: Date settings
	4: Stopwatch
	5: Countdown timer
	6: Auto update of date and time
	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	
	case 1:
	System.out.println("Alarm clock");
	break;
	
	case 2:
	System.out.println("Clock settings");
	break;
	
	case 3:
	System.out.println("Date settings");
	break;
	
	case 4:
	System.out.println("Stopwatch");
	break;

	case 5:
	System.out.println("Countdown timer");
	break;

	case 6:
	System.out.println("Auto update of date and time");
	break;

	}

 break;

 case 12:
 System.out.println("Welcome to Profile");
 break;

 case 13:
 System.out.println("Welcome to SIM service");
 break;

}

}
}