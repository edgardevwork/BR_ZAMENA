package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ActivityFilter.kt */
@ExperimentalWindowApi
@Metadata(m7104d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m7105d2 = {"Landroidx/window/embedding/ActivityFilter;", "", "componentName", "Landroid/content/ComponentName;", "intentAction", "", "(Landroid/content/ComponentName;Ljava/lang/String;)V", "getComponentName", "()Landroid/content/ComponentName;", "getIntentAction", "()Ljava/lang/String;", "equals", "", "other", "hashCode", "", "matchesActivity", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Landroid/app/Activity;", "matchesIntent", "intent", "Landroid/content/Intent;", "toString", "window_release"}, m7106k = 1, m7107mv = {1, 6, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class ActivityFilter {

    @NotNull
    public final ComponentName componentName;

    @Nullable
    public final String intentAction;

    public ActivityFilter(@NotNull ComponentName componentName, @Nullable String str) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        this.componentName = componentName;
        this.intentAction = str;
        String packageName = componentName.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "componentName.packageName");
        String className = componentName.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "componentName.className");
        if (packageName.length() <= 0) {
            throw new IllegalArgumentException("Package name must not be empty".toString());
        }
        if (className.length() <= 0) {
            throw new IllegalArgumentException("Activity class name must not be empty.".toString());
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) packageName, (CharSequence) "*", false, 2, (Object) null) && StringsKt__StringsKt.indexOf$default((CharSequence) packageName, "*", 0, false, 6, (Object) null) != packageName.length() - 1) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) className, (CharSequence) "*", false, 2, (Object) null) && StringsKt__StringsKt.indexOf$default((CharSequence) className, "*", 0, false, 6, (Object) null) != className.length() - 1) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
        }
    }

    @NotNull
    public final ComponentName getComponentName() {
        return this.componentName;
    }

    @Nullable
    public final String getIntentAction() {
        return this.intentAction;
    }

    public final boolean matchesIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (!MatcherUtils.INSTANCE.areComponentsMatching$window_release(intent.getComponent(), this.componentName)) {
            return false;
        }
        String str = this.intentAction;
        return str == null || Intrinsics.areEqual(str, intent.getAction());
    }

    public final boolean matchesActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (MatcherUtils.INSTANCE.areActivityOrIntentComponentsMatching$window_release(activity, this.componentName)) {
            String str = this.intentAction;
            if (str != null) {
                Intent intent = activity.getIntent();
                if (Intrinsics.areEqual(str, intent == null ? null : intent.getAction())) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityFilter)) {
            return false;
        }
        ActivityFilter activityFilter = (ActivityFilter) other;
        return Intrinsics.areEqual(this.componentName, activityFilter.componentName) && Intrinsics.areEqual(this.intentAction, activityFilter.intentAction);
    }

    public int hashCode() {
        int iHashCode = this.componentName.hashCode() * 31;
        String str = this.intentAction;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "ActivityFilter(componentName=" + this.componentName + ", intentAction=" + ((Object) this.intentAction) + ')';
    }
}
