package cn.jbone.cms.common.dataobject;

import cn.jbone.cms.common.enums.StatusEnum;
import cn.jbone.common.api.dto.SearchListDTO;
import lombok.Data;

import java.util.List;

@Data
public class ArticleCommonRequestDO extends SearchListDTO {

    /**
     * 标题
     */
    private String title;

    /**
     * 关键字，用于SEO
     */
    private String keywords;

    /**
     * 描述，摘要，用于SEO和列表摘要
     */
    private String description;

    /**
     * 文章状态，枚举,默认发布状态
     */
    private List<StatusEnum> statusList;

    /**
     * 分类
     */
    private Long categoryId;

    /**
     * 文章模版
     */
    private Long templateId;

    /**
     * 文章标签
     */
    private List<Long> tagIds;

    /**
     * 作者ID
     */
    private Integer creator;

}
