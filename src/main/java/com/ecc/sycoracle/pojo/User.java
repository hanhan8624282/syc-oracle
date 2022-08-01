package com.ecc.sycoracle.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

/**
 * @author sunyc
 * @create 2022-07-05 16:06
 */
@Data
@Repository
@TableName(value = "syc_user")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String userName;
    private String passwd;
    private String status;
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;
    private String tokenValue;
    private String openId;
    private String phone;
}
