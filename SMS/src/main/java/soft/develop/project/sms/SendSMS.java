package soft.develop.project.sms;

import java.io.IOException;

import org.json.JSONException;

import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.httpclient.HTTPException;

import soft.develop.project.util.RadomUtil;
import soft.develop.project.util.SMSUtil;

public class SendSMS {
	public void send() {
		String valaRadom = String.valueOf(RadomUtil.getRadom6());
		String[] params = {valaRadom,"10"};
		SmsSingleSender ssender = new SmsSingleSender(SMSUtil.APPID,SMSUtil.APPKEY);
		try {
			SmsSingleSenderResult result = 
					ssender.sendWithParam("86", "15229539533", SMSUtil.TEMPLATEID, params, SMSUtil.SMSSIGN, "", "");
			System.out.println(result);
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (HTTPException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
