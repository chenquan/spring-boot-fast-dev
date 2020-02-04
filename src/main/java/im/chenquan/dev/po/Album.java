package im.chenquan.dev.po;

import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@Table(name = "album")
@ApiModel
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    @ApiModelProperty
    private String title;

    @Column(name = "desc")
    @ApiModelProperty
    private String desc;

    @Column(name = "src")
    @ApiModelProperty
    private String src;

    @Column(name = "push_time")
    @ApiModelProperty(required = true)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date pushTime;

}
