
public class ExecptionExample {
	
	
	public int getArrayElem(int[] ar, int elemPos) throws ArrayIndexOutOfBoundsException {
		
		//int result;
		
		if ( elemPos >= ar.length ) 
			throw new ArrayIndexOutOfBoundsException("Array index out of bound");
		
		return ar[elemPos];
		
	}
	
	
}
