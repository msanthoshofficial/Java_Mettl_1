import java.io.*;
import java.util.*;
//Read only region start
class UsermainCode
{
	public int nthfibonacci(int input1) {
		int a =0;
		int b==1;
		for(int i=1;i<input1;i++) {
			int sum=a+b;
			a=b;
			b=sum;
		}
		if(input1==1) {
			return 0;
		}
		else {
			return a;
		}

	}
}