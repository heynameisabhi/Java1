package oopj1;
class Tools1{
	String s1="";
	
	int len1=0;
	public String reverse(String s1) {
		String s2="";
		len1=s1.length();
		for(int i=0;i<len1;i++) {
			s2=s2+s1.substring(len1-(i+1),len1-i);
		}
		return s2;
	}
}

public class M6 {

	public static void main(String[] args) {
		Tools1 t1=new Tools1();
		System.out.println(t1.reverse("Abhishek kini"));

	}

}