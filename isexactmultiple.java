import java.io.*;
import java.util.*;
//Read only region start
class UsermainCode
{
	public int isExactMultiple(int input1,int input2) {
		if(input1==0 ||input2==0) {
			return 3;
		}
		else if(Math.abs(input1)%input2==0) {
			return 2;
		}
		else {
			return 1;
		}
	}
}