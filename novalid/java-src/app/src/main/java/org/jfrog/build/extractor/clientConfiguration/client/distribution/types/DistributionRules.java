package org.jfrog.build.extractor.clientConfiguration.client.distribution.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes7.dex */
public class DistributionRules implements Serializable {
    public static final long serialVersionUID = 1;

    @JsonProperty("city_name")
    public String cityName;

    @JsonProperty("country_codes")
    public List<String> countryCodes;

    @JsonProperty("site_name")
    public String siteName;

    public List<String> getCountryCodes() {
        return this.countryCodes;
    }

    public void setCountryCodes(List<String> list) {
        this.countryCodes = list;
    }

    public String getSiteName() {
        return this.siteName;
    }

    public void setSiteName(String str) {
        this.siteName = str;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String str) {
        this.cityName = str;
    }

    public static class Builder {
        public String cityName;
        public List<String> countryCodes;
        public String siteName;

        public Builder countryCodes(List<String> list) {
            this.countryCodes = list;
            return this;
        }

        public Builder siteName(String str) {
            this.siteName = str;
            return this;
        }

        public Builder cityName(String str) {
            this.cityName = str;
            return this;
        }

        public DistributionRules build() {
            DistributionRules distributionRules = new DistributionRules();
            distributionRules.setCountryCodes(this.countryCodes);
            distributionRules.setSiteName(this.siteName);
            distributionRules.setCityName(this.cityName);
            return distributionRules;
        }
    }
}
