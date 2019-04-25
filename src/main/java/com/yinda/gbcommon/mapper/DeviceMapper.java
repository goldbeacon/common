package com.yinda.gbcommon.mapper;

import com.yinda.gbcommon.bean.Device;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface DeviceMapper {
    Device queryById(Long id);

    List<Device> queryAll();

    void save(Device source);
}
