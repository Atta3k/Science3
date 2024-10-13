package org.example.generator.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName personaltelephone
 */
@TableName(value ="personaltelephone")
@Data
public class Personaltelephone implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    private String address;

    private String number;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
