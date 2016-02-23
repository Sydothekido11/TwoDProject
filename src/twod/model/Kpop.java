package twod.model;

public class Kpop 
{
	private int capacity;
	private String groupName;
	
	public Kpop()
	{
		
	}

	public Kpop(int capacity, String groupName)
	{
		this.capacity = capacity;
		this.groupName = groupName;
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	
	public String getGroupName()
	{
		return groupName;
	}
	public String toString()
	{
		String kpopInfo = "This kpop is this " + groupName + " group and has the capacity of " + capacity + " members";
		
		return kpopInfo;
	}

	
}
