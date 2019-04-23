package soft.develop.project.util;

public class RadomUtil {
	public static int getRadom6(){
		int number=(int)(Math.random()*1000000+100000); 
		if (number>999999) {
			number = getRadom6();
		}
		return number;
	}
}
