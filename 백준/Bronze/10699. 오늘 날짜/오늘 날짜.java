import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws Exception {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("y-MM-dd");
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
	}
}