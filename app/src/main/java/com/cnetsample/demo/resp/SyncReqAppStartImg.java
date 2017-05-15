package com.cnetsample.demo.resp;


import com.cuckoo95.cnetlib.def.http.request.CAbstractRequst;

/**
 * Created by c on 16/9/7.
 */
public class SyncReqAppStartImg extends CAbstractRequst {

    public SyncReqAppStartImg() {
        super(RespAppStartImg.class);
        setBaseUrl("http://www.chunlaizhuang.com/rest/v2/");
        setPostFixUrl("splash");
    }
}
