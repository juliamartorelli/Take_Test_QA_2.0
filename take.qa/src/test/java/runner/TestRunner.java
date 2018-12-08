package runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import scripts.FollowScriptTest;

@RunWith(Suite.class)
@SuiteClasses({
	FollowScriptTest.class
})

public class TestRunner {

}
