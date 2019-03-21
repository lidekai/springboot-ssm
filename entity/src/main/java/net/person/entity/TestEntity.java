package net.person.entity;

/**
 * Created by admin on 2019/3/15.
 */
public class TestEntity {
    public String testID;
    public String testName;
    public String testSex;
    public String testAge;

    public TestEntity() {
    }

    public TestEntity(String testID, String testName, String testSex, String testAge) {
        this.testID = testID;
        this.testName = testName;
        this.testSex = testSex;
        this.testAge = testAge;
    }

    public String getTestID() {
        return testID;
    }

    public void setTestID(String testID) {
        this.testID = testID;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getTestSex() {
        return testSex;
    }

    public void setTestSex(String testSex) {
        this.testSex = testSex;
    }

    public String getTestAge() {
        return testAge;
    }

    public void setTestAge(String testAge) {
        this.testAge = testAge;
    }
}
