import java.io.*;
import java.util.*;
//Read only region start
class UsermainCode
{
	public int nthprime(int input1) {
		int count=0,i=0,num=1;
		while (count < input1){
		      num=num+1;
		      for (i = 2; i <= num; i++){
		        if (num % i == 0) {
		          break;
		        }
		      }
		      if ( i == num){
		        count = count+1;
		      }

		}
	}
}