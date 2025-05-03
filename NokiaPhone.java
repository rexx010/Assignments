import java.util.Scanner;

public class NokiaPhone{
public static void main(String[] args){
boolean menu = true;
while(menu){//-----------------------------------------------------------menu loop------------------------------------------------------------

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
0: Exit

""";
System.out.println(message);

 Scanner input = new Scanner(System.in);

 int select = input.nextInt();

switch(select){
 case 1:
boolean phonebookMenu = true;
while(phonebookMenu){//---------------------------------------------------------------phonebookMenu------------------------------------------------------
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
	0: Exit
	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	case 1:
boolean search = true;
while(search){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to Search");
message = """
    	press a number:

	0: Return to phonebook

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: search = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;

	case 2:
 	boolean serviceNos = true;
while(serviceNos){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to serviceNos");
message = """
    	press a number:

	0: Return to phonebook

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: serviceNos = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;

	case 3:
 	boolean Addname = true;
while(Addname){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to Add name");
message = """
    	press a number:

	0: Return to phonebook

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Addname = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;

	case 4:
 	boolean Erase = true;
while(Erase){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to Erase");
message = """
    	press a number:

	0: Return to phonebook

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Erase = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;

	case 5:
 	boolean Edit = true;
while(Edit){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to Edit");
message = """
    	press a number:

	0: Return to phonebook

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Edit = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;

	case 6:
 	boolean AssignTone = true;
while(AssignTone){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to Assign Tone");
message = """
    	press a number:

	0: Return to phonebook

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: AssignTone = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;

	case 7:
 	boolean Sendbcard = true;
while(Sendbcard){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to Send b' card");
message = """
    	press a number:

	0: Return to phonebook

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Sendbcard = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;

	case 8:
 	boolean Options = true;
while(Options){//--------------------------------------------------------------------------------------------------------------------

 	System.out.println("Welcome to Options");

	   	message = """
    	   	press a number:

	   	1: Type of view
	  	2: Memory status
		0: go back to options
	   	""";
	   	System.out.println(message);
	   	select = input.nextInt();
	
	   	switch(select){
	   	case 1:
 	boolean Typeofview = true;
while(Typeofview){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to Types of view");
message = """
    	press a number:

	0: Return to phonebook

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Typeofview = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;

	   	case 2:
 	boolean MemoryStatus = true;
while(MemoryStatus){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to Memory Status");
message = """
    	press a number:

	0: Return to phonebook

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: MemoryStatus = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;

		case 0: Options = false;
		break;

		default: System.out.println("Invalid - Try again");
	   	}//---------------------------------------------------------------------------------------------------------------------------
		}
		

	break;

	case 9:
 	boolean Speeddials = true;
while(Speeddials){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to Speed dials");
message = """
    	press a number:

	0: Return to phonebook

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Speeddials = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;

	case 10:
 	boolean VoiceTags = true;
while(VoiceTags){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to Voice Tags");
message = """
    	press a number:

	0: Return to phonebook

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: VoiceTags = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;
	
	case 0:
	phonebookMenu = false;

	 default: System.out.println("Who you be???... Do am again");
	}


}//-----------------------------------------------------------------------phonebookMenu loop end----------------------------------------------------
 break;


 case 2:
boolean Messages = true;
while(Messages){//---------------------------------------------------------------Messages------------------------------------------------------
 System.out.println("Welcome to Messages");


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
	0: Return to menu

	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	
	case 1:
 	boolean Writemessage = true;
while(Writemessage){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to Writemessage");
message = """
    	press a number:

	0: Return to Messages

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Writemessage = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;

	case 2:
 	 	boolean Inbox = true;
while(Inbox){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to Inbox");
message = """
    	press a number:

	0: Return to Messages

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Inbox = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;

	case 3:
 	 	boolean Outbox = true;
while(Outbox){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to Outbox");
message = """
    	press a number:

	0: Return to Messages

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Outbox = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;

	case 4:
 	boolean PictureMessage = true;
while(PictureMessage){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to PictureMessage");
message = """
    	press a number:

	0: Return to Messages

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: PictureMessage = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;

	case 5:
 	boolean Templates = true;
while(Templates){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to Templates");
message = """
    	press a number:

	0: Return to Messages

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Templates = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}

	break;

	case 6:
 	boolean Smileys = true;
while(Smileys){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to Smileys");
message = """
    	press a number:

	0: Return to Messages

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Smileys = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;

	case 7:
 	boolean MessageSetting = true;
while(MessageSetting){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to Message settings");

		message = """
    		press a number:

		1: Set 1
		2: Common
		0: Return

		""";
		System.out.println(message);
		select = input.nextInt();
		
		switch(select){
			case 1:
			 	boolean Set1 = true;
while(Set1){//--------------------------------------------------------------------------------------------------------------------
 			System.out.println("Welcome to Set 1");

				message = """
    				press a number:

				1: Message centre number
				2: Message sent as
				3: Message validity
				0: Return to MessageSettings

				""";
				System.out.println(message);
				select = input.nextInt();
		
				switch(select){
				
					case 1:
 boolean MessageCentre = true;
while(MessageCentre){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to MessageCentre");
message = """
    	press a number:

	0: Return to Set 1

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: MessageCentre = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}

					break;

					case 2:
 boolean SentAs = true;
while(SentAs){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to SentAs");
message = """
    	press a number:

	0: Return to Set 1

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: SentAs = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
					break;

					case 3:
 boolean MessageValidity = true;
while(MessageValidity){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to MessageValidity");
message = """
    	press a number:

	0: Return to Set 1

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: MessageValidity = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
					break;
	case 0: Set1 = false;
		break;



				
	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
			break;

			case 2:
  boolean Common = true;
while(Common){//--------------------------------------------------------------------------------------------------------------------
	System.out.println("Welcome to Common");
			
			message = """
    				press a number:

				1: Delivery report
				2: Reply via same centre
				3: Character support
				0: Return to MessageSettings

				""";
				System.out.println(message);
				select = input.nextInt();
		
				switch(select){
				
					case 1:
  boolean DeliveryReport = true;
while(DeliveryReport){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to DeliveryReport");
message = """
    	press a number:

	0: Return to Common

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: DeliveryReport = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
					break;

					case 2:
  boolean ReplyViaCentre = true;
while(ReplyViaCentre){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to Reply Via Centre");
message = """
    	press a number:

	0: Return to Common

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: ReplyViaCentre = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
					break;

					case 3:
  boolean CharacterSupport = true;
while(CharacterSupport){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to Character Support");
message = """
    	press a number:

	0: Return to Common

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: CharacterSupport = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	

	break;

	case 0:
	Common = false;

default: System.out.println("Invalid - Try again");
}

}

	break;

	case 0:
	MessageSetting = false;

default: System.out.println("Invalid - Try again");


}
}//--------------------------------------------------------------------------------------------------------------------------------------------

		

	break;
	
	case 8:
 	boolean InfoService = true;
while(InfoService){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to InfoService");
message = """
    	press a number:

	0: Return to Messages

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: InfoService = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;

	case 9:
 	boolean VoiceMailBoxMessage = true;
while(VoiceMailBoxMessage){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to Voice Mail Box Message");
message = """
    	press a number:

	0: Return to Messages

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: VoiceMailBoxMessage = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;

	case 10:
 	boolean Servicecommandeditor = true;
while(Servicecommandeditor){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to Service command editor");
message = """
    	press a number:

	0: Return to Messages

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Servicecommandeditor = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;

	case 0:
	Messages = false;

	 default: System.out.println("Who you be???... Do am again");
	}


}//-----------------------------------------------------------------------Messages----------------------------------------------------
 break;

 case 3:
boolean Chat = true;
while(Chat){//---------------------------------------------------------------Chat------------------------------------------------------
 	 	System.out.println("Welcome to Chat");
message = """
    	press a number:

	0: Return to Menu

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Chat = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}

 break;

 case 4:
boolean Callregister = true;
while(Callregister){//---------------------------------------------------------------Callregister------------------------------------------------------
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
	0: return to the menu
	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	
	case 1:
boolean MissedCall = true;
while(MissedCall){//---------------------------------------------------------------MissedCall------------------------------------------------------
 	 	System.out.println("Welcome to Missed Call");
message = """
    	press a number:

	0: Return to Call register

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: MissedCall = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;
	
	case 2:
boolean ReceivingCall = true;
while(ReceivingCall){//---------------------------------------------------------------Receiving Call------------------------------------------------------
 	 	System.out.println("Welcome to Receiving call");
message = """
    	press a number:

	0: Return to Call register

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: ReceivingCall = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;
	
	case 3:
boolean DialledNumber = true;
while(DialledNumber){//---------------------------------------------------------------Dialled Number------------------------------------------------------
 	 	System.out.println("Welcome to Dialled Number");
message = """
    	press a number:

	0: Return to Call register

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: DialledNumber = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;
	
	case 4:
boolean EraseRecentCallList = true;
while(EraseRecentCallList){//----------------------------------------------Erase Recent Call List------------------------------------------------------
 	 	System.out.println("Welcome to Erase Recent Call List");
message = """
    	press a number:

	0: Return to Call register

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: EraseRecentCallList = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;
	
	case 5:
boolean callduration = true;
while(callduration){//----------------------------------------------callduration------------------------------------------------------
	System.out.println("Welcome to show call duration");
		
			message = """
    			press a number:

			1: Last call duration
			2: All calls' duration
			3: Received calls' duration
			4: Dialled calls' duration
			5: Clear timers
			0: return to call register
			""";
			System.out.println(message);
			select = input.nextInt();

			switch(select){
			case 1:
boolean Lastcallduration = true;
while(Lastcallduration){//----------------------------------------------Lastcallduration------------------------------------------------------
 	 	System.out.println("Welcome to Last call duration");
message = """
    	press a number:

	0: Return to Call Duration

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Lastcallduration = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
			break;
			
			case 2:
boolean AllCallDuration = true;
while(AllCallDuration){//----------------------------------------------AllCallDuration------------------------------------------------------
 	 	System.out.println("Welcome to All Call Duration");
message = """
    	press a number:

	0: Return to Call Duration

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: AllCallDuration = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
			break;
			
			case 3:
boolean ReceivedCallDurations = true;
while(ReceivedCallDurations){//----------------------------------------------ReceivedCallDurations------------------------------------------------------
 	 	System.out.println("Welcome to Received Call Durations");
message = """
    	press a number:

	0: Return to Call Duration

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: ReceivedCallDurations = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
			break;
			
			case 4:
boolean DialledCallDurations = true;
while(DialledCallDurations){//----------------------------------------------DialledCallDurations------------------------------------------------------
 	 	System.out.println("Welcome to Dialled Call Durations");
message = """
    	press a number:

	0: Return to Call Duration

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: DialledCallDurations = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
			break;
			
			case 5:
boolean ClearTimers = true;
while(ClearTimers){//----------------------------------------------ClearTimers------------------------------------------------------
 	 	System.out.println("Welcome to Clear Timer");
message = """
    	press a number:

	0: Return to Call Duration

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: ClearTimers = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
			break;
			
		case 0:
	callduration = false;

	 default: System.out.println("Who you be???... Do am again");
	


}//-----------------------------------------------------------------------------------------------------------------------------------
}		
		

	break;
	
	case 6:
boolean Showcallcost = true;
while(Showcallcost){//----------------------------------------------Showcallcost------------------------------------------------------
	System.out.println("Welcome to Show call costs");

			message = """
    			press a number:

			1: Last call cost
			2: All calls' cost
			3: Clear counters
			0: return to Call register
			""";
			System.out.println(message);
			select = input.nextInt();

			switch(select){
			case 1:
boolean Lastcallcost = true;
while(Lastcallcost){//----------------------------------------------Lastcallcost------------------------------------------------------
 	 	System.out.println("Welcome to Last call cost");
message = """
    	press a number:

	0: Return to Show call cost

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Lastcallcost = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
			break;
			
			case 2:
boolean Allcallcost = true;
while(Allcallcost){//----------------------------------------------Allcallcost------------------------------------------------------
 	 	System.out.println("Welcome to All call cost");
message = """
    	press a number:

	0: Return to Show call cost

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Allcallcost = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
			break;
			
			case 3:
boolean Clearcounter = true;
while(Clearcounter){//----------------------------------------------Clearcounter------------------------------------------------------
 	 	System.out.println("Welcome to Clear counter");
message = """
    	press a number:

	0: Return to Show call cost

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Clearcounter = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
			break;
			
			
		case 0:
	Showcallcost = false;

	 default: System.out.println("Who you be???... Do am again");
	


}//-----------------------------------------------------------------------------------------------------------------------------------
}		

	break;
	
	case 7:
boolean Callcostsettings = true;
while(Callcostsettings){//----------------------------------------------Callcostsettings------------------------------------------------------
	System.out.println("Welcome to call cost settings");

			message = """
    			press a number:

			1: Call cost limit
			2: Show costs in
			0: return to Call cost settings
			""";
			System.out.println(message);
			select = input.nextInt();

			switch(select){
			case 1:
boolean Callcostlimit = true;
while(Callcostlimit){//----------------------------------------------Callcostlimit------------------------------------------------------
 	 	System.out.println("Welcome to Call cost limit");
message = """
    	press a number:

	0: Return to call cost settings

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Callcostlimit = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
			break;
			
			case 2:
boolean CostIn = true;
while(CostIn){//----------------------------------------------CostIn------------------------------------------------------
 	 	System.out.println("Welcome to Cost in");
message = """
    	press a number:

	0: Return to call cost settings

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: CostIn = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
			break;
			
			
		case 0:
	Callcostsettings = false;

	 default: System.out.println("Who you be???... Do am again");
	


}//-----------------------------------------------------------------------------------------------------------------------------------
}
	break;
	
	case 8:
boolean PrepaidCredit = true;
while(PrepaidCredit){//----------------------------------------------PrepaidCredit------------------------------------------------------
 	 	System.out.println("Welcome to Prepaid Credit");
message = """
    	press a number:

	0: Return to Call register

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: PrepaidCredit = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;
	
		case 0:
	Callregister = false;

	 default: System.out.println("Who you be???... Do am again");
	


}//-----------------------------------------------------------------------Callregister end----------------------------------------------------
}
 break;

 case 5:
boolean Tone = true;
while(Tone){//---------------------------------------------------------------Tone------------------------------------------------------
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
	0: Return to menu
	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	
	case 1:
 	boolean Ringingtone = true;
while(Ringingtone){//--------------------------------------------------------------------------------------------------------------------
	System.out.println("Ringing tone");
message = """
    	press a number:

	0: Return to menu

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Ringingtone = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;
	
	case 2:
 	boolean RingingVolume = true;
while(RingingVolume){//--------------------------------------------------------------------------------------------------------------------
	System.out.println("Ringing Volume");
message = """
    	press a number:

	0: Return to menu

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: RingingVolume = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;
	
	case 3:
 	boolean IncomingCallAlert = true;
while(IncomingCallAlert){//--------------------------------------------------------------------------------------------------------------------
	System.out.println("Incoming Call Alert");
message = """
    	press a number:

	0: Return to menu
	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: IncomingCallAlert = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;
	
	case 4:
 	boolean Composer = true;
while(Composer){//--------------------------------------------------------------------------------------------------------------------
	System.out.println("Composer");
message = """
    	press a number:

	0: Return to menu

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Composer = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;

	case 5:
 	boolean MessageAlertTone = true;
while(MessageAlertTone){//--------------------------------------------------------------------------------------------------------------------
	System.out.println("Message Alert Tone");
message = """
    	press a number:

	0: Return to menu

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: MessageAlertTone = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}

	break;

	
	case 6:
 	boolean KeypadTone = true;
while(KeypadTone){//--------------------------------------------------------------------------------------------------------------------
	System.out.println("Keypad Tone");
message = """
    	press a number:

	0: Return to menu

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: KeypadTone = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;

	
	case 7:
 	boolean WarningAndGameTone = true;
while(WarningAndGameTone){//--------------------------------------------------------------------------------------------------------------------
	System.out.println("Warning And Game Tone");
message = """
    	press a number:

	0: Return to menu

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: WarningAndGameTone = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;

	
	case 8:
 	boolean VibratingTone = true;
while(VibratingTone){//--------------------------------------------------------------------------------------------------------------------
	System.out.println("Vibrating Tone");
message = """
    	press a number:

	0: Return to menu

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: VibratingTone = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;

	case 9:
 	boolean ScreenSaver = true;
while(ScreenSaver){//--------------------------------------------------------------------------------------------------------------------
	System.out.println("Screen Saver");
message = """
    	press a number:

	0: Return to menu

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: ScreenSaver = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;

	
	case 0:
	Tone = false;

	 default: System.out.println("Who you be???... Do am again");
	


}//-----------------------------------------------------------------------Tone loop end----------------------------------------------------
}
 break;

 case 6:
boolean Settings = true;
while(Settings){//---------------------------------------------------------------Settings------------------------------------------------------

 System.out.println("Welcome to Settings");

	message = """
    	press a number:

	1: Call Settings
	2: Phone settings
	3: Security settings
	4: Restore factory settings
	0: Return to menu
	
	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	
	case 1:
 boolean CallSettings = true;
while(CallSettings){//--------------------------------------------------------------------------------------------------------------------------
	System.out.println("Call Settings");

		message = """
    		press a number:

		1: Automatic redial
		2: Speed dialing
		3: Call waiting options
		4: Own number sending
		5: Phone line in use
		6: Automatic answer
		0: return to Settings
		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
	
		case 1:
 	boolean AutomaticRedial = true;
while(AutomaticRedial){//--------------------------------------------------------------------------------------------------------------------
	System.out.println("Welcome to automatic redial");
message = """
    	press a number:

	0: Return to call settings

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: AutomaticRedial = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
		break;
	
		case 2:
 	boolean Speeddialling = true;
while(Speeddialling){//--------------------------------------------------------------------------------------------------------------------
	System.out.println("Welcome to Speed dialling");
message = """
    	press a number:

	0: Return to call settings

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Speeddialling = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
		break;
	
		case 3:
 	boolean Callwaitingoption = true;
while(Callwaitingoption){//--------------------------------------------------------------------------------------------------------------------
	System.out.println("Welcome to Call waiting option");
message = """
    	press a number:

	0: Return to call settings

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Callwaitingoption = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
		break;
	
		case 4:
 	boolean Ownnumbersending = true;
while(Ownnumbersending){//--------------------------------------------------------------------------------------------------------------------
	System.out.println("Welcome to Own number sending");
message = """
    	press a number:

	0: Return to call settings

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Ownnumbersending = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
		break;

		case 5:
 	boolean Phonelineinuse = true;
while(Phonelineinuse){//--------------------------------------------------------------------------------------------------------------------
	System.out.println("Welcome to Phone line in use");
message = """
    	press a number:

	0: Return to call settings

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Phonelineinuse = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
		break;

		case 6:
 	boolean AutomaticAnswer = true;
while(AutomaticAnswer){//--------------------------------------------------------------------------------------------------------------------
	System.out.println("Welcome to Automatic Answer");
message = """
    	press a number:

	0: Return to call settings

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: AutomaticAnswer = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
		break;

		
	
	case 0:
	CallSettings = false;

	 default: System.out.println("Who you be???... Do am again");
	


}//----------------------------------------------------------------------------------------------------------------------------------------
}
	break;
	
	case 2:
 boolean PhoneSettings = true;
while(PhoneSettings){//------------------------------------------------------------------------------------------------------------------------------
	System.out.println("Phone settings");

		message = """
    		press a number:

		1: Language
		2: Cell info display
		3: Welcome note
		4: Network selection
		5: Lights
		6: Confirm SIM service action
		0: return to settings
		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
	
		case 1:
 	boolean Language = true;
while(Language){//--------------------------------------------------------------------------------------------------------------------
	System.out.println("Welcome to Language");
message = """
    	press a number:

	0: Return to phone settings

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Language = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
		break;
	
		case 2:
 	boolean CellinfoDisplay = true;
while(CellinfoDisplay){//--------------------------------------------------------------------------------------------------------------------
	System.out.println("Welcome to Cell info Display");
message = """
    	press a number:

	0: Return to phone settings

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: CellinfoDisplay = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
		break;
	
		case 3:
 	boolean WelcomeNote = true;
while(WelcomeNote){//--------------------------------------------------------------------------------------------------------------------
	System.out.println("Welcome to Welcome Note");
message = """
    	press a number:

	0: Return to phone settings

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: WelcomeNote = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
		break;
	
		case 4:
 	boolean NetworkSelection = true;
while(NetworkSelection){//--------------------------------------------------------------------------------------------------------------------
	System.out.println("Welcome to Network Selection");
message = """
    	press a number:

	0: Return to phone settings

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: NetworkSelection = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
		break;

		case 5:
 	boolean Lights = true;
while(Lights){//--------------------------------------------------------------------------------------------------------------------
	System.out.println("Welcome to Lights");
message = """
    	press a number:

	0: Return to phone settings

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Lights = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
		break;

		case 6:
 	boolean SimServiceAction = true;
while(SimServiceAction){//--------------------------------------------------------------------------------------------------------------------
	System.out.println("Welcome to Confirm Sim Service Action");
message = """
    	press a number:

	0: Return to phone settings

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: SimServiceAction = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
		break;

	
	case 0:
	PhoneSettings = false;

	 default: System.out.println("Who you be???... Do am again");
	


}//----------------------------------------------------------------------------------------------------------------------------------------
}
	break;
	
	case 3:
 boolean SecuritySettings = true;
while(SecuritySettings){//--------------------------------------------------------------------------------------------------------------------
	System.out.println("Security settings");

		message = """
    		press a number:

		1: PIN code request
		2: Call barring service
		3: Fixed dialling
		4: Closed user group
		5: Phone security
		6: Change access codes
		0: return to settings
		""";
		System.out.println(message);
		select = input.nextInt();

		switch(select){
	
		case 1:
 	boolean Pincoderequest = true;
while(Pincoderequest){//--------------------------------------------------------------------------------------------------------------------
	System.out.println("Welcome to Pin code request");
message = """
    	press a number:

	0: Return to Security settings

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Pincoderequest = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
		break;
	
		case 2:
 	boolean Callbarringservice = true;
while(Callbarringservice){//--------------------------------------------------------------------------------------------------------------------
	System.out.println("Welcome to Call barring service");
message = """
    	press a number:

	0: Return to Security settings

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Callbarringservice = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
		break;
	
		case 3:
 	boolean Fixeddialling = true;
while(Fixeddialling){//--------------------------------------------------------------------------------------------------------------------
	System.out.println("Welcome to Fixed dialling");
message = """
    	press a number:

	0: Return to Security settings

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Fixeddialling = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
		break;
	
		case 4:
	boolean ClosedUserGroup = true;
while(ClosedUserGroup){//--------------------------------------------------------------------------------------------------------------------
	System.out.println("Welcome to Closed User Group");
message = """
    	press a number:

	0: Return to Security settings

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: ClosedUserGroup = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
		break;

		case 5:
	boolean Phonesecurity = true;
while(Phonesecurity){//--------------------------------------------------------------------------------------------------------------------
	System.out.println("Welcome to Phone security");
message = """
    	press a number:

	0: Return to Security settings

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Phonesecurity = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
		break;

		case 6:
	boolean ChangeAccessCode = true;
while(ChangeAccessCode){//--------------------------------------------------------------------------------------------------------------------
	System.out.println("Welcome Change Access Code");
message = """
    	press a number:

	0: Return to Security settings

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: ChangeAccessCode = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
		break;

		
	case 0:
	SecuritySettings = false;

	 default: System.out.println("Who you be???... Do am again");
	


}//----------------------------------------------------------------------------------------------------------------------------------------
}
	break;
	
	case 4:
	boolean Restorefactorysettings = true;
while(Restorefactorysettings){//--------------------------------------------------------------------------------------------------------------------
	System.out.println("Welcome Restore factory settings");
message = """
    	press a number:

	0: Return to settings

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Restorefactorysettings = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;

		case 0:
	Settings = false;

	 default: System.out.println("Who you be???... Do am again");



}//-----------------------------------------------------------------------end of settings loop----------------------------------------------------
 }

 break;

 case 7:
 boolean CallDivert = true;
while(CallDivert){//---------------------------------------------------------------CallDivert------------------------------------------------------
 	 	System.out.println("Welcome to Call Divert");
message = """
    	press a number:

	0: Return to CallDivert

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: CallDivert = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}

 break;

 case 8:
 boolean Games = true;
while(Games){//---------------------------------------------------------------Games------------------------------------------------------
 	 	System.out.println("Welcome to Games");
message = """
    	press a number:

	0: Return to Games

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Games = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}

 break;

 case 9:
 boolean Calculator = true;
while(Calculator){//---------------------------------------------------------------Calculator------------------------------------------------------
 	 	System.out.println("Welcome to Calculator");
message = """
    	press a number:

	0: Return to Calculator

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Calculator = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}

 
 break;

 case 10:
 boolean Remainders = true;
while(Remainders){//---------------------------------------------------------------Remainders------------------------------------------------------
 	 	System.out.println("Welcome to Remainders");
message = """
    	press a number:

	0: Return to Remainders

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Remainders = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}

 
 break;

 case 11:
 boolean Clock = true;
while(Clock){//---------------------------------------------------------------Clock------------------------------------------------------
 System.out.println("Welcome to Clock");

	message = """
    	press a number:

	1: Alarm clock
	2: Clock settings
	3: Date settings
	4: Stopwatch
	5: Countdown timer
	6: Auto update of date and time
	0: Go back
	""";
	System.out.println(message);
	select = input.nextInt();

	switch(select){
	
	case 1:
 	boolean AlarmClock = true;
while(AlarmClock){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to AlarmClock");
message = """
    	press a number:

	0: Return to Clock

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: AlarmClock = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}
	break;
	
	case 2:
 	boolean ClockSetting = true;
while(ClockSetting){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to ClockSetting");
message = """
    	press a number:

	0: Return to Clock

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: ClockSetting = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}

	break;
	
	case 3:
 	boolean Datesettings = true;
while(Datesettings){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to Date settings");
message = """
    	press a number:

	0: Return to Clock

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Datesettings = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}

	break;
	
	case 4:
 	boolean StopWatch = true;
while(StopWatch){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to Stop Watch");
message = """
    	press a number:

	0: Return to Clock

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: StopWatch = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}

	break;

	case 5:
 	boolean CountdownTimer = true;
while(CountdownTimer){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to Countdown Timer");
message = """
    	press a number:

	0: Return to Clock

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: CountdownTimer = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}

	break;

	case 6:
 	boolean Autoupdateoftimeanddate = true;
while(Autoupdateoftimeanddate){//--------------------------------------------------------------------------------------------------------------------
 	System.out.println("Welcome to Autoupdateoftimeanddate");
message = """
    	press a number:

	0: Return to Clock

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Autoupdateoftimeanddate = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}

	break;

	case 0:
	Clock = false;

	 default: System.out.println("Who you be???... Do am again");
	

	//default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}


 break;

 case 12:
 boolean Profile = true;
while(Profile){//---------------------------------------------------------------Profile------------------------------------------------------
 	 	System.out.println("Welcome to Remainders");
message = """
    	press a number:

	0: Return to Profile

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: Profile = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}

 
 break;

 case 13:
 boolean SimService = true;
while(SimService){//---------------------------------------------------------------SimService------------------------------------------------------
 	 	System.out.println("Welcome to Remainders");
message = """
    	press a number:

	0: Return to SimService

	""";
	System.out.println(message);
	int selectPhonebook = input.nextInt();

	switch(selectPhonebook){
	case 0: SimService = false;
	break;

	default: System.out.println("Invalid - Try again");
}//--------------------------------------------------------------------------------------------------------------------------------------------
}

 
 break;

 case 0: System.out.println("Adios users");
 menu = false;
 break;

 default: System.out.println("Who you be???... Do am again");
}


}//----------------------------------------------------------------- while loop casing----------------------------------------------------------------------


}
}