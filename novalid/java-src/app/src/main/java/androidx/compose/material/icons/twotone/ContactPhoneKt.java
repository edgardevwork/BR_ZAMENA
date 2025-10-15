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

/* compiled from: ContactPhone.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_contactPhone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ContactPhone", "Landroidx/compose/material/icons/Icons$TwoTone;", "getContactPhone", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nContactPhone.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContactPhone.kt\nandroidx/compose/material/icons/twotone/ContactPhoneKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,126:1\n212#2,12:127\n233#2,18:140\n253#2:177\n233#2,18:178\n253#2:215\n174#3:139\n705#4,2:158\n717#4,2:160\n719#4,11:166\n705#4,2:196\n717#4,2:198\n719#4,11:204\n72#5,4:162\n72#5,4:200\n*S KotlinDebug\n*F\n+ 1 ContactPhone.kt\nandroidx/compose/material/icons/twotone/ContactPhoneKt\n*L\n29#1:127,12\n30#1:140,18\n30#1:177\n65#1:178,18\n65#1:215\n29#1:139\n30#1:158,2\n30#1:160,2\n30#1:166,11\n65#1:196,2\n65#1:198,2\n65#1:204,11\n30#1:162,4\n65#1:200,4\n*E\n"})
/* loaded from: classes2.dex */
public final class ContactPhoneKt {

    @Nullable
    private static ImageVector _contactPhone;

    @NotNull
    public static final ImageVector getContactPhone(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _contactPhone;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ContactPhone", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 5.0f);
        pathBuilder.lineTo(2.0f, 5.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.lineTo(22.0f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 6.0f);
        pathBuilder.curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-1.35f, 3.0f, -3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-3.0f, -1.35f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 18.0f);
        pathBuilder.lineTo(3.0f, 18.0f);
        pathBuilder.verticalLineToRelative(-1.41f);
        pathBuilder.curveTo(3.0f, 14.08f, 6.97f, 13.0f, 9.0f, 13.0f);
        pathBuilder.reflectiveCurveToRelative(6.0f, 1.08f, 6.0f, 3.58f);
        pathBuilder.lineTo(15.0f, 18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.85f, 14.0f);
        pathBuilder.horizontalLineToRelative(1.64f);
        pathBuilder.lineTo(21.0f, 16.0f);
        pathBuilder.lineToRelative(-1.99f, 1.99f);
        pathBuilder.curveToRelative(-1.31f, -0.98f, -2.28f, -2.38f, -2.73f, -3.99f);
        pathBuilder.curveToRelative(-0.18f, -0.64f, -0.28f, -1.31f, -0.28f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.1f, -1.36f, 0.28f, -2.0f);
        pathBuilder.curveToRelative(0.45f, -1.62f, 1.42f, -3.01f, 2.73f, -3.99f);
        pathBuilder.lineTo(21.0f, 8.0f);
        pathBuilder.lineToRelative(-1.51f, 2.0f);
        pathBuilder.horizontalLineToRelative(-1.64f);
        pathBuilder.curveToRelative(-0.22f, 0.63f, -0.35f, 1.3f, -0.35f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.13f, 1.37f, 0.35f, 2.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(2.0f, 21.0f);
        pathBuilder2.horizontalLineToRelative(20.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
        pathBuilder2.lineTo(24.0f, 5.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.lineTo(2.0f, 3.0f);
        pathBuilder2.curveTo(0.9f, 3.0f, 0.0f, 3.9f, 0.0f, 5.0f);
        pathBuilder2.verticalLineToRelative(14.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(2.0f, 5.0f);
        pathBuilder2.horizontalLineToRelative(20.0f);
        pathBuilder2.verticalLineToRelative(14.0f);
        pathBuilder2.lineTo(2.0f, 19.0f);
        pathBuilder2.lineTo(2.0f, 5.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.49f, 10.0f);
        pathBuilder2.lineTo(21.0f, 8.0f);
        pathBuilder2.lineToRelative(-1.99f, -1.99f);
        pathBuilder2.curveToRelative(-1.31f, 0.98f, -2.28f, 2.37f, -2.73f, 3.99f);
        pathBuilder2.curveToRelative(-0.18f, 0.64f, -0.28f, 1.31f, -0.28f, 2.0f);
        pathBuilder2.reflectiveCurveToRelative(0.1f, 1.36f, 0.28f, 2.0f);
        pathBuilder2.curveToRelative(0.45f, 1.61f, 1.42f, 3.01f, 2.73f, 3.99f);
        pathBuilder2.lineTo(21.0f, 16.0f);
        pathBuilder2.lineToRelative(-1.51f, -2.0f);
        pathBuilder2.horizontalLineToRelative(-1.64f);
        pathBuilder2.curveToRelative(-0.22f, -0.63f, -0.35f, -1.3f, -0.35f, -2.0f);
        pathBuilder2.reflectiveCurveToRelative(0.13f, -1.37f, 0.35f, -2.0f);
        pathBuilder2.horizontalLineToRelative(1.64f);
        pathBuilder2.close();
        pathBuilder2.moveTo(9.0f, 12.0f);
        pathBuilder2.curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.35f, -3.0f, -3.0f, -3.0f);
        pathBuilder2.reflectiveCurveToRelative(-3.0f, 1.35f, -3.0f, 3.0f);
        pathBuilder2.reflectiveCurveToRelative(1.35f, 3.0f, 3.0f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(9.0f, 8.0f);
        pathBuilder2.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder2.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder2.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(9.0f, 13.0f);
        pathBuilder2.curveToRelative(-2.03f, 0.0f, -6.0f, 1.08f, -6.0f, 3.58f);
        pathBuilder2.lineTo(3.0f, 18.0f);
        pathBuilder2.horizontalLineToRelative(12.0f);
        pathBuilder2.verticalLineToRelative(-1.41f);
        pathBuilder2.curveTo(15.0f, 14.08f, 11.03f, 13.0f, 9.0f, 13.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(5.48f, 16.0f);
        pathBuilder2.curveToRelative(0.74f, -0.5f, 2.22f, -1.0f, 3.52f, -1.0f);
        pathBuilder2.reflectiveCurveToRelative(2.77f, 0.49f, 3.52f, 1.0f);
        pathBuilder2.lineTo(5.48f, 16.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contactPhone = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
