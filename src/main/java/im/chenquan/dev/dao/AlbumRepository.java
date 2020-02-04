package im.chenquan.dev.dao;

import im.chenquan.dev.po.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: UserRepository.java
 * @Version: 1.0
 * @Date: 2020/2/1
 * @Description:
 */

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {

}
