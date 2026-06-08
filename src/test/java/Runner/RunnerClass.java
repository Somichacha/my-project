package Runner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasspathResource("Features")
@ConfigurationParameter(key = "cucumber.glue", value = "Step_definition,Hooks")
@ConfigurationParameter(key = "cucumber.filter.tags", value = "not @ignore")

public class RunnerClass {

}
