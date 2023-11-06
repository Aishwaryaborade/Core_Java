package ExceptionDemo;
//InsufficientFundException is user defined exception 
class InsufficientFundException extends Exception
{
	private double amount;
	public InsufficientFundException(double amount)
	{
		this.amount=amount;
	}
	public double getAmount()
	{
		return amount;
	}
}
class CheckingAccount
{
	private double balance;
	public CheckingAccount()
	{
		
	}
	public void Deposit(double amount)
	{
		balance+=amount;
	}
	public void withdraw(double amount)throws InsufficientFundException
	{
		if(amount<=balance)
		{
		 balance-=amount;
		}
		else
		{
			double needs=amount=balance;
			throw new InsufficientFundException(needs);
		}
	}

	public double getBalance()
	{
		return balance;
	}
}
public class WithdrawAmount {

	public static void main(String[] args) {
		CheckingAccount c=new CheckingAccount();
		System.out.println("Depositing $500.....");
		c.Deposit(500.00);
		try
		{
		System.out.println("Withdrawing 100");
		c.withdraw(100.00);
		System.out.println("Withdrawing 500");
		c.withdraw(500.00);
		}
		catch(InsufficientFundException e)
		{
			System.out.println("OOPS!!! you have insufficient Balance:"+e.getAmount());
		}
		c.getBalance();
	}

}
