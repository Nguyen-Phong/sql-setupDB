package basic.pro;

public class ThaoTacString {

	public static void main(String[] args) {
		String s1 = "Happy ";
		String s2 = "New Year!";
	// Thao tác nối chuỗi
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
	// Lấy một ký tự tại vị trí số 8 của chuỗi
		char ch = s1.charAt(2);
		System.out.println(ch);
	// So sánh chuỗi;
		int comp = s1.compareTo(s2);
		if(comp==1)
		{
			System.out.println("S2 dài hơn S1. "+comp);
		}
		else
		{
			System.out.println("S2 ngắn hơn S1. "+comp);
		}
	// Tìm vị trí xuất hiện đầu tiên của chuỗi
		String s=s1+s2;
		System.out.println("Vị trí xuất hiện đầu tiên của chuỗi \""+s2+"\" trong chuỗi \""+s+"\" là "+s.indexOf(s2));
	//	
	}

}
