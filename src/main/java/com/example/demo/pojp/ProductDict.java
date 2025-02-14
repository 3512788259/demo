package com.example.demo.pojp;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author : ZhangWei
 * @version : 1.0
 * @since : 2024-07-20 19:40
 */
@Entity
@Table(name = "dim_dict_product_yw")
@EntityListeners(AuditingEntityListener.class)
@Data
public class ProductDict implements Serializable {


    private static final long serialVersionUID = 7375450170956056065L;
    @Id
    @GeneratedValue(generator = "myIdStrategy")
    @GenericGenerator(name = "myIdStrategy", strategy = "uuid")
    @Column(length = 50)
    String id;

    @Column(name = "updatetime")
    Date updatetime;

    @Column(name = "createtime")
    Date createtime;
    /**
     * 产品编码
     */
    @Column(name = "product_code", length = 50)
    String productCode;
    /**
     * 中文名称
     */
    @Column(name = "name_szh", length = 200)
    String nameSzh;
    /**
     * 英文名称
     */
    @Column(name = "name_en", length = 200)
    String nameEn;
    /**
     * 直属父级产品编码
     */
    @Column(name = "parent_code", length = 50)
    String parentCode;
    /**
     * 所有父级产品编码
     */
    @Column(name = "ancestors", length = 200)
    String ancestors;
    /**
     * 是否有效
     */
    @Column(name = "valid")
    Integer valid;
    /**
     * 行业代码
     */
    @Column(name = "industry_code", length = 50)
    String industryCode;
    /**
     * 备注：中文
     */
    @Column(name = "rem_szh", length = 1000)
    String remSzh;
    /**
     * 备注英文
     */
    @Column(name = "rem_en", length = 1000)
    String remEn;
    /**
     * 产品层级
     */
    @Column(name = "product_level")
    Integer productLevel;
    /**
     * 排序字段
     */
    @Column(name = "sort")
    Integer sort;
}
