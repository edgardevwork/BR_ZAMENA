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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PhoneMissed.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m7105d2 = {"_phoneMissed", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PhoneMissed", "Landroidx/compose/material/icons/Icons$TwoTone;", "getPhoneMissed$annotations", "(Landroidx/compose/material/icons/Icons$TwoTone;)V", "getPhoneMissed", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPhoneMissed.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneMissed.kt\nandroidx/compose/material/icons/twotone/PhoneMissedKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,103:1\n212#2,12:104\n233#2,18:117\n253#2:154\n233#2,18:155\n253#2:192\n174#3:116\n705#4,2:135\n717#4,2:137\n719#4,11:143\n705#4,2:173\n717#4,2:175\n719#4,11:181\n72#5,4:139\n72#5,4:177\n*S KotlinDebug\n*F\n+ 1 PhoneMissed.kt\nandroidx/compose/material/icons/twotone/PhoneMissedKt\n*L\n35#1:104,12\n36#1:117,18\n36#1:154\n50#1:155,18\n50#1:192\n35#1:116\n36#1:135,2\n36#1:137,2\n36#1:143,11\n50#1:173,2\n50#1:175,2\n50#1:181,11\n36#1:139,4\n50#1:177,4\n*E\n"})
/* loaded from: classes.dex */
public final class PhoneMissedKt {

    @Nullable
    private static ImageVector _phoneMissed;

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.TwoTone.PhoneMissed", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.TwoTone.PhoneMissed", imports = {"androidx.compose.material.icons.automirrored.twotone.PhoneMissed"}))
    public static /* synthetic */ void getPhoneMissed$annotations(Icons.TwoTone twoTone) {
    }

    @NotNull
    public static final ImageVector getPhoneMissed(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _phoneMissed;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PhoneMissed", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.6f, 17.22f);
        pathBuilder.curveToRelative(0.66f, 0.37f, 1.28f, 0.79f, 1.88f, 1.27f);
        pathBuilder.lineToRelative(1.07f, -1.07f);
        pathBuilder.curveToRelative(-0.91f, -0.75f, -1.9f, -1.39f, -2.95f, -1.9f);
        pathBuilder.verticalLineToRelative(1.7f);
        pathBuilder.close();
        pathBuilder.moveTo(3.53f, 18.5f);
        pathBuilder.curveToRelative(0.58f, -0.47f, 1.21f, -0.89f, 1.87f, -1.27f);
        pathBuilder.verticalLineToRelative(-1.71f);
        pathBuilder.curveToRelative(-1.05f, 0.51f, -2.03f, 1.15f, -2.95f, 1.9f);
        pathBuilder.lineToRelative(1.08f, 1.08f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(23.71f, 16.67f);
        pathBuilder2.curveTo(20.66f, 13.78f, 16.54f, 12.0f, 12.0f, 12.0f);
        pathBuilder2.reflectiveCurveTo(3.34f, 13.78f, 0.29f, 16.67f);
        pathBuilder2.curveToRelative(-0.18f, 0.18f, -0.29f, 0.43f, -0.29f, 0.71f);
        pathBuilder2.curveToRelative(0.0f, 0.28f, 0.11f, 0.53f, 0.29f, 0.71f);
        pathBuilder2.lineToRelative(2.48f, 2.48f);
        pathBuilder2.curveToRelative(0.18f, 0.18f, 0.43f, 0.29f, 0.71f, 0.29f);
        pathBuilder2.curveToRelative(0.27f, 0.0f, 0.52f, -0.11f, 0.7f, -0.28f);
        pathBuilder2.curveToRelative(0.79f, -0.74f, 1.69f, -1.36f, 2.66f, -1.85f);
        pathBuilder2.curveToRelative(0.33f, -0.16f, 0.56f, -0.5f, 0.56f, -0.9f);
        pathBuilder2.verticalLineToRelative(-3.1f);
        pathBuilder2.curveToRelative(1.45f, -0.48f, 3.0f, -0.73f, 4.6f, -0.73f);
        pathBuilder2.reflectiveCurveToRelative(3.15f, 0.25f, 4.6f, 0.72f);
        pathBuilder2.verticalLineToRelative(3.1f);
        pathBuilder2.curveToRelative(0.0f, 0.39f, 0.23f, 0.74f, 0.56f, 0.9f);
        pathBuilder2.curveToRelative(0.98f, 0.49f, 1.87f, 1.12f, 2.67f, 1.85f);
        pathBuilder2.curveToRelative(0.18f, 0.18f, 0.43f, 0.28f, 0.7f, 0.28f);
        pathBuilder2.curveToRelative(0.28f, 0.0f, 0.53f, -0.11f, 0.71f, -0.29f);
        pathBuilder2.lineToRelative(2.48f, -2.48f);
        pathBuilder2.curveToRelative(0.18f, -0.18f, 0.29f, -0.43f, 0.29f, -0.71f);
        pathBuilder2.curveToRelative(0.0f, -0.28f, -0.12f, -0.52f, -0.3f, -0.7f);
        pathBuilder2.close();
        pathBuilder2.moveTo(5.4f, 17.23f);
        pathBuilder2.curveToRelative(-0.66f, 0.37f, -1.29f, 0.8f, -1.87f, 1.27f);
        pathBuilder2.lineToRelative(-1.07f, -1.07f);
        pathBuilder2.curveToRelative(0.91f, -0.75f, 1.9f, -1.39f, 2.95f, -1.9f);
        pathBuilder2.verticalLineToRelative(1.7f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.48f, 18.49f);
        pathBuilder2.curveToRelative(-0.6f, -0.48f, -1.22f, -0.9f, -1.88f, -1.27f);
        pathBuilder2.verticalLineToRelative(-1.7f);
        pathBuilder2.curveToRelative(1.05f, 0.51f, 2.03f, 1.15f, 2.95f, 1.9f);
        pathBuilder2.lineToRelative(-1.07f, 1.07f);
        pathBuilder2.close();
        pathBuilder2.moveTo(7.0f, 6.43f);
        pathBuilder2.lineToRelative(4.94f, 4.94f);
        pathBuilder2.lineToRelative(7.07f, -7.07f);
        pathBuilder2.lineToRelative(-1.41f, -1.42f);
        pathBuilder2.lineToRelative(-5.66f, 5.66f);
        pathBuilder2.lineTo(8.4f, 5.0f);
        pathBuilder2.lineTo(11.0f, 5.0f);
        pathBuilder2.lineTo(11.0f, 3.0f);
        pathBuilder2.lineTo(5.0f, 3.0f);
        pathBuilder2.verticalLineToRelative(6.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phoneMissed = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
