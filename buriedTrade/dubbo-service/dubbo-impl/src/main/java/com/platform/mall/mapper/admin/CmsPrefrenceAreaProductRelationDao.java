package com.platform.mall.mapper.admin;

import com.platform.mall.entity.admin.CmsPrefrenceAreaProductRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自定义优选和商品关系操作
 * @author AllDataDC
 */
public interface CmsPrefrenceAreaProductRelationDao {
    int insertList(@Param("list") List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList);
}
