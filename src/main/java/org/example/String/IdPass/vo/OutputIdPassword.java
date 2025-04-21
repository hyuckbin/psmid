package org.example.String.IdPass.vo;

public class OutputIdPassword {
    private String userId;
    private String userPw;
    private String name ;
    public OutputIdPassword(String userId , String userPw,String name){
        this.userId = userId;
        this.userPw = userPw;
        this.name= name;
    }

    public void printInfo(){
        String pw = userPw.substring(0,2) + "*".repeat(userPw.length()-2);
        System.out.println(name + " " + userId + " "+pw);
    }

}
