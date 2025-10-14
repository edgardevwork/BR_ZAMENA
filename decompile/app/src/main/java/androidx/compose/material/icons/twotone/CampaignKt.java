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

/* compiled from: Campaign.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_campaign", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Campaign", "Landroidx/compose/material/icons/Icons$TwoTone;", "getCampaign", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCampaign.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Campaign.kt\nandroidx/compose/material/icons/twotone/CampaignKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,108:1\n212#2,12:109\n233#2,18:122\n253#2:159\n233#2,18:160\n253#2:197\n233#2,18:198\n253#2:235\n233#2,18:236\n253#2:273\n233#2,18:274\n253#2:311\n233#2,18:312\n253#2:349\n174#3:121\n705#4,2:140\n717#4,2:142\n719#4,11:148\n705#4,2:178\n717#4,2:180\n719#4,11:186\n705#4,2:216\n717#4,2:218\n719#4,11:224\n705#4,2:254\n717#4,2:256\n719#4,11:262\n705#4,2:292\n717#4,2:294\n719#4,11:300\n705#4,2:330\n717#4,2:332\n719#4,11:338\n72#5,4:144\n72#5,4:182\n72#5,4:220\n72#5,4:258\n72#5,4:296\n72#5,4:334\n*S KotlinDebug\n*F\n+ 1 Campaign.kt\nandroidx/compose/material/icons/twotone/CampaignKt\n*L\n29#1:109,12\n30#1:122,18\n30#1:159\n38#1:160,18\n38#1:197\n46#1:198,18\n46#1:235\n54#1:236,18\n54#1:273\n82#1:274,18\n82#1:311\n89#1:312,18\n89#1:349\n29#1:121\n30#1:140,2\n30#1:142,2\n30#1:148,11\n38#1:178,2\n38#1:180,2\n38#1:186,11\n46#1:216,2\n46#1:218,2\n46#1:224,11\n54#1:254,2\n54#1:256,2\n54#1:262,11\n82#1:292,2\n82#1:294,2\n82#1:300,11\n89#1:330,2\n89#1:332,2\n89#1:338,11\n30#1:144,4\n38#1:182,4\n46#1:220,4\n54#1:258,4\n82#1:296,4\n89#1:334,4\n*E\n"})
/* loaded from: classes3.dex */
public final class CampaignKt {

    @Nullable
    private static ImageVector _campaign;

    @NotNull
    public static final ImageVector getCampaign(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _campaign;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Campaign", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 11.0f);
        pathBuilder.curveToRelative(0.0f, 0.67f, 0.0f, 1.33f, 0.0f, 2.0f);
        pathBuilder.curveToRelative(1.2f, 0.0f, 2.76f, 0.0f, 4.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, -0.67f, 0.0f, -1.33f, 0.0f, -2.0f);
        pathBuilder.curveTo(20.76f, 11.0f, 19.2f, 11.0f, 18.0f, 11.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(16.0f, 17.61f);
        pathBuilder2.curveToRelative(0.96f, 0.71f, 2.21f, 1.65f, 3.2f, 2.39f);
        pathBuilder2.curveToRelative(0.4f, -0.53f, 0.8f, -1.07f, 1.2f, -1.6f);
        pathBuilder2.curveToRelative(-0.99f, -0.74f, -2.24f, -1.68f, -3.2f, -2.4f);
        pathBuilder2.curveTo(16.8f, 16.54f, 16.4f, 17.08f, 16.0f, 17.61f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(20.4f, 5.6f);
        pathBuilder3.curveTo(20.0f, 5.07f, 19.6f, 4.53f, 19.2f, 4.0f);
        pathBuilder3.curveToRelative(-0.99f, 0.74f, -2.24f, 1.68f, -3.2f, 2.4f);
        pathBuilder3.curveToRelative(0.4f, 0.53f, 0.8f, 1.07f, 1.2f, 1.6f);
        pathBuilder3.curveTo(18.16f, 7.28f, 19.41f, 6.35f, 20.4f, 5.6f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(4.0f, 9.0f);
        pathBuilder4.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder4.verticalLineToRelative(2.0f);
        pathBuilder4.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder4.horizontalLineToRelative(1.0f);
        pathBuilder4.verticalLineToRelative(4.0f);
        pathBuilder4.horizontalLineToRelative(2.0f);
        pathBuilder4.verticalLineToRelative(-4.0f);
        pathBuilder4.horizontalLineToRelative(1.0f);
        pathBuilder4.lineToRelative(5.0f, 3.0f);
        pathBuilder4.verticalLineTo(6.0f);
        pathBuilder4.lineTo(8.0f, 9.0f);
        pathBuilder4.horizontalLineTo(4.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(9.03f, 10.71f);
        pathBuilder4.lineTo(11.0f, 9.53f);
        pathBuilder4.verticalLineToRelative(4.94f);
        pathBuilder4.lineToRelative(-1.97f, -1.18f);
        pathBuilder4.lineTo(8.55f, 13.0f);
        pathBuilder4.horizontalLineTo(8.0f);
        pathBuilder4.horizontalLineTo(4.0f);
        pathBuilder4.verticalLineToRelative(-2.0f);
        pathBuilder4.horizontalLineToRelative(4.0f);
        pathBuilder4.horizontalLineToRelative(0.55f);
        pathBuilder4.lineTo(9.03f, 10.71f);
        pathBuilder4.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw5 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk85 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(15.5f, 12.0f);
        pathBuilder5.curveToRelative(0.0f, -1.33f, -0.58f, -2.53f, -1.5f, -3.35f);
        pathBuilder5.verticalLineToRelative(6.69f);
        pathBuilder5.curveTo(14.92f, 14.53f, 15.5f, 13.33f, 15.5f, 12.0f);
        pathBuilder5.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw5, iM11702getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType6 = VectorKt.getDefaultFillType();
        SolidColor solidColor6 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw6 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk86 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(9.03f, 10.71f);
        pathBuilder6.lineTo(11.0f, 9.53f);
        pathBuilder6.verticalLineToRelative(4.94f);
        pathBuilder6.lineToRelative(-1.97f, -1.18f);
        pathBuilder6.lineTo(8.55f, 13.0f);
        pathBuilder6.horizontalLineTo(8.0f);
        pathBuilder6.horizontalLineTo(4.0f);
        pathBuilder6.verticalLineToRelative(-2.0f);
        pathBuilder6.horizontalLineToRelative(4.0f);
        pathBuilder6.horizontalLineToRelative(0.55f);
        pathBuilder6.lineTo(9.03f, 10.71f);
        pathBuilder6.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder6.getNodes(), defaultFillType6, "", solidColor6, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw6, iM11702getBevelLxFBmk86, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _campaign = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
