package extraConcepts;

import org.openqa.selenium.os.WindowsUtils;

public class KilledUnusedProcess {

	public static void main(String[] args) {
		WindowsUtils.killByName("chromedriver.exe");
		System.out.println(WindowsUtils.thisIsWindows());

	}

}
