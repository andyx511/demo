package com.alex.demo.dao;

import com.alex.demo.entity.AmsAddress;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (AmsAddress)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-15 14:35:05
 */
public interface AmsAddressDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AmsAddress queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AmsAddress> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param amsAddress 实例对象
     * @return 对象列表
     */
    List<AmsAddress> queryAll(AmsAddress amsAddress);

    /**
     * 新增数据
     *
     * @param amsAddress 实例对象
     * @return 影响行数
     */
    int insert(AmsAddress amsAddress);

    /**
     * 修改数据
     *
     * @param amsAddress 实例对象
     * @return 影响行数
     */
    int update(AmsAddress amsAddress);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}