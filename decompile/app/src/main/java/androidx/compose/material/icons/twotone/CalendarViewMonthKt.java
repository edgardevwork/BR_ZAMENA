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

/* compiled from: CalendarViewMonth.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_calendarViewMonth", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CalendarViewMonth", "Landroidx/compose/material/icons/Icons$TwoTone;", "getCalendarViewMonth", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCalendarViewMonth.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarViewMonth.kt\nandroidx/compose/material/icons/twotone/CalendarViewMonthKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,125:1\n212#2,12:126\n233#2,18:139\n253#2:176\n233#2,18:177\n253#2:214\n233#2,18:215\n253#2:252\n233#2,18:253\n253#2:290\n233#2,18:291\n253#2:328\n233#2,18:329\n253#2:366\n233#2,18:367\n253#2:404\n174#3:138\n705#4,2:157\n717#4,2:159\n719#4,11:165\n705#4,2:195\n717#4,2:197\n719#4,11:203\n705#4,2:233\n717#4,2:235\n719#4,11:241\n705#4,2:271\n717#4,2:273\n719#4,11:279\n705#4,2:309\n717#4,2:311\n719#4,11:317\n705#4,2:347\n717#4,2:349\n719#4,11:355\n705#4,2:385\n717#4,2:387\n719#4,11:393\n72#5,4:161\n72#5,4:199\n72#5,4:237\n72#5,4:275\n72#5,4:313\n72#5,4:351\n72#5,4:389\n*S KotlinDebug\n*F\n+ 1 CalendarViewMonth.kt\nandroidx/compose/material/icons/twotone/CalendarViewMonthKt\n*L\n29#1:126,12\n30#1:139,18\n30#1:176\n37#1:177,18\n37#1:214\n44#1:215,18\n44#1:252\n51#1:253,18\n51#1:290\n58#1:291,18\n58#1:328\n65#1:329,18\n65#1:366\n72#1:367,18\n72#1:404\n29#1:138\n30#1:157,2\n30#1:159,2\n30#1:165,11\n37#1:195,2\n37#1:197,2\n37#1:203,11\n44#1:233,2\n44#1:235,2\n44#1:241,11\n51#1:271,2\n51#1:273,2\n51#1:279,11\n58#1:309,2\n58#1:311,2\n58#1:317,11\n65#1:347,2\n65#1:349,2\n65#1:355,11\n72#1:385,2\n72#1:387,2\n72#1:393,11\n30#1:161,4\n37#1:199,4\n44#1:237,4\n51#1:275,4\n58#1:313,4\n65#1:351,4\n72#1:389,4\n*E\n"})
/* loaded from: classes3.dex */
public final class CalendarViewMonthKt {

    @Nullable
    private static ImageVector _calendarViewMonth;

    @NotNull
    public static final ImageVector getCalendarViewMonth(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _calendarViewMonth;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CalendarViewMonth", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(4.0f, 13.0f);
        pathBuilder2.horizontalLineToRelative(4.0f);
        pathBuilder2.verticalLineToRelative(5.0f);
        pathBuilder2.horizontalLineToRelative(-4.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(10.0f, 13.0f);
        pathBuilder3.horizontalLineToRelative(4.0f);
        pathBuilder3.verticalLineToRelative(5.0f);
        pathBuilder3.horizontalLineToRelative(-4.0f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(16.0f, 13.0f);
        pathBuilder4.horizontalLineToRelative(4.0f);
        pathBuilder4.verticalLineToRelative(5.0f);
        pathBuilder4.horizontalLineToRelative(-4.0f);
        pathBuilder4.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw5 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk85 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(16.0f, 6.0f);
        pathBuilder5.horizontalLineToRelative(4.0f);
        pathBuilder5.verticalLineToRelative(5.0f);
        pathBuilder5.horizontalLineToRelative(-4.0f);
        pathBuilder5.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw5, iM11702getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType6 = VectorKt.getDefaultFillType();
        SolidColor solidColor6 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw6 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk86 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(10.0f, 6.0f);
        pathBuilder6.horizontalLineToRelative(4.0f);
        pathBuilder6.verticalLineToRelative(5.0f);
        pathBuilder6.horizontalLineToRelative(-4.0f);
        pathBuilder6.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder6.getNodes(), defaultFillType6, "", solidColor6, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw6, iM11702getBevelLxFBmk86, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType7 = VectorKt.getDefaultFillType();
        SolidColor solidColor7 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw7 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk87 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder7 = new PathBuilder();
        pathBuilder7.moveTo(20.0f, 4.0f);
        pathBuilder7.horizontalLineTo(4.0f);
        pathBuilder7.curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        pathBuilder7.verticalLineToRelative(12.0f);
        pathBuilder7.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder7.horizontalLineToRelative(16.0f);
        pathBuilder7.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder7.verticalLineTo(6.0f);
        pathBuilder7.curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f);
        pathBuilder7.close();
        pathBuilder7.moveTo(8.0f, 18.0f);
        pathBuilder7.horizontalLineTo(4.0f);
        pathBuilder7.verticalLineToRelative(-5.0f);
        pathBuilder7.horizontalLineToRelative(4.0f);
        pathBuilder7.verticalLineTo(18.0f);
        pathBuilder7.close();
        pathBuilder7.moveTo(8.0f, 11.0f);
        pathBuilder7.horizontalLineTo(4.0f);
        pathBuilder7.verticalLineTo(6.0f);
        pathBuilder7.horizontalLineToRelative(4.0f);
        pathBuilder7.verticalLineTo(11.0f);
        pathBuilder7.close();
        pathBuilder7.moveTo(14.0f, 18.0f);
        pathBuilder7.horizontalLineToRelative(-4.0f);
        pathBuilder7.verticalLineToRelative(-5.0f);
        pathBuilder7.horizontalLineToRelative(4.0f);
        pathBuilder7.verticalLineTo(18.0f);
        pathBuilder7.close();
        pathBuilder7.moveTo(14.0f, 11.0f);
        pathBuilder7.horizontalLineToRelative(-4.0f);
        pathBuilder7.verticalLineTo(6.0f);
        pathBuilder7.horizontalLineToRelative(4.0f);
        pathBuilder7.verticalLineTo(11.0f);
        pathBuilder7.close();
        pathBuilder7.moveTo(20.0f, 18.0f);
        pathBuilder7.horizontalLineToRelative(-4.0f);
        pathBuilder7.verticalLineToRelative(-5.0f);
        pathBuilder7.horizontalLineToRelative(4.0f);
        pathBuilder7.verticalLineTo(18.0f);
        pathBuilder7.close();
        pathBuilder7.moveTo(20.0f, 11.0f);
        pathBuilder7.horizontalLineToRelative(-4.0f);
        pathBuilder7.verticalLineTo(6.0f);
        pathBuilder7.horizontalLineToRelative(4.0f);
        pathBuilder7.verticalLineTo(11.0f);
        pathBuilder7.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder7.getNodes(), defaultFillType7, "", solidColor7, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw7, iM11702getBevelLxFBmk87, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _calendarViewMonth = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
