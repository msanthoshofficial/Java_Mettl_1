import java.io.*;
import java.util.*;
//Read only region start
class UsermainCode
{
	public int primerange(int input1,int input2) {
		int ct=0;
		for(int i=input1;i<=input2;i++) {
			boolean flag=false;
			for(int j=0;j<i;j++) {
				if(i%j==0) {
					flag=true;
					break;
				}
			}
			if(flag==true) {
				ct+=1;
			}
			
		}
		return ct;

	}
}