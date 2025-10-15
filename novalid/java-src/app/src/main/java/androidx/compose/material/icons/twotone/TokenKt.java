package androidx.compose.material.icons.twotone;

import androidx.browser.trusted.Token;
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

/* compiled from: Token.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_token", "Landroidx/compose/ui/graphics/vector/ImageVector;", Token.TAG, "Landroidx/compose/material/icons/Icons$TwoTone;", "getToken", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Token.kt\nandroidx/compose/material/icons/twotone/TokenKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,107:1\n212#2,12:108\n233#2,18:121\n253#2:158\n233#2,18:159\n253#2:196\n174#3:120\n705#4,2:139\n717#4,2:141\n719#4,11:147\n705#4,2:177\n717#4,2:179\n719#4,11:185\n72#5,4:143\n72#5,4:181\n*S KotlinDebug\n*F\n+ 1 Token.kt\nandroidx/compose/material/icons/twotone/TokenKt\n*L\n29#1:108,12\n30#1:121,18\n30#1:158\n62#1:159,18\n62#1:196\n29#1:120\n30#1:139,2\n30#1:141,2\n30#1:147,11\n62#1:177,2\n62#1:179,2\n62#1:185,11\n30#1:143,4\n62#1:181,4\n*E\n"})
/* loaded from: classes2.dex */
public final class TokenKt {

    @Nullable
    private static ImageVector _token;

    @NotNull
    public static final ImageVector getToken(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _token;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Token", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.29f);
        pathBuilder.lineToRelative(5.91f, 3.28f);
        pathBuilder.lineTo(14.9f, 9.24f);
        pathBuilder.curveTo(14.17f, 8.48f, 13.14f, 8.0f, 12.0f, 8.0f);
        pathBuilder.reflectiveCurveTo(9.83f, 8.48f, 9.1f, 9.24f);
        pathBuilder.lineTo(6.09f, 7.57f);
        pathBuilder.lineTo(12.0f, 4.29f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 19.16f);
        pathBuilder.lineToRelative(-6.0f, -3.33f);
        pathBuilder.verticalLineTo(9.26f);
        pathBuilder.lineToRelative(3.13f, 1.74f);
        pathBuilder.curveTo(8.04f, 11.31f, 8.0f, 11.65f, 8.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 1.86f, 1.27f, 3.43f, 3.0f, 3.87f);
        pathBuilder.verticalLineTo(19.16f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(10.0f, 13.1f, 10.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 19.16f);
        pathBuilder.verticalLineToRelative(-3.28f);
        pathBuilder.curveToRelative(1.73f, -0.44f, 3.0f, -2.01f, 3.0f, -3.87f);
        pathBuilder.curveToRelative(0.0f, -0.35f, -0.04f, -0.69f, -0.13f, -1.01f);
        pathBuilder.lineTo(19.0f, 9.26f);
        pathBuilder.lineToRelative(0.0f, 6.57f);
        pathBuilder.lineTo(13.0f, 19.16f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(21.0f, 7.0f);
        pathBuilder2.lineToRelative(-9.0f, -5.0f);
        pathBuilder2.lineTo(3.0f, 7.0f);
        pathBuilder2.verticalLineToRelative(10.0f);
        pathBuilder2.lineToRelative(9.0f, 5.0f);
        pathBuilder2.lineToRelative(9.0f, -5.0f);
        pathBuilder2.lineTo(21.0f, 7.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 4.29f);
        pathBuilder2.lineToRelative(5.91f, 3.28f);
        pathBuilder2.lineTo(14.9f, 9.24f);
        pathBuilder2.curveTo(14.17f, 8.48f, 13.14f, 8.0f, 12.0f, 8.0f);
        pathBuilder2.reflectiveCurveTo(9.83f, 8.48f, 9.1f, 9.24f);
        pathBuilder2.lineTo(6.09f, 7.57f);
        pathBuilder2.lineTo(12.0f, 4.29f);
        pathBuilder2.close();
        pathBuilder2.moveTo(11.0f, 19.16f);
        pathBuilder2.lineToRelative(-6.0f, -3.33f);
        pathBuilder2.verticalLineTo(9.26f);
        pathBuilder2.lineToRelative(3.13f, 1.74f);
        pathBuilder2.curveTo(8.04f, 11.31f, 8.0f, 11.65f, 8.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, 1.86f, 1.27f, 3.43f, 3.0f, 3.87f);
        pathBuilder2.verticalLineTo(19.16f);
        pathBuilder2.close();
        pathBuilder2.moveTo(10.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder2.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder2.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder2.reflectiveCurveTo(10.0f, 13.1f, 10.0f, 12.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.0f, 19.16f);
        pathBuilder2.verticalLineToRelative(-3.28f);
        pathBuilder2.curveToRelative(1.73f, -0.44f, 3.0f, -2.01f, 3.0f, -3.87f);
        pathBuilder2.curveToRelative(0.0f, -0.35f, -0.04f, -0.69f, -0.13f, -1.01f);
        pathBuilder2.lineTo(19.0f, 9.26f);
        pathBuilder2.lineToRelative(0.0f, 6.57f);
        pathBuilder2.lineTo(13.0f, 19.16f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _token = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
