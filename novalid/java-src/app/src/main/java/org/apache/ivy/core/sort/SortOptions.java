package org.apache.ivy.core.sort;

/* loaded from: classes5.dex */
public class SortOptions {
    public static final SortOptions DEFAULT = new SortOptions();
    public static final SortOptions SILENT = new SortOptions().setNonMatchingVersionReporter(new SilentNonMatchingVersionReporter()).setUseCircularDependencyStrategy(false);
    public NonMatchingVersionReporter nonMatchingVersionReporter = new WarningNonMatchingVersionReporter();
    public boolean useCircularDependencyStrategy = true;

    public NonMatchingVersionReporter getNonMatchingVersionReporter() {
        return this.nonMatchingVersionReporter;
    }

    public SortOptions setNonMatchingVersionReporter(NonMatchingVersionReporter nonMatchingVersionReporter) {
        this.nonMatchingVersionReporter = nonMatchingVersionReporter;
        return this;
    }

    public boolean isUseCircularDependencyStrategy() {
        return this.useCircularDependencyStrategy;
    }

    public SortOptions setUseCircularDependencyStrategy(boolean z) {
        this.useCircularDependencyStrategy = z;
        return this;
    }
}
