package im.chenquan.dev.po;

import javax.persistence.*;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: User.java
 * @Version: 1.0
 * @Date: 2020/2/1
 * @Description: 覆盖ModelPropertyBuilder.java, 修改swagger-ui日期类型默认显示格式
 */
@Data
@ToString
@Entity
@Table(name = "user")
@ApiModel

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    @ApiModelProperty
    private String username;

    @Column(name = "password")
    @ApiModelProperty
    private String password;
}
