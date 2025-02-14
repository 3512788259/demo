package com.example.demo.pojp;

import com.meritdata.ids.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 供需资源关联表
 *
 * @author ZhangWei
 */
@Entity
@Table(name = "onelink_supply_demand_resource")
public class OnelinkSupplyDemandResource extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 4449330156170209696L;

    /**
     * 关联资源类型（0：标签，1：图片）
     */
    @Column(name = "type")
    private String type;

    /**
     * 资源id
     */
    @Column(name = "resource_id")
    private String resourceId;

    /**
     * 供需信息Id
     */
    @Column(name = "supply_demand_info_id")
    private String supplyDemandInfoId;

    /**
     * 关联资源类型（0：标签，1：图片）
     */
    public OnelinkSupplyDemandResource setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 关联资源类型（0：标签，1：图片）
     */
    public String getType() {
        return type;
    }

    /**
     * 资源id
     */
    public OnelinkSupplyDemandResource setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源id
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * 供需信息Id
     */
    public OnelinkSupplyDemandResource setSupplyDemandInfoId(String supplyDemandInfoId) {
        this.supplyDemandInfoId = supplyDemandInfoId;
        return this;
    }

    /**
     * 供需信息Id
     */
    public String getSupplyDemandInfoId() {
        return supplyDemandInfoId;
    }

    @Override
    public String toString() {
        return "OnelinkSupplyDemandResource{" +
                "type=" + type + '\'' +
                "resourceId=" + resourceId + '\'' +
                "supplyDemandInfoId=" + supplyDemandInfoId + '\'' +
                '}';
    }
}
