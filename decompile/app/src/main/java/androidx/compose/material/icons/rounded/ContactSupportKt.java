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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ContactSupport.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m7105d2 = {"_contactSupport", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ContactSupport", "Landroidx/compose/material/icons/Icons$Rounded;", "getContactSupport$annotations", "(Landroidx/compose/material/icons/Icons$Rounded;)V", "getContactSupport", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nContactSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContactSupport.kt\nandroidx/compose/material/icons/rounded/ContactSupportKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,81:1\n212#2,12:82\n233#2,18:95\n253#2:132\n174#3:94\n705#4,2:113\n717#4,2:115\n719#4,11:121\n72#5,4:117\n*S KotlinDebug\n*F\n+ 1 ContactSupport.kt\nandroidx/compose/material/icons/rounded/ContactSupportKt\n*L\n35#1:82,12\n36#1:95,18\n36#1:132\n35#1:94\n36#1:113,2\n36#1:115,2\n36#1:121,11\n36#1:117,4\n*E\n"})
/* loaded from: classes.dex */
public final class ContactSupportKt {

    @Nullable
    private static ImageVector _contactSupport;

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.Rounded.ContactSupport", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.Rounded.ContactSupport", imports = {"androidx.compose.material.icons.automirrored.rounded.ContactSupport"}))
    public static /* synthetic */ void getContactSupport$annotations(Icons.Rounded rounded) {
    }

    @NotNull
    public static final ImageVector getContactSupport(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _contactSupport;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ContactSupport", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.5f, 2.0f);
        pathBuilder.curveTo(6.81f, 2.0f, 3.0f, 5.81f, 3.0f, 10.5f);
        pathBuilder.reflectiveCurveTo(6.81f, 19.0f, 11.5f, 19.0f);
        pathBuilder.horizontalLineToRelative(0.5f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.curveToRelative(4.86f, -2.34f, 8.0f, -7.0f, 8.0f, -11.5f);
        pathBuilder.curveTo(20.0f, 5.81f, 16.19f, 2.0f, 11.5f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.5f, 16.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.9f, 11.72f);
        pathBuilder.curveToRelative(-0.01f, 0.01f, -0.02f, 0.03f, -0.03f, 0.05f);
        pathBuilder.curveToRelative(-0.05f, 0.08f, -0.1f, 0.16f, -0.14f, 0.24f);
        pathBuilder.curveToRelative(-0.02f, 0.03f, -0.03f, 0.07f, -0.04f, 0.11f);
        pathBuilder.curveToRelative(-0.03f, 0.07f, -0.06f, 0.14f, -0.08f, 0.21f);
        pathBuilder.curveToRelative(-0.07f, 0.21f, -0.1f, 0.43f, -0.1f, 0.68f);
        pathBuilder.lineTo(10.5f, 13.01f);
        pathBuilder.curveToRelative(0.0f, -0.51f, 0.08f, -0.94f, 0.2f, -1.3f);
        pathBuilder.curveToRelative(0.0f, -0.01f, 0.0f, -0.02f, 0.01f, -0.03f);
        pathBuilder.curveToRelative(0.01f, -0.04f, 0.04f, -0.06f, 0.05f, -0.1f);
        pathBuilder.curveToRelative(0.06f, -0.16f, 0.13f, -0.3f, 0.22f, -0.44f);
        pathBuilder.curveToRelative(0.03f, -0.05f, 0.07f, -0.1f, 0.1f, -0.15f);
        pathBuilder.curveToRelative(0.03f, -0.04f, 0.05f, -0.09f, 0.08f, -0.12f);
        pathBuilder.lineToRelative(0.01f, 0.01f);
        pathBuilder.curveToRelative(0.84f, -1.1f, 2.21f, -1.44f, 2.32f, -2.68f);
        pathBuilder.curveToRelative(0.09f, -0.98f, -0.61f, -1.93f, -1.57f, -2.13f);
        pathBuilder.curveToRelative(-1.04f, -0.22f, -1.98f, 0.39f, -2.3f, 1.28f);
        pathBuilder.curveToRelative(-0.14f, 0.36f, -0.47f, 0.65f, -0.88f, 0.65f);
        pathBuilder.horizontalLineToRelative(-0.2f);
        pathBuilder.curveToRelative(-0.6f, 0.0f, -1.04f, -0.59f, -0.87f, -1.17f);
        pathBuilder.curveToRelative(0.55f, -1.82f, 2.37f, -3.09f, 4.43f, -2.79f);
        pathBuilder.curveToRelative(1.69f, 0.25f, 3.04f, 1.64f, 3.33f, 3.33f);
        pathBuilder.curveToRelative(0.44f, 2.44f, -1.63f, 3.03f, -2.53f, 4.35f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contactSupport = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
