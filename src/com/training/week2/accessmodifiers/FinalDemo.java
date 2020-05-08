package com.training.week2.accessmodifiers;

public class FinalDemo /*extends User*/{

    public final String finalVariable1;

    FinalDemo() {
        finalVariable1 = "hi";
    }

    static  {

    }

    public static void method1(String args) {
        args = "Hey";
    }

    public void method2(String args) {
        args = "Hey";
    }

//    args = "Hey";

    public static void main(String[] args) {

//        User user = new User();
//        user.userName = "user1"; //Compile Time Error: Invalid, userName not visible
//        user.department = "Dept1";
    }
}

//Protected = <default> + Children
//private < default < protected < public

/*
class User { //Pojo
    protected String department;
}
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}*/
