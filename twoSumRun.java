import java.util.*;
public class twoSumRun {

	public static void main(String[] args) {
		twoSum ts=new twoSum();
		ts.twoSumProcess();
		ts.twoSumOuput();
	}

}
class twoSum {
		private ArrayList nums = new ArrayList();
		Scanner scanner=new Scanner(System.in);
		private int numsLength;
		private int target;
		private int cellVal;
		private int twoSum1;
		private int twoSum2;
		private int xts;
		private int yts;
		private boolean present;
		private boolean more=true;
		twoSum()
		{
			while (more)
			{
				System.out.println("Enter a number 2-100 for array cell value:");
				String inputString=scanner.nextLine();
				cellVal=Integer.parseInt(inputString);
				nums.add(cellVal);
				System.out.println("Do you want to enter more (Y/N)?:");
				String userResponse=scanner.nextLine();
				if (userResponse.equals("N"))
				{
					more=false;	
				}
			}
		System.out.println("Enter a number 2-100 for target:");
		String inputString=scanner.nextLine();
		target=Integer.parseInt(inputString);
		}

void twoSumProcess()
{
	System.out.println(nums);	
	for (int x=0;x<=nums.size()-1;x++)
	{
		xts=x;
		twoSum1=(int)nums.get(x);
		for (int y=0;y<=nums.size()-1;y++)
		{
			yts=y;
			if (y==x)
			{	
				continue;
			}
			else
			{
				twoSum2=target-(int)nums.get(y);	
				present=this.checkInNums(twoSum2,y,x);
			}
			if (present)
			{
				break;
			}	
		}	
		if (present)
		{
			break;
		}
	}
}
boolean checkInNums(int cellNum,int y,int x)
{
	for (int x1=0;x1<=nums.size()-1;x1++)
	{
		if (y==x1)
		{
			continue;
		}
		else
		{
			if (cellNum==(int)nums.get(x1))
			break;
		}
		
		
	}
	if (cellNum==(int)nums.get(x))
	{
		return(true);
	}
	else
	{
		return(false);
	}
}
void twoSumOuput()
{
	if (present)
	{
		System.out.println("Output ["+xts+","+yts+"]");
	}
	else
	{
		System.out.println("Target not possible by Two Sum");
	}	
}

}