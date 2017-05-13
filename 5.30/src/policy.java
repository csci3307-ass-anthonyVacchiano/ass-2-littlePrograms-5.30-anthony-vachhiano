import java.util.Scanner;

public class policy {
	private int accountnumber;
	private String makeandmodel;
	private String state;
	
	public  policy(int accountNumber, String makeandmodel, String state)
	{
		this.accountnumber = accountnumber;
		this.makeandmodel = makeandmodel;
		setState(state);
	}
	
	public void setAccountNumber(int accountNumber)
	{
		this.accountnumber = accountnumber;
	}
	
	public int getaccountnumber()
	{
		return accountnumber;
	}
	
	public void setMakeAndModel(String makeAndModel)
	{
		this.makeandmodel = makeAndModel;
	}
	
	public String getMakeAndModel()
	{
		return makeandmodel;
	}
	
	public void setState(String state)
	{
		if (state == "MA" || state == "NJ" || state == "NY" || state == "PA" ||
				state == "CT" || state == "ME" || state == "VT")
		{
			this.state = state;
		}
		else
		{
			System.out.printf("%S%n", "The state is incorrect.");
			System.exit(0);
		}
	}
	
	public String getState()
	{
		return state;
	}
	
	public boolean isNoFaultState()
	{
		boolean noFaultState;
		switch (getState())
		{
		case "MA":
		case "NJ":
		case "NY":
		case "PA":
		case "CT":
		case "ME":
		case "VT":
			noFaultState = true;
			break;
		default:
			noFaultState = false;
			break;				
		}
		
		return noFaultState;
	}
	public static void main(String[] args) 
	{
		int account;
		String model;
		String state;
		Scanner input = new Scanner(System.in);
		
		System.out.println("welcome to auto policy.");
		System.out.println("\tplease enter for number policy 1: ");
		System.out.println("six number account number: ");
		account = input.nextInt();
		input.nextLine(); // have to add this to consume the \n
		System.out.println("make and model of the vehicle: ");
		model = input.nextLine();
		System.out.println("state the vehicle was issued (east coast state in two letters): ");
		state = input.nextLine();
		policy policy1 = new policy(account, model, state);
		System.out.println();
		
		System.out.println("\tplease enter for policy 2: ");
		System.out.println("six number account number: ");
		account = input.nextInt();
		input.nextLine();
		System.out.println("make and model of the vehicle: ");
		model = input.nextLine();
		System.out.println("state the vehicle was issued (east coast state in two letters): ");
		state = input.nextLine();
		policy policy2 = new policy(account, model, state);
		
		
		policyInNoFaultState(policy1);
		policyInNoFaultState(policy2);
	}
	
	public static void policyInNoFaultState(policy policy)
	{
		System.out.println("The auto policy:");
		System.out.printf(
				"Acount #: %d; Car: %s; %nState %s %S a no-fault State.%n%n",
				policy.getaccountnumber(), policy.getMakeAndModel(),
				policy.getState(), (policy.isNoFaultState() ? "is": "is not"));
	}
}
