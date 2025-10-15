package androidx.compose.material.icons.twotone;

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

/* compiled from: EditNotifications.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_editNotifications", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EditNotifications", "Landroidx/compose/material/icons/Icons$TwoTone;", "getEditNotifications", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nEditNotifications.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditNotifications.kt\nandroidx/compose/material/icons/twotone/EditNotificationsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,92:1\n212#2,12:93\n233#2,18:106\n253#2:143\n233#2,18:144\n253#2:181\n174#3:105\n705#4,2:124\n717#4,2:126\n719#4,11:132\n705#4,2:162\n717#4,2:164\n719#4,11:170\n72#5,4:128\n72#5,4:166\n*S KotlinDebug\n*F\n+ 1 EditNotifications.kt\nandroidx/compose/material/icons/twotone/EditNotificationsKt\n*L\n29#1:93,12\n30#1:106,18\n30#1:143\n43#1:144,18\n43#1:181\n29#1:105\n30#1:124,2\n30#1:126,2\n30#1:132,11\n43#1:162,2\n43#1:164,2\n43#1:170,11\n30#1:128,4\n43#1:166,4\n*E\n"})
/* loaded from: classes4.dex */
public final class EditNotificationsKt {

    @Nullable
    private static ImageVector _editNotifications;

    @NotNull
    public static final ImageVector getEditNotifications(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _editNotifications;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.EditNotifications", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.0f, 14.2f);
        pathBuilder.lineTo(15.2f, 15.0f);
        pathBuilder.horizontalLineToRelative(-4.6f);
        pathBuilder.verticalLineToRelative(-4.6f);
        pathBuilder.lineToRelative(3.68f, -3.68f);
        pathBuilder.curveTo(13.64f, 6.26f, 12.85f, 6.0f, 12.0f, 6.0f);
        pathBuilder.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineTo(14.2f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(17.58f, 6.25f);
        pathBuilder2.lineToRelative(1.77f, 1.77f);
        pathBuilder2.lineTo(14.37f, 13.0f);
        pathBuilder2.horizontalLineTo(12.6f);
        pathBuilder2.verticalLineToRelative(-1.77f);
        pathBuilder2.lineTo(17.58f, 6.25f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.85f, 5.81f);
        pathBuilder2.lineToRelative(-1.06f, -1.06f);
        pathBuilder2.curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f);
        pathBuilder2.lineToRelative(-0.85f, 0.85f);
        pathBuilder2.lineToRelative(1.77f, 1.77f);
        pathBuilder2.lineToRelative(0.85f, -0.85f);
        pathBuilder2.curveTo(21.05f, 6.32f, 21.05f, 6.0f, 20.85f, 5.81f);
        pathBuilder2.close();
        pathBuilder2.moveTo(18.0f, 12.2f);
        pathBuilder2.verticalLineTo(17.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(-7.0f);
        pathBuilder2.curveToRelative(0.0f, -2.79f, 1.91f, -5.14f, 4.5f, -5.8f);
        pathBuilder2.verticalLineTo(3.5f);
        pathBuilder2.curveTo(10.5f, 2.67f, 11.17f, 2.0f, 12.0f, 2.0f);
        pathBuilder2.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder2.verticalLineToRelative(0.7f);
        pathBuilder2.curveToRelative(0.82f, 0.21f, 1.57f, 0.59f, 2.21f, 1.09f);
        pathBuilder2.lineToRelative(-1.43f, 1.43f);
        pathBuilder2.curveTo(13.64f, 6.26f, 12.85f, 6.0f, 12.0f, 6.0f);
        pathBuilder2.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilder2.verticalLineToRelative(7.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.verticalLineToRelative(-2.8f);
        pathBuilder2.lineTo(18.0f, 12.2f);
        pathBuilder2.close();
        pathBuilder2.moveTo(10.0f, 20.0f);
        pathBuilder2.horizontalLineToRelative(4.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder2.reflectiveCurveTo(10.0f, 21.1f, 10.0f, 20.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _editNotifications = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
