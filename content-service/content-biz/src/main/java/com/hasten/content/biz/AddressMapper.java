package com.hasten.content.biz;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hasten.content.domain.entity.Address;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Hasten
 * @since 2024-09-14
 */
@Mapper
public interface AddressMapper extends BaseMapper<Address> {

    @Select("SELECT id,user_id, province, city FROM address limit 0,5")
    List<Address> getAddressList();

}
