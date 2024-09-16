

package RunnerPack;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import BasePack.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\FeaturePack\\FaceBook.feature", glue = "StepPack",dryRun = false, publish = true, monochrome = true, plugin = {
		"html:target\\FaceBook.report\\FaceBook.html", "json:target\\FaceBook.report\\FaceBook.json" })

public class RunnerClass extends BaseClass {


}
