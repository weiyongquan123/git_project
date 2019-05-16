package com.nnxy.model;

public class Student {
   private int id;//唯一标识ID
   private String username;//用户名
   private String password;//密码
   private int sex;
   private String love;
   public Student(int id,String username,String password,int sex,String love) {
	   super();
	   this.id=id;
	   this.username=username;
	   this.password=password;
	   this.sex=sex;
	   this.love =love;
   }

   
}
