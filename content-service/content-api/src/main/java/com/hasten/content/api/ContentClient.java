package com.hasten.content.api;

import com.hasten.content.domain.entity.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 *
 * @author Hasten
 */

@FeignClient(value = "content-service")
public interface ContentClient {

    @GetMapping("/content/test/get")
    String testGet();

    @GetMapping("/content/test/db")
    List<Address> testDb();

}
