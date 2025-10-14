package androidx.compose.p003ui.graphics;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.RoundRect;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.blackhub.bronline.game.gui.blackpass.utils.BlackPassKeys;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jfrog.build.extractor.clientConfiguration.ClientConfigurationFields;

/* compiled from: Path.kt */
@Metadata(m7104d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 P2\u00020\u0001:\u0001PJ \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H&J \u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H&J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J$\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u001aH&ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u000fH&J\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020!H&J(\u0010\"\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\tH&J(\u0010$\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\tH\u0016J\b\u0010%\u001a\u00020\rH&J8\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u0011H&J\b\u0010-\u001a\u00020\u000fH&J\u0018\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u0011H&J\u0018\u00101\u001a\u00020\r2\u0006\u0010/\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u0011H&J*\u00102\u001a\u00020\t2\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u000206H&ø\u0001\u0000¢\u0006\u0004\b7\u00108J(\u00109\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u0011H&J8\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020\u00112\u0006\u0010<\u001a\u00020\u00112\u0006\u0010=\u001a\u00020\u00112\u0006\u0010>\u001a\u00020\u00112\u0006\u0010?\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\u0011H&J\u0018\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\u00112\u0006\u0010C\u001a\u00020\u0011H&J\u0018\u0010D\u001a\u00020\r2\u0006\u0010B\u001a\u00020\u00112\u0006\u0010C\u001a\u00020\u0011H&J(\u0010E\u001a\u00020\r2\u0006\u0010;\u001a\u00020\u00112\u0006\u0010<\u001a\u00020\u00112\u0006\u0010=\u001a\u00020\u00112\u0006\u0010>\u001a\u00020\u0011H&J\b\u0010F\u001a\u00020\rH&J\b\u0010G\u001a\u00020\rH\u0016J\u001a\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020JH\u0016ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ\u001a\u0010M\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH&ø\u0001\u0000¢\u0006\u0004\bN\u0010OR\u001e\u0010\u0002\u001a\u00020\u0003X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0012\u0010\u000b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\nø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006QÀ\u0006\u0003"}, m7105d2 = {"Landroidx/compose/ui/graphics/Path;", "", "fillType", "Landroidx/compose/ui/graphics/PathFillType;", "getFillType-Rg-k1Os", "()I", "setFillType-oQ8Xj4U", "(I)V", "isConvex", "", "()Z", "isEmpty", "addArc", "", "oval", "Landroidx/compose/ui/geometry/Rect;", "startAngleDegrees", "", "sweepAngleDegrees", "addArcRad", "startAngleRadians", "sweepAngleRadians", "addOval", "addPath", "path", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Offset;", "addPath-Uv8p0NA", "(Landroidx/compose/ui/graphics/Path;J)V", "addRect", "rect", "addRoundRect", "roundRect", "Landroidx/compose/ui/geometry/RoundRect;", "arcTo", "forceMoveTo", "arcToRad", "close", "cubicTo", "x1", "y1", "x2", "y2", "x3", "y3", "getBounds", "lineTo", "x", "y", "moveTo", BlackPassKeys.OP_PRICE_TITLE, "path1", "path2", "operation", "Landroidx/compose/ui/graphics/PathOperation;", "op-N5in7k0", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;I)Z", "quadraticBezierTo", "relativeCubicTo", "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "relativeLineTo", "dx", "dy", "relativeMoveTo", "relativeQuadraticBezierTo", "reset", "rewind", "transform", ClientConfigurationFields.MATRIX, "Landroidx/compose/ui/graphics/Matrix;", "transform-58bKbWc", "([F)V", "translate", "translate-k-4lQ0M", "(J)V", "Companion", "ui-graphics_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public interface Path {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    void addArc(@NotNull Rect oval, float startAngleDegrees, float sweepAngleDegrees);

    void addArcRad(@NotNull Rect oval, float startAngleRadians, float sweepAngleRadians);

    void addOval(@NotNull Rect oval);

    /* renamed from: addPath-Uv8p0NA */
    void mo11230addPathUv8p0NA(@NotNull Path path, long j);

    void addRect(@NotNull Rect rect);

    void addRoundRect(@NotNull RoundRect roundRect);

    void arcTo(@NotNull Rect rect, float startAngleDegrees, float sweepAngleDegrees, boolean forceMoveTo);

    void close();

    void cubicTo(float x1, float y1, float x2, float y2, float x3, float y3);

    @NotNull
    Rect getBounds();

    /* renamed from: getFillType-Rg-k1Os */
    int mo11231getFillTypeRgk1Os();

    boolean isConvex();

    boolean isEmpty();

    void lineTo(float x, float y);

    void moveTo(float x, float y);

    /* renamed from: op-N5in7k0 */
    boolean mo11232opN5in7k0(@NotNull Path path1, @NotNull Path path2, int operation);

    void quadraticBezierTo(float x1, float y1, float x2, float y2);

    void relativeCubicTo(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3);

    void relativeLineTo(float dx, float dy);

    void relativeMoveTo(float dx, float dy);

    void relativeQuadraticBezierTo(float dx1, float dy1, float dx2, float dy2);

    void reset();

    /* renamed from: setFillType-oQ8Xj4U */
    void mo11233setFillTypeoQ8Xj4U(int i);

    /* renamed from: transform-58bKbWc */
    default void mo11234transform58bKbWc(@NotNull float[] fArr) {
    }

    /* renamed from: translate-k-4lQ0M */
    void mo11235translatek4lQ0M(long j);

    /* compiled from: Path.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void arcToRad(@NotNull Path path, @NotNull Rect rect, float f, float f2, boolean z) {
            Path.super.arcToRad(rect, f, f2, z);
        }

        @Deprecated
        public static void rewind(@NotNull Path path) {
            Path.super.rewind();
        }

        @Deprecated
        /* renamed from: transform-58bKbWc */
        public static void m11613transform58bKbWc(@NotNull Path path, @NotNull float[] fArr) {
            Path.super.mo11234transform58bKbWc(fArr);
        }
    }

    default void arcToRad(@NotNull Rect rect, float startAngleRadians, float sweepAngleRadians, boolean forceMoveTo) {
        arcTo(rect, DegreesKt.degrees(startAngleRadians), DegreesKt.degrees(sweepAngleRadians), forceMoveTo);
    }

    /* renamed from: addPath-Uv8p0NA$default */
    static /* synthetic */ void m11610addPathUv8p0NA$default(Path path, Path path2, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i & 2) != 0) {
            j = Offset.INSTANCE.m11115getZeroF1C5BW0();
        }
        path.mo11230addPathUv8p0NA(path2, j);
    }

    default void rewind() {
        reset();
    }

    /* compiled from: Path.kt */
    @Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, m7105d2 = {"Landroidx/compose/ui/graphics/Path$Companion;", "", "()V", "combine", "Landroidx/compose/ui/graphics/Path;", "operation", "Landroidx/compose/ui/graphics/PathOperation;", "path1", "path2", "combine-xh6zSI8", "(ILandroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "ui-graphics_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        /* renamed from: combine-xh6zSI8 */
        public final Path m11611combinexh6zSI8(int operation, @NotNull Path path1, @NotNull Path path2) {
            Path Path = AndroidPath_androidKt.Path();
            if (Path.mo11232opN5in7k0(path1, path2, operation)) {
                return Path;
            }
            throw new IllegalArgumentException("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
        }
    }
}
