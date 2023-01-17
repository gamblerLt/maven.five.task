/*
package lt.code.academy;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class TwilioConfig {
    public static final String ACCOUNT_SID = System.getenv("AC76d91d3bb22a85cc8c16be7cf4e31c15");
    public static final String AUTH_TOKEN = System.getenv("8e0fbeccc9f07a61e8fa7d9a168c2cca");

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = new Message.creator(
                new com.twilio.type.PhoneNumber("+14805318340"),
                "Zinutes tekstas")
                .create;
        System.out.println(message.getSid);

    }
}


*/
