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

/* compiled from: TextRotationAngleup.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_textRotationAngleup", "Landroidx/compose/ui/graphics/vector/ImageVector;", "TextRotationAngleup", "Landroidx/compose/material/icons/Icons$Rounded;", "getTextRotationAngleup", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTextRotationAngleup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRotationAngleup.kt\nandroidx/compose/material/icons/rounded/TextRotationAngleupKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,68:1\n212#2,12:69\n233#2,18:82\n253#2:119\n174#3:81\n705#4,2:100\n717#4,2:102\n719#4,11:108\n72#5,4:104\n*S KotlinDebug\n*F\n+ 1 TextRotationAngleup.kt\nandroidx/compose/material/icons/rounded/TextRotationAngleupKt\n*L\n29#1:69,12\n30#1:82,18\n30#1:119\n29#1:81\n30#1:100,2\n30#1:102,2\n30#1:108,11\n30#1:104,4\n*E\n"})
/* loaded from: classes2.dex */
public final class TextRotationAngleupKt {

    @Nullable
    private static ImageVector _textRotationAngleup;

    @NotNull
    public static final ImageVector getTextRotationAngleup(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _textRotationAngleup;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TextRotationAngleup", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.61f, 9.85f);
        pathBuilder.lineToRelative(0.56f, 0.56f);
        pathBuilder.lineToRelative(-8.48f, 8.49f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(8.49f, -8.49f);
        pathBuilder.lineToRelative(0.56f, 0.56f);
        pathBuilder.curveToRelative(0.31f, 0.32f, 0.85f, 0.1f, 0.85f, -0.34f);
        pathBuilder.lineTo(21.0f, 9.5f);
        pathBuilder.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilder.horizontalLineToRelative(-2.54f);
        pathBuilder.curveToRelative(-0.44f, 0.0f, -0.66f, 0.54f, -0.35f, 0.85f);
        pathBuilder.close();
        pathBuilder.moveTo(8.48f, 12.75f);
        pathBuilder.lineToRelative(3.54f, -3.54f);
        pathBuilder.lineToRelative(1.6f, 0.67f);
        pathBuilder.curveToRelative(0.36f, 0.15f, 0.77f, 0.07f, 1.05f, -0.21f);
        pathBuilder.curveToRelative(0.49f, -0.49f, 0.32f, -1.31f, -0.32f, -1.57f);
        pathBuilder.lineTo(5.26f, 4.5f);
        pathBuilder.curveToRelative(-0.43f, -0.16f, -0.91f, -0.06f, -1.23f, 0.26f);
        pathBuilder.curveToRelative(-0.32f, 0.32f, -0.42f, 0.8f, -0.25f, 1.23f);
        pathBuilder.lineToRelative(3.61f, 9.09f);
        pathBuilder.curveToRelative(0.25f, 0.64f, 1.08f, 0.81f, 1.57f, 0.32f);
        pathBuilder.curveToRelative(0.28f, -0.28f, 0.36f, -0.69f, 0.21f, -1.05f);
        pathBuilder.lineToRelative(-0.69f, -1.6f);
        pathBuilder.close();
        pathBuilder.moveTo(7.66f, 11.03f);
        pathBuilder.lineTo(5.43f, 6.16f);
        pathBuilder.lineToRelative(4.87f, 2.23f);
        pathBuilder.lineToRelative(-2.64f, 2.64f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textRotationAngleup = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
