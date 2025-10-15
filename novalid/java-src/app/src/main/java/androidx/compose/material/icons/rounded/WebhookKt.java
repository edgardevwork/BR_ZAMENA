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

/* compiled from: Webhook.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_webhook", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Webhook", "Landroidx/compose/material/icons/Icons$Rounded;", "getWebhook", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nWebhook.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Webhook.kt\nandroidx/compose/material/icons/rounded/WebhookKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,92:1\n212#2,12:93\n233#2,18:106\n253#2:143\n174#3:105\n705#4,2:124\n717#4,2:126\n719#4,11:132\n72#5,4:128\n*S KotlinDebug\n*F\n+ 1 Webhook.kt\nandroidx/compose/material/icons/rounded/WebhookKt\n*L\n29#1:93,12\n30#1:106,18\n30#1:143\n29#1:105\n30#1:124,2\n30#1:126,2\n30#1:132,11\n30#1:128,4\n*E\n"})
/* loaded from: classes4.dex */
public final class WebhookKt {

    @Nullable
    private static ImageVector _webhook;

    @NotNull
    public static final ImageVector getWebhook(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _webhook;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Webhook", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.0f, 16.0f);
        pathBuilder.curveToRelative(0.0f, -1.84f, 1.0f, -3.45f, 2.48f, -4.32f);
        pathBuilder.curveTo(5.15f, 11.29f, 6.0f, 11.76f, 6.0f, 12.54f);
        pathBuilder.curveToRelative(0.0f, 0.36f, -0.19f, 0.68f, -0.5f, 0.86f);
        pathBuilder.curveTo(4.6f, 13.92f, 4.0f, 14.89f, 4.0f, 16.0f);
        pathBuilder.curveToRelative(0.0f, 1.85f, 1.68f, 3.31f, 3.6f, 2.94f);
        pathBuilder.curveToRelative(1.42f, -0.28f, 2.4f, -1.61f, 2.4f, -3.06f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, -0.49f, 0.39f, -0.88f, 0.88f, -0.88f);
        pathBuilder.lineToRelative(5.0f, 0.0f);
        pathBuilder.curveToRelative(0.27f, -0.31f, 0.67f, -0.5f, 1.12f, -0.5f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder.curveToRelative(-0.44f, 0.0f, -0.84f, -0.19f, -1.12f, -0.5f);
        pathBuilder.lineToRelative(-3.98f, 0.0f);
        pathBuilder.curveToRelative(-0.46f, 2.28f, -2.48f, 4.0f, -4.9f, 4.0f);
        pathBuilder.curveTo(4.24f, 21.0f, 2.0f, 18.76f, 2.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.37f, 7.0f);
        pathBuilder.curveToRelative(0.65f, 0.0f, 1.14f, -0.62f, 0.97f, -1.25f);
        pathBuilder.curveTo(16.79f, 3.59f, 14.83f, 2.0f, 12.5f, 2.0f);
        pathBuilder.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, 1.43f, 0.6f, 2.71f, 1.55f, 3.62f);
        pathBuilder.lineToRelative(-2.35f, 3.9f);
        pathBuilder.curveTo(6.02f, 14.66f, 5.5f, 15.27f, 5.5f, 16.0f);
        pathBuilder.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.curveToRelative(0.0f, -0.16f, -0.02f, -0.31f, -0.07f, -0.45f);
        pathBuilder.lineToRelative(2.86f, -4.75f);
        pathBuilder.curveToRelative(0.25f, -0.41f, 0.13f, -0.95f, -0.28f, -1.19f);
        pathBuilder.curveTo(10.11f, 9.08f, 9.5f, 8.11f, 9.5f, 7.0f);
        pathBuilder.curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.54f, 0.93f, 2.89f, 2.2f);
        pathBuilder.curveTo(15.52f, 6.66f, 15.9f, 7.0f, 16.37f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 13.0f);
        pathBuilder.curveToRelative(-0.38f, 0.0f, -0.75f, 0.07f, -1.09f, 0.2f);
        pathBuilder.curveToRelative(-0.4f, 0.16f, -0.86f, -0.04f, -1.08f, -0.41f);
        pathBuilder.lineToRelative(-2.6f, -4.32f);
        pathBuilder.curveTo(11.53f, 8.35f, 11.0f, 7.74f, 11.0f, 7.0f);
        pathBuilder.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(14.0f, 6.17f, 14.0f, 7.0f);
        pathBuilder.curveToRelative(0.0f, 0.15f, -0.02f, 0.29f, -0.06f, 0.43f);
        pathBuilder.lineToRelative(2.19f, 3.65f);
        pathBuilder.curveTo(16.41f, 11.03f, 16.7f, 11.0f, 17.0f, 11.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f);
        pathBuilder.curveToRelative(-0.86f, 0.0f, -1.68f, -0.22f, -2.39f, -0.61f);
        pathBuilder.curveToRelative(-0.92f, -0.5f, -0.58f, -1.89f, 0.47f, -1.89f);
        pathBuilder.curveToRelative(0.17f, 0.0f, 0.34f, 0.05f, 0.49f, 0.14f);
        pathBuilder.curveTo(15.99f, 18.87f, 16.48f, 19.0f, 17.0f, 19.0f);
        pathBuilder.curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f);
        pathBuilder.reflectiveCurveTo(18.65f, 13.0f, 17.0f, 13.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _webhook = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
