package tests;

import org.testng.annotations.Test;

public class ActionTests extends TestBase{

    @Test
    public void actionTest()
    {
        app.action().selectInterations();
        app.action().selectDropable();
        app.action().droppebleTests();

    }
}
