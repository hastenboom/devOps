package com.hasten.cart.biz;

import com.hasten.content.api.ContentClient;
import com.hasten.content.domain.entity.Address;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 * @author Hasten
 */
@RestController
@RequestMapping("/cart")
@RequiredArgsConstructor
public class CartController {


    private final ContentClient contentClient;


    @GetMapping("/test/openfeign/get")
    public String testOpenFeign() {
        return contentClient.testGet();
    }

    @GetMapping("/test/openfeign/db")
    public List<Address> testDb() {
        return contentClient.testDb();
    }

}
