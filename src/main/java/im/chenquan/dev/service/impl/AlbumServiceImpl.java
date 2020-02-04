package im.chenquan.dev.service.impl;

import java.util.Optional;

import im.chenquan.dev.dao.AlbumRepository;
import im.chenquan.dev.po.Album;
import im.chenquan.dev.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: AlbumServerImpl.java
 * @Version: 1.0
 * @Date: 2020/2/1
 * @Description:
 */
@Service
public class AlbumServiceImpl implements AlbumService {
    @Autowired
    AlbumRepository albumRepository;

    @Override
    public void delete(Long id) {
        Optional<Album> albumOptional = albumRepository.findById(id);
        if (albumOptional.isPresent()) {
            Album album = albumOptional.get();
            String src = album.getSrc();
        }
    }

    @Override
    public void update(Album album) {
        Long id = album.getId();
        Optional<Album> albumOptional = albumRepository.findById(id);
        if (albumOptional.isPresent()) {
            albumRepository.save(album);
        }
    }
}
