package org.jfrog.build.api.dependency;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/* loaded from: classes7.dex */
public class PropertySearchResult {
    public List<SearchEntry> results = new ArrayList();

    public List<SearchEntry> getResults() {
        return this.results;
    }

    public void setResults(List<SearchEntry> list) {
        this.results = list;
    }

    public static class SearchEntry {
        public String artifactoryUrl;
        public String filePath;
        public String repoKey;
        public String uri;

        public String getUri() {
            return this.uri;
        }

        public void setUri(String str) {
            this.uri = str;
            this.artifactoryUrl = StringUtils.substringBefore(str, "/api/storage/");
            String strSubstringAfter = StringUtils.substringAfter(str, "/api/storage/");
            this.repoKey = StringUtils.substringBefore(strSubstringAfter, "/");
            this.filePath = StringUtils.substringAfter(strSubstringAfter, "/");
        }

        public String getRepoUri() {
            return this.artifactoryUrl + "/" + this.repoKey;
        }

        public String getRepoPath() {
            return this.repoKey + "/" + this.filePath;
        }

        public String getFilePath() {
            return this.filePath;
        }
    }
}
