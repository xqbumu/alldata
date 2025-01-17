package com.platform.mall.service.mobile;

import com.platform.mall.entity.mobile.LitemallFeedback;

import java.util.List;

/**
 * @author AllDataDC
 * @date 2020/3/27 11:39
 */
public interface LitemallFeedbackService {
    Integer add(LitemallFeedback feedback);

    List<LitemallFeedback> querySelective(Integer userId, String username,
                                          Integer page, Integer limit, String sort, String order);
}
