package io.renren.modules.arct.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.arct.dao.ClassifyDao;
import io.renren.modules.arct.entity.ClassifyEntity;
import io.renren.modules.arct.service.ClassifyService;


@Service("classifyService")
public class ClassifyServiceImpl extends ServiceImpl<ClassifyDao, ClassifyEntity> implements ClassifyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {

        QueryWrapper<ClassifyEntity> queryWrapper = new QueryWrapper<>();
        if (Query.STATUS_ACTIVED.equals(params.get(Query.STATUS))) {
            queryWrapper.eq("status", 1);
        }

        IPage<ClassifyEntity> page = this.page(
                new Query<ClassifyEntity>().getPage(params),
                queryWrapper
        );


        return new PageUtils(page);
    }

}