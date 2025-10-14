package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.graphics.StrokeCap;
import androidx.compose.p003ui.graphics.StrokeJoin;
import androidx.compose.p003ui.graphics.vector.ImageVector;
import androidx.compose.p003ui.graphics.vector.PathBuilder;
import androidx.compose.p003ui.graphics.vector.VectorKt;
import androidx.compose.p003ui.unit.C2046Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TrackChanges.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_trackChanges", "Landroidx/compose/ui/graphics/vector/ImageVector;", "TrackChanges", "Landroidx/compose/material/icons/Icons$Rounded;", "getTrackChanges", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTrackChanges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackChanges.kt\nandroidx/compose/material/icons/rounded/TrackChangesKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,68:1\n212#2,12:69\n233#2,18:82\n253#2:119\n174#3:81\n705#4,2:100\n717#4,2:102\n719#4,11:108\n72#5,4:104\n*S KotlinDebug\n*F\n+ 1 TrackChanges.kt\nandroidx/compose/material/icons/rounded/TrackChangesKt\n*L\n29#1:69,12\n30#1:82,18\n30#1:119\n29#1:81\n30#1:100,2\n30#1:102,2\n30#1:108,11\n30#1:104,4\n*E\n"})
/* loaded from: classes2.dex */
public final class TrackChangesKt {

    @Nullable
    private static ImageVector _trackChanges;

    @NotNull
    public static final ImageVector getTrackChanges(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _trackChanges;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TrackChanges", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.32f, 5.68f);
        pathBuilder.curveToRelative(-0.36f, 0.36f, -0.39f, 0.92f, -0.07f, 1.32f);
        pathBuilder.curveToRelative(1.45f, 1.82f, 2.21f, 4.31f, 1.53f, 6.92f);
        pathBuilder.curveToRelative(-0.79f, 3.05f, -3.18f, 5.33f, -6.21f, 5.94f);
        pathBuilder.curveTo(8.47f, 20.87f, 4.0f, 16.93f, 4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -4.08f, 3.05f, -7.44f, 7.0f, -7.93f);
        pathBuilder.verticalLineToRelative(2.02f);
        pathBuilder.curveToRelative(-3.13f, 0.53f, -5.43f, 3.46f, -4.93f, 6.83f);
        pathBuilder.curveToRelative(0.39f, 2.61f, 2.56f, 4.71f, 5.18f, 5.03f);
        pathBuilder.curveTo(14.89f, 18.4f, 18.0f, 15.56f, 18.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.25f, -0.38f, -2.4f, -1.03f, -3.36f);
        pathBuilder.curveToRelative(-0.34f, -0.5f, -1.07f, -0.53f, -1.5f, -0.11f);
        pathBuilder.lineToRelative(-0.01f, 0.01f);
        pathBuilder.curveToRelative(-0.34f, 0.34f, -0.37f, 0.87f, -0.11f, 1.27f);
        pathBuilder.curveToRelative(0.6f, 0.92f, 0.84f, 2.1f, 0.49f, 3.32f);
        pathBuilder.curveToRelative(-0.39f, 1.37f, -1.54f, 2.46f, -2.94f, 2.77f);
        pathBuilder.curveToRelative(-2.6f, 0.57f, -4.9f, -1.39f, -4.9f, -3.9f);
        pathBuilder.curveToRelative(0.0f, -1.86f, 1.28f, -3.41f, 3.0f, -3.86f);
        pathBuilder.verticalLineToRelative(2.14f);
        pathBuilder.curveToRelative(-0.6f, 0.35f, -1.0f, 0.98f, -1.0f, 1.72f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.curveToRelative(0.0f, -0.74f, -0.4f, -1.38f, -1.0f, -1.72f);
        pathBuilder.verticalLineTo(2.71f);
        pathBuilder.curveToRelative(0.0f, -0.39f, -0.32f, -0.71f, -0.71f, -0.71f);
        pathBuilder.curveToRelative(-5.36f, -0.2f, -9.98f, 4.06f, -10.27f, 9.4f);
        pathBuilder.curveToRelative(-0.36f, 6.55f, 5.41f, 11.82f, 12.01f, 10.4f);
        pathBuilder.curveToRelative(3.88f, -0.83f, 6.88f, -3.8f, 7.75f, -7.67f);
        pathBuilder.curveToRelative(0.71f, -3.16f, -0.2f, -6.16f, -1.97f, -8.37f);
        pathBuilder.curveToRelative(-0.37f, -0.47f, -1.07f, -0.5f, -1.49f, -0.08f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _trackChanges = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
