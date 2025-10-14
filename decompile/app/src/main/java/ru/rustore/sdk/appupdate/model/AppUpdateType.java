package ru.rustore.sdk.appupdate.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import org.jetbrains.annotations.NotNull;

@Retention(RetentionPolicy.SOURCE)
@Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, m7105d2 = {"Lru/rustore/sdk/appupdate/model/AppUpdateType;", "", "Companion", "sdk-public-appupdate_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
/* loaded from: classes6.dex */
public @interface AppUpdateType {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int FLEXIBLE = 0;
    public static final int IMMEDIATE = 1;
    public static final int SILENT = 2;

    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m7105d2 = {"Lru/rustore/sdk/appupdate/model/AppUpdateType$Companion;", "", "()V", "FLEXIBLE", "", "IMMEDIATE", "SILENT", "sdk-public-appupdate_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int FLEXIBLE = 0;
        public static final int IMMEDIATE = 1;
        public static final int SILENT = 2;

        private Companion() {
        }
    }
}
