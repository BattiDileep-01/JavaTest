
import java.util.ArrayList;
import java.util.stream.*;
import java.util.Comparator;

public class MinAndMax{

public static void main(String[] args){
	
ArrayList<Integer> al = new ArrayList<Integer>();

al.add(1000);
al.add(10);
al.add(9865);
al.add(5677);
al.add(868);
al.add(6464);

System.out.println(al);

int smallnumber = al.stream().min((i1 , i2) -> (i1<i2)?-1:(i1>i2)?1:0).get();
int bignumber = al.stream().max((i1 , i2) -> -i1.compareTo(i2)).get();

System.out.println(smallnumber);
System.out.println(bignumber);

}
}