package org.jfrog.build.api.dependency;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class PatternResult implements Serializable {
    public List<PatternArtifact> patternArtifacts;

    public PatternResult() {
        this.patternArtifacts = new ArrayList();
    }

    public PatternResult(List<PatternArtifact> list) {
        this.patternArtifacts = list;
    }

    public List<PatternArtifact> getPatternArtifacts() {
        return this.patternArtifacts;
    }

    public void setPatternArtifacts(List<PatternArtifact> list) {
        this.patternArtifacts = list;
    }

    public void addArtifact(PatternArtifact patternArtifact) {
        if (this.patternArtifacts == null) {
            this.patternArtifacts = new ArrayList();
        }
        this.patternArtifacts.add(patternArtifact);
    }
}
