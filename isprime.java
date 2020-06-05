import java.io.*;
import java.util.*;
//Read only region start
class UsermainCode
{
	public int isprime(int input1) {
			boolean flag=false;
			for(int i=2;i<input1;i++) {
				if(input1%i==0) {
					flag=true;
					break;
				}
			}
			if(flag==false) {
				return 2;
			}
			else {
				return  1;
			}

	}
}