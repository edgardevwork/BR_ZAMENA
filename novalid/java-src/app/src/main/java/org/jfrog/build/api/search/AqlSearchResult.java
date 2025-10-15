package org.jfrog.build.api.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;

/* loaded from: classes7.dex */
public class AqlSearchResult {
    public List<SearchEntry> results = new ArrayList();

    public List<SearchEntry> getResults() {
        return this.results;
    }

    public void setResults(List<SearchEntry> list) {
        this.results = list;
    }

    public static class SearchEntry {
        public String actualMd5;
        public String actualSha1;
        public String name;
        public String path;
        public String repo;
        public String[] virtualRepos = new String[0];
        public HashMap<String, String> properties = new HashMap<>();

        public void setRepo(String str) {
            this.repo = str;
        }

        public void setPath(String str) {
            this.path = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        @JsonProperty("actual_sha1")
        public void setActualSha1(String str) {
            this.actualSha1 = str;
        }

        @JsonProperty("actual_md5")
        public void setActualMd5(String str) {
            this.actualMd5 = str;
        }

        @JsonProperty("virtual_repos")
        public void setVirtualRepos(String[] strArr) {
            this.virtualRepos = strArr;
        }

        @JsonProperty("properties")
        public void setProperties(List<Property> list) {
            for (Property property : list) {
                if (StringUtils.isNotEmpty(property.key)) {
                    this.properties.put(property.key, property.value);
                }
            }
        }

        public String getRepo() {
            return this.repo;
        }

        public String getPath() {
            return this.path;
        }

        public String getName() {
            return this.name;
        }

        @JsonProperty("actual_sha1")
        public String getActualSha1() {
            return this.actualSha1;
        }

        @JsonProperty("actual_md5")
        public String getActualMd5() {
            return this.actualMd5;
        }

        @JsonProperty("virtual_repos")
        public String[] getVirtualRepos() {
            return this.virtualRepos;
        }

        @JsonProperty("properties")
        public Map<String, String> getProperties() {
            return this.properties;
        }

        public String getBuildName() {
            return this.properties.get("build.name");
        }

        public String getBuildNumber() {
            return this.properties.get("build.number");
        }
    }

    public static class Property {
        public String key;
        public String value;

        @JsonProperty("key")
        public void setKey(String str) {
            this.key = str;
        }

        @JsonProperty("key")
        public String getkey() {
            return this.key;
        }

        @JsonProperty("value")
        public void setValue(String str) {
            this.value = str;
        }

        @JsonProperty("value")
        public String getValue() {
            return this.value;
        }
    }
}
