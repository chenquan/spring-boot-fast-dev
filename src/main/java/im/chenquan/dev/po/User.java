package im.chenquan.dev.po;

import javax.persistence.*;

import lombok.Data;
import lombok.ToString;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: User.java
 * @Version: 1.0
 * @Date: 2020/2/1
 * @Description:
 */
@Data
@ToString
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;
}
