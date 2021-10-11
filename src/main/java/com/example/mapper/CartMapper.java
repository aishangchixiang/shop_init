package com.example.mapper;

import com.example.entity.Cart;
import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CartMapper {
    void addcartitem(@Param("goodsid")Integer goodsid, @Param("quantity")Integer quantity, @Param("userid")Integer userid);
    List<Cart> getcartlist(@Param("userid")Integer userid);
    void updatequantitybygoodsid(@Param("userid") Integer userid,@Param("goodsid") Integer goodsid,@Param("quantity")Integer quantity);
    Cart getcartlistbygoodsid(@Param("userid")Integer userid,@Param("goodsid")Integer goodsid);
    Cart getcartbyid(Integer cartid);
    void deletecartbyid(Integer cartid);
    void updatequantity(@Param("cartid") Integer cartid,@Param("quantity") Integer quantity);
}
