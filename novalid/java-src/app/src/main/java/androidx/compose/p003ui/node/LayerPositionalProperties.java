package androidx.compose.p003ui.node;

import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import androidx.compose.p003ui.graphics.TransformOrigin;
import kotlin.Metadata;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;

/* compiled from: NodeCoordinator.kt */
@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0000J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u00020\u000bX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, m7105d2 = {"Landroidx/compose/ui/node/LayerPositionalProperties;", "", "()V", "cameraDistance", "", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "transformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "J", "translationX", "translationY", "copyFrom", "", PomReader.SCOPE, "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "other", "hasSameValuesAs", "", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class LayerPositionalProperties {
    public float rotationX;
    public float rotationY;
    public float rotationZ;
    public float translationX;
    public float translationY;
    public float scaleX = 1.0f;
    public float scaleY = 1.0f;
    public float cameraDistance = 8.0f;
    public long transformOrigin = TransformOrigin.INSTANCE.m11730getCenterSzJe1aQ();

    public final void copyFrom(@NotNull LayerPositionalProperties other) {
        this.scaleX = other.scaleX;
        this.scaleY = other.scaleY;
        this.translationX = other.translationX;
        this.translationY = other.translationY;
        this.rotationX = other.rotationX;
        this.rotationY = other.rotationY;
        this.rotationZ = other.rotationZ;
        this.cameraDistance = other.cameraDistance;
        this.transformOrigin = other.transformOrigin;
    }

    public final void copyFrom(@NotNull GraphicsLayerScope scope) {
        this.scaleX = scope.getScaleX();
        this.scaleY = scope.getScaleY();
        this.translationX = scope.getTranslationX();
        this.translationY = scope.getTranslationY();
        this.rotationX = scope.getRotationX();
        this.rotationY = scope.getRotationY();
        this.rotationZ = scope.getRotationZ();
        this.cameraDistance = scope.getCameraDistance();
        this.transformOrigin = scope.mo11529getTransformOriginSzJe1aQ();
    }

    public final boolean hasSameValuesAs(@NotNull LayerPositionalProperties other) {
        return this.scaleX == other.scaleX && this.scaleY == other.scaleY && this.translationX == other.translationX && this.translationY == other.translationY && this.rotationX == other.rotationX && this.rotationY == other.rotationY && this.rotationZ == other.rotationZ && this.cameraDistance == other.cameraDistance && TransformOrigin.m11724equalsimpl0(this.transformOrigin, other.transformOrigin);
    }
}
