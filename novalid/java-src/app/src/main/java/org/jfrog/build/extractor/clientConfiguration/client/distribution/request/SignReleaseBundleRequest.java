package org.jfrog.build.extractor.clientConfiguration.client.distribution.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/* loaded from: classes7.dex */
public class SignReleaseBundleRequest implements Serializable {
    public static final long serialVersionUID = 1;

    @JsonProperty("storing_repository")
    public String storingRepository;

    public SignReleaseBundleRequest() {
    }

    public SignReleaseBundleRequest(String str) {
        this.storingRepository = str;
    }

    public String getStoringRepository() {
        return this.storingRepository;
    }

    public void setStoringRepository(String str) {
        this.storingRepository = str;
    }
}
