package com.imooc.o2o.service;

import com.imooc.o2o.dto.AreaExecution;
import com.imooc.o2o.entity.Area;

import java.util.List;

public interface AreaService {
    String AREALISTKEY = "arealist";
    List<Area> getAreaList();
    /**
     * 增加区域信息
     *
     * @param area
     * @return
     */
    AreaExecution addArea(Area area);

    /**
     * 修改区域信息
     *
     * @param area
     * @return
     */
    AreaExecution modifyArea(Area area);

}
