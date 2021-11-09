package com.haksik.ssuHaksik;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class TestController {


    @PostMapping("test")
    public TestObject test(){

        simpleImage simpleImage = new simpleImage("http://k.kakaocdn.net/dn/83BvP/bl20duRC1Q1/lj3JUcmrzC53YIjNDkqbWK/i_6piz1p.jpg","보물상자입니다");
        template template = new template();
        ArrayObject1212 arrayObject = new ArrayObject1212(simpleImage);
        template.outputs.add(arrayObject);

        TestObject testObject = new TestObject("2.0", template);

        return testObject;
    }
}
