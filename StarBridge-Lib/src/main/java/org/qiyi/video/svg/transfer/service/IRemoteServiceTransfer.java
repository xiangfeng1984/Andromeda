package org.qiyi.video.svg.transfer.service;

//import android.arch.lifecycle.LifecycleOwner;

import android.os.IBinder;

import org.qiyi.video.svg.bean.BinderBean;

/**
 * Created by wangallen on 2018/1/9.
 */

public interface IRemoteServiceTransfer {

    //IBinder getRemoteService(LifecycleOwner owner, String serviceCanonicalName);

    //IBinder getRemoteService(String serviceCanonicalName);
    BinderBean getRemoteServiceBean(String serviceCanonicalName);

    //其实是registerStubService
    void registerStubService(String serviceCanonicalName, IBinder stubBinder);

    /**
     * 要注销本进程的某个服务，注意它与
     *
     * @param serviceCanonicalName
     */
    void unregisterStubService(String serviceCanonicalName);
}