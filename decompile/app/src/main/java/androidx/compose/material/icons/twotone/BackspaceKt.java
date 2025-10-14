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

/* compiled from: Backspace.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m7105d2 = {"_backspace", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Backspace", "Landroidx/compose/material/icons/Icons$TwoTone;", "getBackspace$annotations", "(Landroidx/compose/material/icons/Icons$TwoTone;)V", "getBackspace", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBackspace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Backspace.kt\nandroidx/compose/material/icons/twotone/BackspaceKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,98:1\n212#2,12:99\n233#2,18:112\n253#2:149\n233#2,18:150\n253#2:187\n174#3:111\n705#4,2:130\n717#4,2:132\n719#4,11:138\n705#4,2:168\n717#4,2:170\n719#4,11:176\n72#5,4:134\n72#5,4:172\n*S KotlinDebug\n*F\n+ 1 Backspace.kt\nandroidx/compose/material/icons/twotone/BackspaceKt\n*L\n35#1:99,12\n36#1:112,18\n36#1:149\n60#1:150,18\n60#1:187\n35#1:111\n36#1:130,2\n36#1:132,2\n36#1:138,11\n60#1:168,2\n60#1:170,2\n60#1:176,11\n36#1:134,4\n60#1:172,4\n*E\n"})
/* loaded from: classes.dex */
public final class BackspaceKt {

    @Nullable
    private static ImageVector _backspace;

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.TwoTone.Backspace", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.TwoTone.Backspace", imports = {"androidx.compose.material.icons.automirrored.twotone.Backspace"}))
    public static /* synthetic */ void getBackspace$annotations(Icons.TwoTone twoTone) {
    }

    @NotNull
    public static final ImageVector getBackspace(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _backspace;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Backspace", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.06f, 5.0f);
        pathBuilder.lineTo(2.4f, 12.0f);
        pathBuilder.lineToRelative(4.67f, 7.0f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineTo(7.06f);
        pathBuilder.curveToRelative(0.01f, 0.0f, 0.01f, 0.0f, 0.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 8.41f);
        pathBuilder.lineTo(10.41f, 7.0f);
        pathBuilder.lineTo(14.0f, 10.59f);
        pathBuilder.lineTo(17.59f, 7.0f);
        pathBuilder.lineTo(19.0f, 8.41f);
        pathBuilder.lineTo(15.41f, 12.0f);
        pathBuilder.lineTo(19.0f, 15.59f);
        pathBuilder.lineTo(17.59f, 17.0f);
        pathBuilder.lineTo(14.0f, 13.41f);
        pathBuilder.lineTo(10.41f, 17.0f);
        pathBuilder.lineTo(9.0f, 15.59f);
        pathBuilder.lineTo(12.59f, 12.0f);
        pathBuilder.lineTo(9.0f, 8.41f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(22.0f, 3.0f);
        pathBuilder2.lineTo(7.0f, 3.0f);
        pathBuilder2.curveToRelative(-0.69f, 0.0f, -1.23f, 0.35f, -1.59f, 0.88f);
        pathBuilder2.lineTo(0.0f, 12.0f);
        pathBuilder2.lineToRelative(5.41f, 8.11f);
        pathBuilder2.curveToRelative(0.36f, 0.53f, 0.9f, 0.89f, 1.59f, 0.89f);
        pathBuilder2.horizontalLineToRelative(15.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.lineTo(24.0f, 5.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(22.0f, 19.0f);
        pathBuilder2.lineTo(7.07f, 19.0f);
        pathBuilder2.lineTo(2.4f, 12.0f);
        pathBuilder2.lineToRelative(4.66f, -7.0f);
        pathBuilder2.lineTo(22.0f, 5.0f);
        pathBuilder2.verticalLineToRelative(14.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(10.41f, 17.0f);
        pathBuilder2.lineTo(14.0f, 13.41f);
        pathBuilder2.lineTo(17.59f, 17.0f);
        pathBuilder2.lineTo(19.0f, 15.59f);
        pathBuilder2.lineTo(15.41f, 12.0f);
        pathBuilder2.lineTo(19.0f, 8.41f);
        pathBuilder2.lineTo(17.59f, 7.0f);
        pathBuilder2.lineTo(14.0f, 10.59f);
        pathBuilder2.lineTo(10.41f, 7.0f);
        pathBuilder2.lineTo(9.0f, 8.41f);
        pathBuilder2.lineTo(12.59f, 12.0f);
        pathBuilder2.lineTo(9.0f, 15.59f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _backspace = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
