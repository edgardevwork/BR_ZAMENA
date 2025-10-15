package androidx.compose.p003ui.node;

import android.view.View;
import androidx.compose.p003ui.ExperimentalComposeUiApi;
import androidx.compose.p003ui.InternalComposeUiApi;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusTargetNode;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.layout.LayoutInfo;
import androidx.compose.p003ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.ModifierInfo;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.layout.Remeasurement;
import androidx.compose.p003ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.p003ui.node.Owner;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.platform.JvmActuals_jvmKt;
import androidx.compose.p003ui.platform.ViewConfiguration;
import androidx.compose.p003ui.semantics.SemanticsConfiguration;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DpSize;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.p003ui.viewinterop.AndroidViewHolder;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.bumptech.glide.load.engine.GlideException;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Comparator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.ivy.osgi.p063p2.P2CompositeParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LayoutNode.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000Ì\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b?\b\u0000\u0018\u0000 á\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\bá\u0002â\u0002ã\u0002ä\u0002B\u0019\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001a\u0010å\u0001\u001a\u00030¶\u00012\b\u0010À\u0001\u001a\u00030µ\u0001H\u0000¢\u0006\u0003\bæ\u0001J\u0010\u0010ç\u0001\u001a\u00030¶\u0001H\u0000¢\u0006\u0003\bè\u0001J\n\u0010é\u0001\u001a\u00030¶\u0001H\u0002J\u0014\u0010ê\u0001\u001a\u00030ë\u00012\b\b\u0002\u0010G\u001a\u00020\u000bH\u0002J\u0010\u0010ì\u0001\u001a\u00030¶\u0001H\u0000¢\u0006\u0003\bí\u0001J\u0010\u0010î\u0001\u001a\u00030¶\u0001H\u0000¢\u0006\u0003\bï\u0001J\u001a\u0010ð\u0001\u001a\u00030¶\u00012\b\u0010ñ\u0001\u001a\u00030ò\u0001H\u0000¢\u0006\u0003\bó\u0001J\"\u0010ô\u0001\u001a\u00030¶\u00012\u0015\u0010õ\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0005\u0012\u00030¶\u00010´\u0001H\u0086\bJ(\u0010ö\u0001\u001a\u00030¶\u00012\u001b\u0010õ\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0000\u0012\u0005\u0012\u00030¶\u00010÷\u0001H\u0086\bJ)\u0010ø\u0001\u001a\u00030¶\u00012\u0016\u0010õ\u0001\u001a\u0011\u0012\u0005\u0012\u00030ù\u0001\u0012\u0005\u0012\u00030¶\u00010´\u0001H\u0080\b¢\u0006\u0003\bú\u0001J(\u0010û\u0001\u001a\u00030¶\u00012\u0015\u0010õ\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0005\u0012\u00030¶\u00010´\u0001H\u0080\b¢\u0006\u0003\bü\u0001J\n\u0010ý\u0001\u001a\u00030¶\u0001H\u0016J\u0013\u0010þ\u0001\u001a\f\u0018\u00010ÿ\u0001j\u0005\u0018\u0001`\u0080\u0002H\u0017J\u0010\u0010\u0081\u0002\u001a\t\u0012\u0005\u0012\u00030\u0082\u00020$H\u0016J@\u0010\u0083\u0002\u001a\u00030¶\u00012\b\u0010\u0084\u0002\u001a\u00030\u0085\u00022\b\u0010\u0086\u0002\u001a\u00030\u0087\u00022\t\b\u0002\u0010\u0088\u0002\u001a\u00020\t2\t\b\u0002\u0010\u0089\u0002\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0006\b\u008a\u0002\u0010\u008b\u0002J@\u0010\u008c\u0002\u001a\u00030¶\u00012\b\u0010\u0084\u0002\u001a\u00030\u0085\u00022\b\u0010\u008d\u0002\u001a\u00030\u0087\u00022\t\b\u0002\u0010\u0088\u0002\u001a\u00020\t2\t\b\u0002\u0010\u0089\u0002\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0006\b\u008e\u0002\u0010\u008b\u0002J!\u0010P\u001a\u00030¶\u00012\u000f\u0010õ\u0001\u001a\n\u0012\u0005\u0012\u00030¶\u00010\u008f\u0002H\u0080\b¢\u0006\u0003\b\u0090\u0002J\"\u0010\u0091\u0002\u001a\u00030¶\u00012\u0007\u0010\u0092\u0002\u001a\u00020\u000b2\u0007\u0010\u0093\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0003\b\u0094\u0002J\n\u0010\u0095\u0002\u001a\u00030¶\u0001H\u0002J\n\u0010\u0096\u0002\u001a\u00030¶\u0001H\u0002J\u0010\u0010\u0097\u0002\u001a\u00030¶\u0001H\u0000¢\u0006\u0003\b\u0098\u0002J\u0010\u0010\u0099\u0002\u001a\u00030¶\u0001H\u0000¢\u0006\u0003\b\u009a\u0002J\u0010\u0010\u009b\u0002\u001a\u00030¶\u0001H\u0000¢\u0006\u0003\b\u009c\u0002J\u0010\u0010\u009d\u0002\u001a\u00030¶\u0001H\u0000¢\u0006\u0003\b\u009e\u0002J\u0010\u0010\u009f\u0002\u001a\u00030¶\u0001H\u0000¢\u0006\u0003\b \u0002J\u0013\u0010¡\u0002\u001a\u00030¶\u00012\t\b\u0002\u0010¢\u0002\u001a\u00020\tJ\n\u0010£\u0002\u001a\u00030¶\u0001H\u0002J \u0010¤\u0002\u001a\u00020\t2\f\b\u0002\u0010¥\u0002\u001a\u0005\u0018\u00010¦\u0002H\u0000ø\u0001\u0000¢\u0006\u0003\b§\u0002J\u0010\u0010¨\u0002\u001a\u00030¶\u0001H\u0000¢\u0006\u0003\b©\u0002J\u0010\u0010ª\u0002\u001a\u00030¶\u0001H\u0000¢\u0006\u0003\b«\u0002J\u0010\u0010¬\u0002\u001a\u00030¶\u0001H\u0000¢\u0006\u0003\b\u00ad\u0002J\u0010\u0010®\u0002\u001a\u00030¶\u0001H\u0000¢\u0006\u0003\b¯\u0002J\u0010\u0010°\u0002\u001a\u00030¶\u0001H\u0000¢\u0006\u0003\b±\u0002J+\u0010²\u0002\u001a\u00030¶\u00012\u0007\u0010³\u0002\u001a\u00020\u000b2\u0007\u0010´\u0002\u001a\u00020\u000b2\u0007\u0010µ\u0002\u001a\u00020\u000bH\u0000¢\u0006\u0003\b¶\u0002J\u0013\u0010·\u0002\u001a\u00030¶\u00012\u0007\u0010¸\u0002\u001a\u00020\u0000H\u0002J\n\u0010¹\u0002\u001a\u00030¶\u0001H\u0016J\n\u0010º\u0002\u001a\u00030¶\u0001H\u0002J\n\u0010»\u0002\u001a\u00030¶\u0001H\u0016J\n\u0010¼\u0002\u001a\u00030¶\u0001H\u0016J\n\u0010½\u0002\u001a\u00030¶\u0001H\u0016J\u0010\u0010¾\u0002\u001a\u00030¶\u0001H\u0000¢\u0006\u0003\b¿\u0002J\"\u0010À\u0002\u001a\u00030¶\u00012\u0007\u0010Á\u0002\u001a\u00020\u000b2\u0007\u0010Â\u0002\u001a\u00020\u000bH\u0000¢\u0006\u0003\bÃ\u0002J\n\u0010Ä\u0002\u001a\u00030¶\u0001H\u0002J \u0010Å\u0002\u001a\u00020\t2\f\b\u0002\u0010¥\u0002\u001a\u0005\u0018\u00010¦\u0002H\u0000ø\u0001\u0000¢\u0006\u0003\bÆ\u0002J\u0010\u0010Ç\u0002\u001a\u00030¶\u0001H\u0000¢\u0006\u0003\bÈ\u0002J\"\u0010É\u0002\u001a\u00030¶\u00012\u0007\u0010\u0092\u0002\u001a\u00020\u000b2\u0007\u0010µ\u0002\u001a\u00020\u000bH\u0000¢\u0006\u0003\bÊ\u0002J\u0010\u0010Ë\u0002\u001a\u00030¶\u0001H\u0000¢\u0006\u0003\bÌ\u0002J\u001b\u0010Í\u0002\u001a\u00030¶\u00012\t\b\u0002\u0010Î\u0002\u001a\u00020\tH\u0000¢\u0006\u0003\bÏ\u0002J&\u0010Ð\u0002\u001a\u00030¶\u00012\t\b\u0002\u0010Î\u0002\u001a\u00020\t2\t\b\u0002\u0010Ñ\u0002\u001a\u00020\tH\u0000¢\u0006\u0003\bÒ\u0002J\u001b\u0010Ó\u0002\u001a\u00030¶\u00012\t\b\u0002\u0010Î\u0002\u001a\u00020\tH\u0000¢\u0006\u0003\bÔ\u0002J&\u0010Õ\u0002\u001a\u00030¶\u00012\t\b\u0002\u0010Î\u0002\u001a\u00020\t2\t\b\u0002\u0010Ñ\u0002\u001a\u00020\tH\u0000¢\u0006\u0003\bÖ\u0002J\u0019\u0010×\u0002\u001a\u00030¶\u00012\u0007\u0010Ø\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0003\bÙ\u0002J\n\u0010Ú\u0002\u001a\u00030¶\u0001H\u0002J\u0010\u0010Û\u0002\u001a\u00030¶\u0001H\u0000¢\u0006\u0003\bÜ\u0002J\t\u0010Ý\u0002\u001a\u00020\tH\u0002J\n\u0010Þ\u0002\u001a\u00030ë\u0001H\u0016J\u0010\u0010ß\u0002\u001a\u00030¶\u0001H\u0000¢\u0006\u0003\bà\u0002R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00000$8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010'R\u0016\u0010,\u001a\u0004\u0018\u00010\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R,\u00100\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000b8W@WX\u0097\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b1\u0010\u001f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00108\u001a\u0002072\u0006\u00106\u001a\u000207@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R$\u0010B\u001a\u00020A2\u0006\u00106\u001a\u00020A@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001a\u0010G\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u00103\"\u0004\bI\u00105R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00000$8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u0010'R\u0014\u0010L\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bM\u0010\u001cR\u0014\u0010N\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u00103R\u000e\u0010P\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010Q\u001a\u00020\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0016\u0010T\u001a\u0004\u0018\u00010\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bU\u0010SR\u001a\u0010V\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u001c\"\u0004\bX\u0010\"R\"\u0010Y\u001a\n\u0018\u00010Zj\u0004\u0018\u0001`[X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u0014\u0010`\u001a\u00020aX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010cR\u001a\u0010d\u001a\u00020eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u0014\u0010j\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u0010\u001cR\u001e\u0010k\u001a\u00020\t2\u0006\u0010/\u001a\u00020\t@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\bk\u0010\u001cR\u0014\u0010l\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010\u001cR\u0011\u0010m\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bm\u0010\u001cR\u0013\u0010n\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0014\u0010p\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010\u001cR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010q\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010\u001c\"\u0004\bs\u0010\"R\u0014\u0010t\u001a\u00020uX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bv\u0010wR$\u0010y\u001a\u00020x2\u0006\u00106\u001a\u00020x@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u0014\u0010~\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010\u001cR\u0018\u0010\u0080\u0001\u001a\u00030\u0081\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0016\u0010\u0084\u0001\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010\u001cR\u0016\u0010\u0086\u0001\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010\u001cR\u001e\u0010\u0088\u0001\u001a\t\u0018\u00010\u0089\u0001R\u00020u8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R.\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00002\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u0093\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001c\u0010\u0096\u0001\u001a\u00070\u0097\u0001R\u00020u8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0016\u0010\u009a\u0001\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010\u001cR+\u0010\u009d\u0001\u001a\u00030\u009c\u00012\u0007\u00106\u001a\u00030\u009c\u0001@VX\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R\u0016\u0010¢\u0001\u001a\u00020e8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b£\u0001\u0010gR\u0016\u0010¤\u0001\u001a\u00020e8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010gR+\u0010§\u0001\u001a\u00030¦\u00012\u0007\u00106\u001a\u00030¦\u0001@VX\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R\u001d\u0010¬\u0001\u001a\u00020\tX\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u00ad\u0001\u0010\u001c\"\u0005\b®\u0001\u0010\"R\u0018\u0010¯\u0001\u001a\u00030°\u0001X\u0080\u0004¢\u0006\n\n\u0000\u001a\u0006\b±\u0001\u0010²\u0001R0\u0010³\u0001\u001a\u0013\u0012\u0005\u0012\u00030µ\u0001\u0012\u0005\u0012\u00030¶\u0001\u0018\u00010´\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R0\u0010»\u0001\u001a\u0013\u0012\u0005\u0012\u00030µ\u0001\u0012\u0005\u0012\u00030¶\u0001\u0018\u00010´\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¼\u0001\u0010¸\u0001\"\u0006\b½\u0001\u0010º\u0001R\u0016\u0010¾\u0001\u001a\u00020\u00178@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b¿\u0001\u0010SR'\u0010À\u0001\u001a\u0005\u0018\u00010µ\u00012\t\u0010/\u001a\u0005\u0018\u00010µ\u0001@BX\u0080\u000e¢\u0006\n\n\u0000\u001a\u0006\bÁ\u0001\u0010Â\u0001R\u0019\u0010Ã\u0001\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\b\u001a\u0006\bÄ\u0001\u0010\u008f\u0001R\u0019\u0010Å\u0001\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\bÆ\u0001\u0010Ç\u0001R\u0016\u0010È\u0001\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÉ\u0001\u00103R\u000f\u0010Ê\u0001\u001a\u00020eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u00020\u000bX\u0096\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bË\u0001\u00103\"\u0005\bÌ\u0001\u00105R\"\u0010Í\u0001\u001a\u0005\u0018\u00010Î\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0006\bÑ\u0001\u0010Ò\u0001R\u000f\u0010Ó\u0001\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010Õ\u0001\u001a\u00030Ô\u00012\u0007\u00106\u001a\u00030Ô\u0001@VX\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÖ\u0001\u0010×\u0001\"\u0006\bØ\u0001\u0010Ù\u0001R\u000f\u0010Ú\u0001\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010Û\u0001\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÜ\u0001\u00103R\u0018\u0010Ý\u0001\u001a\u00030Þ\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bß\u0001\u0010à\u0001R#\u0010á\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e8@X\u0081\u0004¢\u0006\u000e\u0012\u0005\bâ\u0001\u0010\u001f\u001a\u0005\bã\u0001\u0010\u0010R\u000f\u0010ä\u0001\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006å\u0002"}, m7105d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "Landroidx/compose/ui/layout/Remeasurement;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/layout/LayoutInfo;", "Landroidx/compose/ui/node/ComposeUiNode;", "Landroidx/compose/ui/node/InteroperableComposeUiNode;", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "isVirtual", "", "semanticsId", "", "(ZI)V", "_children", "Landroidx/compose/runtime/collection/MutableVector;", "get_children$ui_release", "()Landroidx/compose/runtime/collection/MutableVector;", "_collapsedSemantics", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "_foldedChildren", "Landroidx/compose/ui/node/MutableVectorWithMutationTracking;", "_foldedParent", "_innerLayerCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "_unfoldedChildren", "_zSortedChildren", "alignmentLinesRequired", "getAlignmentLinesRequired$ui_release", "()Z", "canMultiMeasure", "getCanMultiMeasure$ui_release$annotations", "()V", "getCanMultiMeasure$ui_release", "setCanMultiMeasure$ui_release", "(Z)V", "childLookaheadMeasurables", "", "Landroidx/compose/ui/layout/Measurable;", "getChildLookaheadMeasurables$ui_release", "()Ljava/util/List;", "childMeasurables", "getChildMeasurables$ui_release", P2CompositeParser.ChildrenHandler.CHILDREN, "getChildren$ui_release", "collapsedSemantics", "getCollapsedSemantics$ui_release", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "<set-?>", "compositeKeyHash", "getCompositeKeyHash$annotations", "getCompositeKeyHash", "()I", "setCompositeKeyHash", "(I)V", "value", "Landroidx/compose/runtime/CompositionLocalMap;", "compositionLocalMap", "getCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "setCompositionLocalMap", "(Landroidx/compose/runtime/CompositionLocalMap;)V", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/unit/Density;", "density", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "depth", "getDepth$ui_release", "setDepth$ui_release", "foldedChildren", "getFoldedChildren$ui_release", "hasFixedInnerContentConstraints", "getHasFixedInnerContentConstraints$ui_release", "height", "getHeight", "ignoreRemeasureRequests", "innerCoordinator", "getInnerCoordinator$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerLayerCoordinator", "getInnerLayerCoordinator", "innerLayerCoordinatorIsDirty", "getInnerLayerCoordinatorIsDirty$ui_release", "setInnerLayerCoordinatorIsDirty$ui_release", "interopViewFactoryHolder", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/viewinterop/InteropViewFactoryHolder;", "getInteropViewFactoryHolder$ui_release", "()Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "setInteropViewFactoryHolder$ui_release", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V", "intrinsicsPolicy", "Landroidx/compose/ui/node/IntrinsicsPolicy;", "getIntrinsicsPolicy$ui_release", "()Landroidx/compose/ui/node/IntrinsicsPolicy;", "intrinsicsUsageByParent", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getIntrinsicsUsageByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setIntrinsicsUsageByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "isAttached", "isDeactivated", "isPlaced", "isPlacedByParent", "isPlacedInLookahead", "()Ljava/lang/Boolean;", "isValidOwnerScope", "isVirtualLookaheadRoot", "isVirtualLookaheadRoot$ui_release", "setVirtualLookaheadRoot$ui_release", "layoutDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "getLayoutDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutPending", "getLayoutPending$ui_release", "layoutState", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "getLayoutState$ui_release", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "lookaheadLayoutPending", "getLookaheadLayoutPending$ui_release", "lookaheadMeasurePending", "getLookaheadMeasurePending$ui_release", "lookaheadPassDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "getLookaheadPassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "newRoot", "lookaheadRoot", "getLookaheadRoot$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "setLookaheadRoot", "(Landroidx/compose/ui/node/LayoutNode;)V", "mDrawScope", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getMDrawScope$ui_release", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "measurePassDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "getMeasurePassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "measurePending", "getMeasurePending$ui_release", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "setMeasurePolicy", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "measuredByParent", "getMeasuredByParent$ui_release", "measuredByParentInLookahead", "getMeasuredByParentInLookahead$ui_release", "Landroidx/compose/ui/Modifier;", "modifier", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "needsOnPositionedDispatch", "getNeedsOnPositionedDispatch$ui_release", "setNeedsOnPositionedDispatch$ui_release", "nodes", "Landroidx/compose/ui/node/NodeChain;", "getNodes$ui_release", "()Landroidx/compose/ui/node/NodeChain;", "onAttach", "Lkotlin/Function1;", "Landroidx/compose/ui/node/Owner;", "", "getOnAttach$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnAttach$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "onDetach", "getOnDetach$ui_release", "setOnDetach$ui_release", "outerCoordinator", "getOuterCoordinator$ui_release", "owner", "getOwner$ui_release", "()Landroidx/compose/ui/node/Owner;", "parent", "getParent$ui_release", "parentInfo", "getParentInfo", "()Landroidx/compose/ui/layout/LayoutInfo;", "placeOrder", "getPlaceOrder$ui_release", "previousIntrinsicsUsageByParent", "getSemanticsId", "setSemanticsId", "subcompositionsState", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "getSubcompositionsState$ui_release", "()Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "setSubcompositionsState$ui_release", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V", "unfoldedVirtualChildrenListDirty", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "setViewConfiguration", "(Landroidx/compose/ui/platform/ViewConfiguration;)V", "virtualChildrenCount", "width", "getWidth", "zIndex", "", "getZIndex", "()F", "zSortedChildren", "getZSortedChildren$annotations", "getZSortedChildren", "zSortedChildrenInvalidated", "attach", "attach$ui_release", "clearSubtreeIntrinsicsUsage", "clearSubtreeIntrinsicsUsage$ui_release", "clearSubtreePlacementIntrinsicsUsage", "debugTreeToString", "", "detach", "detach$ui_release", "dispatchOnPositionedCallbacks", "dispatchOnPositionedCallbacks$ui_release", "draw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "draw$ui_release", "forEachChild", "block", "forEachChildIndexed", "Lkotlin/Function2;", "forEachCoordinator", "Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "forEachCoordinator$ui_release", "forEachCoordinatorIncludingInner", "forEachCoordinatorIncludingInner$ui_release", "forceRemeasure", "getInteropView", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "getModifierInfo", "Landroidx/compose/ui/layout/ModifierInfo;", "hitTest", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "isTouchEvent", "isInLayer", "hitTest-M_7yMNQ$ui_release", "(JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTestSemantics", "hitSemanticsEntities", "hitTestSemantics-M_7yMNQ$ui_release", "Lkotlin/Function0;", "ignoreRemeasureRequests$ui_release", "insertAt", FirebaseAnalytics.Param.INDEX, "instance", "insertAt$ui_release", "invalidateFocusOnAttach", "invalidateFocusOnDetach", "invalidateLayer", "invalidateLayer$ui_release", "invalidateLayers", "invalidateLayers$ui_release", "invalidateMeasurements", "invalidateMeasurements$ui_release", "invalidateParentData", "invalidateParentData$ui_release", "invalidateSemantics", "invalidateSemantics$ui_release", "invalidateSubtree", "isRootOfInvalidation", "invalidateUnfoldedVirtualChildren", "lookaheadRemeasure", "constraints", "Landroidx/compose/ui/unit/Constraints;", "lookaheadRemeasure-_Sx5XlM$ui_release", "lookaheadReplace", "lookaheadReplace$ui_release", "markLayoutPending", "markLayoutPending$ui_release", "markLookaheadLayoutPending", "markLookaheadLayoutPending$ui_release", "markLookaheadMeasurePending", "markLookaheadMeasurePending$ui_release", "markMeasurePending", "markMeasurePending$ui_release", "move", "from", "to", CatchStreamerKeys.COUNT_KEY, "move$ui_release", "onChildRemoved", P2CompositeParser.ChildHandler.CHILD, "onDeactivate", "onDensityOrLayoutDirectionChanged", "onLayoutComplete", "onRelease", "onReuse", "onZSortedChildrenInvalidated", "onZSortedChildrenInvalidated$ui_release", "place", "x", "y", "place$ui_release", "recreateUnfoldedChildrenIfDirty", "remeasure", "remeasure-_Sx5XlM$ui_release", "removeAll", "removeAll$ui_release", "removeAt", "removeAt$ui_release", "replace", "replace$ui_release", "requestLookaheadRelayout", "forceRequest", "requestLookaheadRelayout$ui_release", "requestLookaheadRemeasure", "scheduleMeasureAndLayout", "requestLookaheadRemeasure$ui_release", "requestRelayout", "requestRelayout$ui_release", "requestRemeasure", "requestRemeasure$ui_release", "rescheduleRemeasureOrRelayout", "it", "rescheduleRemeasureOrRelayout$ui_release", "resetModifierState", "resetSubtreeIntrinsicsUsage", "resetSubtreeIntrinsicsUsage$ui_release", "shouldInvalidateParentLayer", "toString", "updateChildrenIfDirty", "updateChildrenIfDirty$ui_release", "Companion", "LayoutState", "NoIntrinsicsMeasurePolicy", "UsageByParent", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 8 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 9 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 10 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 11 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 12 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n+ 13 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n1#1,1477:1\n1247#1,7:1484\n1247#1,7:1556\n1072#1,2:1564\n1074#1,2:1578\n197#1:1581\n1235#1,7:1964\n197#1:2139\n197#1:2151\n197#1:2163\n1247#1,7:2175\n1208#2:1478\n1187#2,2:1479\n1208#2:1481\n1187#2,2:1482\n1208#2:1491\n1187#2,2:1492\n1208#2:1627\n1187#2,2:1628\n1208#2:1691\n1187#2,2:1692\n1208#2:1765\n1187#2,2:1766\n1208#2:1861\n1187#2,2:1862\n1208#2:1925\n1187#2,2:1926\n1208#2:2007\n1187#2,2:2008\n1208#2:2092\n1187#2,2:2093\n48#3:1494\n48#3:1529\n48#3:1544\n48#3:1566\n460#4,7:1495\n146#4:1502\n467#4,4:1503\n460#4,11:1507\n476#4,11:1518\n460#4,11:1530\n460#4,11:1545\n460#4,11:1567\n146#4:1580\n460#4,11:1582\n460#4,11:2046\n460#4,11:2140\n460#4,11:2152\n460#4,11:2164\n76#5:1541\n76#5:1543\n76#5:1563\n78#5:1593\n78#5:1656\n101#5:1730\n88#5:1804\n90#5,3:1805\n94#5:1809\n90#5:1814\n92#5,3:1816\n90#5:1822\n86#5:1889\n86#5:1909\n72#5:1971\n72#5:1991\n84#5:2057\n74#5:2126\n72#5:2127\n72#5:2131\n72#5:2133\n74#5:2134\n1#6:1542\n702#7,8:1594\n725#7,3:1602\n710#7,2:1605\n713#7,2:1650\n728#7,3:1652\n715#7:1655\n702#7,8:1657\n725#7,3:1665\n710#7,2:1668\n703#7:1670\n704#7,11:1714\n728#7,3:1725\n715#7:1728\n705#7:1729\n702#7,8:1731\n725#7,3:1739\n710#7,2:1742\n703#7:1744\n704#7,11:1788\n728#7,3:1799\n715#7:1802\n705#7:1803\n725#7,3:1811\n728#7,3:1819\n741#7,18:1823\n759#7,3:1884\n753#7:1887\n744#7:1888\n702#7,8:1890\n725#7,3:1898\n710#7,2:1901\n703#7:1903\n704#7,11:1948\n728#7,3:1959\n715#7:1962\n705#7:1963\n702#7,8:1972\n725#7,3:1980\n710#7,2:1983\n703#7:1985\n704#7,11:2030\n728#7,3:2041\n715#7:2044\n705#7:2045\n725#7,3:2128\n728#7,3:2136\n385#8,6:1607\n395#8,2:1614\n397#8,8:1619\n405#8,9:1630\n414#8,8:1642\n385#8,6:1671\n395#8,2:1678\n397#8,8:1683\n405#8,9:1694\n414#8,8:1706\n385#8,6:1745\n395#8,2:1752\n397#8,8:1757\n405#8,9:1768\n414#8,8:1780\n385#8,6:1841\n395#8,2:1848\n397#8,8:1853\n405#8,9:1864\n414#8,8:1876\n385#8,5:1904\n390#8:1910\n395#8,2:1912\n397#8,8:1917\n405#8,9:1928\n414#8,8:1940\n385#8,5:1986\n390#8:1992\n395#8,2:1994\n397#8,8:1999\n405#8,9:2010\n414#8,8:2022\n385#8,6:2072\n395#8,2:2079\n397#8,8:2084\n405#8,9:2095\n414#8,8:2107\n261#9:1613\n261#9:1677\n261#9:1751\n261#9:1815\n261#9:1847\n261#9:1911\n261#9:1993\n261#9:2078\n261#9:2132\n261#9:2135\n234#10,3:1616\n237#10,3:1639\n234#10,3:1680\n237#10,3:1703\n234#10,3:1754\n237#10,3:1777\n234#10,3:1850\n237#10,3:1873\n234#10,3:1914\n237#10,3:1937\n234#10,3:1996\n237#10,3:2019\n234#10,3:2081\n237#10,3:2104\n47#11:1808\n52#12:1810\n106#13:2058\n95#13,13:2059\n108#13:2115\n100#13,10:2116\n*S KotlinDebug\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n114#1:1484,7\n490#1:1556,7\n524#1:1564,2\n524#1:1578,2\n593#1:1581\n1115#1:1964,7\n1283#1:2139\n1305#1:2151\n1317#1:2163\n1363#1:2175,7\n128#1:1478\n128#1:1479,2\n539#1:1481\n539#1:1482,2\n140#1:1491\n140#1:1492,2\n656#1:1627\n656#1:1628,2\n678#1:1691\n678#1:1692,2\n690#1:1765\n690#1:1766,2\n1063#1:1861\n1063#1:1862,2\n1099#1:1925\n1099#1:1926,2\n1197#1:2007\n1197#1:2008,2\n1226#1:2092\n1226#1:2093,2\n144#1:1494\n368#1:1529\n480#1:1544\n525#1:1566\n144#1:1495,7\n146#1:1502\n144#1:1503,4\n197#1:1507,11\n199#1:1518,11\n368#1:1530,11\n480#1:1545,11\n525#1:1567,11\n555#1:1580\n593#1:1582,11\n1201#1:2046,11\n1283#1:2140,11\n1305#1:2152,11\n1317#1:2164,11\n416#1:1541\n463#1:1543\n520#1:1563\n656#1:1593\n678#1:1656\n690#1:1730\n856#1:1804\n1053#1:1805,3\n1053#1:1809\n1055#1:1814\n1055#1:1816,3\n1063#1:1822\n1099#1:1889\n1100#1:1909\n1197#1:1971\n1198#1:1991\n1226#1:2057\n1256#1:2126\n1256#1:2127\n1258#1:2131\n1259#1:2133\n1263#1:2134\n656#1:1594,8\n656#1:1602,3\n656#1:1605,2\n656#1:1650,2\n656#1:1652,3\n656#1:1655\n678#1:1657,8\n678#1:1665,3\n678#1:1668,2\n678#1:1670\n678#1:1714,11\n678#1:1725,3\n678#1:1728\n678#1:1729\n690#1:1731,8\n690#1:1739,3\n690#1:1742,2\n690#1:1744\n690#1:1788,11\n690#1:1799,3\n690#1:1802\n690#1:1803\n1054#1:1811,3\n1054#1:1819,3\n1063#1:1823,18\n1063#1:1884,3\n1063#1:1887\n1063#1:1888\n1099#1:1890,8\n1099#1:1898,3\n1099#1:1901,2\n1099#1:1903\n1099#1:1948,11\n1099#1:1959,3\n1099#1:1962\n1099#1:1963\n1197#1:1972,8\n1197#1:1980,3\n1197#1:1983,2\n1197#1:1985\n1197#1:2030,11\n1197#1:2041,3\n1197#1:2044\n1197#1:2045\n1257#1:2128,3\n1257#1:2136,3\n656#1:1607,6\n656#1:1614,2\n656#1:1619,8\n656#1:1630,9\n656#1:1642,8\n678#1:1671,6\n678#1:1678,2\n678#1:1683,8\n678#1:1694,9\n678#1:1706,8\n690#1:1745,6\n690#1:1752,2\n690#1:1757,8\n690#1:1768,9\n690#1:1780,8\n1063#1:1841,6\n1063#1:1848,2\n1063#1:1853,8\n1063#1:1864,9\n1063#1:1876,8\n1099#1:1904,5\n1099#1:1910\n1099#1:1912,2\n1099#1:1917,8\n1099#1:1928,9\n1099#1:1940,8\n1197#1:1986,5\n1197#1:1992\n1197#1:1994,2\n1197#1:1999,8\n1197#1:2010,9\n1197#1:2022,8\n1226#1:2072,6\n1226#1:2079,2\n1226#1:2084,8\n1226#1:2095,9\n1226#1:2107,8\n656#1:1613\n678#1:1677\n690#1:1751\n1055#1:1815\n1063#1:1847\n1099#1:1911\n1197#1:1993\n1226#1:2078\n1258#1:2132\n1263#1:2135\n656#1:1616,3\n656#1:1639,3\n678#1:1680,3\n678#1:1703,3\n690#1:1754,3\n690#1:1777,3\n1063#1:1850,3\n1063#1:1873,3\n1099#1:1914,3\n1099#1:1937,3\n1197#1:1996,3\n1197#1:2019,3\n1226#1:2081,3\n1226#1:2104,3\n1053#1:1808\n1053#1:1810\n1226#1:2058\n1226#1:2059,13\n1226#1:2115\n1226#1:2116,10\n*E\n"})
/* loaded from: classes3.dex */
public final class LayoutNode implements ComposeNodeLifecycleCallback, Remeasurement, OwnerScope, LayoutInfo, ComposeUiNode, InteroperableComposeUiNode, Owner.OnLayoutCompletedListener {
    public static final int NotPlacedPlaceOrder = Integer.MAX_VALUE;

    @Nullable
    private SemanticsConfiguration _collapsedSemantics;

    @NotNull
    private final MutableVectorWithMutationTracking<LayoutNode> _foldedChildren;

    @Nullable
    private LayoutNode _foldedParent;

    @Nullable
    private NodeCoordinator _innerLayerCoordinator;

    @Nullable
    private MutableVector<LayoutNode> _unfoldedChildren;

    @NotNull
    private final MutableVector<LayoutNode> _zSortedChildren;
    private boolean canMultiMeasure;
    private int compositeKeyHash;

    @NotNull
    private CompositionLocalMap compositionLocalMap;

    @NotNull
    private Density density;
    private int depth;
    private boolean ignoreRemeasureRequests;
    private boolean innerLayerCoordinatorIsDirty;

    @Nullable
    private AndroidViewHolder interopViewFactoryHolder;

    @NotNull
    private final IntrinsicsPolicy intrinsicsPolicy;

    @NotNull
    private UsageByParent intrinsicsUsageByParent;
    private boolean isDeactivated;
    private final boolean isVirtual;
    private boolean isVirtualLookaheadRoot;

    @NotNull
    private final LayoutNodeLayoutDelegate layoutDelegate;

    @NotNull
    private LayoutDirection layoutDirection;

    @Nullable
    private LayoutNode lookaheadRoot;

    @NotNull
    private MeasurePolicy measurePolicy;

    @NotNull
    private Modifier modifier;
    private boolean needsOnPositionedDispatch;

    @NotNull
    private final NodeChain nodes;

    @Nullable
    private Function1<? super Owner, Unit> onAttach;

    @Nullable
    private Function1<? super Owner, Unit> onDetach;

    @Nullable
    private Owner owner;

    @NotNull
    private UsageByParent previousIntrinsicsUsageByParent;
    private int semanticsId;

    @Nullable
    private LayoutNodeSubcompositionsState subcompositionsState;
    private boolean unfoldedVirtualChildrenListDirty;

    @NotNull
    private ViewConfiguration viewConfiguration;
    private int virtualChildrenCount;
    private boolean zSortedChildrenInvalidated;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final NoIntrinsicsMeasurePolicy ErrorMeasurePolicy = new NoIntrinsicsMeasurePolicy() { // from class: androidx.compose.ui.node.LayoutNode$Companion$ErrorMeasurePolicy$1
        @Override // androidx.compose.p003ui.layout.MeasurePolicy
        /* renamed from: measure-3p2s80s */
        public /* bridge */ /* synthetic */ MeasureResult mo7599measure3p2s80s(MeasureScope measureScope, List list, long j) {
            return (MeasureResult) m12744measure3p2s80s(measureScope, (List<? extends Measurable>) list, j);
        }

        @NotNull
        /* renamed from: measure-3p2s80s, reason: not valid java name */
        public Void m12744measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
            throw new IllegalStateException("Undefined measure and it is required".toString());
        }
    };

    @NotNull
    private static final Function0<LayoutNode> Constructor = new Function0<LayoutNode>() { // from class: androidx.compose.ui.node.LayoutNode$Companion$Constructor$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final LayoutNode invoke() {
            return new LayoutNode(false, 0, 3, null);
        }
    };

    @NotNull
    private static final ViewConfiguration DummyViewConfiguration = new ViewConfiguration() { // from class: androidx.compose.ui.node.LayoutNode$Companion$DummyViewConfiguration$1
        @Override // androidx.compose.p003ui.platform.ViewConfiguration
        public long getDoubleTapMinTimeMillis() {
            return 40L;
        }

        @Override // androidx.compose.p003ui.platform.ViewConfiguration
        public long getDoubleTapTimeoutMillis() {
            return 300L;
        }

        @Override // androidx.compose.p003ui.platform.ViewConfiguration
        public long getLongPressTimeoutMillis() {
            return 400L;
        }

        @Override // androidx.compose.p003ui.platform.ViewConfiguration
        public float getTouchSlop() {
            return 16.0f;
        }

        @Override // androidx.compose.p003ui.platform.ViewConfiguration
        /* renamed from: getMinimumTouchTargetSize-MYxV2XQ, reason: not valid java name */
        public long mo12743getMinimumTouchTargetSizeMYxV2XQ() {
            return DpSize.INSTANCE.m13774getZeroMYxV2XQ();
        }
    };

    @NotNull
    private static final Comparator<LayoutNode> ZComparator = new Comparator() { // from class: androidx.compose.ui.node.LayoutNode$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return LayoutNode.ZComparator$lambda$39((LayoutNode) obj, (LayoutNode) obj2);
        }
    };

    /* compiled from: LayoutNode.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m7105d2 = {"Landroidx/compose/ui/node/LayoutNode$LayoutState;", "", "(Ljava/lang/String;I)V", "Measuring", "LookaheadMeasuring", "LayingOut", "LookaheadLayingOut", "Idle", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes4.dex */
    public enum LayoutState {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m7105d2 = {"Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "", "(Ljava/lang/String;I)V", "InMeasureBlock", "InLayoutBlock", "NotUsed", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes4.dex */
    public enum UsageByParent {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutState.values().length];
            try {
                iArr[LayoutState.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LayoutNode() {
        this(false, 0, 3, null);
    }

    @Deprecated(message = "Temporary API to support ConstraintLayout prototyping.")
    public static /* synthetic */ void getCanMultiMeasure$ui_release$annotations() {
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getCompositeKeyHash$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getZSortedChildren$annotations() {
    }

    public LayoutNode(boolean z, int i) {
        this.isVirtual = z;
        this.semanticsId = i;
        this._foldedChildren = new MutableVectorWithMutationTracking<>(new MutableVector(new LayoutNode[16], 0), new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNode$_foldedChildren$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.getLayoutDelegate().markChildrenDirty();
            }
        });
        this._zSortedChildren = new MutableVector<>(new LayoutNode[16], 0);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = ErrorMeasurePolicy;
        this.intrinsicsPolicy = new IntrinsicsPolicy(this);
        this.density = LayoutNodeKt.DefaultDensity;
        this.layoutDirection = LayoutDirection.Ltr;
        this.viewConfiguration = DummyViewConfiguration;
        this.compositionLocalMap = CompositionLocalMap.INSTANCE.getEmpty();
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.intrinsicsUsageByParent = usageByParent;
        this.previousIntrinsicsUsageByParent = usageByParent;
        this.nodes = new NodeChain(this);
        this.layoutDelegate = new LayoutNodeLayoutDelegate(this);
        this.innerLayerCoordinatorIsDirty = true;
        this.modifier = Modifier.INSTANCE;
    }

    public /* synthetic */ LayoutNode(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? SemanticsModifierKt.generateSemanticsId() : i);
    }

    @Override // androidx.compose.p003ui.layout.LayoutInfo
    public int getSemanticsId() {
        return this.semanticsId;
    }

    public void setSemanticsId(int i) {
        this.semanticsId = i;
    }

    @Override // androidx.compose.p003ui.node.ComposeUiNode
    @ExperimentalComposeUiApi
    public int getCompositeKeyHash() {
        return this.compositeKeyHash;
    }

    @Override // androidx.compose.p003ui.node.ComposeUiNode
    @ExperimentalComposeUiApi
    public void setCompositeKeyHash(int i) {
        this.compositeKeyHash = i;
    }

    /* renamed from: isVirtualLookaheadRoot$ui_release, reason: from getter */
    public final boolean getIsVirtualLookaheadRoot() {
        return this.isVirtualLookaheadRoot;
    }

    public final void setVirtualLookaheadRoot$ui_release(boolean z) {
        this.isVirtualLookaheadRoot = z;
    }

    @Nullable
    /* renamed from: getLookaheadRoot$ui_release, reason: from getter */
    public final LayoutNode getLookaheadRoot() {
        return this.lookaheadRoot;
    }

    private final void setLookaheadRoot(LayoutNode layoutNode) {
        if (Intrinsics.areEqual(layoutNode, this.lookaheadRoot)) {
            return;
        }
        this.lookaheadRoot = layoutNode;
        if (layoutNode != null) {
            this.layoutDelegate.ensureLookaheadDelegateCreated$ui_release();
            NodeCoordinator wrapped = getInnerCoordinator$ui_release().getWrapped();
            for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
                outerCoordinator$ui_release.ensureLookaheadDelegateCreated();
            }
        }
        invalidateMeasurements$ui_release();
    }

    @Nullable
    public final Boolean isPlacedInLookahead() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release != null) {
            return Boolean.valueOf(lookaheadPassDelegate$ui_release.getIsPlaced());
        }
        return null;
    }

    @NotNull
    public final List<LayoutNode> getFoldedChildren$ui_release() {
        return this._foldedChildren.asList();
    }

    private final void recreateUnfoldedChildrenIfDirty() {
        if (this.unfoldedVirtualChildrenListDirty) {
            int i = 0;
            this.unfoldedVirtualChildrenListDirty = false;
            MutableVector<LayoutNode> mutableVector = this._unfoldedChildren;
            if (mutableVector == null) {
                mutableVector = new MutableVector<>(new LayoutNode[16], 0);
                this._unfoldedChildren = mutableVector;
            }
            mutableVector.clear();
            MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
            int size = vector.getSize();
            if (size > 0) {
                LayoutNode[] content = vector.getContent();
                do {
                    LayoutNode layoutNode = content[i];
                    if (layoutNode.isVirtual) {
                        mutableVector.addAll(mutableVector.getSize(), layoutNode.get_children$ui_release());
                    } else {
                        mutableVector.add(layoutNode);
                    }
                    i++;
                } while (i < size);
            }
            this.layoutDelegate.markChildrenDirty();
        }
    }

    @NotNull
    public final List<Measurable> getChildMeasurables$ui_release() {
        return getMeasurePassDelegate$ui_release().getChildDelegates$ui_release();
    }

    @NotNull
    public final List<Measurable> getChildLookaheadMeasurables$ui_release() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
        return lookaheadPassDelegate$ui_release.getChildDelegates$ui_release();
    }

    private final void invalidateUnfoldedVirtualChildren() {
        LayoutNode layoutNode;
        if (this.virtualChildrenCount > 0) {
            this.unfoldedVirtualChildrenListDirty = true;
        }
        if (!this.isVirtual || (layoutNode = this._foldedParent) == null) {
            return;
        }
        layoutNode.invalidateUnfoldedVirtualChildren();
    }

    @NotNull
    public final MutableVector<LayoutNode> get_children$ui_release() {
        updateChildrenIfDirty$ui_release();
        if (this.virtualChildrenCount == 0) {
            return this._foldedChildren.getVector();
        }
        MutableVector<LayoutNode> mutableVector = this._unfoldedChildren;
        Intrinsics.checkNotNull(mutableVector);
        return mutableVector;
    }

    public final void updateChildrenIfDirty$ui_release() {
        if (this.virtualChildrenCount > 0) {
            recreateUnfoldedChildrenIfDirty();
        }
    }

    public final void forEachChild(@NotNull Function1<? super LayoutNode, Unit> block) {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                block.invoke(content[i]);
                i++;
            } while (i < size);
        }
    }

    public final void forEachChildIndexed(@NotNull Function2<? super Integer, ? super LayoutNode, Unit> block) {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                block.invoke(Integer.valueOf(i), content[i]);
                i++;
            } while (i < size);
        }
    }

    @NotNull
    public final List<LayoutNode> getChildren$ui_release() {
        return get_children$ui_release().asMutableList();
    }

    @Nullable
    public final LayoutNode getParent$ui_release() {
        LayoutNode layoutNode = this._foldedParent;
        while (layoutNode != null && layoutNode.isVirtual) {
            layoutNode = layoutNode._foldedParent;
        }
        return layoutNode;
    }

    @Nullable
    /* renamed from: getOwner$ui_release, reason: from getter */
    public final Owner getOwner() {
        return this.owner;
    }

    @Nullable
    /* renamed from: getInteropViewFactoryHolder$ui_release, reason: from getter */
    public final AndroidViewHolder getInteropViewFactoryHolder() {
        return this.interopViewFactoryHolder;
    }

    public final void setInteropViewFactoryHolder$ui_release(@Nullable AndroidViewHolder androidViewHolder) {
        this.interopViewFactoryHolder = androidViewHolder;
    }

    @Override // androidx.compose.p003ui.node.InteroperableComposeUiNode
    @InternalComposeUiApi
    @Nullable
    public View getInteropView() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            return androidViewHolder.getView();
        }
        return null;
    }

    @Override // androidx.compose.p003ui.layout.LayoutInfo
    public boolean isAttached() {
        return this.owner != null;
    }

    /* renamed from: getDepth$ui_release, reason: from getter */
    public final int getDepth() {
        return this.depth;
    }

    public final void setDepth$ui_release(int i) {
        this.depth = i;
    }

    @NotNull
    public final LayoutState getLayoutState$ui_release() {
        return this.layoutDelegate.getLayoutState();
    }

    @Nullable
    public final LayoutNodeLayoutDelegate.LookaheadPassDelegate getLookaheadPassDelegate$ui_release() {
        return this.layoutDelegate.getLookaheadPassDelegate();
    }

    @NotNull
    public final LayoutNodeLayoutDelegate.MeasurePassDelegate getMeasurePassDelegate$ui_release() {
        return this.layoutDelegate.getMeasurePassDelegate();
    }

    public final void insertAt$ui_release(int i, @NotNull LayoutNode instance) {
        if (instance._foldedParent != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot insert ");
            sb.append(instance);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(debugTreeToString$default(this, 0, 1, null));
            sb.append(" Other tree: ");
            LayoutNode layoutNode = instance._foldedParent;
            sb.append(layoutNode != null ? debugTreeToString$default(layoutNode, 0, 1, null) : null);
            throw new IllegalStateException(sb.toString().toString());
        }
        if (instance.owner != null) {
            throw new IllegalStateException(("Cannot insert " + instance + " because it already has an owner. This tree: " + debugTreeToString$default(this, 0, 1, null) + " Other tree: " + debugTreeToString$default(instance, 0, 1, null)).toString());
        }
        instance._foldedParent = this;
        this._foldedChildren.add(i, instance);
        onZSortedChildrenInvalidated$ui_release();
        if (instance.isVirtual) {
            this.virtualChildrenCount++;
        }
        invalidateUnfoldedVirtualChildren();
        Owner owner = this.owner;
        if (owner != null) {
            instance.attach$ui_release(owner);
        }
        if (instance.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
            layoutNodeLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() + 1);
        }
    }

    public final void onZSortedChildrenInvalidated$ui_release() {
        if (this.isVirtual) {
            LayoutNode parent$ui_release = getParent$ui_release();
            if (parent$ui_release != null) {
                parent$ui_release.onZSortedChildrenInvalidated$ui_release();
                return;
            }
            return;
        }
        this.zSortedChildrenInvalidated = true;
    }

    public final void removeAt$ui_release(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(("count (" + i2 + ") must be greater than 0").toString());
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            onChildRemoved(this._foldedChildren.removeAt(i3));
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void removeAll$ui_release() {
        int size = this._foldedChildren.getSize();
        while (true) {
            size--;
            if (-1 < size) {
                onChildRemoved(this._foldedChildren.get(size));
            } else {
                this._foldedChildren.clear();
                return;
            }
        }
    }

    private final void onChildRemoved(LayoutNode layoutNode) {
        if (layoutNode.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            this.layoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(r0.getChildrenAccessingCoordinatesDuringPlacement() - 1);
        }
        if (this.owner != null) {
            layoutNode.detach$ui_release();
        }
        layoutNode._foldedParent = null;
        layoutNode.getOuterCoordinator$ui_release().setWrappedBy$ui_release(null);
        if (layoutNode.isVirtual) {
            this.virtualChildrenCount--;
            MutableVector<LayoutNode> vector = layoutNode._foldedChildren.getVector();
            int size = vector.getSize();
            if (size > 0) {
                LayoutNode[] content = vector.getContent();
                int i = 0;
                do {
                    content[i].getOuterCoordinator$ui_release().setWrappedBy$ui_release(null);
                    i++;
                } while (i < size);
            }
        }
        invalidateUnfoldedVirtualChildren();
        onZSortedChildrenInvalidated$ui_release();
    }

    public final void move$ui_release(int from, int to, int i) {
        if (from == to) {
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            this._foldedChildren.add(from > to ? to + i2 : (to + i) - 2, this._foldedChildren.removeAt(from > to ? from + i2 : from));
        }
        onZSortedChildrenInvalidated$ui_release();
        invalidateUnfoldedVirtualChildren();
        invalidateMeasurements$ui_release();
    }

    public final void invalidateSemantics$ui_release() {
        this._collapsedSemantics = null;
        LayoutNodeKt.requireOwner(this).onSemanticsChange();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, androidx.compose.ui.semantics.SemanticsConfiguration] */
    @Nullable
    public final SemanticsConfiguration getCollapsedSemantics$ui_release() {
        if (!this.nodes.m12779hasH91voCI$ui_release(NodeKind.m12816constructorimpl(8)) || this._collapsedSemantics != null) {
            return this._collapsedSemantics;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new SemanticsConfiguration();
        LayoutNodeKt.requireOwner(this).getSnapshotObserver().observeSemanticsReads$ui_release(this, new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNode$collapsedSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0 */
            /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
            /* JADX WARN: Type inference failed for: r4v10 */
            /* JADX WARN: Type inference failed for: r4v11 */
            /* JADX WARN: Type inference failed for: r4v3 */
            /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
            /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v6 */
            /* JADX WARN: Type inference failed for: r4v7 */
            /* JADX WARN: Type inference failed for: r4v8 */
            /* JADX WARN: Type inference failed for: r4v9 */
            /* JADX WARN: Type inference failed for: r6v7, types: [T, androidx.compose.ui.semantics.SemanticsConfiguration] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                NodeChain nodes = this.this$0.getNodes();
                int iM12816constructorimpl = NodeKind.m12816constructorimpl(8);
                Ref.ObjectRef<SemanticsConfiguration> objectRef2 = objectRef;
                if ((nodes.getAggregateChildKindSet() & iM12816constructorimpl) != 0) {
                    for (Modifier.Node tail = nodes.getTail(); tail != null; tail = tail.getParent()) {
                        if ((tail.getKindSet() & iM12816constructorimpl) != 0) {
                            DelegatingNode delegatingNodePop = tail;
                            MutableVector mutableVector = null;
                            while (delegatingNodePop != 0) {
                                if (delegatingNodePop instanceof SemanticsModifierNode) {
                                    SemanticsModifierNode semanticsModifierNode = (SemanticsModifierNode) delegatingNodePop;
                                    if (semanticsModifierNode.getIsClearingSemantics()) {
                                        ?? semanticsConfiguration = new SemanticsConfiguration();
                                        objectRef2.element = semanticsConfiguration;
                                        semanticsConfiguration.setClearingSemantics(true);
                                    }
                                    if (semanticsModifierNode.getShouldMergeDescendantSemantics()) {
                                        objectRef2.element.setMergingSemanticsOfDescendants(true);
                                    }
                                    semanticsModifierNode.applySemantics(objectRef2.element);
                                } else if ((delegatingNodePop.getKindSet() & iM12816constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                    Modifier.Node delegate = delegatingNodePop.getDelegate();
                                    int i = 0;
                                    delegatingNodePop = delegatingNodePop;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iM12816constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
                                                delegatingNodePop = delegate;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNodePop != 0) {
                                                    mutableVector.add(delegatingNodePop);
                                                    delegatingNodePop = 0;
                                                }
                                                mutableVector.add(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        delegatingNodePop = delegatingNodePop;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                    }
                }
            }
        });
        T t = objectRef.element;
        this._collapsedSemantics = (SemanticsConfiguration) t;
        return (SemanticsConfiguration) t;
    }

    public final void attach$ui_release(@NotNull Owner owner) {
        LayoutNode layoutNode;
        int i = 0;
        if (this.owner != null) {
            throw new IllegalStateException(("Cannot attach " + this + " as it already is attached.  Tree: " + debugTreeToString$default(this, 0, 1, null)).toString());
        }
        LayoutNode layoutNode2 = this._foldedParent;
        if (layoutNode2 != null) {
            if (!Intrinsics.areEqual(layoutNode2 != null ? layoutNode2.owner : null, owner)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Attaching to a different owner(");
                sb.append(owner);
                sb.append(") than the parent's owner(");
                LayoutNode parent$ui_release = getParent$ui_release();
                sb.append(parent$ui_release != null ? parent$ui_release.owner : null);
                sb.append("). This tree: ");
                sb.append(debugTreeToString$default(this, 0, 1, null));
                sb.append(" Parent tree: ");
                LayoutNode layoutNode3 = this._foldedParent;
                sb.append(layoutNode3 != null ? debugTreeToString$default(layoutNode3, 0, 1, null) : null);
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        LayoutNode parent$ui_release2 = getParent$ui_release();
        if (parent$ui_release2 == null) {
            getMeasurePassDelegate$ui_release().setPlaced$ui_release(true);
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release != null) {
                lookaheadPassDelegate$ui_release.setPlaced(true);
            }
        }
        getOuterCoordinator$ui_release().setWrappedBy$ui_release(parent$ui_release2 != null ? parent$ui_release2.getInnerCoordinator$ui_release() : null);
        this.owner = owner;
        this.depth = (parent$ui_release2 != null ? parent$ui_release2.depth : -1) + 1;
        if (this.nodes.m12779hasH91voCI$ui_release(NodeKind.m12816constructorimpl(8))) {
            invalidateSemantics$ui_release();
        }
        owner.onAttach(this);
        if (this.isVirtualLookaheadRoot) {
            setLookaheadRoot(this);
        } else {
            LayoutNode layoutNode4 = this._foldedParent;
            if (layoutNode4 == null || (layoutNode = layoutNode4.lookaheadRoot) == null) {
                layoutNode = this.lookaheadRoot;
            }
            setLookaheadRoot(layoutNode);
        }
        if (!getIsDeactivated()) {
            this.nodes.markAsAttached();
        }
        MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
        int size = vector.getSize();
        if (size > 0) {
            LayoutNode[] content = vector.getContent();
            do {
                content[i].attach$ui_release(owner);
                i++;
            } while (i < size);
        }
        if (!getIsDeactivated()) {
            this.nodes.runAttachLifecycle();
        }
        invalidateMeasurements$ui_release();
        if (parent$ui_release2 != null) {
            parent$ui_release2.invalidateMeasurements$ui_release();
        }
        NodeCoordinator wrapped = getInnerCoordinator$ui_release().getWrapped();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
            outerCoordinator$ui_release.onLayoutNodeAttach();
        }
        Function1<? super Owner, Unit> function1 = this.onAttach;
        if (function1 != null) {
            function1.invoke(owner);
        }
        this.layoutDelegate.updateParentData();
        if (getIsDeactivated()) {
            return;
        }
        invalidateFocusOnAttach();
    }

    public final void detach$ui_release() {
        Owner owner = this.owner;
        if (owner == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot detach node that is already detached!  Tree: ");
            LayoutNode parent$ui_release = getParent$ui_release();
            sb.append(parent$ui_release != null ? debugTreeToString$default(parent$ui_release, 0, 1, null) : null);
            throw new IllegalStateException(sb.toString().toString());
        }
        invalidateFocusOnDetach();
        LayoutNode parent$ui_release2 = getParent$ui_release();
        if (parent$ui_release2 != null) {
            parent$ui_release2.invalidateLayer$ui_release();
            parent$ui_release2.invalidateMeasurements$ui_release();
            LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate$ui_release = getMeasurePassDelegate$ui_release();
            UsageByParent usageByParent = UsageByParent.NotUsed;
            measurePassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release != null) {
                lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
            }
        }
        this.layoutDelegate.resetAlignmentLines();
        Function1<? super Owner, Unit> function1 = this.onDetach;
        if (function1 != null) {
            function1.invoke(owner);
        }
        if (this.nodes.m12779hasH91voCI$ui_release(NodeKind.m12816constructorimpl(8))) {
            invalidateSemantics$ui_release();
        }
        this.nodes.runDetachLifecycle$ui_release();
        this.ignoreRemeasureRequests = true;
        MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
        int size = vector.getSize();
        if (size > 0) {
            LayoutNode[] content = vector.getContent();
            int i = 0;
            do {
                content[i].detach$ui_release();
                i++;
            } while (i < size);
        }
        this.ignoreRemeasureRequests = false;
        this.nodes.markAsDetached$ui_release();
        owner.onDetach(this);
        this.owner = null;
        setLookaheadRoot(null);
        this.depth = 0;
        getMeasurePassDelegate$ui_release().onNodeDetached();
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release2 = getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release2 != null) {
            lookaheadPassDelegate$ui_release2.onNodeDetached();
        }
    }

    @NotNull
    public final MutableVector<LayoutNode> getZSortedChildren() {
        if (this.zSortedChildrenInvalidated) {
            this._zSortedChildren.clear();
            MutableVector<LayoutNode> mutableVector = this._zSortedChildren;
            mutableVector.addAll(mutableVector.getSize(), get_children$ui_release());
            this._zSortedChildren.sortWith(ZComparator);
            this.zSortedChildrenInvalidated = false;
        }
        return this._zSortedChildren;
    }

    @Override // androidx.compose.p003ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttached();
    }

    @NotNull
    public String toString() {
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + " children: " + getChildren$ui_release().size() + " measurePolicy: " + getMeasurePolicy();
    }

    public final boolean getHasFixedInnerContentConstraints$ui_release() {
        long jM12800getLastMeasurementConstraintsmsEJaDk$ui_release = getInnerCoordinator$ui_release().m12800getLastMeasurementConstraintsmsEJaDk$ui_release();
        return Constraints.m13620getHasFixedWidthimpl(jM12800getLastMeasurementConstraintsmsEJaDk$ui_release) && Constraints.m13619getHasFixedHeightimpl(jM12800getLastMeasurementConstraintsmsEJaDk$ui_release);
    }

    public static /* synthetic */ String debugTreeToString$default(LayoutNode layoutNode, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return layoutNode.debugTreeToString(i);
    }

    private final String debugTreeToString(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append(GlideException.IndentedAppendable.INDENT);
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                sb.append(content[i2].debugTreeToString(depth + 1));
                i2++;
            } while (i2 < size);
        }
        String string = sb.toString();
        if (depth != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* compiled from: LayoutNode.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\r\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\"\u0010\u000f\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\u0010\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m7105d2 = {"Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "error", "", "(Ljava/lang/String;)V", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "", "maxIntrinsicWidth", "height", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static abstract class NoIntrinsicsMeasurePolicy implements MeasurePolicy {
        public static final int $stable = 0;

        @NotNull
        private final String error;

        public NoIntrinsicsMeasurePolicy(@NotNull String str) {
            this.error = str;
        }

        @Override // androidx.compose.p003ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) m12745maxIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i)).intValue();
        }

        @Override // androidx.compose.p003ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) m12746maxIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i)).intValue();
        }

        @Override // androidx.compose.p003ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) m12747minIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i)).intValue();
        }

        @Override // androidx.compose.p003ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) m12748minIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i)).intValue();
        }

        @NotNull
        /* renamed from: minIntrinsicWidth */
        public Void m12748minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
            throw new IllegalStateException(this.error.toString());
        }

        @NotNull
        /* renamed from: minIntrinsicHeight */
        public Void m12747minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
            throw new IllegalStateException(this.error.toString());
        }

        @NotNull
        /* renamed from: maxIntrinsicWidth */
        public Void m12746maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
            throw new IllegalStateException(this.error.toString());
        }

        @NotNull
        /* renamed from: maxIntrinsicHeight */
        public Void m12745maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
            throw new IllegalStateException(this.error.toString());
        }
    }

    @Override // androidx.compose.p003ui.node.ComposeUiNode
    @NotNull
    public MeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    @Override // androidx.compose.p003ui.node.ComposeUiNode
    public void setMeasurePolicy(@NotNull MeasurePolicy measurePolicy) {
        if (Intrinsics.areEqual(this.measurePolicy, measurePolicy)) {
            return;
        }
        this.measurePolicy = measurePolicy;
        this.intrinsicsPolicy.updateFrom(getMeasurePolicy());
        invalidateMeasurements$ui_release();
    }

    @NotNull
    /* renamed from: getIntrinsicsPolicy$ui_release, reason: from getter */
    public final IntrinsicsPolicy getIntrinsicsPolicy() {
        return this.intrinsicsPolicy;
    }

    @Override // androidx.compose.p003ui.layout.LayoutInfo, androidx.compose.p003ui.node.ComposeUiNode
    @NotNull
    public Density getDensity() {
        return this.density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // androidx.compose.p003ui.node.ComposeUiNode
    public void setDensity(@NotNull Density density) {
        if (Intrinsics.areEqual(this.density, density)) {
            return;
        }
        this.density = density;
        onDensityOrLayoutDirectionChanged();
        NodeChain nodeChain = this.nodes;
        int iM12816constructorimpl = NodeKind.m12816constructorimpl(16);
        if ((nodeChain.getAggregateChildKindSet() & iM12816constructorimpl) != 0) {
            for (Modifier.Node head = nodeChain.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iM12816constructorimpl) != 0) {
                    DelegatingNode delegatingNodePop = head;
                    MutableVector mutableVector = null;
                    while (delegatingNodePop != 0) {
                        if (delegatingNodePop instanceof PointerInputModifierNode) {
                            ((PointerInputModifierNode) delegatingNodePop).onDensityChange();
                        } else if ((delegatingNodePop.getKindSet() & iM12816constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                            Modifier.Node delegate = delegatingNodePop.getDelegate();
                            int i = 0;
                            delegatingNodePop = delegatingNodePop;
                            while (delegate != null) {
                                if ((delegate.getKindSet() & iM12816constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        delegatingNodePop = delegate;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (delegatingNodePop != 0) {
                                            mutableVector.add(delegatingNodePop);
                                            delegatingNodePop = 0;
                                        }
                                        mutableVector.add(delegate);
                                    }
                                }
                                delegate = delegate.getChild();
                                delegatingNodePop = delegatingNodePop;
                            }
                            if (i == 1) {
                            }
                        }
                        delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head.getAggregateChildKindSet() & iM12816constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    @Override // androidx.compose.p003ui.layout.LayoutInfo, androidx.compose.p003ui.node.ComposeUiNode
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // androidx.compose.p003ui.node.ComposeUiNode
    public void setLayoutDirection(@NotNull LayoutDirection layoutDirection) {
        if (this.layoutDirection != layoutDirection) {
            this.layoutDirection = layoutDirection;
            onDensityOrLayoutDirectionChanged();
        }
    }

    @Override // androidx.compose.p003ui.layout.LayoutInfo, androidx.compose.p003ui.node.ComposeUiNode
    @NotNull
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // androidx.compose.p003ui.node.ComposeUiNode
    public void setViewConfiguration(@NotNull ViewConfiguration viewConfiguration) {
        if (Intrinsics.areEqual(this.viewConfiguration, viewConfiguration)) {
            return;
        }
        this.viewConfiguration = viewConfiguration;
        NodeChain nodeChain = this.nodes;
        int iM12816constructorimpl = NodeKind.m12816constructorimpl(16);
        if ((nodeChain.getAggregateChildKindSet() & iM12816constructorimpl) != 0) {
            for (Modifier.Node head = nodeChain.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iM12816constructorimpl) != 0) {
                    DelegatingNode delegatingNodePop = head;
                    MutableVector mutableVector = null;
                    while (delegatingNodePop != 0) {
                        if (delegatingNodePop instanceof PointerInputModifierNode) {
                            ((PointerInputModifierNode) delegatingNodePop).onViewConfigurationChange();
                        } else if ((delegatingNodePop.getKindSet() & iM12816constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                            Modifier.Node delegate = delegatingNodePop.getDelegate();
                            int i = 0;
                            delegatingNodePop = delegatingNodePop;
                            while (delegate != null) {
                                if ((delegate.getKindSet() & iM12816constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        delegatingNodePop = delegate;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (delegatingNodePop != 0) {
                                            mutableVector.add(delegatingNodePop);
                                            delegatingNodePop = 0;
                                        }
                                        mutableVector.add(delegate);
                                    }
                                }
                                delegate = delegate.getChild();
                                delegatingNodePop = delegatingNodePop;
                            }
                            if (i == 1) {
                            }
                        }
                        delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head.getAggregateChildKindSet() & iM12816constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    @Override // androidx.compose.p003ui.node.ComposeUiNode
    @NotNull
    public CompositionLocalMap getCompositionLocalMap() {
        return this.compositionLocalMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // androidx.compose.p003ui.node.ComposeUiNode
    public void setCompositionLocalMap(@NotNull CompositionLocalMap compositionLocalMap) {
        this.compositionLocalMap = compositionLocalMap;
        setDensity((Density) compositionLocalMap.get(CompositionLocalsKt.getLocalDensity()));
        setLayoutDirection((LayoutDirection) compositionLocalMap.get(CompositionLocalsKt.getLocalLayoutDirection()));
        setViewConfiguration((ViewConfiguration) compositionLocalMap.get(CompositionLocalsKt.getLocalViewConfiguration()));
        NodeChain nodeChain = this.nodes;
        int iM12816constructorimpl = NodeKind.m12816constructorimpl(32768);
        if ((nodeChain.getAggregateChildKindSet() & iM12816constructorimpl) != 0) {
            for (Modifier.Node head = nodeChain.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iM12816constructorimpl) != 0) {
                    DelegatingNode delegatingNodePop = head;
                    MutableVector mutableVector = null;
                    while (delegatingNodePop != 0) {
                        if (delegatingNodePop instanceof CompositionLocalConsumerModifierNode) {
                            Modifier.Node node = ((CompositionLocalConsumerModifierNode) delegatingNodePop).getNode();
                            if (node.getIsAttached()) {
                                NodeKindKt.autoInvalidateUpdatedNode(node);
                            } else {
                                node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                            }
                        } else if ((delegatingNodePop.getKindSet() & iM12816constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                            Modifier.Node delegate = delegatingNodePop.getDelegate();
                            int i = 0;
                            delegatingNodePop = delegatingNodePop;
                            while (delegate != null) {
                                if ((delegate.getKindSet() & iM12816constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        delegatingNodePop = delegate;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (delegatingNodePop != 0) {
                                            mutableVector.add(delegatingNodePop);
                                            delegatingNodePop = 0;
                                        }
                                        mutableVector.add(delegate);
                                    }
                                }
                                delegate = delegate.getChild();
                                delegatingNodePop = delegatingNodePop;
                            }
                            if (i == 1) {
                            }
                        }
                        delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head.getAggregateChildKindSet() & iM12816constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    private final void onDensityOrLayoutDirectionChanged() {
        invalidateMeasurements$ui_release();
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
        invalidateLayers$ui_release();
    }

    @Override // androidx.compose.p003ui.layout.LayoutInfo
    public int getWidth() {
        return this.layoutDelegate.getWidth$ui_release();
    }

    @Override // androidx.compose.p003ui.layout.LayoutInfo
    public int getHeight() {
        return this.layoutDelegate.getHeight$ui_release();
    }

    public final boolean getAlignmentLinesRequired$ui_release() {
        AlignmentLines alignmentLines;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
        if (layoutNodeLayoutDelegate.getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release()) {
            return true;
        }
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = layoutNodeLayoutDelegate.getLookaheadAlignmentLinesOwner$ui_release();
        return (lookaheadAlignmentLinesOwner$ui_release == null || (alignmentLines = lookaheadAlignmentLinesOwner$ui_release.getAlignmentLines()) == null || !alignmentLines.getRequired$ui_release()) ? false : true;
    }

    @NotNull
    public final LayoutNodeDrawScope getMDrawScope$ui_release() {
        return LayoutNodeKt.requireOwner(this).getSharedDrawScope();
    }

    @Override // androidx.compose.p003ui.layout.LayoutInfo
    public boolean isPlaced() {
        return getMeasurePassDelegate$ui_release().getIsPlaced();
    }

    public final boolean isPlacedByParent() {
        return getMeasurePassDelegate$ui_release().getIsPlacedByParent();
    }

    public final int getPlaceOrder$ui_release() {
        return getMeasurePassDelegate$ui_release().getPlaceOrder();
    }

    @NotNull
    public final UsageByParent getMeasuredByParent$ui_release() {
        return getMeasurePassDelegate$ui_release().getMeasuredByParent();
    }

    @NotNull
    public final UsageByParent getMeasuredByParentInLookahead$ui_release() {
        UsageByParent measuredByParent;
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        return (lookaheadPassDelegate$ui_release == null || (measuredByParent = lookaheadPassDelegate$ui_release.getMeasuredByParent()) == null) ? UsageByParent.NotUsed : measuredByParent;
    }

    @NotNull
    /* renamed from: getIntrinsicsUsageByParent$ui_release, reason: from getter */
    public final UsageByParent getIntrinsicsUsageByParent() {
        return this.intrinsicsUsageByParent;
    }

    public final void setIntrinsicsUsageByParent$ui_release(@NotNull UsageByParent usageByParent) {
        this.intrinsicsUsageByParent = usageByParent;
    }

    /* renamed from: getCanMultiMeasure$ui_release, reason: from getter */
    public final boolean getCanMultiMeasure() {
        return this.canMultiMeasure;
    }

    public final void setCanMultiMeasure$ui_release(boolean z) {
        this.canMultiMeasure = z;
    }

    @NotNull
    /* renamed from: getNodes$ui_release, reason: from getter */
    public final NodeChain getNodes() {
        return this.nodes;
    }

    @NotNull
    public final NodeCoordinator getInnerCoordinator$ui_release() {
        return this.nodes.getInnerCoordinator();
    }

    @NotNull
    /* renamed from: getLayoutDelegate$ui_release, reason: from getter */
    public final LayoutNodeLayoutDelegate getLayoutDelegate() {
        return this.layoutDelegate;
    }

    @NotNull
    public final NodeCoordinator getOuterCoordinator$ui_release() {
        return this.nodes.getOuterCoordinator();
    }

    private final float getZIndex() {
        return getMeasurePassDelegate$ui_release().getZIndex();
    }

    @Nullable
    /* renamed from: getSubcompositionsState$ui_release, reason: from getter */
    public final LayoutNodeSubcompositionsState getSubcompositionsState() {
        return this.subcompositionsState;
    }

    public final void setSubcompositionsState$ui_release(@Nullable LayoutNodeSubcompositionsState layoutNodeSubcompositionsState) {
        this.subcompositionsState = layoutNodeSubcompositionsState;
    }

    /* renamed from: getInnerLayerCoordinatorIsDirty$ui_release, reason: from getter */
    public final boolean getInnerLayerCoordinatorIsDirty() {
        return this.innerLayerCoordinatorIsDirty;
    }

    public final void setInnerLayerCoordinatorIsDirty$ui_release(boolean z) {
        this.innerLayerCoordinatorIsDirty = z;
    }

    private final NodeCoordinator getInnerLayerCoordinator() {
        if (this.innerLayerCoordinatorIsDirty) {
            NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
            NodeCoordinator wrappedBy = getOuterCoordinator$ui_release().getWrappedBy();
            this._innerLayerCoordinator = null;
            while (true) {
                if (Intrinsics.areEqual(innerCoordinator$ui_release, wrappedBy)) {
                    break;
                }
                if ((innerCoordinator$ui_release != null ? innerCoordinator$ui_release.getLayer() : null) != null) {
                    this._innerLayerCoordinator = innerCoordinator$ui_release;
                    break;
                }
                innerCoordinator$ui_release = innerCoordinator$ui_release != null ? innerCoordinator$ui_release.getWrappedBy() : null;
            }
        }
        NodeCoordinator nodeCoordinator = this._innerLayerCoordinator;
        if (nodeCoordinator == null || nodeCoordinator.getLayer() != null) {
            return nodeCoordinator;
        }
        throw new IllegalStateException("layer was not set".toString());
    }

    public final void invalidateLayer$ui_release() {
        NodeCoordinator innerLayerCoordinator = getInnerLayerCoordinator();
        if (innerLayerCoordinator != null) {
            innerLayerCoordinator.invalidateLayer();
            return;
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
    }

    @Override // androidx.compose.p003ui.node.ComposeUiNode
    @NotNull
    public Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.p003ui.node.ComposeUiNode
    public void setModifier(@NotNull Modifier modifier) {
        if (this.isVirtual && getModifier() != Modifier.INSTANCE) {
            throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes".toString());
        }
        if (!(!getIsDeactivated())) {
            throw new IllegalArgumentException("modifier is updated when deactivated".toString());
        }
        this.modifier = modifier;
        this.nodes.updateFrom$ui_release(modifier);
        this.layoutDelegate.updateParentData();
        if (this.nodes.m12779hasH91voCI$ui_release(NodeKind.m12816constructorimpl(512)) && this.lookaheadRoot == null) {
            setLookaheadRoot(this);
        }
    }

    private final void resetModifierState() {
        this.nodes.resetState$ui_release();
    }

    public final void invalidateParentData$ui_release() {
        this.layoutDelegate.invalidateParentData();
    }

    @Override // androidx.compose.p003ui.layout.LayoutInfo
    @NotNull
    public LayoutCoordinates getCoordinates() {
        return getInnerCoordinator$ui_release();
    }

    @Nullable
    public final Function1<Owner, Unit> getOnAttach$ui_release() {
        return this.onAttach;
    }

    public final void setOnAttach$ui_release(@Nullable Function1<? super Owner, Unit> function1) {
        this.onAttach = function1;
    }

    @Nullable
    public final Function1<Owner, Unit> getOnDetach$ui_release() {
        return this.onDetach;
    }

    public final void setOnDetach$ui_release(@Nullable Function1<? super Owner, Unit> function1) {
        this.onDetach = function1;
    }

    /* renamed from: getNeedsOnPositionedDispatch$ui_release, reason: from getter */
    public final boolean getNeedsOnPositionedDispatch() {
        return this.needsOnPositionedDispatch;
    }

    public final void setNeedsOnPositionedDispatch$ui_release(boolean z) {
        this.needsOnPositionedDispatch = z;
    }

    public final void place$ui_release(int x, int y) {
        Placeable.PlacementScope placementScope;
        NodeCoordinator innerCoordinator$ui_release;
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release == null || (innerCoordinator$ui_release = parent$ui_release.getInnerCoordinator$ui_release()) == null || (placementScope = innerCoordinator$ui_release.getPlacementScope()) == null) {
            placementScope = LayoutNodeKt.requireOwner(this).getPlacementScope();
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, getMeasurePassDelegate$ui_release(), x, y, 0.0f, 4, null);
    }

    public final void replace$ui_release() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        getMeasurePassDelegate$ui_release().replace();
    }

    public final void lookaheadReplace$ui_release() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
        lookaheadPassDelegate$ui_release.replace();
    }

    public final void draw$ui_release(@NotNull Canvas canvas) {
        getOuterCoordinator$ui_release().draw(canvas);
    }

    /* renamed from: hitTest-M_7yMNQ$ui_release$default */
    public static /* synthetic */ void m12735hitTestM_7yMNQ$ui_release$default(LayoutNode layoutNode, long j, HitTestResult hitTestResult, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = true;
        }
        layoutNode.m12739hitTestM_7yMNQ$ui_release(j, hitTestResult, z3, z2);
    }

    /* renamed from: hitTest-M_7yMNQ$ui_release */
    public final void m12739hitTestM_7yMNQ$ui_release(long pointerPosition, @NotNull HitTestResult hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        getOuterCoordinator$ui_release().m12803hitTestYqVAtuI(NodeCoordinator.INSTANCE.getPointerInputSource(), getOuterCoordinator$ui_release().m12799fromParentPositionMKHz9U(pointerPosition), hitTestResult, isTouchEvent, isInLayer);
    }

    /* renamed from: hitTestSemantics-M_7yMNQ$ui_release */
    public final void m12740hitTestSemanticsM_7yMNQ$ui_release(long pointerPosition, @NotNull HitTestResult hitSemanticsEntities, boolean isTouchEvent, boolean isInLayer) {
        getOuterCoordinator$ui_release().m12803hitTestYqVAtuI(NodeCoordinator.INSTANCE.getSemanticsSource(), getOuterCoordinator$ui_release().m12799fromParentPositionMKHz9U(pointerPosition), hitSemanticsEntities, true, isInLayer);
    }

    public final void rescheduleRemeasureOrRelayout$ui_release(@NotNull LayoutNode it) {
        if (WhenMappings.$EnumSwitchMapping$0[it.getLayoutState$ui_release().ordinal()] == 1) {
            if (it.getLookaheadMeasurePending$ui_release()) {
                requestLookaheadRemeasure$ui_release$default(it, true, false, 2, null);
                return;
            }
            if (it.getLookaheadLayoutPending$ui_release()) {
                it.requestLookaheadRelayout$ui_release(true);
            }
            if (it.getMeasurePending$ui_release()) {
                requestRemeasure$ui_release$default(it, true, false, 2, null);
                return;
            } else {
                if (it.getLayoutPending$ui_release()) {
                    it.requestRelayout$ui_release(true);
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException("Unexpected state " + it.getLayoutState$ui_release());
    }

    public static /* synthetic */ void requestRemeasure$ui_release$default(LayoutNode layoutNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        layoutNode.requestRemeasure$ui_release(z, z2);
    }

    public final void requestRemeasure$ui_release(boolean forceRequest, boolean scheduleMeasureAndLayout) {
        Owner owner;
        if (this.ignoreRemeasureRequests || this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        Owner.onRequestMeasure$default(owner, this, false, forceRequest, scheduleMeasureAndLayout, 2, null);
        getMeasurePassDelegate$ui_release().invalidateIntrinsicsParent(forceRequest);
    }

    public static /* synthetic */ void requestLookaheadRemeasure$ui_release$default(LayoutNode layoutNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        layoutNode.requestLookaheadRemeasure$ui_release(z, z2);
    }

    public final void requestLookaheadRemeasure$ui_release(boolean forceRequest, boolean scheduleMeasureAndLayout) {
        if (this.lookaheadRoot == null) {
            throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope".toString());
        }
        Owner owner = this.owner;
        if (owner == null || this.ignoreRemeasureRequests || this.isVirtual) {
            return;
        }
        owner.onRequestMeasure(this, true, forceRequest, scheduleMeasureAndLayout);
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
        lookaheadPassDelegate$ui_release.invalidateIntrinsicsParent(forceRequest);
    }

    public final void invalidateMeasurements$ui_release() {
        if (this.lookaheadRoot != null) {
            requestLookaheadRemeasure$ui_release$default(this, false, false, 3, null);
        } else {
            requestRemeasure$ui_release$default(this, false, false, 3, null);
        }
    }

    private final void invalidateFocusOnAttach() {
        if (this.nodes.has$ui_release(NodeKind.m12816constructorimpl(1024) | NodeKind.m12816constructorimpl(2048) | NodeKind.m12816constructorimpl(4096))) {
            for (Modifier.Node head = this.nodes.getHead(); head != null; head = head.getChild()) {
                if (((NodeKind.m12816constructorimpl(1024) & head.getKindSet()) != 0) | ((NodeKind.m12816constructorimpl(2048) & head.getKindSet()) != 0) | ((NodeKind.m12816constructorimpl(4096) & head.getKindSet()) != 0)) {
                    NodeKindKt.autoInvalidateInsertedNode(head);
                }
            }
        }
    }

    private final void invalidateFocusOnDetach() {
        NodeChain nodeChain = this.nodes;
        int iM12816constructorimpl = NodeKind.m12816constructorimpl(1024);
        if ((nodeChain.getAggregateChildKindSet() & iM12816constructorimpl) != 0) {
            for (Modifier.Node tail = nodeChain.getTail(); tail != null; tail = tail.getParent()) {
                if ((tail.getKindSet() & iM12816constructorimpl) != 0) {
                    Modifier.Node nodePop = tail;
                    MutableVector mutableVector = null;
                    while (nodePop != null) {
                        if (nodePop instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) nodePop;
                            if (focusTargetNode.getFocusState().isFocused()) {
                                LayoutNodeKt.requireOwner(this).getFocusOwner().clearFocus(true, false);
                                focusTargetNode.scheduleInvalidationForFocusEvents$ui_release();
                            }
                        } else if ((nodePop.getKindSet() & iM12816constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                            int i = 0;
                            for (Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if ((delegate.getKindSet() & iM12816constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        nodePop = delegate;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (nodePop != null) {
                                            mutableVector.add(nodePop);
                                            nodePop = null;
                                        }
                                        mutableVector.add(delegate);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        nodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
            }
        }
    }

    public final void ignoreRemeasureRequests$ui_release(@NotNull Function0<Unit> block) {
        this.ignoreRemeasureRequests = true;
        block.invoke();
        this.ignoreRemeasureRequests = false;
    }

    public static /* synthetic */ void requestRelayout$ui_release$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.requestRelayout$ui_release(z);
    }

    public final void requestRelayout$ui_release(boolean forceRequest) {
        Owner owner;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        Owner.onRequestRelayout$default(owner, this, false, forceRequest, 2, null);
    }

    public static /* synthetic */ void requestLookaheadRelayout$ui_release$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.requestLookaheadRelayout$ui_release(z);
    }

    public final void requestLookaheadRelayout$ui_release(boolean forceRequest) {
        Owner owner;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        owner.onRequestRelayout(this, true, forceRequest);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void dispatchOnPositionedCallbacks$ui_release() {
        if (getLayoutState$ui_release() != LayoutState.Idle || getLayoutPending$ui_release() || getMeasurePending$ui_release() || getIsDeactivated() || !isPlaced()) {
            return;
        }
        NodeChain nodeChain = this.nodes;
        int iM12816constructorimpl = NodeKind.m12816constructorimpl(256);
        if ((nodeChain.getAggregateChildKindSet() & iM12816constructorimpl) != 0) {
            for (Modifier.Node head = nodeChain.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iM12816constructorimpl) != 0) {
                    DelegatingNode delegatingNodePop = head;
                    MutableVector mutableVector = null;
                    while (delegatingNodePop != 0) {
                        if (delegatingNodePop instanceof GlobalPositionAwareModifierNode) {
                            GlobalPositionAwareModifierNode globalPositionAwareModifierNode = (GlobalPositionAwareModifierNode) delegatingNodePop;
                            globalPositionAwareModifierNode.onGloballyPositioned(DelegatableNodeKt.m12713requireCoordinator64DMado(globalPositionAwareModifierNode, NodeKind.m12816constructorimpl(256)));
                        } else if ((delegatingNodePop.getKindSet() & iM12816constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                            Modifier.Node delegate = delegatingNodePop.getDelegate();
                            int i = 0;
                            delegatingNodePop = delegatingNodePop;
                            while (delegate != null) {
                                if ((delegate.getKindSet() & iM12816constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        delegatingNodePop = delegate;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (delegatingNodePop != 0) {
                                            mutableVector.add(delegatingNodePop);
                                            delegatingNodePop = 0;
                                        }
                                        mutableVector.add(delegate);
                                    }
                                }
                                delegate = delegate.getChild();
                                delegatingNodePop = delegatingNodePop;
                            }
                            if (i == 1) {
                            }
                        }
                        delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head.getAggregateChildKindSet() & iM12816constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    @Override // androidx.compose.p003ui.layout.LayoutInfo
    @NotNull
    public List<ModifierInfo> getModifierInfo() {
        return this.nodes.getModifierInfo();
    }

    /* renamed from: lookaheadRemeasure-_Sx5XlM$ui_release$default */
    public static /* synthetic */ boolean m12737lookaheadRemeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i, Object obj) {
        if ((i & 1) != 0) {
            constraints = layoutNode.layoutDelegate.m12756getLastLookaheadConstraintsDWUhwKw();
        }
        return layoutNode.m12741lookaheadRemeasure_Sx5XlM$ui_release(constraints);
    }

    /* renamed from: lookaheadRemeasure-_Sx5XlM$ui_release */
    public final boolean m12741lookaheadRemeasure_Sx5XlM$ui_release(@Nullable Constraints constraints) {
        if (constraints == null || this.lookaheadRoot == null) {
            return false;
        }
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
        return lookaheadPassDelegate$ui_release.m12759remeasureBRTryo0(constraints.getValue());
    }

    /* renamed from: remeasure-_Sx5XlM$ui_release$default */
    public static /* synthetic */ boolean m12738remeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i, Object obj) {
        if ((i & 1) != 0) {
            constraints = layoutNode.layoutDelegate.m12755getLastConstraintsDWUhwKw();
        }
        return layoutNode.m12742remeasure_Sx5XlM$ui_release(constraints);
    }

    /* renamed from: remeasure-_Sx5XlM$ui_release */
    public final boolean m12742remeasure_Sx5XlM$ui_release(@Nullable Constraints constraints) {
        if (constraints == null) {
            return false;
        }
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreeIntrinsicsUsage$ui_release();
        }
        return getMeasurePassDelegate$ui_release().m12762remeasureBRTryo0(constraints.getValue());
    }

    public final boolean getMeasurePending$ui_release() {
        return this.layoutDelegate.getMeasurePending();
    }

    public final boolean getLayoutPending$ui_release() {
        return this.layoutDelegate.getLayoutPending();
    }

    public final boolean getLookaheadMeasurePending$ui_release() {
        return this.layoutDelegate.getLookaheadMeasurePending();
    }

    public final boolean getLookaheadLayoutPending$ui_release() {
        return this.layoutDelegate.getLookaheadLayoutPending();
    }

    public final void markLayoutPending$ui_release() {
        this.layoutDelegate.markLayoutPending$ui_release();
    }

    public final void markMeasurePending$ui_release() {
        this.layoutDelegate.markMeasurePending$ui_release();
    }

    public final void markLookaheadLayoutPending$ui_release() {
        this.layoutDelegate.markLookaheadLayoutPending$ui_release();
    }

    public static /* synthetic */ void invalidateSubtree$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        layoutNode.invalidateSubtree(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.ui.Modifier$Node] */
    public final void invalidateSubtree(boolean isRootOfInvalidation) {
        LayoutNode parent$ui_release;
        if (isRootOfInvalidation && (parent$ui_release = getParent$ui_release()) != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
        invalidateSemantics$ui_release();
        requestRemeasure$ui_release$default(this, false, false, 3, null);
        NodeChain nodeChain = this.nodes;
        int iM12816constructorimpl = NodeKind.m12816constructorimpl(2);
        if ((nodeChain.getAggregateChildKindSet() & iM12816constructorimpl) != 0) {
            for (Modifier.Node head = nodeChain.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iM12816constructorimpl) != 0) {
                    DelegatingNode delegatingNodePop = head;
                    MutableVector mutableVector = null;
                    while (delegatingNodePop != 0) {
                        if (delegatingNodePop instanceof LayoutModifierNode) {
                            OwnedLayer layer = DelegatableNodeKt.m12713requireCoordinator64DMado((LayoutModifierNode) delegatingNodePop, NodeKind.m12816constructorimpl(2)).getLayer();
                            if (layer != null) {
                                layer.invalidate();
                            }
                        } else if ((delegatingNodePop.getKindSet() & iM12816constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                            Modifier.Node delegate = delegatingNodePop.getDelegate();
                            int i = 0;
                            delegatingNodePop = delegatingNodePop;
                            while (delegate != null) {
                                if ((delegate.getKindSet() & iM12816constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        delegatingNodePop = delegate;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (delegatingNodePop != 0) {
                                            mutableVector.add(delegatingNodePop);
                                            delegatingNodePop = 0;
                                        }
                                        mutableVector.add(delegate);
                                    }
                                }
                                delegate = delegate.getChild();
                                delegatingNodePop = delegatingNodePop;
                            }
                            if (i == 1) {
                            }
                        }
                        delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head.getAggregateChildKindSet() & iM12816constructorimpl) == 0) {
                    break;
                }
            }
        }
        MutableVector<LayoutNode> mutableVector2 = get_children$ui_release();
        int size = mutableVector2.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector2.getContent();
            int i2 = 0;
            do {
                content[i2].invalidateSubtree(false);
                i2++;
            } while (i2 < size);
        }
    }

    public final void markLookaheadMeasurePending$ui_release() {
        this.layoutDelegate.markLookaheadMeasurePending$ui_release();
    }

    @Override // androidx.compose.p003ui.layout.Remeasurement
    public void forceRemeasure() {
        if (this.lookaheadRoot != null) {
            requestLookaheadRemeasure$ui_release$default(this, false, false, 1, null);
        } else {
            requestRemeasure$ui_release$default(this, false, false, 1, null);
        }
        Constraints constraintsM12755getLastConstraintsDWUhwKw = this.layoutDelegate.m12755getLastConstraintsDWUhwKw();
        if (constraintsM12755getLastConstraintsDWUhwKw != null) {
            Owner owner = this.owner;
            if (owner != null) {
                owner.mo12872measureAndLayout0kLqBqw(this, constraintsM12755getLastConstraintsDWUhwKw.getValue());
                return;
            }
            return;
        }
        Owner owner2 = this.owner;
        if (owner2 != null) {
            Owner.measureAndLayout$default(owner2, false, 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // androidx.compose.ui.node.Owner.OnLayoutCompletedListener
    public void onLayoutComplete() {
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        int iM12816constructorimpl = NodeKind.m12816constructorimpl(128);
        boolean zM12825getIncludeSelfInTraversalH91voCI = NodeKindKt.m12825getIncludeSelfInTraversalH91voCI(iM12816constructorimpl);
        Modifier.Node tail = innerCoordinator$ui_release.getTail();
        if (!zM12825getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return;
        }
        for (Modifier.Node nodeHeadNode = innerCoordinator$ui_release.headNode(zM12825getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & iM12816constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
            if ((nodeHeadNode.getKindSet() & iM12816constructorimpl) != 0) {
                DelegatingNode delegatingNodePop = nodeHeadNode;
                MutableVector mutableVector = null;
                while (delegatingNodePop != 0) {
                    if (delegatingNodePop instanceof LayoutAwareModifierNode) {
                        ((LayoutAwareModifierNode) delegatingNodePop).onPlaced(getInnerCoordinator$ui_release());
                    } else if ((delegatingNodePop.getKindSet() & iM12816constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                        Modifier.Node delegate = delegatingNodePop.getDelegate();
                        int i = 0;
                        delegatingNodePop = delegatingNodePop;
                        while (delegate != null) {
                            if ((delegate.getKindSet() & iM12816constructorimpl) != 0) {
                                i++;
                                if (i == 1) {
                                    delegatingNodePop = delegate;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (delegatingNodePop != 0) {
                                        mutableVector.add(delegatingNodePop);
                                        delegatingNodePop = 0;
                                    }
                                    mutableVector.add(delegate);
                                }
                            }
                            delegate = delegate.getChild();
                            delegatingNodePop = delegatingNodePop;
                        }
                        if (i == 1) {
                        }
                    }
                    delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                }
            }
            if (nodeHeadNode == tail) {
                return;
            }
        }
    }

    public final void forEachCoordinator$ui_release(@NotNull Function1<? super LayoutModifierNodeCoordinator, Unit> block) {
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
            Intrinsics.checkNotNull(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
            block.invoke(layoutModifierNodeCoordinator);
            outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped();
        }
    }

    public final void forEachCoordinatorIncludingInner$ui_release(@NotNull Function1<? super NodeCoordinator, Unit> block) {
        NodeCoordinator wrapped = getInnerCoordinator$ui_release().getWrapped();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
            block.invoke(outerCoordinator$ui_release);
        }
    }

    private final boolean shouldInvalidateParentLayer() {
        if (this.nodes.m12779hasH91voCI$ui_release(NodeKind.m12816constructorimpl(4)) && !this.nodes.m12779hasH91voCI$ui_release(NodeKind.m12816constructorimpl(2))) {
            return true;
        }
        for (Modifier.Node head = this.nodes.getHead(); head != null; head = head.getChild()) {
            if ((NodeKind.m12816constructorimpl(2) & head.getKindSet()) != 0 && DelegatableNodeKt.m12713requireCoordinator64DMado(head, NodeKind.m12816constructorimpl(2)).getLayer() != null) {
                return false;
            }
            if ((NodeKind.m12816constructorimpl(4) & head.getKindSet()) != 0) {
                return true;
            }
        }
        return true;
    }

    public final void clearSubtreeIntrinsicsUsage$ui_release() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = content[i];
                if (layoutNode.intrinsicsUsageByParent != UsageByParent.NotUsed) {
                    layoutNode.clearSubtreeIntrinsicsUsage$ui_release();
                }
                i++;
            } while (i < size);
        }
    }

    private final void clearSubtreePlacementIntrinsicsUsage() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = content[i];
                if (layoutNode.intrinsicsUsageByParent == UsageByParent.InLayoutBlock) {
                    layoutNode.clearSubtreePlacementIntrinsicsUsage();
                }
                i++;
            } while (i < size);
        }
    }

    @Override // androidx.compose.p003ui.layout.LayoutInfo
    @Nullable
    public LayoutInfo getParentInfo() {
        return getParent$ui_release();
    }

    @Override // androidx.compose.p003ui.layout.LayoutInfo
    /* renamed from: isDeactivated, reason: from getter */
    public boolean getIsDeactivated() {
        return this.isDeactivated;
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        if (!isAttached()) {
            throw new IllegalArgumentException("onReuse is only expected on attached node".toString());
        }
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onReuse();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.onReuse();
        }
        if (getIsDeactivated()) {
            this.isDeactivated = false;
            invalidateSemantics$ui_release();
        } else {
            resetModifierState();
        }
        setSemanticsId(SemanticsModifierKt.generateSemanticsId());
        this.nodes.markAsAttached();
        this.nodes.runAttachLifecycle();
        rescheduleRemeasureOrRelayout$ui_release(this);
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onDeactivate();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.onDeactivate();
        }
        this.isDeactivated = true;
        resetModifierState();
        if (isAttached()) {
            invalidateSemantics$ui_release();
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onRelease();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.onRelease();
        }
        NodeCoordinator wrapped = getInnerCoordinator$ui_release().getWrapped();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
            outerCoordinator$ui_release.onRelease();
        }
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(m7104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0080T¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m7105d2 = {"Landroidx/compose/ui/node/LayoutNode$Companion;", "", "()V", "Constructor", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", "getConstructor$ui_release", "()Lkotlin/jvm/functions/Function0;", "DummyViewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getDummyViewConfiguration$ui_release", "()Landroidx/compose/ui/platform/ViewConfiguration;", "ErrorMeasurePolicy", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "NotPlacedPlaceOrder", "", "ZComparator", "Ljava/util/Comparator;", "getZComparator$ui_release", "()Ljava/util/Comparator;", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final Function0<LayoutNode> getConstructor$ui_release() {
            return LayoutNode.Constructor;
        }

        @NotNull
        public final ViewConfiguration getDummyViewConfiguration$ui_release() {
            return LayoutNode.DummyViewConfiguration;
        }

        @NotNull
        public final Comparator<LayoutNode> getZComparator$ui_release() {
            return LayoutNode.ZComparator;
        }
    }

    public static final int ZComparator$lambda$39(LayoutNode layoutNode, LayoutNode layoutNode2) {
        if (layoutNode.getZIndex() == layoutNode2.getZIndex()) {
            return Intrinsics.compare(layoutNode.getPlaceOrder$ui_release(), layoutNode2.getPlaceOrder$ui_release());
        }
        return Float.compare(layoutNode.getZIndex(), layoutNode2.getZIndex());
    }

    public final void invalidateLayers$ui_release() {
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
            Intrinsics.checkNotNull(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
            OwnedLayer layer = layoutModifierNodeCoordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
            outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped();
        }
        OwnedLayer layer2 = getInnerCoordinator$ui_release().getLayer();
        if (layer2 != null) {
            layer2.invalidate();
        }
    }

    public final void resetSubtreeIntrinsicsUsage$ui_release() {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = content[i];
                UsageByParent usageByParent = layoutNode.previousIntrinsicsUsageByParent;
                layoutNode.intrinsicsUsageByParent = usageByParent;
                if (usageByParent != UsageByParent.NotUsed) {
                    layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
                }
                i++;
            } while (i < size);
        }
    }
}
