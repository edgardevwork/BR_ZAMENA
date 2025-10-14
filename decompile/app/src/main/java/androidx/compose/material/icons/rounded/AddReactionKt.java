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

/* compiled from: AddReaction.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_addReaction", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AddReaction", "Landroidx/compose/material/icons/Icons$Rounded;", "getAddReaction", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAddReaction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddReaction.kt\nandroidx/compose/material/icons/rounded/AddReactionKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,85:1\n212#2,12:86\n233#2,18:99\n253#2:136\n174#3:98\n705#4,2:117\n717#4,2:119\n719#4,11:125\n72#5,4:121\n*S KotlinDebug\n*F\n+ 1 AddReaction.kt\nandroidx/compose/material/icons/rounded/AddReactionKt\n*L\n29#1:86,12\n30#1:99,18\n30#1:136\n29#1:98\n30#1:117,2\n30#1:119,2\n30#1:125,11\n30#1:121,4\n*E\n"})
/* loaded from: classes4.dex */
public final class AddReactionKt {

    @Nullable
    private static ImageVector _addReaction;

    @NotNull
    public static final ImageVector getAddReaction(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _addReaction;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AddReaction", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(24.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.curveTo(23.55f, 3.0f, 24.0f, 3.45f, 24.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.52f, 8.95f);
        pathBuilder.curveTo(21.83f, 9.91f, 22.0f, 10.94f, 22.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 5.52f, -4.48f, 10.0f, -10.0f, 10.0f);
        pathBuilder.reflectiveCurveTo(2.0f, 17.52f, 2.0f, 12.0f);
        pathBuilder.curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f);
        pathBuilder.curveToRelative(1.5f, 0.0f, 2.92f, 0.34f, 4.2f, 0.94f);
        pathBuilder.curveTo(16.08f, 3.27f, 16.0f, 3.62f, 16.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, 1.35f, 0.9f, 2.5f, 2.13f, 2.87f);
        pathBuilder.curveTo(18.5f, 8.1f, 19.65f, 9.0f, 21.0f, 9.0f);
        pathBuilder.curveTo(21.18f, 9.0f, 21.35f, 8.98f, 21.52f, 8.95f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 9.5f);
        pathBuilder.curveTo(7.0f, 10.33f, 7.67f, 11.0f, 8.5f, 11.0f);
        pathBuilder.reflectiveCurveTo(10.0f, 10.33f, 10.0f, 9.5f);
        pathBuilder.reflectiveCurveTo(9.33f, 8.0f, 8.5f, 8.0f);
        pathBuilder.reflectiveCurveTo(7.0f, 8.67f, 7.0f, 9.5f);
        pathBuilder.close();
        pathBuilder.moveTo(16.31f, 14.0f);
        pathBuilder.horizontalLineTo(7.69f);
        pathBuilder.curveToRelative(-0.38f, 0.0f, -0.63f, 0.42f, -0.44f, 0.75f);
        pathBuilder.curveTo(8.2f, 16.39f, 9.97f, 17.5f, 12.0f, 17.5f);
        pathBuilder.reflectiveCurveToRelative(3.8f, -1.11f, 4.75f, -2.75f);
        pathBuilder.curveTo(16.94f, 14.42f, 16.7f, 14.0f, 16.31f, 14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 9.5f);
        pathBuilder.curveTo(17.0f, 8.67f, 16.33f, 8.0f, 15.5f, 8.0f);
        pathBuilder.reflectiveCurveTo(14.0f, 8.67f, 14.0f, 9.5f);
        pathBuilder.reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(17.0f, 10.33f, 17.0f, 9.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addReaction = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
