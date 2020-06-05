import java.io.*;
import java.util.*;
//Read only region start
class UsermainCode
{
	public int lastDigitof(int input1) {
		input1=Math.abs(input1)/10;
		if(input1==0) {
			return -1;
		}
		else{
			return(input1%10);
		}
	}
}