package com.wolf.material.service.Impl;

import com.wolf.material.mapper.Tb_materialsMapper;
import com.wolf.material.pojo.Tb_materials;
import com.wolf.material.service.Tb_materialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: 物资表
 * @author: 江毅东
 * @createDate: 2019/10/31
 * @version: 1.0
 */
@Service
public class Tb_materialsServiceImpl implements Tb_materialsService {
    @Autowired(required = false)
    private Tb_materialsMapper tb_materialsMapper;
    @Override
    public Boolean insertOne(Tb_materials tb_materials) throws Exception {
        return tb_materialsMapper.insertOne(tb_materials);
    }
    @Override
    public Boolean deleteOne(Integer Iid)throws Exception
    {
        return tb_materialsMapper.deleteOne(Iid);
    }

    @Override
    public Boolean updateBorrow(Integer Iid) throws Exception {
        return tb_materialsMapper.updateBorrow(Iid);
    }

    @Override
    public Boolean updateAvailable(Integer Iid) throws Exception {
        return tb_materialsMapper.updateAvailable(Iid);
    }

}
