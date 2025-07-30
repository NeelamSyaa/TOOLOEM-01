package JavaWithSelenuim;

import org.testng.annotations.Test;

public class grouptestmethod {


@Test
	public void test() {
		
	}

    @Test(groups = { "smoke" })
    public void loginTest() {
        System.out.println("Login Test - Smoke");
    }

    @Test(groups = { "regression" })
    public void profileUpdateTest() {
        System.out.println("Profile Update Test - Regression");
    }

    @Test(groups = { "smoke", "regression" })
    public void searchTest() {
        System.out.println("Search Test - Smoke & Regression");
    }


}
