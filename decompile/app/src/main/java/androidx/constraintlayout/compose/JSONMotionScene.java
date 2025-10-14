package androidx.constraintlayout.compose;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.intellij.lang.annotations.Language;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MotionLayout.kt */
@Metadata(m7104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004H\u0014J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tH\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m7105d2 = {"Landroidx/constraintlayout/compose/JSONMotionScene;", "Landroidx/constraintlayout/compose/EditableJSONLayout;", "Landroidx/constraintlayout/compose/MotionScene;", "content", "", "(Ljava/lang/String;)V", "constraintSetsContent", "Ljava/util/HashMap;", "forcedProgress", "", "transitionsContent", "getConstraintSet", FirebaseAnalytics.Param.INDEX, "", "name", "getForcedProgress", "getTransition", "onNewContent", "", "onNewProgress", "progress", "resetForcedProgress", "setConstraintSetContent", "setTransitionContent", "compose_release"}, m7106k = 1, m7107mv = {1, 5, 1}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class JSONMotionScene extends EditableJSONLayout implements MotionScene {

    @NotNull
    public final HashMap<String, String> constraintSetsContent;
    public float forcedProgress;

    @NotNull
    public final HashMap<String, String> transitionsContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JSONMotionScene(@Language("json5") @NotNull String content) {
        super(content);
        Intrinsics.checkNotNullParameter(content, "content");
        this.constraintSetsContent = new HashMap<>();
        this.transitionsContent = new HashMap<>();
        this.forcedProgress = Float.NaN;
        initialization();
    }

    @Override // androidx.constraintlayout.compose.MotionScene
    public void setConstraintSetContent(@NotNull String name, @NotNull String content) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(content, "content");
        this.constraintSetsContent.put(name, content);
    }

    @Override // androidx.constraintlayout.compose.MotionScene
    public void setTransitionContent(@NotNull String name, @NotNull String content) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(content, "content");
        this.transitionsContent.put(name, content);
    }

    @Override // androidx.constraintlayout.compose.MotionScene
    @Nullable
    public String getConstraintSet(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.constraintSetsContent.get(name);
    }

    @Override // androidx.constraintlayout.compose.MotionScene
    @Nullable
    public String getConstraintSet(int index) {
        Collection<String> collectionValues = this.constraintSetsContent.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "constraintSetsContent.values");
        return (String) CollectionsKt___CollectionsKt.elementAtOrNull(collectionValues, index);
    }

    @Override // androidx.constraintlayout.compose.MotionScene
    @Nullable
    public String getTransition(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.transitionsContent.get(name);
    }

    @Override // androidx.constraintlayout.compose.MotionScene
    public float getForcedProgress() {
        return this.forcedProgress;
    }

    @Override // androidx.constraintlayout.compose.MotionScene
    public void resetForcedProgress() {
        this.forcedProgress = Float.NaN;
    }

    @Override // androidx.constraintlayout.compose.EditableJSONLayout
    public void onNewContent(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        super.onNewContent(content);
        try {
            ConstraintSetParserKt.parseMotionSceneJSON(this, content);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.constraintlayout.compose.EditableJSONLayout
    public void onNewProgress(float progress) {
        this.forcedProgress = progress;
        signalUpdate();
    }
}
