package org.apache.ivy.plugins.namespace;

/* loaded from: classes6.dex */
public class NamespaceRule {
    public String description;
    public MRIDTransformationRule fromSystem;
    public String name;
    public MRIDTransformationRule toSystem;

    public MRIDTransformationRule getFromSystem() {
        return this.fromSystem;
    }

    public void addFromsystem(MRIDTransformationRule mRIDTransformationRule) {
        if (this.fromSystem != null) {
            throw new IllegalArgumentException("only one fromsystem is allowed per rule");
        }
        this.fromSystem = mRIDTransformationRule;
    }

    public MRIDTransformationRule getToSystem() {
        return this.toSystem;
    }

    public void addTosystem(MRIDTransformationRule mRIDTransformationRule) {
        if (this.toSystem != null) {
            throw new IllegalArgumentException("only one tosystem is allowed per rule");
        }
        this.toSystem = mRIDTransformationRule;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }
}
