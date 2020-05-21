package com.alex.demo.service.impl;

import com.alex.demo.entity.AmsAddress;
import com.alex.demo.dao.AmsAddressDao;
import com.alex.demo.service.AmsAddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AmsAddress)表服务实现类
 *
 * @author AlexNi
 * @since 2020-05-15 14:35:06
 */
@Service("amsAddressService")
public class AmsAddressServiceImpl implements AmsAddressService {
    @Resource
    private AmsAddressDao amsAddressDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AmsAddress queryById(Integer id) {
        return this.amsAddressDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<AmsAddress> queryAllByLimit(int offset, int limit) {
        return this.amsAddressDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param amsAddress 实例对象
     * @return 实例对象
     */
    @Override
    public AmsAddress insert(AmsAddress amsAddress) {
        this.amsAddressDao.insert(amsAddress);
        return amsAddress;
    }

    /**
     * 修改数据
     *
     * @param amsAddress 实例对象
     * @return 实例对象
     */
    @Override
    public AmsAddress update(AmsAddress amsAddress) {
        this.amsAddressDao.update(amsAddress);
        return this.queryById(amsAddress.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.amsAddressDao.deleteById(id) > 0;
    }
}