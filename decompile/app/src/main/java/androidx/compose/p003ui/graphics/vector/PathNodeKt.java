package androidx.compose.p003ui.graphics.vector;

import androidx.compose.p003ui.graphics.vector.PathNode;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: PathNode.kt */
@Metadata(m7104d1 = {"\u0000@\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001ai\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b28\b\u0004\u0010(\u001a2\u0012\u0013\u0012\u00110%¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110\b¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020#0)H\u0082\b\u001a4\u0010.\u001a\u00020 *\u00020\u00012\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020#0/j\b\u0012\u0004\u0012\u00020#`02\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\bH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u00061"}, m7105d2 = {"ArcToKey", "", "CloseKey", "CurveToKey", "HorizontalToKey", "LineToKey", "MoveToKey", "NUM_ARC_TO_ARGS", "", "NUM_CURVE_TO_ARGS", "NUM_HORIZONTAL_TO_ARGS", "NUM_LINE_TO_ARGS", "NUM_MOVE_TO_ARGS", "NUM_QUAD_TO_ARGS", "NUM_REFLECTIVE_CURVE_TO_ARGS", "NUM_REFLECTIVE_QUAD_TO_ARGS", "NUM_VERTICAL_TO_ARGS", "QuadToKey", "ReflectiveCurveToKey", "ReflectiveQuadToKey", "RelativeArcToKey", "RelativeCloseKey", "RelativeCurveToKey", "RelativeHorizontalToKey", "RelativeLineToKey", "RelativeMoveToKey", "RelativeQuadToKey", "RelativeReflectiveCurveToKey", "RelativeReflectiveQuadToKey", "RelativeVerticalToKey", "VerticalToKey", "pathNodesFromArgs", "", "nodes", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "args", "", CatchStreamerKeys.COUNT_KEY, "numArgs", "nodeFor", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "subArray", TtmlNode.START, "addPathNodes", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "ui-graphics_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPathNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n1#1,400:1\n347#1,15:401\n347#1,15:416\n347#1,15:431\n347#1,15:446\n347#1,15:461\n347#1,15:476\n347#1,15:491\n347#1,15:506\n347#1,15:521\n347#1,15:536\n347#1,15:551\n347#1,15:566\n347#1,15:581\n347#1,15:596\n347#1,15:611\n347#1,15:626\n347#1,15:641\n347#1,15:656\n*S KotlinDebug\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n154#1:401,15\n163#1:416,15\n167#1:431,15\n176#1:446,15\n180#1:461,15\n189#1:476,15\n198#1:491,15\n207#1:506,15\n216#1:521,15\n232#1:536,15\n243#1:551,15\n257#1:566,15\n271#1:581,15\n285#1:596,15\n294#1:611,15\n303#1:626,15\n312#1:641,15\n324#1:656,15\n*E\n"})
/* loaded from: classes.dex */
public final class PathNodeKt {
    private static final char ArcToKey = 'A';
    private static final char CloseKey = 'Z';
    private static final char CurveToKey = 'C';
    private static final char HorizontalToKey = 'H';
    private static final char LineToKey = 'L';
    private static final char MoveToKey = 'M';
    private static final int NUM_ARC_TO_ARGS = 7;
    private static final int NUM_CURVE_TO_ARGS = 6;
    private static final int NUM_HORIZONTAL_TO_ARGS = 1;
    private static final int NUM_LINE_TO_ARGS = 2;
    private static final int NUM_MOVE_TO_ARGS = 2;
    private static final int NUM_QUAD_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_CURVE_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_QUAD_TO_ARGS = 2;
    private static final int NUM_VERTICAL_TO_ARGS = 1;
    private static final char QuadToKey = 'Q';
    private static final char ReflectiveCurveToKey = 'S';
    private static final char ReflectiveQuadToKey = 'T';
    private static final char RelativeArcToKey = 'a';
    private static final char RelativeCloseKey = 'z';
    private static final char RelativeCurveToKey = 'c';
    private static final char RelativeHorizontalToKey = 'h';
    private static final char RelativeLineToKey = 'l';
    private static final char RelativeMoveToKey = 'm';
    private static final char RelativeQuadToKey = 'q';
    private static final char RelativeReflectiveCurveToKey = 's';
    private static final char RelativeReflectiveQuadToKey = 't';
    private static final char RelativeVerticalToKey = 'v';
    private static final char VerticalToKey = 'V';

    public static final void addPathNodes(char c, @NotNull ArrayList<PathNode> arrayList, @NotNull float[] fArr, int i) {
        if (c == 'z' || c == 'Z') {
            arrayList.add(PathNode.Close.INSTANCE);
            return;
        }
        int i2 = 0;
        if (c == 'm') {
            int i3 = i - 2;
            while (i2 <= i3) {
                int i4 = i2 + 1;
                PathNode relativeMoveTo = new PathNode.RelativeMoveTo(fArr[i2], fArr[i4]);
                if ((relativeMoveTo instanceof PathNode.MoveTo) && i2 > 0) {
                    relativeMoveTo = new PathNode.LineTo(fArr[i2], fArr[i4]);
                } else if (i2 > 0) {
                    relativeMoveTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i4]);
                }
                arrayList.add(relativeMoveTo);
                i2 += 2;
            }
            return;
        }
        if (c == 'M') {
            int i5 = i - 2;
            while (i2 <= i5) {
                int i6 = i2 + 1;
                PathNode moveTo = new PathNode.MoveTo(fArr[i2], fArr[i6]);
                if (i2 > 0) {
                    moveTo = new PathNode.LineTo(fArr[i2], fArr[i6]);
                } else if ((moveTo instanceof PathNode.RelativeMoveTo) && i2 > 0) {
                    moveTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i6]);
                }
                arrayList.add(moveTo);
                i2 += 2;
            }
            return;
        }
        if (c == 'l') {
            int i7 = i - 2;
            while (i2 <= i7) {
                int i8 = i2 + 1;
                PathNode relativeLineTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i8]);
                if ((relativeLineTo instanceof PathNode.MoveTo) && i2 > 0) {
                    relativeLineTo = new PathNode.LineTo(fArr[i2], fArr[i8]);
                } else if ((relativeLineTo instanceof PathNode.RelativeMoveTo) && i2 > 0) {
                    relativeLineTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i8]);
                }
                arrayList.add(relativeLineTo);
                i2 += 2;
            }
            return;
        }
        if (c == 'L') {
            int i9 = i - 2;
            while (i2 <= i9) {
                int i10 = i2 + 1;
                PathNode lineTo = new PathNode.LineTo(fArr[i2], fArr[i10]);
                if ((lineTo instanceof PathNode.MoveTo) && i2 > 0) {
                    lineTo = new PathNode.LineTo(fArr[i2], fArr[i10]);
                } else if ((lineTo instanceof PathNode.RelativeMoveTo) && i2 > 0) {
                    lineTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i10]);
                }
                arrayList.add(lineTo);
                i2 += 2;
            }
            return;
        }
        if (c == 'h') {
            int i11 = i - 1;
            while (i2 <= i11) {
                PathNode relativeHorizontalTo = new PathNode.RelativeHorizontalTo(fArr[i2]);
                if ((relativeHorizontalTo instanceof PathNode.MoveTo) && i2 > 0) {
                    relativeHorizontalTo = new PathNode.LineTo(fArr[i2], fArr[i2 + 1]);
                } else if ((relativeHorizontalTo instanceof PathNode.RelativeMoveTo) && i2 > 0) {
                    relativeHorizontalTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i2 + 1]);
                }
                arrayList.add(relativeHorizontalTo);
                i2++;
            }
            return;
        }
        if (c == 'H') {
            int i12 = i - 1;
            while (i2 <= i12) {
                PathNode horizontalTo = new PathNode.HorizontalTo(fArr[i2]);
                if ((horizontalTo instanceof PathNode.MoveTo) && i2 > 0) {
                    horizontalTo = new PathNode.LineTo(fArr[i2], fArr[i2 + 1]);
                } else if ((horizontalTo instanceof PathNode.RelativeMoveTo) && i2 > 0) {
                    horizontalTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i2 + 1]);
                }
                arrayList.add(horizontalTo);
                i2++;
            }
            return;
        }
        if (c == 'v') {
            int i13 = i - 1;
            while (i2 <= i13) {
                PathNode relativeVerticalTo = new PathNode.RelativeVerticalTo(fArr[i2]);
                if ((relativeVerticalTo instanceof PathNode.MoveTo) && i2 > 0) {
                    relativeVerticalTo = new PathNode.LineTo(fArr[i2], fArr[i2 + 1]);
                } else if ((relativeVerticalTo instanceof PathNode.RelativeMoveTo) && i2 > 0) {
                    relativeVerticalTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i2 + 1]);
                }
                arrayList.add(relativeVerticalTo);
                i2++;
            }
            return;
        }
        if (c == 'V') {
            int i14 = i - 1;
            while (i2 <= i14) {
                PathNode verticalTo = new PathNode.VerticalTo(fArr[i2]);
                if ((verticalTo instanceof PathNode.MoveTo) && i2 > 0) {
                    verticalTo = new PathNode.LineTo(fArr[i2], fArr[i2 + 1]);
                } else if ((verticalTo instanceof PathNode.RelativeMoveTo) && i2 > 0) {
                    verticalTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i2 + 1]);
                }
                arrayList.add(verticalTo);
                i2++;
            }
            return;
        }
        if (c == 'c') {
            int i15 = i - 6;
            while (i2 <= i15) {
                int i16 = i2 + 1;
                PathNode relativeCurveTo = new PathNode.RelativeCurveTo(fArr[i2], fArr[i16], fArr[i2 + 2], fArr[i2 + 3], fArr[i2 + 4], fArr[i2 + 5]);
                if ((relativeCurveTo instanceof PathNode.MoveTo) && i2 > 0) {
                    relativeCurveTo = new PathNode.LineTo(fArr[i2], fArr[i16]);
                } else if ((relativeCurveTo instanceof PathNode.RelativeMoveTo) && i2 > 0) {
                    relativeCurveTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i16]);
                }
                arrayList.add(relativeCurveTo);
                i2 += 6;
            }
            return;
        }
        if (c == 'C') {
            int i17 = i - 6;
            while (i2 <= i17) {
                int i18 = i2 + 1;
                PathNode curveTo = new PathNode.CurveTo(fArr[i2], fArr[i18], fArr[i2 + 2], fArr[i2 + 3], fArr[i2 + 4], fArr[i2 + 5]);
                if ((curveTo instanceof PathNode.MoveTo) && i2 > 0) {
                    curveTo = new PathNode.LineTo(fArr[i2], fArr[i18]);
                } else if ((curveTo instanceof PathNode.RelativeMoveTo) && i2 > 0) {
                    curveTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i18]);
                }
                arrayList.add(curveTo);
                i2 += 6;
            }
            return;
        }
        if (c == 's') {
            int i19 = i - 4;
            while (i2 <= i19) {
                int i20 = i2 + 1;
                PathNode relativeReflectiveCurveTo = new PathNode.RelativeReflectiveCurveTo(fArr[i2], fArr[i20], fArr[i2 + 2], fArr[i2 + 3]);
                if ((relativeReflectiveCurveTo instanceof PathNode.MoveTo) && i2 > 0) {
                    relativeReflectiveCurveTo = new PathNode.LineTo(fArr[i2], fArr[i20]);
                } else if ((relativeReflectiveCurveTo instanceof PathNode.RelativeMoveTo) && i2 > 0) {
                    relativeReflectiveCurveTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i20]);
                }
                arrayList.add(relativeReflectiveCurveTo);
                i2 += 4;
            }
            return;
        }
        if (c == 'S') {
            int i21 = i - 4;
            while (i2 <= i21) {
                int i22 = i2 + 1;
                PathNode reflectiveCurveTo = new PathNode.ReflectiveCurveTo(fArr[i2], fArr[i22], fArr[i2 + 2], fArr[i2 + 3]);
                if ((reflectiveCurveTo instanceof PathNode.MoveTo) && i2 > 0) {
                    reflectiveCurveTo = new PathNode.LineTo(fArr[i2], fArr[i22]);
                } else if ((reflectiveCurveTo instanceof PathNode.RelativeMoveTo) && i2 > 0) {
                    reflectiveCurveTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i22]);
                }
                arrayList.add(reflectiveCurveTo);
                i2 += 4;
            }
            return;
        }
        if (c == 'q') {
            int i23 = i - 4;
            while (i2 <= i23) {
                int i24 = i2 + 1;
                PathNode relativeQuadTo = new PathNode.RelativeQuadTo(fArr[i2], fArr[i24], fArr[i2 + 2], fArr[i2 + 3]);
                if ((relativeQuadTo instanceof PathNode.MoveTo) && i2 > 0) {
                    relativeQuadTo = new PathNode.LineTo(fArr[i2], fArr[i24]);
                } else if ((relativeQuadTo instanceof PathNode.RelativeMoveTo) && i2 > 0) {
                    relativeQuadTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i24]);
                }
                arrayList.add(relativeQuadTo);
                i2 += 4;
            }
            return;
        }
        if (c == 'Q') {
            int i25 = i - 4;
            while (i2 <= i25) {
                int i26 = i2 + 1;
                PathNode quadTo = new PathNode.QuadTo(fArr[i2], fArr[i26], fArr[i2 + 2], fArr[i2 + 3]);
                if ((quadTo instanceof PathNode.MoveTo) && i2 > 0) {
                    quadTo = new PathNode.LineTo(fArr[i2], fArr[i26]);
                } else if ((quadTo instanceof PathNode.RelativeMoveTo) && i2 > 0) {
                    quadTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i26]);
                }
                arrayList.add(quadTo);
                i2 += 4;
            }
            return;
        }
        if (c == 't') {
            int i27 = i - 2;
            while (i2 <= i27) {
                int i28 = i2 + 1;
                PathNode relativeReflectiveQuadTo = new PathNode.RelativeReflectiveQuadTo(fArr[i2], fArr[i28]);
                if ((relativeReflectiveQuadTo instanceof PathNode.MoveTo) && i2 > 0) {
                    relativeReflectiveQuadTo = new PathNode.LineTo(fArr[i2], fArr[i28]);
                } else if ((relativeReflectiveQuadTo instanceof PathNode.RelativeMoveTo) && i2 > 0) {
                    relativeReflectiveQuadTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i28]);
                }
                arrayList.add(relativeReflectiveQuadTo);
                i2 += 2;
            }
            return;
        }
        if (c == 'T') {
            int i29 = i - 2;
            while (i2 <= i29) {
                int i30 = i2 + 1;
                PathNode reflectiveQuadTo = new PathNode.ReflectiveQuadTo(fArr[i2], fArr[i30]);
                if ((reflectiveQuadTo instanceof PathNode.MoveTo) && i2 > 0) {
                    reflectiveQuadTo = new PathNode.LineTo(fArr[i2], fArr[i30]);
                } else if ((reflectiveQuadTo instanceof PathNode.RelativeMoveTo) && i2 > 0) {
                    reflectiveQuadTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i30]);
                }
                arrayList.add(reflectiveQuadTo);
                i2 += 2;
            }
            return;
        }
        if (c == 'a') {
            int i31 = i - 7;
            for (int i32 = 0; i32 <= i31; i32 += 7) {
                int i33 = i32 + 1;
                PathNode relativeArcTo = new PathNode.RelativeArcTo(fArr[i32], fArr[i33], fArr[i32 + 2], Float.compare(fArr[i32 + 3], 0.0f) != 0, Float.compare(fArr[i32 + 4], 0.0f) != 0, fArr[i32 + 5], fArr[i32 + 6]);
                if ((relativeArcTo instanceof PathNode.MoveTo) && i32 > 0) {
                    relativeArcTo = new PathNode.LineTo(fArr[i32], fArr[i33]);
                } else if ((relativeArcTo instanceof PathNode.RelativeMoveTo) && i32 > 0) {
                    relativeArcTo = new PathNode.RelativeLineTo(fArr[i32], fArr[i33]);
                }
                arrayList.add(relativeArcTo);
            }
            return;
        }
        if (c != 'A') {
            throw new IllegalArgumentException("Unknown command for: " + c);
        }
        int i34 = i - 7;
        for (int i35 = 0; i35 <= i34; i35 += 7) {
            int i36 = i35 + 1;
            PathNode arcTo = new PathNode.ArcTo(fArr[i35], fArr[i36], fArr[i35 + 2], Float.compare(fArr[i35 + 3], 0.0f) != 0, Float.compare(fArr[i35 + 4], 0.0f) != 0, fArr[i35 + 5], fArr[i35 + 6]);
            if ((arcTo instanceof PathNode.MoveTo) && i35 > 0) {
                arcTo = new PathNode.LineTo(fArr[i35], fArr[i36]);
            } else if ((arcTo instanceof PathNode.RelativeMoveTo) && i35 > 0) {
                arcTo = new PathNode.RelativeLineTo(fArr[i35], fArr[i36]);
            }
            arrayList.add(arcTo);
        }
    }

    private static final void pathNodesFromArgs(List<PathNode> list, float[] fArr, int i, int i2, Function2<? super float[], ? super Integer, ? extends PathNode> function2) {
        int i3 = i - i2;
        int i4 = 0;
        while (i4 <= i3) {
            PathNode pathNodeInvoke = function2.invoke(fArr, Integer.valueOf(i4));
            if ((pathNodeInvoke instanceof PathNode.MoveTo) && i4 > 0) {
                pathNodeInvoke = new PathNode.LineTo(fArr[i4], fArr[i4 + 1]);
            } else if ((pathNodeInvoke instanceof PathNode.RelativeMoveTo) && i4 > 0) {
                pathNodeInvoke = new PathNode.RelativeLineTo(fArr[i4], fArr[i4 + 1]);
            }
            list.add(pathNodeInvoke);
            i4 += i2;
        }
    }
}
