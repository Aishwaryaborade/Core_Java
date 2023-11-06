package enumDemo;

public enum Months {
January(1),February(2),March(3),April(4),May(5),June(6),July(7),
August(8),September(9),October(10),November(11),December(12);

	private int MonthsEnumIndex;
	Months (int name)
	  {
		this.MonthsEnumIndex=name;
   	  }
	public static void main (String...s)
	{
		System.out.println(Months.May.getMonthsEnumIndex());
		System.out.println(Months.May);
		
		System.out.println(Months.August.getMonthsEnumIndex());
		System.out.println(Months.August);
	}
	public int getMonthsEnumIndex()
	{
		return MonthsEnumIndex;
	}
}