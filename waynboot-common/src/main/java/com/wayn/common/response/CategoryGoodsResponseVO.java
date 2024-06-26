package com.wayn.common.response;

import com.wayn.common.core.entity.shop.Category;
import com.wayn.common.core.entity.shop.Goods;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @author: waynaqua
 * @date: 2023/11/6 22:19
 */
@Data
public class CategoryGoodsResponseVO implements Serializable {
    @Serial
    private static final long serialVersionUID = -7580503521421359029L;

    /**
     * 商品列表
     */
    private List<Goods> goods;

    /**
     * 分类详情
     */
    private Category category;
}
