import java.util.*;
public class addTwoNumbersRun {
	public static void main(String[] args){
		double fNumber=0;
		int sizelLBigger;
		double pow=0;
		double base=10;
		addTwoNumbers num1=new addTwoNumbers();
		num1.addTwoNumbersDisplay();
		addTwoNumbers num2=new addTwoNumbers();
		num2.addTwoNumbersDisplay();
		if (num1.sizelL>=num2.sizelL){
			sizelLBigger=num1.sizelL;
		}else{
			sizelLBigger=num2.sizelL;
		}
		for (int x=0;x<=sizelLBigger-1;x++){
			fNumber=fNumber+((num1.addTwoNumbersValueAtIndex(x)+num2.addTwoNumbersValueAtIndex(x))*(Math.pow(base, pow)));
			System.out.println("base*power"+(int)(Math.pow(base, pow)));
			System.out.println("num1x:"+num1.addTwoNumbersValueAtIndex(x));
			System.out.println("num2x:"+num2.addTwoNumbersValueAtIndex(x));
			System.out.println("pow:"+(int)pow);
			System.out.println("fNumber:"+(int)fNumber);
			pow++;
		}
		addTwoNumbers num3=new addTwoNumbers((int) fNumber);
		System.out.println("Result:"+(int)fNumber);
		num3.addTwoNumbersDisplay();
		
	}
	
}
class addTwoNumbers{
	private int num; 
	private int rem;
	private double drem;
	private int divs=10;
	private double ddivs=10;
	private int divi;
	private double ddivi;
	private int pDiv=10;
	private int pow=1;
	private boolean cond=true;
	protected int sizelL;
	private LinkedList lL=new LinkedList();
	Scanner scanner=new Scanner(System.in);
	addTwoNumbers(){
	System.out.println("Enter the number:");
	String inputString=scanner.nextLine();
	num=Integer.parseInt(inputString);
	System.out.println("Number entered:"+num);
	while(cond){
		divi=num/divs;
		rem=num%divs;
		lL.add(rem);
		num=divi;
		if ((num==0)&&(rem==0)){
			cond=false;
		}else if (divi<10){
			lL.add(divi);
			cond=false;
		}
	}
	sizelL=lL.size();
}
	addTwoNumbers(int Number){
		while(cond){
			divi=Number/divs;
			rem=Number%divs;
			lL.add(rem);
			Number=divi;
			if ((Number==0)&&(rem==0)){
				cond=false;
			}else if (divi<10){
				lL.add(divi);
				cond=false;
			}
		}
		sizelL=lL.size();

}

void addTwoNumbersDisplay(){
	System.out.println("LinkedList of the number entered in reverse is:"+lL);
	System.out.println("Size of this LinkedList is:"+sizelL);
}	
int addTwoNumbersValueAtIndex(int i){
	int lLValueAtIndex;
if (i<lL.size()){	
	lLValueAtIndex=(int)lL.get(i);
	return(lLValueAtIndex);
}else{
	return(0);
}
}
}
