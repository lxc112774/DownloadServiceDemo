package com.example.root.downloadservicedemo;

/**
 * Created by root on 22-3-25.
 */

public interface DownloadListener {
    void onProgress(int progress);
    void onSuccess();
    void onFailed();
    void onPaused();
    void onCanceled();

}
