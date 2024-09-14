package com.hasten.content.biz;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.hasten.content.biz.service.AddressServiceImpl;
import com.hasten.content.biz.service.IAddressService;
import com.hasten.content.domain.entity.Address;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Hasten
 * @since 2024-09-14
 */
@RestController
@RequestMapping("/content")
@Api(value = "content service")
@RequiredArgsConstructor
public class ContentController {

    private final AddressMapper addressMapper;


    @GetMapping("/test/get")
    @ApiOperation(value = "test get")
    public String testGet() {
        return "/content/test/get replies: 'Wow, you can really dance'";
    }


    @GetMapping("/test/db")
    @ApiOperation(value = "test db")
    public List<Address> testDb() {
        return addressMapper.getAddressList();
    }

}
