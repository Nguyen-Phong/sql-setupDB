package basic.pro;

public class ThaoTacString2 {

	public static void main(String[] args) {
		String s="Happy New Year";
		String s1="Happy";
		String s2="New Year";
	// Tìm vị trí cuối cùng của chuỗi s2 trong chuỗi s:
		System.out.println("Vị trí cuối cùng của chuỗi s2: "+s.lastIndexOf(s2)); // trả về -1 nếu không tìm thấy
	// Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
		System.out.println(s.replace(s2, s1));
	// Loại bỏ các khoảng trắng dư thừa của s3 Ở HAI BÊN
		String s3 = "    Xin Chào      ";
		System.out.println(s3.trim());
	// Tạo chuỗi con từ s, lấy từ Index sang bên phải
		System.out.println("Chuỗi lấy từ Index số 6: "+s.substring(6));
		
	}

}
