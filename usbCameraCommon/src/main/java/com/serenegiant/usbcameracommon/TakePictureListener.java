package com.serenegiant.usbcameracommon;

public interface TakePictureListener {

    void onSuccess(String path);

    void onFailure(Throwable tr);
    
}
