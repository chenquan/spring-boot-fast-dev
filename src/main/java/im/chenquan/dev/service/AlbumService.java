package im.chenquan.dev.service;

import im.chenquan.dev.po.Album;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: AlbumServer.java
 * @Version: 1.0
 * @Date: 2020/2/1
 * @Description:
 */

public interface AlbumService {
    /**
     * 删除图片,
     *
     * @param id
     */
    void delete(Long id);

    /**
     * 更改图片链接
     * @param album
     */
    void update(Album album);
}
