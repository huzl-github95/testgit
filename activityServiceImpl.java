package com.bear.cakeonline.test;


import javax.annotation.Resource;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional(readOnly=false)
public class TestServiceImpl {


@Resource
private TestDaoImpl testDaoImpl;


public void regist(){
this.testDaoImpl.saveUser();
}


public void login(){
this.testDaoImpl.login();
}


add  func2
public void login2(){
this.testDaoImpl.login();
}

}
