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

/* compiled from: WrongLocation.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_wrongLocation", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WrongLocation", "Landroidx/compose/material/icons/Icons$TwoTone;", "getWrongLocation", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nWrongLocation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WrongLocation.kt\nandroidx/compose/material/icons/twotone/WrongLocationKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,72:1\n212#2,12:73\n233#2,18:86\n253#2:123\n233#2,18:124\n253#2:161\n233#2,18:162\n253#2:199\n174#3:85\n705#4,2:104\n717#4,2:106\n719#4,11:112\n705#4,2:142\n717#4,2:144\n719#4,11:150\n705#4,2:180\n717#4,2:182\n719#4,11:188\n72#5,4:108\n72#5,4:146\n72#5,4:184\n*S KotlinDebug\n*F\n+ 1 WrongLocation.kt\nandroidx/compose/material/icons/twotone/WrongLocationKt\n*L\n29#1:73,12\n30#1:86,18\n30#1:123\n46#1:124,18\n46#1:161\n52#1:162,18\n52#1:199\n29#1:85\n30#1:104,2\n30#1:106,2\n30#1:112,11\n46#1:142,2\n46#1:144,2\n46#1:150,11\n52#1:180,2\n52#1:182,2\n52#1:188,11\n30#1:108,4\n46#1:146,4\n52#1:184,4\n*E\n"})
/* loaded from: classes3.dex */
public final class WrongLocationKt {

    @Nullable
    private static ImageVector _wrongLocation;

    @NotNull
    public static final ImageVector getWrongLocation(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _wrongLocation;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.WrongLocation", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 11.0f);
        pathBuilder.curveToRelative(0.0f, 0.07f, 0.0f, 0.13f, 0.0f, 0.2f);
        pathBuilder.curveToRelative(0.0f, 2.34f, -1.95f, 5.44f, -6.0f, 9.14f);
        pathBuilder.curveToRelative(-4.05f, -3.7f, -6.0f, -6.79f, -6.0f, -9.14f);
        pathBuilder.curveTo(6.0f, 7.57f, 8.65f, 5.0f, 12.0f, 5.0f);
        pathBuilder.curveToRelative(0.34f, 0.0f, 0.68f, 0.03f, 1.0f, 0.08f);
        pathBuilder.verticalLineTo(3.06f);
        pathBuilder.curveTo(12.67f, 3.02f, 12.34f, 3.0f, 12.0f, 3.0f);
        pathBuilder.curveToRelative(-4.2f, 0.0f, -8.0f, 3.22f, -8.0f, 8.2f);
        pathBuilder.curveToRelative(0.0f, 3.32f, 2.67f, 7.25f, 8.0f, 11.8f);
        pathBuilder.curveToRelative(5.33f, -4.55f, 8.0f, -8.48f, 8.0f, -11.8f);
        pathBuilder.curveToRelative(0.0f, -0.07f, 0.0f, -0.13f, 0.0f, -0.2f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 11.0f);
        pathBuilder2.moveToRelative(-2.0f, 0.0f);
        pathBuilder2.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        pathBuilder2.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(22.54f, 2.88f);
        pathBuilder3.lineToRelative(-1.42f, -1.42f);
        pathBuilder3.lineToRelative(-2.12f, 2.13f);
        pathBuilder3.lineToRelative(-2.12f, -2.13f);
        pathBuilder3.lineToRelative(-1.42f, 1.42f);
        pathBuilder3.lineToRelative(2.13f, 2.12f);
        pathBuilder3.lineToRelative(-2.13f, 2.12f);
        pathBuilder3.lineToRelative(1.42f, 1.42f);
        pathBuilder3.lineToRelative(2.12f, -2.13f);
        pathBuilder3.lineToRelative(2.12f, 2.13f);
        pathBuilder3.lineToRelative(1.42f, -1.42f);
        pathBuilder3.lineToRelative(-2.13f, -2.12f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wrongLocation = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
