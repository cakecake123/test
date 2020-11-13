package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务器组的测试方法11111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务器组的测试方法2222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("这是服务器组的测试方法3333");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是服务器组的测试方法4444");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("这是服务器组之前运行的方法");
    }
    @AfterGroups("server")
    public void AfterGroupsOnServer(){
        System.out.println("这是服务器组之前运行的方法");
    }


}
