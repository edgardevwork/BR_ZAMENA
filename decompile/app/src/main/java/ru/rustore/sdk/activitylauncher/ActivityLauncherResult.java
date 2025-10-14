package ru.rustore.sdk.activitylauncher;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: ActivityLauncherResult.kt */
@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \r2\u00020\u0001:\u0007\u0007\b\t\n\u000b\f\rB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m7105d2 = {"Lru/rustore/sdk/activitylauncher/ActivityLauncherResult;", "", "code", "", "(I)V", "getCode", "()I", "ActivityNotFound", "ActivityResultCanceled", "ActivityResultOk", "ActivityResultUnknown", "ActivitySendIntentError", "ActivityUnknownError", "Companion", "Lru/rustore/sdk/activitylauncher/ActivityLauncherResult$ActivityNotFound;", "Lru/rustore/sdk/activitylauncher/ActivityLauncherResult$ActivityResultCanceled;", "Lru/rustore/sdk/activitylauncher/ActivityLauncherResult$ActivityResultOk;", "Lru/rustore/sdk/activitylauncher/ActivityLauncherResult$ActivityResultUnknown;", "Lru/rustore/sdk/activitylauncher/ActivityLauncherResult$ActivitySendIntentError;", "Lru/rustore/sdk/activitylauncher/ActivityLauncherResult$ActivityUnknownError;", "sdk-public-activitylauncher_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public abstract class ActivityLauncherResult {
    public static final int ACTIVITY_SEND_INTENT_ERROR = 9901;
    public static final int ACTIVITY_UNKNOWN_ERROR = 9902;
    public final int code;

    public /* synthetic */ ActivityLauncherResult(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public ActivityLauncherResult(int i) {
        this.code = i;
    }

    public int getCode() {
        return this.code;
    }

    /* compiled from: ActivityLauncherResult.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m7105d2 = {"Lru/rustore/sdk/activitylauncher/ActivityLauncherResult$ActivitySendIntentError;", "Lru/rustore/sdk/activitylauncher/ActivityLauncherResult;", "()V", "sdk-public-activitylauncher_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    /* loaded from: classes8.dex */
    public static final class ActivitySendIntentError extends ActivityLauncherResult {

        @NotNull
        public static final ActivitySendIntentError INSTANCE = new ActivitySendIntentError();

        public ActivitySendIntentError() {
            super(9901, null);
        }
    }

    /* compiled from: ActivityLauncherResult.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m7105d2 = {"Lru/rustore/sdk/activitylauncher/ActivityLauncherResult$ActivityUnknownError;", "Lru/rustore/sdk/activitylauncher/ActivityLauncherResult;", "()V", "sdk-public-activitylauncher_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    /* loaded from: classes8.dex */
    public static final class ActivityUnknownError extends ActivityLauncherResult {

        @NotNull
        public static final ActivityUnknownError INSTANCE = new ActivityUnknownError();

        public ActivityUnknownError() {
            super(9902, null);
        }
    }

    /* compiled from: ActivityLauncherResult.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m7105d2 = {"Lru/rustore/sdk/activitylauncher/ActivityLauncherResult$ActivityNotFound;", "Lru/rustore/sdk/activitylauncher/ActivityLauncherResult;", "()V", "sdk-public-activitylauncher_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    /* loaded from: classes8.dex */
    public static final class ActivityNotFound extends ActivityLauncherResult {

        @NotNull
        public static final ActivityNotFound INSTANCE = new ActivityNotFound();

        public ActivityNotFound() {
            super(2, null);
        }
    }

    /* compiled from: ActivityLauncherResult.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m7105d2 = {"Lru/rustore/sdk/activitylauncher/ActivityLauncherResult$ActivityResultOk;", "Lru/rustore/sdk/activitylauncher/ActivityLauncherResult;", "()V", "sdk-public-activitylauncher_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    /* loaded from: classes8.dex */
    public static final class ActivityResultOk extends ActivityLauncherResult {

        @NotNull
        public static final ActivityResultOk INSTANCE = new ActivityResultOk();

        public ActivityResultOk() {
            super(-1, null);
        }
    }

    /* compiled from: ActivityLauncherResult.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m7105d2 = {"Lru/rustore/sdk/activitylauncher/ActivityLauncherResult$ActivityResultCanceled;", "Lru/rustore/sdk/activitylauncher/ActivityLauncherResult;", "()V", "sdk-public-activitylauncher_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    /* loaded from: classes8.dex */
    public static final class ActivityResultCanceled extends ActivityLauncherResult {

        @NotNull
        public static final ActivityResultCanceled INSTANCE = new ActivityResultCanceled();

        public ActivityResultCanceled() {
            super(0, null);
        }
    }

    /* compiled from: ActivityLauncherResult.kt */
    @Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m7105d2 = {"Lru/rustore/sdk/activitylauncher/ActivityLauncherResult$ActivityResultUnknown;", "Lru/rustore/sdk/activitylauncher/ActivityLauncherResult;", "code", "", "(I)V", "getCode", "()I", "sdk-public-activitylauncher_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    /* loaded from: classes8.dex */
    public static final class ActivityResultUnknown extends ActivityLauncherResult {
        public final int code;

        public ActivityResultUnknown(int i) {
            super(i, null);
            this.code = i;
        }

        @Override // ru.rustore.sdk.activitylauncher.ActivityLauncherResult
        public int getCode() {
            return this.code;
        }
    }
}
