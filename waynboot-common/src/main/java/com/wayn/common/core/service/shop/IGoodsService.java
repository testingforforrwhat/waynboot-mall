package com.wayn.common.core.service.shop;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wayn.common.core.domain.shop.Goods;
import com.wayn.common.core.domain.vo.GoodsSaveRelatedVO;
import com.wayn.common.core.domain.vo.SearchVO;
import com.wayn.common.util.R;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 商品基本信息表 服务类
 * </p>
 *
 * @author wayn
 * @since 2020-07-06
 */
public interface IGoodsService extends IService<Goods> {


    /**
     * 查询商品分页列表
     *
     * @param page  分页对象
     * @param goods 查询参数
     * @return goods分页列表
     */
    IPage<Goods> listPage(Page<Goods> page, Goods goods);

    IPage<Goods> listColumnBindGoodsPage(Page<Goods> page, Goods goods, List<Long> columnGoodsIds);

    IPage<Goods> listColumnUnBindGoodsPage(Page<Goods> page, Goods goods, List<Long> columnGoodsIds);

    /**
     * 获取商品详情（包含货品，规格，属性，分类）
     *
     * @param goodsId 商品ID
     * @return 商品详情
     */
    Map<String, Object> getGoodsInfoById(Long goodsId);

    /**
     * 保存商品相关对象
     *
     * @param goodsSaveRelatedVO 商品保存关联VO对象
     * @return R
     */
    R saveGoodsRelated(GoodsSaveRelatedVO goodsSaveRelatedVO);

    /**
     * 校验商品名称是否唯一
     *
     * @param goods 栏目信息
     * @return 状态码 0 唯一 1 不唯一
     */
    String checkGoodsNameUnique(Goods goods);

    /**
     * 删除商品相关对象
     *
     * @param goodsId 商品ID
     * @return boolean
     */
    boolean deleteGoodsRelatedByGoodsId(Long goodsId);

    /**
     * 更新商品相关对象
     *
     * @param goodsSaveRelatedVO 商品保存关联VO对象
     * @return R
     */
    R updateGoodsRelated(GoodsSaveRelatedVO goodsSaveRelatedVO);

    /**
     * 根据二级分类Id集合获取对应商品
     *
     * @param page       分页对象
     * @param l2cateList 二级分类Id集合
     * @return r
     */
    R selectListPageByCateIds(Page<Goods> page, List<Long> l2cateList);

    List<Goods> searchResult(Page<SearchVO> page, SearchVO searchVO);
}
