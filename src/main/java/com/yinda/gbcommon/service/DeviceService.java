package com.yinda.gbcommon.service;

import com.yinda.gbcommon.bean.Device;

import java.util.List;

public interface DeviceService {
    Device queryById(Long id);

    List<Device> queryAll();

    void save(Device source);
}
