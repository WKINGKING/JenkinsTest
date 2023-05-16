package cn.itsource.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>User</p>
 *
 * @author 波波老师(微信 ： javabobo0513)
 */
@Data
@ApiModel(value="用户对象")
public class User {

    @ApiModelProperty(value = "登录账号")// 对属性进行简要说明
    private String username;

    @ApiModelProperty(value = "登录密码")// 对属性进行简要说明
    private String password;
}