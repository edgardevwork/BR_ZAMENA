package androidx.compose.p003ui.graphics.vector;

import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.vector.ImageVector;
import androidx.exifinterface.media.ExifInterface;
import com.blackhub.bronline.launcher.LauncherConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ImageVector.kt */
@Metadata(m7104d1 = {"\u0000h\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0086\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012H\u0086\b\u001a\u0098\u0001\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020 2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012H\u0086\bø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a'\u0010%\u001a\u0002H&\"\u0004\b\u0000\u0010&*\u0012\u0012\u0004\u0012\u0002H&0'j\b\u0012\u0004\u0012\u0002H&`(H\u0002¢\u0006\u0002\u0010)\u001a'\u0010*\u001a\u0002H&\"\u0004\b\u0000\u0010&*\u0012\u0012\u0004\u0012\u0002H&0'j\b\u0012\u0004\u0012\u0002H&`(H\u0002¢\u0006\u0002\u0010)\u001a/\u0010+\u001a\u00020,\"\u0004\b\u0000\u0010&*\u0012\u0012\u0004\u0012\u0002H&0'j\b\u0012\u0004\u0012\u0002H&`(2\u0006\u0010-\u001a\u0002H&H\u0002¢\u0006\u0002\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, m7105d2 = {"group", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "name", "", "rotate", "", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "block", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "path", "fill", "Landroidx/compose/ui/graphics/Brush;", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineMiter", "pathFillType", "Landroidx/compose/ui/graphics/PathFillType;", "pathBuilder", "Landroidx/compose/ui/graphics/vector/PathBuilder;", "path-R_LF-3I", "(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFILkotlin/jvm/functions/Function1;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "peek", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)Ljava/lang/Object;", "pop", LauncherConstants.PUSH, "", "value", "(Ljava/util/ArrayList;Ljava/lang/Object;)Z", "ui_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nImageVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 2 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,779:1\n72#2,4:780\n*S KotlinDebug\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n*L\n718#1:780,4\n*E\n"})
/* loaded from: classes.dex */
public final class ImageVectorKt {
    /* renamed from: path-R_LF-3I$default */
    public static /* synthetic */ ImageVector.Builder m11976pathR_LF3I$default(ImageVector.Builder builder, String str, Brush brush, float f, Brush brush2, float f2, float f3, int i, int i2, float f4, int i3, Function1 function1, int i4, Object obj) {
        String str2 = (i4 & 1) != 0 ? "" : str;
        Brush brush3 = (i4 & 2) != 0 ? null : brush;
        float f5 = (i4 & 4) != 0 ? 1.0f : f;
        Brush brush4 = (i4 & 8) != 0 ? null : brush2;
        float f6 = (i4 & 16) != 0 ? 1.0f : f2;
        float f7 = (i4 & 32) != 0 ? 0.0f : f3;
        int defaultStrokeLineCap = (i4 & 64) != 0 ? VectorKt.getDefaultStrokeLineCap() : i;
        int defaultStrokeLineJoin = (i4 & 128) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i2;
        float f8 = (i4 & 256) != 0 ? 4.0f : f4;
        int defaultFillType = (i4 & 512) != 0 ? VectorKt.getDefaultFillType() : i3;
        PathBuilder pathBuilder = new PathBuilder();
        function1.invoke(pathBuilder);
        return ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, str2, brush3, f5, brush4, f6, f7, defaultStrokeLineCap, defaultStrokeLineJoin, f8, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    public static /* synthetic */ ImageVector.Builder group$default(ImageVector.Builder builder, String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, Function1 function1, int i, Object obj) {
        builder.addGroup((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? 1.0f : f4, (i & 32) == 0 ? f5 : 1.0f, (i & 64) != 0 ? 0.0f : f6, (i & 128) != 0 ? 0.0f : f7, (i & 256) != 0 ? VectorKt.getEmptyPath() : list);
        function1.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    @NotNull
    public static final ImageVector.Builder group(@NotNull ImageVector.Builder builder, @NotNull String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, @NotNull List<? extends PathNode> list, @NotNull Function1<? super ImageVector.Builder, Unit> function1) {
        builder.addGroup(str, f, f2, f3, f4, f5, f6, f7, list);
        function1.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    public static final <T> boolean push(ArrayList<T> arrayList, T t) {
        return arrayList.add(t);
    }

    public static final <T> T pop(ArrayList<T> arrayList) {
        return arrayList.remove(arrayList.size() - 1);
    }

    public static final <T> T peek(ArrayList<T> arrayList) {
        return arrayList.get(arrayList.size() - 1);
    }

    @NotNull
    /* renamed from: path-R_LF-3I */
    public static final ImageVector.Builder m11975pathR_LF3I(@NotNull ImageVector.Builder builder, @NotNull String str, @Nullable Brush brush, float f, @Nullable Brush brush2, float f2, float f3, int i, int i2, float f4, int i3, @NotNull Function1<? super PathBuilder, Unit> function1) {
        PathBuilder pathBuilder = new PathBuilder();
        function1.invoke(pathBuilder);
        return ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), i3, str, brush, f, brush2, f2, f3, i, i2, f4, 0.0f, 0.0f, 0.0f, 14336, null);
    }
}
