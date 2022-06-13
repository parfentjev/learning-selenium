package uitest;

import misc.User;
import org.junit.jupiter.api.Test;
import support.dataobject.UserCredential;

@User(UserCredential.USER)
public class DummyTest extends UiTest {
    @Test
    public void run() {
        System.out.println();
    }
}
