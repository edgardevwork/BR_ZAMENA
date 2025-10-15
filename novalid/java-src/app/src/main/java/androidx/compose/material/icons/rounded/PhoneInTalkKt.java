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

/* compiled from: PhoneInTalk.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_phoneInTalk", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PhoneInTalk", "Landroidx/compose/material/icons/Icons$Rounded;", "getPhoneInTalk", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPhoneInTalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneInTalk.kt\nandroidx/compose/material/icons/rounded/PhoneInTalkKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,71:1\n212#2,12:72\n233#2,18:85\n253#2:122\n174#3:84\n705#4,2:103\n717#4,2:105\n719#4,11:111\n72#5,4:107\n*S KotlinDebug\n*F\n+ 1 PhoneInTalk.kt\nandroidx/compose/material/icons/rounded/PhoneInTalkKt\n*L\n29#1:72,12\n30#1:85,18\n30#1:122\n29#1:84\n30#1:103,2\n30#1:105,2\n30#1:111,11\n30#1:107,4\n*E\n"})
/* loaded from: classes3.dex */
public final class PhoneInTalkKt {

    @Nullable
    private static ImageVector _phoneInTalk;

    @NotNull
    public static final ImageVector getPhoneInTalk(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _phoneInTalk;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PhoneInTalk", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.88f, 5.05f);
        pathBuilder.curveToRelative(3.18f, 0.4f, 5.67f, 2.89f, 6.07f, 6.07f);
        pathBuilder.curveToRelative(0.06f, 0.51f, 0.49f, 0.88f, 0.99f, 0.88f);
        pathBuilder.curveToRelative(0.04f, 0.0f, 0.08f, 0.0f, 0.12f, -0.01f);
        pathBuilder.curveToRelative(0.55f, -0.07f, 0.94f, -0.57f, 0.87f, -1.12f);
        pathBuilder.curveToRelative(-0.51f, -4.09f, -3.72f, -7.3f, -7.81f, -7.81f);
        pathBuilder.curveToRelative(-0.55f, -0.06f, -1.05f, 0.33f, -1.11f, 0.88f);
        pathBuilder.curveToRelative(-0.07f, 0.55f, 0.32f, 1.05f, 0.87f, 1.11f);
        pathBuilder.close();
        pathBuilder.moveTo(13.26f, 7.16f);
        pathBuilder.curveToRelative(-0.53f, -0.14f, -1.08f, 0.18f, -1.22f, 0.72f);
        pathBuilder.reflectiveCurveToRelative(0.18f, 1.08f, 0.72f, 1.22f);
        pathBuilder.curveToRelative(1.05f, 0.27f, 1.87f, 1.09f, 2.15f, 2.15f);
        pathBuilder.curveToRelative(0.12f, 0.45f, 0.52f, 0.75f, 0.97f, 0.75f);
        pathBuilder.curveToRelative(0.08f, 0.0f, 0.17f, -0.01f, 0.25f, -0.03f);
        pathBuilder.curveToRelative(0.53f, -0.14f, 0.85f, -0.69f, 0.72f, -1.22f);
        pathBuilder.curveToRelative(-0.47f, -1.77f, -1.84f, -3.14f, -3.59f, -3.59f);
        pathBuilder.close();
        pathBuilder.moveTo(19.23f, 15.26f);
        pathBuilder.lineToRelative(-2.54f, -0.29f);
        pathBuilder.curveToRelative(-0.61f, -0.07f, -1.21f, 0.14f, -1.64f, 0.57f);
        pathBuilder.lineToRelative(-1.84f, 1.84f);
        pathBuilder.curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f);
        pathBuilder.lineToRelative(1.85f, -1.85f);
        pathBuilder.curveToRelative(0.43f, -0.43f, 0.64f, -1.03f, 0.57f, -1.64f);
        pathBuilder.lineToRelative(-0.29f, -2.52f);
        pathBuilder.curveToRelative(-0.12f, -1.01f, -0.97f, -1.77f, -1.99f, -1.77f);
        pathBuilder.lineTo(5.03f, 3.01f);
        pathBuilder.curveToRelative(-1.13f, 0.0f, -2.07f, 0.94f, -2.0f, 2.07f);
        pathBuilder.curveToRelative(0.53f, 8.54f, 7.36f, 15.36f, 15.89f, 15.89f);
        pathBuilder.curveToRelative(1.13f, 0.07f, 2.07f, -0.87f, 2.07f, -2.0f);
        pathBuilder.verticalLineToRelative(-1.73f);
        pathBuilder.curveToRelative(0.01f, -1.01f, -0.75f, -1.86f, -1.76f, -1.98f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phoneInTalk = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
