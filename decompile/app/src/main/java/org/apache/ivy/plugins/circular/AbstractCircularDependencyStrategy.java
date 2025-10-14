package org.apache.ivy.plugins.circular;

/* loaded from: classes5.dex */
public abstract class AbstractCircularDependencyStrategy implements CircularDependencyStrategy {
    public String name;

    public AbstractCircularDependencyStrategy(String str) {
        this.name = str;
    }

    @Override // org.apache.ivy.plugins.circular.CircularDependencyStrategy
    public String getName() {
        return this.name;
    }

    public String toString() {
        return getName();
    }
}
