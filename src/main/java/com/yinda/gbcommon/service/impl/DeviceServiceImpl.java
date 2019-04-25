package com.yinda.gbcommon.service.impl;

import com.yinda.gbcommon.bean.Device;
import com.yinda.gbcommon.mapper.DeviceMapper;
import com.yinda.gbcommon.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("deviceService")
public class DeviceServiceImpl implements DeviceService {
    @Autowired
    private DeviceMapper deviceMapper;

    @Override
    public Device queryById(Long id) {
        return deviceMapper.queryById(id);
    }

    @Override
    public List<Device> queryAll() {
        return deviceMapper.queryAll();
    }

    @Override
    public void save(Device source) {
        deviceMapper.save(source);
    }
}
