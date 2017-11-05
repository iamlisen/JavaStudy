package DatePackage;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.printf("%tc",date);//包含全部日期和时间信息 星期日 十一月 05 00:53:42 CST 2017
		System.out.println("\n");
		System.out.printf("%tF",date);//"年-月-日格式" //2017-11-05
		System.out.println("\n");
		System.out.printf("%tD",date);//"月/日/年"    11/05/17
		System.out.println("\n");
		System.out.printf("%tr",date);//时:分:秒 AM/PM 12:55:12 上午
		System.out.println("\n");
		System.out.printf("%tT",date);//时:分:秒 24小时制 00:56:48
		System.out.println("\n");
		System.out.printf("%tR",date);//时:分 24小时制  00:56
		System.out.println("\n");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(simpleDateFormat.format(date));//2017-11-05
	}

}
