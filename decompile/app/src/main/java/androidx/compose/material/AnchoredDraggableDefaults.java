package androidx.compose.material;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AnchoredDraggable.kt */
@Stable
@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m7105d2 = {"Landroidx/compose/material/AnchoredDraggableDefaults;", "", "()V", "AnimationSpec", "Landroidx/compose/animation/core/SpringSpec;", "", "getAnimationSpec$annotations", "getAnimationSpec", "()Landroidx/compose/animation/core/SpringSpec;", "material_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@ExperimentalMaterialApi
/* loaded from: classes3.dex */
public final class AnchoredDraggableDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final AnchoredDraggableDefaults INSTANCE = new AnchoredDraggableDefaults();

    @NotNull
    private static final SpringSpec<Float> AnimationSpec = new SpringSpec<>(0.0f, 0.0f, null, 7, null);

    @ExperimentalMaterialApi
    public static /* synthetic */ void getAnimationSpec$annotations() {
    }

    private AnchoredDraggableDefaults() {
    }

    @ExperimentalMaterialApi
    @NotNull
    public final SpringSpec<Float> getAnimationSpec() {
        return AnimationSpec;
    }
}
