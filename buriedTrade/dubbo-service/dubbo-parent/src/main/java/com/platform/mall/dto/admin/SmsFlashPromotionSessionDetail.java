package com.platform.mall.dto.admin;

import com.platform.mall.entity.admin.SmsFlashPromotionSession;

/**
 * 包含商品数量的场次信息
 * @author AllDataDC
 */
public class SmsFlashPromotionSessionDetail extends SmsFlashPromotionSession {
    private Long productCount;

    public Long getProductCount() {
        return productCount;
    }

    public void setProductCount(Long productCount) {
        this.productCount = productCount;
    }
}
