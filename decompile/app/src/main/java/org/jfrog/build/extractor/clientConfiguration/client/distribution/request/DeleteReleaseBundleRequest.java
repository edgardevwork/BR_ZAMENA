package org.jfrog.build.extractor.clientConfiguration.client.distribution.request;

import com.fasterxml.jackson.annotation.JsonProperty;

/* loaded from: classes5.dex */
public class DeleteReleaseBundleRequest extends RemoteReleaseBundleRequest {

    @JsonProperty("on_success")
    public OnSuccess onSuccess;

    /* loaded from: classes7.dex */
    public enum OnSuccess {
        keep,
        delete
    }

    public OnSuccess getOnSuccess() {
        return this.onSuccess;
    }

    public void setOnSuccess(OnSuccess onSuccess) {
        this.onSuccess = onSuccess;
    }
}
