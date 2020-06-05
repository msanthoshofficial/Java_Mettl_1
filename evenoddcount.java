import java.io.*;
import java.util.*;
//Read only region start
class UsermainCode
{
	public int oddof5(int input1,int input2,int input3,int input4,int input5,String input6) {
		int ct=0;
		if(input6.equals("odd")) {
			if(input1%2!=0) {
				ct+=1;
			}
			if(input2%2!=0) {
				ct+=1;
			}
			if(input3%2!=0) {
				ct+=1;
			}
			if(input4%2!=0) {
				ct+=1;
			}
			if(input5%2!=0) {
				ct+=1;
			}
		}
		else if(input6.equals("even")) {
			if(input1%2==0) {
				ct+=1;
			}
			if(input2%2==0) {
				ct+=1;
			}
			if(input3%2==0) {
				ct+=1;
			}
			if(input4%2==0) {
				ct+=1;
			}
			if(input5%2==0) {
				ct+=1;
			}
}
		return ct;

	}
}