package im.chenquan.dev.po;

import javax.persistence.*;

import lombok.Data;
import lombok.ToString;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: Album.java
 * @Version: 1.0
 * @Date: 2020/2/1
 * @Description:
 */
@Data
@ToString
@Entity
@Table(name = "dev")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "desc")
    private String desc;

    @Column(name = "src")
    private String src;

    @Column(name = "push_time")
    private String pushTime;

}
