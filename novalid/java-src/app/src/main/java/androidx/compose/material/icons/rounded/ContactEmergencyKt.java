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

/* compiled from: ContactEmergency.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_contactEmergency", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ContactEmergency", "Landroidx/compose/material/icons/Icons$Rounded;", "getContactEmergency", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nContactEmergency.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContactEmergency.kt\nandroidx/compose/material/icons/rounded/ContactEmergencyKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,90:1\n212#2,12:91\n233#2,18:104\n253#2:141\n174#3:103\n705#4,2:122\n717#4,2:124\n719#4,11:130\n72#5,4:126\n*S KotlinDebug\n*F\n+ 1 ContactEmergency.kt\nandroidx/compose/material/icons/rounded/ContactEmergencyKt\n*L\n29#1:91,12\n30#1:104,18\n30#1:141\n29#1:103\n30#1:122,2\n30#1:124,2\n30#1:130,11\n30#1:126,4\n*E\n"})
/* loaded from: classes.dex */
public final class ContactEmergencyKt {

    @Nullable
    private static ImageVector _contactEmergency;

    @NotNull
    public static final ImageVector getContactEmergency(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _contactEmergency;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ContactEmergency", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 3.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.curveTo(0.9f, 3.0f, 0.0f, 3.9f, 0.0f, 5.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
        pathBuilder.lineTo(24.0f, 5.0f);
        pathBuilder.curveTo(24.0f, 3.9f, 23.1f, 3.0f, 22.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 8.0f);
        pathBuilder.curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-1.35f, 3.0f, -3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-3.0f, -1.35f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveTo(7.35f, 8.0f, 9.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(2.08f, 19.0f);
        pathBuilder.curveToRelative(1.38f, -2.39f, 3.96f, -4.0f, 6.92f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(5.54f, 1.61f, 6.92f, 4.0f);
        pathBuilder.horizontalLineTo(2.08f);
        pathBuilder.close();
        pathBuilder.moveTo(20.6f, 10.5f);
        pathBuilder.lineTo(20.6f, 10.5f);
        pathBuilder.curveToRelative(-0.21f, 0.36f, -0.67f, 0.48f, -1.02f, 0.27f);
        pathBuilder.lineToRelative(-0.82f, -0.48f);
        pathBuilder.verticalLineToRelative(0.95f);
        pathBuilder.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilder.verticalLineTo(10.3f);
        pathBuilder.lineToRelative(-0.82f, 0.48f);
        pathBuilder.curveToRelative(-0.36f, 0.21f, -0.82f, 0.08f, -1.02f, -0.27f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.21f, -0.36f, -0.08f, -0.82f, 0.27f, -1.02f);
        pathBuilder.lineTo(16.5f, 9.0f);
        pathBuilder.lineToRelative(-0.82f, -0.48f);
        pathBuilder.curveToRelative(-0.36f, -0.21f, -0.48f, -0.67f, -0.27f, -1.02f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.21f, -0.36f, 0.67f, -0.48f, 1.02f, -0.27f);
        pathBuilder.lineToRelative(0.82f, 0.48f);
        pathBuilder.verticalLineTo(6.75f);
        pathBuilder.curveTo(17.25f, 6.34f, 17.59f, 6.0f, 18.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilder.verticalLineTo(7.7f);
        pathBuilder.lineToRelative(0.82f, -0.48f);
        pathBuilder.curveToRelative(0.36f, -0.21f, 0.82f, -0.08f, 1.02f, 0.27f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.21f, 0.36f, 0.08f, 0.82f, -0.27f, 1.02f);
        pathBuilder.lineTo(19.5f, 9.0f);
        pathBuilder.lineToRelative(0.82f, 0.48f);
        pathBuilder.curveTo(20.68f, 9.68f, 20.81f, 10.14f, 20.6f, 10.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contactEmergency = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
