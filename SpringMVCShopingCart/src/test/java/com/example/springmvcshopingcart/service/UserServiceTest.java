package com.example.springmvcshopingcart.service;

import com.example.springmvcshopingcart.domain.UserModel;
import com.example.springmvcshopingcart.exception.FieldMissMatchException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

//    @Test
//    public void testRegister() throws FieldMissMatchException {
//        UserModel userModel = new UserModel();
//        userModel.setUsername("lhlocTest");
//        userModel.setPassword("12345");
//        userModel.setRePassword("12345");
//        userService.register(userModel);
//    }
//
//    @Test(expected = FieldMissMatchException.class)
//    public void testRegisterWithMissMatchPassword() throws FieldMissMatchException {
//        UserModel userModel = new UserModel();
//        userModel.setUsername("lhlocTest");
//        userModel.setPassword("12345");
//        userModel.setRePassword("123456");
//
//        userService.register(userModel);
//    }
// >8 => A
    // >6 => B
    // > 4 => C
    // D

    @Test
    public void testAverageMathAlphabet() {
        String expected = "B";
        String result = userService.averageMathAlphabet(8, 6);
        assert expected.equals(result);
    }

    @Test
    public void testAverageWithBoundaryAResult() {
        String expected = "A";
        String result = userService.averageMathAlphabet(8, 8);
        assert expected.equals(result);
    }

    @Test
    public void testAverageWithBoundaryOverAResult() {
        String expected = "A";
        String result = userService.averageMathAlphabet(10, 10);
        assert expected.equals(result);
    }

    @Test
    public void testAverageWithBoundaryDResult() {
        String expected = "D";
        String result = userService.averageMathAlphabet(0, 0);
        assert expected.equals(result);
    }

    @Test(expected = RuntimeException.class)
    public void testAverageWithNegativeInput() {
        userService.averageMathAlphabet(-1, -1);
    }

    @Test(expected = RuntimeException.class)
    public void testAverageWithPositiveInput() {
        userService.averageMathAlphabet(11, 11);
    }


//    public static void main(String[] args) throws NoSuchAlgorithmException {
//        Random random = new Random();
//        System.out.println(random.nextLong());
//        System.out.println("===========");
//        SecureRandom secureRandom = SecureRandom.getInstanceStrong();
//        System.out.println(secureRandom.nextLong());
//    }
}
