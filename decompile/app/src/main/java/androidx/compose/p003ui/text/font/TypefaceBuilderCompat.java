package androidx.compose.p003ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p003ui.text.ExperimentalTextApi;
import androidx.compose.p003ui.text.font.FontVariation;
import androidx.compose.p003ui.unit.AndroidDensity_androidKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DensityKt;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidPreloadedFont.android.kt */
@RequiresApi(api = 26)
@Metadata(m7104d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J$\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J$\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, m7105d2 = {"Landroidx/compose/ui/text/font/TypefaceBuilderCompat;", "", "()V", "createFromAssets", "Landroid/graphics/Typeface;", "assetManager", "Landroid/content/res/AssetManager;", "path", "", "context", "Landroid/content/Context;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "createFromFile", PomReader.PomProfileElement.FILE, "Ljava/io/File;", "createFromFileDescriptor", "fileDescriptor", "Landroid/os/ParcelFileDescriptor;", "toVariationSettings", "", "Landroid/graphics/fonts/FontVariationAxis;", "(Landroidx/compose/ui/text/font/FontVariation$Settings;Landroid/content/Context;)[Landroid/graphics/fonts/FontVariationAxis;", "ui-text_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAndroidPreloadedFont.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPreloadedFont.android.kt\nandroidx/compose/ui/text/font/TypefaceBuilderCompat\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,234:1\n151#2,3:235\n33#2,4:238\n154#2,2:242\n38#2:244\n156#2:245\n37#3,2:246\n*S KotlinDebug\n*F\n+ 1 AndroidPreloadedFont.android.kt\nandroidx/compose/ui/text/font/TypefaceBuilderCompat\n*L\n229#1:235,3\n229#1:238,4\n229#1:242,2\n229#1:244\n229#1:245\n231#1:246,2\n*E\n"})
/* loaded from: classes.dex */
public final class TypefaceBuilderCompat {

    @NotNull
    public static final TypefaceBuilderCompat INSTANCE = new TypefaceBuilderCompat();

    @ExperimentalTextApi
    @DoNotInline
    @Nullable
    public final Typeface createFromAssets(@NotNull AssetManager assetManager, @NotNull String path, @Nullable Context context, @NotNull FontVariation.Settings variationSettings) {
        if (context == null) {
            return null;
        }
        return TypefaceBuilderCompat$$ExternalSyntheticApiModelOutline3.m334m(assetManager, path).setFontVariationSettings(toVariationSettings(variationSettings, context)).build();
    }

    @ExperimentalTextApi
    @DoNotInline
    @Nullable
    public final Typeface createFromFile(@NotNull File file, @Nullable Context context, @NotNull FontVariation.Settings variationSettings) {
        if (context == null) {
            return null;
        }
        return TypefaceBuilderCompat$$ExternalSyntheticApiModelOutline2.m333m(file).setFontVariationSettings(toVariationSettings(variationSettings, context)).build();
    }

    @ExperimentalTextApi
    @DoNotInline
    @Nullable
    public final Typeface createFromFileDescriptor(@NotNull ParcelFileDescriptor fileDescriptor, @Nullable Context context, @NotNull FontVariation.Settings variationSettings) {
        if (context == null) {
            return null;
        }
        TypefaceBuilderCompat$$ExternalSyntheticApiModelOutline7.m338m();
        return TypefaceBuilderCompat$$ExternalSyntheticApiModelOutline6.m337m(fileDescriptor.getFileDescriptor()).setFontVariationSettings(toVariationSettings(variationSettings, context)).build();
    }

    @ExperimentalTextApi
    @RequiresApi(26)
    public final FontVariationAxis[] toVariationSettings(FontVariation.Settings settings, Context context) {
        Density Density;
        if (context != null) {
            Density = AndroidDensity_androidKt.Density(context);
        } else if (!settings.getNeedsDensity()) {
            Density = DensityKt.Density(1.0f, 1.0f);
        } else {
            throw new IllegalStateException("Required density, but not provided");
        }
        List<FontVariation.Setting> settings2 = settings.getSettings();
        ArrayList arrayList = new ArrayList(settings2.size());
        int size = settings2.size();
        for (int i = 0; i < size; i++) {
            FontVariation.Setting setting = settings2.get(i);
            TypefaceBuilderCompat$$ExternalSyntheticApiModelOutline5.m336m();
            arrayList.add(TypefaceBuilderCompat$$ExternalSyntheticApiModelOutline4.m335m(setting.getAxisName(), setting.toVariationValue(Density)));
        }
        return (FontVariationAxis[]) arrayList.toArray(new FontVariationAxis[0]);
    }
}
