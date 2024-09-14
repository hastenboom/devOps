package com.hasten.content.biz.service;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hasten.content.biz.AddressMapper;
import com.hasten.content.domain.entity.Address;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Hasten
 * @since 2024-09-14
 */
@Service
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements IAddressService {

}
