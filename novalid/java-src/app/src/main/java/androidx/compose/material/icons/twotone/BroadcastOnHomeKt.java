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

/* compiled from: BroadcastOnHome.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_broadcastOnHome", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BroadcastOnHome", "Landroidx/compose/material/icons/Icons$TwoTone;", "getBroadcastOnHome", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBroadcastOnHome.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastOnHome.kt\nandroidx/compose/material/icons/twotone/BroadcastOnHomeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,110:1\n212#2,12:111\n233#2,18:124\n253#2:161\n233#2,18:162\n253#2:199\n233#2,18:200\n253#2:237\n233#2,18:238\n253#2:275\n233#2,18:276\n253#2:313\n233#2,18:314\n253#2:351\n174#3:123\n705#4,2:142\n717#4,2:144\n719#4,11:150\n705#4,2:180\n717#4,2:182\n719#4,11:188\n705#4,2:218\n717#4,2:220\n719#4,11:226\n705#4,2:256\n717#4,2:258\n719#4,11:264\n705#4,2:294\n717#4,2:296\n719#4,11:302\n705#4,2:332\n717#4,2:334\n719#4,11:340\n72#5,4:146\n72#5,4:184\n72#5,4:222\n72#5,4:260\n72#5,4:298\n72#5,4:336\n*S KotlinDebug\n*F\n+ 1 BroadcastOnHome.kt\nandroidx/compose/material/icons/twotone/BroadcastOnHomeKt\n*L\n29#1:111,12\n30#1:124,18\n30#1:161\n37#1:162,18\n37#1:199\n48#1:200,18\n48#1:237\n66#1:238,18\n66#1:275\n77#1:276,18\n77#1:313\n91#1:314,18\n91#1:351\n29#1:123\n30#1:142,2\n30#1:144,2\n30#1:150,11\n37#1:180,2\n37#1:182,2\n37#1:188,11\n48#1:218,2\n48#1:220,2\n48#1:226,11\n66#1:256,2\n66#1:258,2\n66#1:264,11\n77#1:294,2\n77#1:296,2\n77#1:302,11\n91#1:332,2\n91#1:334,2\n91#1:340,11\n30#1:146,4\n37#1:184,4\n48#1:222,4\n66#1:260,4\n77#1:298,4\n91#1:336,4\n*E\n"})
/* loaded from: classes4.dex */
public final class BroadcastOnHomeKt {

    @Nullable
    private static ImageVector _broadcastOnHome;

    @NotNull
    public static final ImageVector getBroadcastOnHome(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _broadcastOnHome;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.BroadcastOnHome", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.0f, 8.59f);
        pathBuilder2.curveToRelative(0.73f, 0.29f, 1.4f, 0.69f, 2.0f, 1.17f);
        pathBuilder2.verticalLineTo(6.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.verticalLineTo(8.59f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(8.0f, 9.0f);
        pathBuilder3.horizontalLineTo(3.0f);
        pathBuilder3.curveToRelative(-0.5f, 0.0f, -1.0f, 0.5f, -1.0f, 1.0f);
        pathBuilder3.verticalLineToRelative(9.0f);
        pathBuilder3.curveToRelative(0.0f, 0.5f, 0.5f, 1.0f, 1.0f, 1.0f);
        pathBuilder3.horizontalLineToRelative(5.0f);
        pathBuilder3.curveToRelative(0.5f, 0.0f, 1.0f, -0.5f, 1.0f, -1.0f);
        pathBuilder3.verticalLineToRelative(-9.0f);
        pathBuilder3.curveTo(9.0f, 9.5f, 8.5f, 9.0f, 8.0f, 9.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(7.0f, 18.0f);
        pathBuilder3.horizontalLineTo(4.0f);
        pathBuilder3.verticalLineToRelative(-7.0f);
        pathBuilder3.horizontalLineToRelative(3.0f);
        pathBuilder3.verticalLineTo(18.0f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(17.0f, 14.75f);
        pathBuilder4.curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f);
        pathBuilder4.curveToRelative(0.0f, 0.4f, 0.2f, 0.75f, 0.5f, 0.97f);
        pathBuilder4.verticalLineTo(22.0f);
        pathBuilder4.horizontalLineToRelative(1.5f);
        pathBuilder4.verticalLineToRelative(-5.03f);
        pathBuilder4.curveToRelative(0.3f, -0.23f, 0.5f, -0.57f, 0.5f, -0.97f);
        pathBuilder4.curveTo(18.25f, 15.31f, 17.69f, 14.75f, 17.0f, 14.75f);
        pathBuilder4.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw5 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk85 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(17.0f, 12.0f);
        pathBuilder5.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilder5.curveToRelative(0.0f, 1.1f, 0.45f, 2.1f, 1.17f, 2.83f);
        pathBuilder5.lineToRelative(1.06f, -1.06f);
        pathBuilder5.curveToRelative(-0.45f, -0.45f, -0.73f, -1.08f, -0.73f, -1.77f);
        pathBuilder5.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        pathBuilder5.reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilder5.curveToRelative(0.0f, 0.69f, -0.28f, 1.31f, -0.73f, 1.76f);
        pathBuilder5.lineToRelative(1.06f, 1.06f);
        pathBuilder5.curveTo(20.55f, 18.1f, 21.0f, 17.1f, 21.0f, 16.0f);
        pathBuilder5.curveTo(21.0f, 13.79f, 19.21f, 12.0f, 17.0f, 12.0f);
        pathBuilder5.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw5, iM11702getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType6 = VectorKt.getDefaultFillType();
        SolidColor solidColor6 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw6 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk86 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(17.0f, 9.5f);
        pathBuilder6.curveToRelative(-3.59f, 0.0f, -6.5f, 2.91f, -6.5f, 6.5f);
        pathBuilder6.curveToRelative(0.0f, 1.79f, 0.73f, 3.42f, 1.9f, 4.6f);
        pathBuilder6.lineToRelative(1.06f, -1.06f);
        pathBuilder6.curveTo(12.56f, 18.63f, 12.0f, 17.38f, 12.0f, 16.0f);
        pathBuilder6.curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f);
        pathBuilder6.reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilder6.curveToRelative(0.0f, 1.37f, -0.56f, 2.62f, -1.46f, 3.52f);
        pathBuilder6.lineToRelative(1.07f, 1.06f);
        pathBuilder6.curveToRelative(1.17f, -1.18f, 1.89f, -2.8f, 1.89f, -4.58f);
        pathBuilder6.curveTo(23.5f, 12.41f, 20.59f, 9.5f, 17.0f, 9.5f);
        pathBuilder6.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder6.getNodes(), defaultFillType6, "", solidColor6, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw6, iM11702getBevelLxFBmk86, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _broadcastOnHome = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
