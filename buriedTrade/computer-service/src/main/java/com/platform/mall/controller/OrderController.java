package com.platform.mall.controller;

import com.platform.mall.entity.Result;
import com.platform.mall.service.OrderService;
import com.platform.mall.utils.ResultUtil;
import com.platform.mall.dto.front.Order;
import com.platform.mall.dto.front.OrderInfo;
import com.platform.mall.dto.front.PageOrder;
import com.platform.mall.entity.TbThanks;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author AllDataDC
 */
@RestController
@Api(description = "订单")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/member/orderList",method = RequestMethod.GET)
    @ApiOperation(value = "获得用户所有订单")
    public Result<PageOrder> getOrderList(String userId,
                                          @RequestParam(defaultValue = "1") int page,
                                          @RequestParam(defaultValue = "5") int size){

        PageOrder pageOrder=orderService.getOrderList(Long.valueOf(userId), page, size);
        return new ResultUtil<PageOrder>().setData(pageOrder);
    }

    @RequestMapping(value = "/member/orderDetail",method = RequestMethod.GET)
    @ApiOperation(value = "通过id获取订单")
    public Result<Order> getOrder(String orderId){

        Order order=orderService.getOrder(Long.valueOf(orderId));
        return new ResultUtil<Order>().setData(order);
    }

    @RequestMapping(value = "/member/addOrder",method = RequestMethod.POST)
    @ApiOperation(value = "创建订单")
    public Result<Object> addOrder(@RequestBody OrderInfo orderInfo){

        Long orderId=orderService.createOrder(orderInfo);
        return new ResultUtil<Object>().setData(orderId.toString());
    }

    @RequestMapping(value = "/member/cancelOrder",method = RequestMethod.POST)
    @ApiOperation(value = "取消订单")
    public Result<Object> cancelOrder(@RequestBody Order order){

        int result=orderService.cancelOrder(order.getOrderId());
        return new ResultUtil<Object>().setData(result);
    }

    @RequestMapping(value = "/member/delOrder",method = RequestMethod.GET)
    @ApiOperation(value = "删除订单")
    public Result<Object> delOrder(String orderId){

        int result=orderService.delOrder(Long.valueOf(orderId));
        return new ResultUtil<Object>().setData(result);
    }

    @RequestMapping(value = "/member/payOrder",method = RequestMethod.POST)
    @ApiOperation(value = "支付订单")
    public Result<Object> payOrder(@RequestBody TbThanks tbThanks){

        int result=orderService.payOrder(tbThanks);
        return new ResultUtil<Object>().setData(result);
    }
}
