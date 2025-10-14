package com.google.firebase.crashlytics.ndk;

import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;

/* loaded from: classes6.dex */
final class SessionFiles {
    public final File app;
    public final File binaryImages;
    public final File device;
    public final File metadata;
    public final NativeCore nativeCore;

    /* renamed from: os */
    public final File f871os;
    public final File session;

    public static final class NativeCore {

        @Nullable
        public final CrashlyticsReport.ApplicationExitInfo applicationExitInfo;

        @Nullable
        public final File minidump;

        public NativeCore(@Nullable File file, @Nullable CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
            this.minidump = file;
            this.applicationExitInfo = applicationExitInfo;
        }

        public boolean hasCore() {
            File file = this.minidump;
            return (file != null && file.exists()) || this.applicationExitInfo != null;
        }
    }

    public static final class Builder {
        private File app;
        private File binaryImages;
        private File device;
        private File metadata;
        private NativeCore nativeCore;

        /* renamed from: os */
        private File f872os;
        private File session;

        public Builder nativeCore(NativeCore nativeCore) {
            this.nativeCore = nativeCore;
            return this;
        }

        public Builder binaryImagesFile(File file) {
            this.binaryImages = file;
            return this;
        }

        public Builder metadataFile(File file) {
            this.metadata = file;
            return this;
        }

        public Builder sessionFile(File file) {
            this.session = file;
            return this;
        }

        public Builder appFile(File file) {
            this.app = file;
            return this;
        }

        public Builder deviceFile(File file) {
            this.device = file;
            return this;
        }

        public Builder osFile(File file) {
            this.f872os = file;
            return this;
        }

        public SessionFiles build() {
            return new SessionFiles(this);
        }
    }

    private SessionFiles(Builder builder) {
        this.nativeCore = builder.nativeCore;
        this.binaryImages = builder.binaryImages;
        this.metadata = builder.metadata;
        this.session = builder.session;
        this.app = builder.app;
        this.device = builder.device;
        this.f871os = builder.f872os;
    }
}
