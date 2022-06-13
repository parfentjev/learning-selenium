package uitest.chat;

import misc.User;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import support.dataobject.UserCredential;
import support.page.OpenPage;
import support.page.home.shoutbox.ShoutboxPageBlock;
import uitest.UiTest;

@User(UserCredential.USER)
public class SiropuShoutboxUiTest extends UiTest {
    @Test
    @DisplayName("Send message and verify it appears as the last item on the message list")
    public void sendMessage() {
        final String message = RandomStringUtils.randomAlphanumeric(500);

        ShoutboxPageBlock shoutboxPageBlock = OpenPage.homePage().shoutboxPageBlock();
        shoutboxPageBlock.getMessageInput().sendKeys(message);
        shoutboxPageBlock.submitAndAwaitCompleted();

        shoutboxPageBlock.getMessageList()
                .getElements()
                .forEach(r -> System.out.println(r.getUsername().getText() + ": " + r.getMessage().getText()));

    }
}
