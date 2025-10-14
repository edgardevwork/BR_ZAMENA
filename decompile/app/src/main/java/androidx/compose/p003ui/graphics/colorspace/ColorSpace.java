package androidx.compose.p003ui.graphics.colorspace;

import androidx.annotation.IntRange;
import androidx.annotation.Size;
import androidx.compose.p003ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jfrog.build.extractor.clientConfiguration.ArtifactoryClientConfiguration;

/* compiled from: ColorSpace.kt */
@Metadata(m7104d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 72\u00020\u0001:\u00017B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0013\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0007J\u0012\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\u001f\u001a\u00020\u001aH'J\u0012\u0010 \u001a\u00020\u001c2\b\b\u0001\u0010!\u001a\u00020\bH&J\u0012\u0010\"\u001a\u00020\u001c2\b\b\u0001\u0010!\u001a\u00020\bH&J\b\u0010#\u001a\u00020\bH\u0016J\b\u0010$\u001a\u00020\u0003H\u0016J%\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u001cH\u0010¢\u0006\u0002\b*J \u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u001cH\u0007J\u0012\u0010+\u001a\u00020\u001a2\b\b\u0001\u0010\u001f\u001a\u00020\u001aH'J%\u0010/\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u001cH\u0010¢\u0006\u0002\b0J=\u00101\u001a\u0002022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u00103\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u0000H\u0010ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106R\u0011\u0010\n\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, m7105d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "name", "", "model", "Landroidx/compose/ui/graphics/colorspace/ColorModel;", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "id", "", "(Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V", "componentCount", "getComponentCount", "()I", "getId$ui_graphics_release", "isSrgb", "", "()Z", "isWideGamut", "getModel-xdoWZVw", "()J", "J", "getName", "()Ljava/lang/String;", "equals", "other", "fromXyz", "", "x", "", "y", "z", "v", "getMaxValue", "component", "getMinValue", "hashCode", "toString", "toXy", "", "v0", "v1", ArtifactoryClientConfiguration.DEFAULT_NUGET_PROTOCOL, "toXy$ui_graphics_release", "toXyz", "r", "g", "b", "toZ", "toZ$ui_graphics_release", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "a", "colorSpace", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "Companion", "ui-graphics_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nColorSpace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,799:1\n25#2,3:800\n*S KotlinDebug\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n*L\n290#1:800,3\n*E\n"})
/* loaded from: classes.dex */
public abstract class ColorSpace {
    public static final int MaxId = 63;
    public static final int MinId = -1;
    private final int id;
    private final long model;

    @NotNull
    private final String name;

    public /* synthetic */ ColorSpace(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, i);
    }

    public /* synthetic */ ColorSpace(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j);
    }

    @Size(min = 3)
    @NotNull
    public abstract float[] fromXyz(@Size(min = 3) @NotNull float[] v);

    public abstract float getMaxValue(@IntRange(from = 0, m10to = 3) int component);

    public abstract float getMinValue(@IntRange(from = 0, m10to = 3) int component);

    public boolean isSrgb() {
        return false;
    }

    public abstract boolean isWideGamut();

    @Size(min = 3)
    @NotNull
    public abstract float[] toXyz(@Size(min = 3) @NotNull float[] v);

    private ColorSpace(String str, long j, int i) {
        this.name = str;
        this.model = j;
        this.id = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    /* renamed from: getModel-xdoWZVw, reason: not valid java name and from getter */
    public final long getModel() {
        return this.model;
    }

    /* renamed from: getId$ui_graphics_release, reason: from getter */
    public final int getId() {
        return this.id;
    }

    private ColorSpace(String str, long j) {
        this(str, j, -1, null);
    }

    @IntRange(from = 1, m10to = 4)
    public final int getComponentCount() {
        return ColorModel.m11747getComponentCountimpl(this.model);
    }

    @Size(3)
    @NotNull
    public final float[] toXyz(float r, float g, float b) {
        return toXyz(new float[]{r, g, b});
    }

    public long toXy$ui_graphics_release(float v0, float v1, float v2) {
        float[] xyz = toXyz(v0, v1, v2);
        float f = xyz[0];
        float f2 = xyz[1];
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public float toZ$ui_graphics_release(float v0, float v1, float v2) {
        return toXyz(v0, v1, v2)[2];
    }

    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release, reason: not valid java name */
    public long mo11756xyzaToColorJlNiLsg$ui_graphics_release(float x, float y, float z, float a2, @NotNull ColorSpace colorSpace) {
        float[] fArrFromXyz = fromXyz(x, y, z);
        return ColorKt.Color(fArrFromXyz[0], fArrFromXyz[1], fArrFromXyz[2], a2, colorSpace);
    }

    @Size(min = 3)
    @NotNull
    public final float[] fromXyz(float x, float y, float z) {
        float[] fArr = new float[ColorModel.m11747getComponentCountimpl(this.model)];
        fArr[0] = x;
        fArr[1] = y;
        fArr[2] = z;
        return fromXyz(fArr);
    }

    @NotNull
    public String toString() {
        return this.name + " (id=" + this.id + ", model=" + ((Object) ColorModel.m11749toStringimpl(this.model)) + ')';
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        ColorSpace colorSpace = (ColorSpace) other;
        if (this.id == colorSpace.id && Intrinsics.areEqual(this.name, colorSpace.name)) {
            return ColorModel.m11746equalsimpl0(this.model, colorSpace.model);
        }
        return false;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + ColorModel.m11748hashCodeimpl(this.model)) * 31) + this.id;
    }
}
