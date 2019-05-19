package com.xuecheng.framework.domain.cms.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Auther: SuperJ
 * @Date: 2019/4/27 14:04
 * @Description:
 */
@Data
public class QueryPageRequest {
    //接收页面查询的查询条件

    //站点id
    @ApiModelProperty("站点id")
    private String siteId;
    //页面id
    private String pageId;
    //页面名称
    private String pageName;
    //别名
    private String pageAliase;
    //模板Id
    private String templateId;
}
