package soft.develop.project.test;

import soft.develop.project.sms.SendSMS;

public class TestDemo {
	public static void main(String[] args) {
		//测试会不会生成6位以上的验证码
//		for (int i = 0; i < 100; i++) {
//			int a = RadomUtil.getRadom6();
//			System.out.println(a);
//		}
		SendSMS sendSMS = new SendSMS();
		sendSMS.send();
	}
}
