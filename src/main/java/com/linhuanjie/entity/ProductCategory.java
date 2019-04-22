package com.linhuanjie.entity;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;


/**
 * @author: linhuanjie
 * @description: 类名
 * @createTime : 2019-04-21 11:26
 * @email: lhuanjie@qq.com
 */
@Entity
@DynamicUpdate
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductCategory {

    /** 类目id. */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;
}
