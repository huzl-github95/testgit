package com.bear.cakeonline.test;


import javax.annotation.Resource;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


add  func2 aaaa
@Service
@Transactional(readOnly=false)
public class TestServiceImpl {


@Resource
private TestDaoImpl testDaoImpl;


public void regist(){
this.testDaoImpl.saveUser();
}
add func5;

public void login(){
this.testDaoImpl.login();
}

add  func1
public void login1(){
this.testDaoImpl.login();
}

add  func3


}
