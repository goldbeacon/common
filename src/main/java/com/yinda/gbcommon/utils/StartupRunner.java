package com.yinda.gbcommon.utils;

import java.util.List;

import org.springframework.stereotype.Component;

import com.yinda.gbcommon.bean.Device;
import com.yinda.gbcommon.service.DeviceService;

/**
 * Created by devilmole on 2018/4/25.
 */
@Component
public class StartupRunner implements Runnable {

	private DeviceService deviceService;

	public StartupRunner(DeviceService deviceService) {
		this.deviceService = deviceService;
	}

    @Override
    public void run() {
    	List<Device> list = deviceService.queryAll();
    	System.out.println(list.size());
    	if(list!=null&& list.size()>0){
			for (Device source: list) {
				source.setRemark1("1");
				deviceService.save(source);
			}
		}
    }
}
