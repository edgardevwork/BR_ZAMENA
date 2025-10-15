package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p003ui.unit.IntSize;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AnimatedContent.kt */
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m7105d2 = {"Landroidx/compose/animation/SizeTransform;", "", "clip", "", "getClip", "()Z", "createAnimationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntSize;", "initialSize", "targetSize", "createAnimationSpec-TemP2vQ", "(JJ)Landroidx/compose/animation/core/FiniteAnimationSpec;", "animation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public interface SizeTransform {
    @NotNull
    /* renamed from: createAnimationSpec-TemP2vQ, reason: not valid java name */
    FiniteAnimationSpec<IntSize> mo7674createAnimationSpecTemP2vQ(long initialSize, long targetSize);

    boolean getClip();
}
