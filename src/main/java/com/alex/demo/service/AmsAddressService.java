package com.alex.demo.service;

import com.alex.demo.entity.AmsAddress;
import java.util.List;

/**
 * (AmsAddress)表服务接口
 *
 * @author AlexNi
 * @since 2020-05-15 14:35:05
 */
public interface AmsAddressService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AmsAddress queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AmsAddress> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param amsAddress 实例对象
     * @return 实例对象
     */
    AmsAddress insert(AmsAddress amsAddress);

    /**
     * 修改数据
     *
     * @param amsAddress 实例对象
     * @return 实例对象
     */
    AmsAddress update(AmsAddress amsAddress);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}