package im.chenquan.dev.web.controller.v1;

import im.chenquan.dev.config.exception.ResultResponse;
import im.chenquan.dev.dao.AlbumRepository;
import im.chenquan.dev.po.Album;
import im.chenquan.dev.service.AlbumService;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: AlbumController.java
 * @Version: 1.0
 * @Date: 2020/2/1
 * @Description:
 */
@RestController
@RequestMapping("/v1/album")
public class AlbumController {
    private final AlbumService albumService;
    private final AlbumRepository albumRepository;

    public AlbumController(AlbumService albumService, AlbumRepository albumRepository) {
        this.albumService = albumService;
        this.albumRepository = albumRepository;
    }

    @PostMapping
    public ResultResponse add(@RequestBody Album album) throws Exception {
        albumRepository.save(album);
        return ResultResponse.success();
    }

    @DeleteMapping
    public ResultResponse delete(Long id) throws Exception {
        albumService.delete(id);
        return ResultResponse.success();
    }


    @GetMapping
    public ResultResponse update() throws Exception {
        return ResultResponse.success();
    }

    @PutMapping
    public ResultResponse list(@RequestBody Album album) throws Exception {
        albumService.update(album);
        return ResultResponse.success();
    }


}
