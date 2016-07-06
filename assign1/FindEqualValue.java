package assign1;

public class FindEqualValue {
	
	public static void main (String args[]){
	
		for(int T=0; T<10; T++){
			for(int O=0; O<10; O++){
				for(int G=1; G<10; G++){//there is a carry over to 'GOOD' so G must be initialized as 1 instead of 0
					for(int D=0; D<10; D++){
						if((T*100+O*10+O)*4 == (G*1000+O*100+O*10+D) & (T != O & T != G & T != D & O != G & O != D & G != D))
						{
							System.out.println ("T = "+T+ " O = "+O+ " G = "+G+ " D = "+D);			
						}
					}
				}
			}
		}
	}//moin(Sting[]): void
}//close FindEqualValue