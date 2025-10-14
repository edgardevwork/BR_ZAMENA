package org.apache.commons.compress.archivers.sevenz;

/* loaded from: classes5.dex */
public class SevenZFileOptions {
    public static final SevenZFileOptions DEFAULT = new SevenZFileOptions(Integer.MAX_VALUE, false, false);
    public static final boolean DEFAULT_TRY_TO_RECOVER_BROKEN_ARCHIVES = false;
    public static final boolean DEFAULT_USE_DEFAULTNAME_FOR_UNNAMED_ENTRIES = false;
    public static final int DEFAUL_MEMORY_LIMIT_IN_KB = Integer.MAX_VALUE;
    public final int maxMemoryLimitInKb;
    public final boolean tryToRecoverBrokenArchives;
    public final boolean useDefaultNameForUnnamedEntries;

    public SevenZFileOptions(int i, boolean z, boolean z2) {
        this.maxMemoryLimitInKb = i;
        this.useDefaultNameForUnnamedEntries = z;
        this.tryToRecoverBrokenArchives = z2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public int getMaxMemoryLimitInKb() {
        return this.maxMemoryLimitInKb;
    }

    public boolean getUseDefaultNameForUnnamedEntries() {
        return this.useDefaultNameForUnnamedEntries;
    }

    public boolean getTryToRecoverBrokenArchives() {
        return this.tryToRecoverBrokenArchives;
    }

    public static class Builder {
        public int maxMemoryLimitInKb = Integer.MAX_VALUE;
        public boolean useDefaultNameForUnnamedEntries = false;
        public boolean tryToRecoverBrokenArchives = false;

        public Builder withMaxMemoryLimitInKb(int i) {
            this.maxMemoryLimitInKb = i;
            return this;
        }

        public Builder withUseDefaultNameForUnnamedEntries(boolean z) {
            this.useDefaultNameForUnnamedEntries = z;
            return this;
        }

        public Builder withTryToRecoverBrokenArchives(boolean z) {
            this.tryToRecoverBrokenArchives = z;
            return this;
        }

        public SevenZFileOptions build() {
            return new SevenZFileOptions(this.maxMemoryLimitInKb, this.useDefaultNameForUnnamedEntries, this.tryToRecoverBrokenArchives);
        }
    }
}
