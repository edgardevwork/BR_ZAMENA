package org.jfrog.build.client.artifactoryXrayResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes7.dex */
public class ArtifactoryXrayResponse implements Serializable {
    public static final long serialVersionUID = -1632171048760650595L;
    public List<Alert> alerts;
    public List<License> licenses;
    public Summary summary;

    public ArtifactoryXrayResponse() {
        this.alerts = null;
        this.licenses = null;
    }

    public ArtifactoryXrayResponse(Summary summary, List<Alert> list, List<License> list2) {
        this.summary = summary;
        this.alerts = list;
        this.licenses = list2;
    }

    public Summary getSummary() {
        return this.summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public List<Alert> getAlerts() {
        return this.alerts;
    }

    public void setAlerts(List<Alert> list) {
        this.alerts = list;
    }

    public List<License> getLicenses() {
        return this.licenses;
    }

    public void setLicenses(List<License> list) {
        this.licenses = list;
    }

    public String toString() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        try {
            return objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed while parsing JSON response", e);
        }
    }
}
