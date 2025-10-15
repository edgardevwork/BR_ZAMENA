package org.jfrog.build.extractor.clientConfiguration.client.response;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class GetAllBuildNumbersResponse {
    public List<BuildsNumberDetails> buildsNumbers = new ArrayList();
    public String uri;

    public String getUri() {
        return this.uri;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public List<BuildsNumberDetails> getBuildsNumbers() {
        return this.buildsNumbers;
    }

    public void setBuildsNumbers(List<BuildsNumberDetails> list) {
        this.buildsNumbers = list;
    }

    public static class BuildsNumberDetails {
        public String started;
        public String uri;

        public String getStarted() {
            return this.started;
        }

        public void setStarted(String str) {
            this.started = str;
        }

        public String getUri() {
            return this.uri;
        }

        public void setUri(String str) {
            this.uri = str;
        }
    }
}
