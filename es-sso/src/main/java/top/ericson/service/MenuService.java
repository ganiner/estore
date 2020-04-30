package top.ericson.service;

import com.baomidou.mybatisplus.core.metadata.IPage;

import top.ericson.pojo.Menu;
import top.ericson.vo.PageQuery;

/**
 * @author Ericson
 * @class MenuService
 * @date 2020/04/30 23:35
 * @version 1.0
 * @description
 */
public interface MenuService {

    void create(Menu role);
    
    Integer deleteById(Integer id);
    
    Integer updateById(Menu role);

    IPage<Menu> findPage(PageQuery pageQuery);

}