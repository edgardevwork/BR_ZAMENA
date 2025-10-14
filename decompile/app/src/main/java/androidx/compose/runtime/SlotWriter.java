package androidx.compose.runtime;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SlotTable.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\bA\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 ¯\u00012\u00020\u0001:\u0002¯\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\nJ\u0010\u00109\u001a\u00020\u00072\b\b\u0002\u0010:\u001a\u00020\nJ\u000e\u0010;\u001a\u00020\n2\u0006\u00109\u001a\u00020\u0007J\u0006\u0010<\u001a\u000207J\u0006\u0010=\u001a\u000207J\u0010\u0010>\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020\nH\u0002J\b\u0010@\u001a\u000207H\u0002J\u0006\u0010A\u001a\u000207J\u0010\u0010B\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020\nH\u0002J\u0010\u0010C\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020\nH\u0002J \u0010D\u001a\u00020\n2\u0006\u00109\u001a\u00020\n2\u0006\u0010E\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010F\u001a\u00020\n2\u0006\u0010:\u001a\u00020\nH\u0002J\u0010\u0010G\u001a\u00020\n2\u0006\u0010F\u001a\u00020\nH\u0002J(\u0010H\u001a\u00020\n2\u0006\u0010:\u001a\u00020\n2\u0006\u0010I\u001a\u00020\n2\u0006\u0010E\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0006\u0010J\u001a\u00020\nJ\u0006\u0010K\u001a\u000207J\u000e\u0010L\u001a\u0002072\u0006\u00109\u001a\u00020\u0007J\u000e\u0010L\u001a\u0002072\u0006\u0010:\u001a\u00020\nJ \u0010M\u001a\u0002072\u0006\u0010#\u001a\u00020\n2\u0006\u0010J\u001a\u00020\n2\u0006\u0010N\u001a\u00020\nH\u0002JK\u0010O\u001a\u0002072\u0006\u0010?\u001a\u00020\n28\u0010P\u001a4\u0012\u0013\u0012\u00110\n¢\u0006\f\bR\u0012\b\bS\u0012\u0004\b\b(:\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\bR\u0012\b\bS\u0012\u0004\b\b(T\u0012\u0004\u0012\u0002070QH\u0086\bJ\u0010\u0010U\u001a\u0004\u0018\u00010\u00012\u0006\u0010:\u001a\u00020\nJ\u0010\u0010V\u001a\u00020\n2\u0006\u0010:\u001a\u00020\nH\u0002J\u000e\u0010W\u001a\u00020\n2\u0006\u0010:\u001a\u00020\nJ\u0010\u0010X\u001a\u0004\u0018\u00010\u00012\u0006\u0010:\u001a\u00020\nJ\u000e\u0010Y\u001a\u00020\n2\u0006\u0010:\u001a\u00020\nJ\u000e\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010[J\u001a\u0010\\\u001a\u0002012\u0006\u0010#\u001a\u00020\n2\b\u0010]\u001a\u0004\u0018\u00010^H\u0002J\u0006\u0010_\u001a\u00020^J\u000e\u0010`\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\nJ\u0016\u0010a\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\n2\u0006\u0010?\u001a\u00020\nJ\u000e\u0010b\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\nJ\u0010\u0010c\u001a\u0002072\b\u0010d\u001a\u0004\u0018\u00010\u0001J\u0010\u0010e\u001a\u0002072\u0006\u0010'\u001a\u00020\nH\u0002J\u0018\u0010f\u001a\u0002072\u0006\u0010'\u001a\u00020\n2\u0006\u0010?\u001a\u00020\nH\u0002J\u000e\u0010 \u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\nJ\u000e\u0010g\u001a\b\u0012\u0004\u0012\u00020\n0hH\u0002J\u0010\u0010i\u001a\u0002072\b\b\u0002\u0010?\u001a\u00020\nJ \u0010j\u001a\u0002072\u0006\u0010k\u001a\u00020\n2\u0006\u0010l\u001a\u00020\n2\u0006\u0010'\u001a\u00020\nH\u0002J&\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00070h2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\n2\b\b\u0002\u0010n\u001a\u00020\u000eJ\u000e\u0010o\u001a\u0002072\u0006\u0010p\u001a\u00020\nJ\u0010\u0010q\u001a\u0002072\u0006\u0010:\u001a\u00020\nH\u0002J$\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00070h2\u0006\u0010p\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\nJ\u0018\u0010s\u001a\u0002072\u0006\u0010:\u001a\u00020\n2\u0006\u0010?\u001a\u00020\nH\u0002J$\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00070h2\u0006\u00109\u001a\u00020\u00072\u0006\u0010p\u001a\u00020\n2\u0006\u0010u\u001a\u00020\u0000J\u0010\u0010v\u001a\u0004\u0018\u00010\u00012\u0006\u00109\u001a\u00020\u0007J\u0010\u0010v\u001a\u0004\u0018\u00010\u00012\u0006\u0010:\u001a\u00020\nJ\u000e\u0010!\u001a\u00020\n2\u0006\u0010:\u001a\u00020\nJ\u000e\u0010#\u001a\u00020\n2\u0006\u00109\u001a\u00020\u0007J\u000e\u0010#\u001a\u00020\n2\u0006\u0010:\u001a\u00020\nJ\u0010\u0010w\u001a\u00020\n2\u0006\u0010:\u001a\u00020\nH\u0002J\u0018\u0010x\u001a\u00020\n2\u0006\u0010:\u001a\u00020\n2\u0006\u0010I\u001a\u00020\nH\u0002J\b\u0010y\u001a\u000207H\u0002J\u000e\u0010z\u001a\u0002072\u0006\u0010]\u001a\u00020^J\u0006\u0010{\u001a\u000207J\u0016\u0010|\u001a\u0002072\u0006\u0010}\u001a\u00020\n2\u0006\u0010d\u001a\u00020^J@\u0010~\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020\n2\u0006\u0010'\u001a\u00020\n2&\u0010/\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u000201\u0018\u000100j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u000201\u0018\u0001`2H\u0002J\u0006\u0010\u007f\u001a\u00020\u000eJ\u001b\u0010\u0080\u0001\u001a\u00020\u000e2\u0007\u0010\u0081\u0001\u001a\u00020\n2\u0007\u0010\u0082\u0001\u001a\u00020\nH\u0002J#\u0010\u0083\u0001\u001a\u0002072\u0007\u0010\u0081\u0001\u001a\u00020\n2\u0007\u0010\u0082\u0001\u001a\u00020\n2\u0006\u0010?\u001a\u00020\nH\u0002J\u0007\u0010\u0084\u0001\u001a\u000207J\t\u0010\u0085\u0001\u001a\u00020\nH\u0002J\t\u0010\u0086\u0001\u001a\u000207H\u0002J\u000f\u0010\u0087\u0001\u001a\u0002072\u0006\u00109\u001a\u00020\u0007J\u0011\u0010\u0088\u0001\u001a\u0002072\b\u0010d\u001a\u0004\u0018\u00010\u0001J\u001b\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010:\u001a\u00020\n2\b\u0010d\u001a\u0004\u0018\u00010\u0001J#\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010?\u001a\u00020\n2\u0006\u0010:\u001a\u00020\n2\b\u0010d\u001a\u0004\u0018\u00010\u0001J\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0001J\u0007\u0010\u008a\u0001\u001a\u00020\nJ\u0007\u0010\u008b\u0001\u001a\u000207J\u0019\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\nJ\u001a\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00012\u0007\u0010\u008d\u0001\u001a\u00020\n2\u0006\u0010:\u001a\u00020\nJ\u0013\u0010\u008e\u0001\u001a\u0004\u0018\u0001012\u0006\u0010?\u001a\u00020\nH\u0002J\u001a\u0010\u008f\u0001\u001a\u0002072\u0006\u0010}\u001a\u00020\n2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0001J%\u0010\u008f\u0001\u001a\u0002072\u0006\u0010}\u001a\u00020\n2\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00012\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0001J\u0007\u0010\u0092\u0001\u001a\u000207J\u000f\u0010\u0092\u0001\u001a\u0002072\u0006\u0010}\u001a\u00020\nJ\u001a\u0010\u0092\u0001\u001a\u0002072\u0006\u0010}\u001a\u00020\n2\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0001J/\u0010\u0092\u0001\u001a\u0002072\u0006\u0010}\u001a\u00020\n2\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010 \u001a\u00020\u000e2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0001H\u0002J\u001a\u0010\u0094\u0001\u001a\u0002072\u0006\u0010}\u001a\u00020\n2\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0001J$\u0010\u0094\u0001\u001a\u0002072\u0006\u0010}\u001a\u00020\n2\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010v\u001a\u0004\u0018\u00010\u0001J\t\u0010\u0095\u0001\u001a\u00020^H\u0016J\u0019\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00072\u0006\u0010?\u001a\u00020\nH\u0000¢\u0006\u0003\b\u0097\u0001J\u0013\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010d\u001a\u0004\u0018\u00010\u0001J\u001b\u0010\u0099\u0001\u001a\u0002072\u0007\u0010\u009a\u0001\u001a\u00020\n2\u0007\u0010\u009b\u0001\u001a\u00020\nH\u0002J\u0011\u0010\u009c\u0001\u001a\u0002072\b\u0010d\u001a\u0004\u0018\u00010\u0001J\u0011\u0010\u009d\u0001\u001a\u0002072\u0006\u0010?\u001a\u00020\nH\u0002J\u001a\u0010\u009e\u0001\u001a\u0002072\u0006\u0010?\u001a\u00020\n2\u0007\u0010\u0088\u0001\u001a\u00020&H\u0002J\u0019\u0010\u009f\u0001\u001a\u0002072\u0006\u00109\u001a\u00020\u00072\b\u0010d\u001a\u0004\u0018\u00010\u0001J\u0011\u0010\u009f\u0001\u001a\u0002072\b\u0010d\u001a\u0004\u0018\u00010\u0001J\u001b\u0010 \u0001\u001a\u0002072\u0006\u0010:\u001a\u00020\n2\b\u0010d\u001a\u0004\u0018\u00010\u0001H\u0002J\u0011\u0010¡\u0001\u001a\u0002072\b\u0010d\u001a\u0004\u0018\u00010\u0001J\u000f\u0010¢\u0001\u001a\u000207H\u0000¢\u0006\u0003\b£\u0001J\u000f\u0010¤\u0001\u001a\u000207H\u0000¢\u0006\u0003\b¥\u0001J\u0016\u0010¦\u0001\u001a\u00020\n*\u00020\u001d2\u0007\u0010§\u0001\u001a\u00020\nH\u0002J\u0015\u0010F\u001a\u00020\n*\u00020\u001d2\u0007\u0010§\u0001\u001a\u00020\nH\u0002J\u0013\u0010¨\u0001\u001a\b\u0012\u0004\u0012\u00020\n0h*\u00020\u001dH\u0002J\u001b\u0010©\u0001\u001a\u000207*\b0ª\u0001j\u0003`«\u00012\u0006\u0010:\u001a\u00020\nH\u0002J\u0016\u0010¬\u0001\u001a\u00020\n*\u00020\u001d2\u0007\u0010§\u0001\u001a\u00020\nH\u0002J\u0014\u0010#\u001a\u00020\n*\u00020\u001d2\u0006\u0010:\u001a\u00020\nH\u0002J\u0016\u0010\u00ad\u0001\u001a\u00020\n*\u00020\u001d2\u0007\u0010§\u0001\u001a\u00020\nH\u0002J\u001e\u0010®\u0001\u001a\u000207*\u00020\u001d2\u0007\u0010§\u0001\u001a\u00020\n2\u0006\u0010F\u001a\u00020\nH\u0002R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u001e\u0010\u0014\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\fR\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0011R\u0011\u0010 \u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b \u0010\u0011R\u000e\u0010!\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010#\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\fR\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\fR\u0018\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010*X\u0082\u000e¢\u0006\u0004\n\u0002\u0010+R\u000e\u0010,\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010/\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u000201\u0018\u000100j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u000201\u0018\u0001`2X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u0006°\u0001"}, m7105d2 = {"Landroidx/compose/runtime/SlotWriter;", "", "table", "Landroidx/compose/runtime/SlotTable;", "(Landroidx/compose/runtime/SlotTable;)V", "anchors", "Ljava/util/ArrayList;", "Landroidx/compose/runtime/Anchor;", "Lkotlin/collections/ArrayList;", "capacity", "", "getCapacity", "()I", "<set-?>", "", "closed", "getClosed", "()Z", "currentGroup", "getCurrentGroup", "currentGroupEnd", "getCurrentGroupEnd", "currentSlot", "currentSlotEnd", "endStack", "Landroidx/compose/runtime/IntStack;", "groupGapLen", "groupGapStart", "groups", "", "insertCount", "isGroupEnd", "isNode", "nodeCount", "nodeCountStack", "parent", "getParent", "pendingRecalculateMarks", "Landroidx/compose/runtime/PrioritySet;", "size", "getSize$runtime_release", "slots", "", "[Ljava/lang/Object;", "slotsGapLen", "slotsGapOwner", "slotsGapStart", "sourceInformationMap", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/HashMap;", "startStack", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "advanceBy", "", "amount", LinkHeader.Parameters.Anchor, FirebaseAnalytics.Param.INDEX, "anchorIndex", "bashCurrentGroup", "beginInsert", "childContainsAnyMarks", "group", "clearSlotGap", "close", "containsAnyGroupMarks", "containsGroupMark", "dataAnchorToDataIndex", "gapLen", "dataIndex", "dataIndexToDataAddress", "dataIndexToDataAnchor", "gapStart", "endGroup", "endInsert", "ensureStarted", "fixParentAnchorsFor", "firstChild", "forEachData", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "data", "groupAux", "groupIndexToAddress", "groupKey", "groupObjectKey", "groupSize", "groupSlots", "", "groupSourceInformationFor", "sourceInformation", "", "groupsAsString", "indexInCurrentGroup", "indexInGroup", "indexInParent", "insertAux", "value", "insertGroups", "insertSlots", "keys", "", "markGroup", "moveAnchors", "originalLocation", "newLocation", "moveFrom", "removeSourceGroup", "moveGroup", TypedValues.CycleType.S_WAVE_OFFSET, "moveGroupGapTo", "moveIntoGroupFrom", "moveSlotGapTo", "moveTo", "writer", "node", "parentAnchorToIndex", "parentIndexToAnchor", "recalculateMarks", "recordGroupSourceInformation", "recordGrouplessCallSourceInformationEnd", "recordGrouplessCallSourceInformationStart", "key", "removeAnchors", "removeGroup", "removeGroups", TtmlNode.START, "len", "removeSlots", "reset", "restoreCurrentGroupEnd", "saveCurrentGroupEnd", "seek", "set", "skip", "skipGroup", "skipToGroupEnd", "slot", "groupIndex", "sourceInformationOf", "startData", "aux", "objectKey", "startGroup", "dataKey", "startNode", "toString", "tryAnchor", "tryAnchor$runtime_release", "update", "updateAnchors", "previousGapStart", "newGapStart", "updateAux", "updateContainsMark", "updateContainsMarkNow", "updateNode", "updateNodeOfGroup", "updateParentNode", "verifyDataAnchors", "verifyDataAnchors$runtime_release", "verifyParentAnchors", "verifyParentAnchors$runtime_release", "auxIndex", "address", "dataIndexes", "groupAsString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "nodeIndex", "slotIndex", "updateDataIndex", "Companion", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 6 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 7 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3745:1\n4178#2,5:3746\n4178#2,5:3751\n4178#2,5:3756\n4178#2,5:3761\n4178#2,5:3774\n4178#2,5:3779\n4178#2,5:3784\n4178#2,5:3789\n4178#2,5:3794\n4178#2,5:3799\n4178#2,5:3804\n4178#2,5:3809\n4178#2,5:3814\n4178#2,5:3819\n4178#2,5:3824\n4178#2,5:3829\n4178#2,5:3834\n4178#2,5:3839\n4178#2,5:3866\n4178#2,5:3871\n4178#2,5:3876\n1#3:3766\n361#4,7:3767\n166#5,8:3844\n166#5,8:3852\n3616#6,6:3860\n33#7,6:3881\n82#7,3:3887\n33#7,4:3890\n85#7,2:3894\n38#7:3896\n87#7:3897\n231#7,3:3898\n64#7,4:3901\n234#7,2:3905\n69#7:3907\n236#7:3908\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n*L\n1526#1:3746,5\n1550#1:3751,5\n1563#1:3756,5\n1566#1:3761,5\n1649#1:3774,5\n1670#1:3779,5\n1717#1:3784,5\n1722#1:3789,5\n1762#1:3794,5\n1773#1:3799,5\n1903#1:3804,5\n1967#1:3809,5\n1972#1:3814,5\n2004#1:3819,5\n2064#1:3824,5\n2065#1:3829,5\n2078#1:3834,5\n2172#1:3839,5\n2735#1:3866,5\n2747#1:3871,5\n2957#1:3876,5\n1611#1:3767,7\n2479#1:3844,8\n2520#1:3852,8\n2540#1:3860,6\n3058#1:3881,6\n3228#1:3887,3\n3228#1:3890,4\n3228#1:3894,2\n3228#1:3896\n3228#1:3897\n3231#1:3898,3\n3231#1:3901,4\n3231#1:3905,2\n3231#1:3907\n3231#1:3908\n*E\n"})
/* loaded from: classes.dex */
public final class SlotWriter {

    @NotNull
    private ArrayList<Anchor> anchors;
    private boolean closed;
    private int currentGroup;
    private int currentGroupEnd;
    private int currentSlot;
    private int currentSlotEnd;
    private int groupGapLen;
    private int groupGapStart;

    @NotNull
    private int[] groups;
    private int insertCount;
    private int nodeCount;

    @Nullable
    private PrioritySet pendingRecalculateMarks;

    @NotNull
    private Object[] slots;
    private int slotsGapLen;
    private int slotsGapOwner;
    private int slotsGapStart;

    @Nullable
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;

    @NotNull
    private final SlotTable table;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private final IntStack startStack = new IntStack();

    @NotNull
    private final IntStack endStack = new IntStack();

    @NotNull
    private final IntStack nodeCountStack = new IntStack();
    private int parent = -1;

    private final int dataAnchorToDataIndex(int i, int gapLen, int capacity) {
        return i < 0 ? (capacity - gapLen) + i + 1 : i;
    }

    public final int dataIndexToDataAnchor(int i, int gapStart, int gapLen, int capacity) {
        return i > gapStart ? -(((capacity - gapLen) - i) + 1) : i;
    }

    public SlotWriter(@NotNull SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        this.slots = slotTable.getSlots();
        this.anchors = slotTable.getAnchors$runtime_release();
        this.sourceInformationMap = slotTable.getSourceInformationMap$runtime_release();
        this.groupGapStart = slotTable.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - slotTable.getGroupsSize();
        this.slotsGapStart = slotTable.getSlotsSize();
        this.slotsGapLen = this.slots.length - slotTable.getSlotsSize();
        this.slotsGapOwner = slotTable.getGroupsSize();
        this.currentGroupEnd = slotTable.getGroupsSize();
    }

    @NotNull
    /* renamed from: getTable$runtime_release, reason: from getter */
    public final SlotTable getTable() {
        return this.table;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getCurrentGroupEnd() {
        return this.currentGroupEnd;
    }

    public final boolean isGroupEnd() {
        return this.currentGroup == this.currentGroupEnd;
    }

    public final boolean isNode() {
        int i = this.currentGroup;
        return i < this.currentGroupEnd && SlotTableKt.isNode(this.groups, groupIndexToAddress(i));
    }

    public final boolean isNode(int i) {
        return SlotTableKt.isNode(this.groups, groupIndexToAddress(i));
    }

    public final int nodeCount(int i) {
        return SlotTableKt.nodeCount(this.groups, groupIndexToAddress(i));
    }

    public final int groupKey(int i) {
        return SlotTableKt.key(this.groups, groupIndexToAddress(i));
    }

    @Nullable
    public final Object groupObjectKey(int i) {
        int iGroupIndexToAddress = groupIndexToAddress(i);
        if (SlotTableKt.hasObjectKey(this.groups, iGroupIndexToAddress)) {
            return this.slots[SlotTableKt.objectKeyIndex(this.groups, iGroupIndexToAddress)];
        }
        return null;
    }

    public final int groupSize(int i) {
        return SlotTableKt.groupSize(this.groups, groupIndexToAddress(i));
    }

    @Nullable
    public final Object groupAux(int i) {
        int iGroupIndexToAddress = groupIndexToAddress(i);
        return SlotTableKt.hasAux(this.groups, iGroupIndexToAddress) ? this.slots[auxIndex(this.groups, iGroupIndexToAddress)] : Composer.INSTANCE.getEmpty();
    }

    public final boolean indexInParent(int i) {
        int i2 = this.parent;
        return (i > i2 && i < this.currentGroupEnd) || (i2 == 0 && i == 0);
    }

    public final boolean indexInCurrentGroup(int i) {
        return indexInGroup(i, this.currentGroup);
    }

    public final boolean indexInGroup(int i, int group) {
        int iIndexOf;
        int capacity;
        if (group == this.parent) {
            capacity = this.currentGroupEnd;
        } else if (group > this.startStack.peekOr(0) || (iIndexOf = this.startStack.indexOf(group)) < 0) {
            int iGroupSize = groupSize(group);
            capacity = iGroupSize + group;
        } else {
            capacity = (getCapacity() - this.groupGapLen) - this.endStack.peek(iIndexOf);
        }
        return i > group && i < capacity;
    }

    @Nullable
    public final Object node(int i) {
        int iGroupIndexToAddress = groupIndexToAddress(i);
        if (SlotTableKt.isNode(this.groups, iGroupIndexToAddress)) {
            return this.slots[dataIndexToDataAddress(nodeIndex(this.groups, iGroupIndexToAddress))];
        }
        return null;
    }

    @Nullable
    public final Object node(@NotNull Anchor anchor) {
        return node(anchor.toIndexFor(this));
    }

    public final int getParent() {
        return this.parent;
    }

    public final int parent(int i) {
        return parent(this.groups, i);
    }

    public final int parent(@NotNull Anchor anchor) {
        if (anchor.getValid()) {
            return parent(this.groups, anchorIndex(anchor));
        }
        return -1;
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final void close() {
        this.closed = true;
        if (this.startStack.isEmpty()) {
            moveGroupGapTo(getSize$runtime_release());
            moveSlotGapTo(this.slots.length - this.slotsGapLen, this.groupGapStart);
            clearSlotGap();
            recalculateMarks();
        }
        this.table.close$runtime_release(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors, this.sourceInformationMap);
    }

    public final void reset() {
        if (this.insertCount == 0) {
            recalculateMarks();
            this.currentGroup = 0;
            this.currentGroupEnd = getCapacity() - this.groupGapLen;
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
            this.nodeCount = 0;
            return;
        }
        ComposerKt.composeRuntimeError("Cannot reset when inserting".toString());
        throw new KotlinNothingValueException();
    }

    @Nullable
    public final Object update(@Nullable Object value) {
        Object objSkip = skip();
        set(value);
        return objSkip;
    }

    public final void updateAux(@Nullable Object value) {
        int iGroupIndexToAddress = groupIndexToAddress(this.currentGroup);
        if (SlotTableKt.hasAux(this.groups, iGroupIndexToAddress)) {
            this.slots[dataIndexToDataAddress(auxIndex(this.groups, iGroupIndexToAddress))] = value;
        } else {
            ComposerKt.composeRuntimeError("Updating the data of a group that was not created with a data slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final void insertAux(@Nullable Object value) {
        if (this.insertCount >= 0) {
            int i = this.parent;
            int iGroupIndexToAddress = groupIndexToAddress(i);
            if (!SlotTableKt.hasAux(this.groups, iGroupIndexToAddress)) {
                insertSlots(1, i);
                int iAuxIndex = auxIndex(this.groups, iGroupIndexToAddress);
                int iDataIndexToDataAddress = dataIndexToDataAddress(iAuxIndex);
                int i2 = this.currentSlot;
                if (i2 > iAuxIndex) {
                    int i3 = i2 - iAuxIndex;
                    if (i3 >= 3) {
                        throw new IllegalStateException("Moving more than two slot not supported".toString());
                    }
                    if (i3 > 1) {
                        Object[] objArr = this.slots;
                        objArr[iDataIndexToDataAddress + 2] = objArr[iDataIndexToDataAddress + 1];
                    }
                    Object[] objArr2 = this.slots;
                    objArr2[iDataIndexToDataAddress + 1] = objArr2[iDataIndexToDataAddress];
                }
                SlotTableKt.addAux(this.groups, iGroupIndexToAddress);
                this.slots[iDataIndexToDataAddress] = value;
                this.currentSlot++;
                return;
            }
            ComposerKt.composeRuntimeError("Group already has auxiliary data".toString());
            throw new KotlinNothingValueException();
        }
        ComposerKt.composeRuntimeError("Cannot insert auxiliary data when not inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final void recordGroupSourceInformation(@NotNull String sourceInformation) {
        if (this.insertCount > 0) {
            groupSourceInformationFor(this.parent, sourceInformation);
        }
    }

    public final void recordGrouplessCallSourceInformationStart(int key, @NotNull String value) {
        if (this.insertCount > 0) {
            groupSourceInformationFor(this.parent, null).startGrouplessCall(key, value);
        }
    }

    public final void recordGrouplessCallSourceInformationEnd() {
        if (this.insertCount > 0) {
            groupSourceInformationFor(this.parent, null).endGrouplessCall();
        }
    }

    private final GroupSourceInformation groupSourceInformationFor(int parent, String sourceInformation) {
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        if (map == null) {
            map = new HashMap<>();
        }
        this.sourceInformationMap = map;
        Anchor anchor = anchor(parent);
        GroupSourceInformation groupSourceInformation = map.get(anchor);
        if (groupSourceInformation == null) {
            groupSourceInformation = new GroupSourceInformation(0, sourceInformation);
            if (sourceInformation == null) {
                int iGroupSize = parent + 1;
                int i = this.currentGroup;
                while (iGroupSize < i) {
                    groupSourceInformation.reportGroup(this, iGroupSize);
                    iGroupSize += SlotTableKt.groupSize(this.groups, iGroupSize);
                }
            }
            map.put(anchor, groupSourceInformation);
        }
        return groupSourceInformation;
    }

    public final void updateNode(@Nullable Object value) {
        updateNodeOfGroup(this.currentGroup, value);
    }

    public final void updateNode(@NotNull Anchor anchor, @Nullable Object value) {
        updateNodeOfGroup(anchor.toIndexFor(this), value);
    }

    public final void updateParentNode(@Nullable Object value) {
        updateNodeOfGroup(this.parent, value);
    }

    public final void set(@Nullable Object value) {
        int i = this.currentSlot;
        if (i <= this.currentSlotEnd) {
            this.slots[dataIndexToDataAddress(i - 1)] = value;
        } else {
            ComposerKt.composeRuntimeError("Writing to an invalid slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    @Nullable
    public final Object set(int i, @Nullable Object value) {
        return set(this.currentGroup, i, value);
    }

    @Nullable
    public final Object set(int group, int i, @Nullable Object value) {
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(group));
        int i2 = iSlotIndex + i;
        if (!(i2 >= iSlotIndex && i2 < dataIndex(this.groups, groupIndexToAddress(group + 1)))) {
            ComposerKt.composeRuntimeError(("Write to an invalid slot index " + i + " for group " + group).toString());
            throw new KotlinNothingValueException();
        }
        int iDataIndexToDataAddress = dataIndexToDataAddress(i2);
        Object[] objArr = this.slots;
        Object obj = objArr[iDataIndexToDataAddress];
        objArr[iDataIndexToDataAddress] = value;
        return obj;
    }

    @Nullable
    public final Object skip() {
        if (this.insertCount > 0) {
            insertSlots(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i = this.currentSlot;
        this.currentSlot = i + 1;
        return objArr[dataIndexToDataAddress(i)];
    }

    @Nullable
    public final Object slot(@NotNull Anchor anchor, int i) {
        return slot(anchorIndex(anchor), i);
    }

    @Nullable
    public final Object slot(int groupIndex, int i) {
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(groupIndex));
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(groupIndex + 1));
        int i2 = i + iSlotIndex;
        if (iSlotIndex > i2 || i2 >= iDataIndex) {
            return Composer.INSTANCE.getEmpty();
        }
        return this.slots[dataIndexToDataAddress(i2)];
    }

    public final void advanceBy(int amount) {
        boolean z = false;
        if (amount >= 0) {
            if (this.insertCount > 0) {
                throw new IllegalStateException("Cannot call seek() while inserting".toString());
            }
            if (amount == 0) {
                return;
            }
            int i = this.currentGroup + amount;
            if (i >= this.parent && i <= this.currentGroupEnd) {
                z = true;
            }
            if (!z) {
                ComposerKt.composeRuntimeError(("Cannot seek outside the current group (" + this.parent + '-' + this.currentGroupEnd + ')').toString());
                throw new KotlinNothingValueException();
            }
            this.currentGroup = i;
            int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i));
            this.currentSlot = iDataIndex;
            this.currentSlotEnd = iDataIndex;
            return;
        }
        ComposerKt.composeRuntimeError("Cannot seek backwards".toString());
        throw new KotlinNothingValueException();
    }

    public final void seek(@NotNull Anchor anchor) {
        advanceBy(anchor.toIndexFor(this) - this.currentGroup);
    }

    public final void skipToGroupEnd() {
        int i = this.currentGroupEnd;
        this.currentGroup = i;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i));
    }

    public final void beginInsert() {
        int i = this.insertCount;
        this.insertCount = i + 1;
        if (i == 0) {
            saveCurrentGroupEnd();
        }
    }

    public final void endInsert() {
        int i = this.insertCount;
        if (i <= 0) {
            throw new IllegalStateException("Unbalanced begin/end insert".toString());
        }
        int i2 = i - 1;
        this.insertCount = i2;
        if (i2 == 0) {
            if (this.nodeCountStack.getTos() == this.startStack.getTos()) {
                restoreCurrentGroupEnd();
            } else {
                ComposerKt.composeRuntimeError("startGroup/endGroup mismatch while inserting".toString());
                throw new KotlinNothingValueException();
            }
        }
    }

    public final void startGroup() {
        if (this.insertCount == 0) {
            Composer.Companion companion = Composer.INSTANCE;
            startGroup(0, companion.getEmpty(), false, companion.getEmpty());
        } else {
            ComposerKt.composeRuntimeError("Key must be supplied when inserting".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final void startGroup(int key) {
        Composer.Companion companion = Composer.INSTANCE;
        startGroup(key, companion.getEmpty(), false, companion.getEmpty());
    }

    public final void startGroup(int key, @Nullable Object dataKey) {
        startGroup(key, dataKey, false, Composer.INSTANCE.getEmpty());
    }

    public final void startNode(int key, @Nullable Object objectKey) {
        startGroup(key, objectKey, true, Composer.INSTANCE.getEmpty());
    }

    public final void startNode(int key, @Nullable Object objectKey, @Nullable Object node) {
        startGroup(key, objectKey, true, node);
    }

    public final void startData(int key, @Nullable Object objectKey, @Nullable Object aux) {
        startGroup(key, objectKey, false, aux);
    }

    public final void startData(int key, @Nullable Object aux) {
        startGroup(key, Composer.INSTANCE.getEmpty(), false, aux);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startGroup(int key, Object objectKey, boolean isNode, Object aux) {
        int iGroupSize;
        GroupSourceInformation groupSourceInformationSourceInformationOf;
        int i = this.parent;
        byte b = this.insertCount > 0;
        this.nodeCountStack.push(this.nodeCount);
        if (b != false) {
            insertGroups(1);
            int i2 = this.currentGroup;
            int iGroupIndexToAddress = groupIndexToAddress(i2);
            Composer.Companion companion = Composer.INSTANCE;
            int i3 = objectKey != companion.getEmpty() ? 1 : 0;
            int i4 = (isNode || aux == companion.getEmpty()) ? 0 : 1;
            SlotTableKt.initGroup(this.groups, iGroupIndexToAddress, key, isNode, i3, i4, this.parent, this.currentSlot);
            this.currentSlotEnd = this.currentSlot;
            int i5 = (isNode ? 1 : 0) + i3 + i4;
            if (i5 > 0) {
                insertSlots(i5, i2);
                Object[] objArr = this.slots;
                int i6 = this.currentSlot;
                if (isNode) {
                    objArr[i6] = aux;
                    i6++;
                }
                if (i3 != 0) {
                    objArr[i6] = objectKey;
                    i6++;
                }
                if (i4 != 0) {
                    objArr[i6] = aux;
                    i6++;
                }
                this.currentSlot = i6;
            }
            this.nodeCount = 0;
            iGroupSize = i2 + 1;
            this.parent = i2;
            this.currentGroup = iGroupSize;
            if (i >= 0 && (groupSourceInformationSourceInformationOf = sourceInformationOf(i)) != null) {
                groupSourceInformationSourceInformationOf.reportGroup(this, i2);
            }
        } else {
            this.startStack.push(i);
            saveCurrentGroupEnd();
            int i7 = this.currentGroup;
            int iGroupIndexToAddress2 = groupIndexToAddress(i7);
            if (!Intrinsics.areEqual(aux, Composer.INSTANCE.getEmpty())) {
                if (isNode) {
                    updateNode(aux);
                } else {
                    updateAux(aux);
                }
            }
            this.currentSlot = slotIndex(this.groups, iGroupIndexToAddress2);
            this.currentSlotEnd = dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1));
            this.nodeCount = SlotTableKt.nodeCount(this.groups, iGroupIndexToAddress2);
            this.parent = i7;
            this.currentGroup = i7 + 1;
            iGroupSize = i7 + SlotTableKt.groupSize(this.groups, iGroupIndexToAddress2);
        }
        this.currentGroupEnd = iGroupSize;
    }

    public final int endGroup() {
        boolean z = this.insertCount > 0;
        int i = this.currentGroup;
        int i2 = this.currentGroupEnd;
        int i3 = this.parent;
        int iGroupIndexToAddress = groupIndexToAddress(i3);
        int i4 = this.nodeCount;
        int i5 = i - i3;
        boolean zIsNode = SlotTableKt.isNode(this.groups, iGroupIndexToAddress);
        if (z) {
            SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress, i5);
            SlotTableKt.updateNodeCount(this.groups, iGroupIndexToAddress, i4);
            this.nodeCount = this.nodeCountStack.pop() + (zIsNode ? 1 : i4);
            this.parent = parent(this.groups, i3);
        } else {
            if ((i != i2 ? 0 : 1) != 0) {
                int iGroupSize = SlotTableKt.groupSize(this.groups, iGroupIndexToAddress);
                int iNodeCount = SlotTableKt.nodeCount(this.groups, iGroupIndexToAddress);
                SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress, i5);
                SlotTableKt.updateNodeCount(this.groups, iGroupIndexToAddress, i4);
                int iPop = this.startStack.pop();
                restoreCurrentGroupEnd();
                this.parent = iPop;
                int iParent = parent(this.groups, i3);
                int iPop2 = this.nodeCountStack.pop();
                this.nodeCount = iPop2;
                if (iParent == iPop) {
                    this.nodeCount = iPop2 + (zIsNode ? 0 : i4 - iNodeCount);
                } else {
                    int i6 = i5 - iGroupSize;
                    int i7 = zIsNode ? 0 : i4 - iNodeCount;
                    if (i6 != 0 || i7 != 0) {
                        while (iParent != 0 && iParent != iPop && (i7 != 0 || i6 != 0)) {
                            int iGroupIndexToAddress2 = groupIndexToAddress(iParent);
                            if (i6 != 0) {
                                SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress2, SlotTableKt.groupSize(this.groups, iGroupIndexToAddress2) + i6);
                            }
                            if (i7 != 0) {
                                int[] iArr = this.groups;
                                SlotTableKt.updateNodeCount(iArr, iGroupIndexToAddress2, SlotTableKt.nodeCount(iArr, iGroupIndexToAddress2) + i7);
                            }
                            if (SlotTableKt.isNode(this.groups, iGroupIndexToAddress2)) {
                                i7 = 0;
                            }
                            iParent = parent(this.groups, iParent);
                        }
                    }
                    this.nodeCount += i7;
                }
            } else {
                ComposerKt.composeRuntimeError("Expected to be at the end of a group".toString());
                throw new KotlinNothingValueException();
            }
        }
        return i4;
    }

    public final void ensureStarted(int i) {
        boolean z = false;
        if (this.insertCount <= 0) {
            int i2 = this.parent;
            if (i2 != i) {
                if (i >= i2 && i < this.currentGroupEnd) {
                    z = true;
                }
                if (!z) {
                    ComposerKt.composeRuntimeError(("Started group at " + i + " must be a subgroup of the group at " + i2).toString());
                    throw new KotlinNothingValueException();
                }
                int i3 = this.currentGroup;
                int i4 = this.currentSlot;
                int i5 = this.currentSlotEnd;
                this.currentGroup = i;
                startGroup();
                this.currentGroup = i3;
                this.currentSlot = i4;
                this.currentSlotEnd = i5;
                return;
            }
            return;
        }
        ComposerKt.composeRuntimeError("Cannot call ensureStarted() while inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final void ensureStarted(@NotNull Anchor anchor) {
        ensureStarted(anchor.toIndexFor(this));
    }

    public final int skipGroup() {
        int iGroupIndexToAddress = groupIndexToAddress(this.currentGroup);
        int iGroupSize = this.currentGroup + SlotTableKt.groupSize(this.groups, iGroupIndexToAddress);
        this.currentGroup = iGroupSize;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(iGroupSize));
        if (SlotTableKt.isNode(this.groups, iGroupIndexToAddress)) {
            return 1;
        }
        return SlotTableKt.nodeCount(this.groups, iGroupIndexToAddress);
    }

    public final boolean removeGroup() {
        Anchor anchorTryAnchor$runtime_release;
        if (this.insertCount == 0) {
            int i = this.currentGroup;
            int i2 = this.currentSlot;
            int iSkipGroup = skipGroup();
            GroupSourceInformation groupSourceInformationSourceInformationOf = sourceInformationOf(this.parent);
            if (groupSourceInformationSourceInformationOf != null && (anchorTryAnchor$runtime_release = tryAnchor$runtime_release(i)) != null) {
                groupSourceInformationSourceInformationOf.removeAnchor(anchorTryAnchor$runtime_release);
            }
            PrioritySet prioritySet = this.pendingRecalculateMarks;
            if (prioritySet != null) {
                while (prioritySet.isNotEmpty() && prioritySet.peek() >= i) {
                    prioritySet.takeMax();
                }
            }
            boolean zRemoveGroups = removeGroups(i, this.currentGroup - i);
            removeSlots(i2, this.currentSlot - i2, i - 1);
            this.currentGroup = i;
            this.currentSlot = i2;
            this.nodeCount -= iSkipGroup;
            return zRemoveGroups;
        }
        ComposerKt.composeRuntimeError("Cannot remove group while inserting".toString());
        throw new KotlinNothingValueException();
    }

    @NotNull
    public final Iterator<Object> groupSlots() {
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int[] iArr = this.groups;
        int i = this.currentGroup;
        return new C17711(iDataIndex, dataIndex(iArr, groupIndexToAddress(i + groupSize(i))), this);
    }

    /* compiled from: SlotTable.kt */
    @Metadata(m7104d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, m7105d2 = {"androidx/compose/runtime/SlotWriter$groupSlots$1", "", "", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "hasNext", "", LinkHeader.Rel.Next, "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.runtime.SlotWriter$groupSlots$1 */
    /* loaded from: classes2.dex */
    public static final class C17711 implements Iterator<Object>, KMappedMarker {
        final /* synthetic */ int $end;
        private int current;
        final /* synthetic */ SlotWriter this$0;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public C17711(int i, int i2, SlotWriter slotWriter) {
            this.$end = i2;
            this.this$0 = slotWriter;
            this.current = i;
        }

        public final int getCurrent() {
            return this.current;
        }

        public final void setCurrent(int i) {
            this.current = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.current < this.$end;
        }

        @Override // java.util.Iterator
        @Nullable
        public Object next() {
            if (!hasNext()) {
                return null;
            }
            Object[] objArr = this.this$0.slots;
            SlotWriter slotWriter = this.this$0;
            int i = this.current;
            this.current = i + 1;
            return objArr[slotWriter.dataIndexToDataAddress(i)];
        }
    }

    public final void forEachData(int group, @NotNull Function2<? super Integer, Object, Unit> block) {
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(group));
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(group + 1));
        for (int i = iSlotIndex; i < iDataIndex; i++) {
            block.invoke(Integer.valueOf(i - iSlotIndex), this.slots[dataIndexToDataAddress(i)]);
        }
    }

    public final void moveGroup(int i) {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeRuntimeError("Cannot move a group while inserting".toString());
            throw new KotlinNothingValueException();
        }
        if (!(i >= 0)) {
            ComposerKt.composeRuntimeError("Parameter offset is out of bounds".toString());
            throw new KotlinNothingValueException();
        }
        if (i == 0) {
            return;
        }
        int i2 = this.currentGroup;
        int i3 = this.parent;
        int i4 = this.currentGroupEnd;
        int iGroupSize = i2;
        for (int i5 = i; i5 > 0; i5--) {
            iGroupSize += SlotTableKt.groupSize(this.groups, groupIndexToAddress(iGroupSize));
            if (!(iGroupSize <= i4)) {
                ComposerKt.composeRuntimeError("Parameter offset is out of bounds".toString());
                throw new KotlinNothingValueException();
            }
        }
        int iGroupSize2 = SlotTableKt.groupSize(this.groups, groupIndexToAddress(iGroupSize));
        int i6 = this.currentSlot;
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(iGroupSize));
        int i7 = iGroupSize + iGroupSize2;
        int iDataIndex2 = dataIndex(this.groups, groupIndexToAddress(i7));
        int i8 = iDataIndex2 - iDataIndex;
        insertSlots(i8, Math.max(this.currentGroup - 1, 0));
        insertGroups(iGroupSize2);
        int[] iArr = this.groups;
        int iGroupIndexToAddress = groupIndexToAddress(i7) * 5;
        ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, groupIndexToAddress(i2) * 5, iGroupIndexToAddress, (iGroupSize2 * 5) + iGroupIndexToAddress);
        if (i8 > 0) {
            Object[] objArr = this.slots;
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i6, dataIndexToDataAddress(iDataIndex + i8), dataIndexToDataAddress(iDataIndex2 + i8));
        }
        int i9 = iDataIndex + i8;
        int i10 = i9 - i6;
        int i11 = this.slotsGapStart;
        int i12 = this.slotsGapLen;
        int length = this.slots.length;
        int i13 = this.slotsGapOwner;
        int i14 = i2 + iGroupSize2;
        int i15 = i2;
        while (i15 < i14) {
            int iGroupIndexToAddress2 = groupIndexToAddress(i15);
            int i16 = i11;
            int i17 = i10;
            updateDataIndex(iArr, iGroupIndexToAddress2, dataIndexToDataAnchor(dataIndex(iArr, iGroupIndexToAddress2) - i10, i13 < iGroupIndexToAddress2 ? 0 : i16, i12, length));
            i15++;
            i11 = i16;
            i10 = i17;
        }
        moveAnchors(i7, i2, iGroupSize2);
        if (!removeGroups(i7, iGroupSize2)) {
            fixParentAnchorsFor(i3, this.currentGroupEnd, i2);
            if (i8 > 0) {
                removeSlots(i9, i8, i7 - 1);
                return;
            }
            return;
        }
        ComposerKt.composeRuntimeError("Unexpectedly removed anchors".toString());
        throw new KotlinNothingValueException();
    }

    /* compiled from: SlotTable.kt */
    @Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J@\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0002¨\u0006\u000f"}, m7105d2 = {"Landroidx/compose/runtime/SlotWriter$Companion;", "", "()V", "moveGroup", "", "Landroidx/compose/runtime/Anchor;", "fromWriter", "Landroidx/compose/runtime/SlotWriter;", "fromIndex", "", "toWriter", "updateFromCursor", "", "updateToCursor", "removeSourceGroup", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,3745:1\n1#2:3746\n33#3,6:3747\n4178#4,5:3753\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n*L\n2302#1:3747,6\n2367#1:3753,5\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ List moveGroup$default(Companion companion, SlotWriter slotWriter, int i, SlotWriter slotWriter2, boolean z, boolean z2, boolean z3, int i2, Object obj) {
            if ((i2 & 32) != 0) {
                z3 = true;
            }
            return companion.moveGroup(slotWriter, i, slotWriter2, z, z2, z3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final List<Anchor> moveGroup(SlotWriter fromWriter, int fromIndex, SlotWriter toWriter, boolean updateFromCursor, boolean updateToCursor, boolean removeSourceGroup) {
            boolean z;
            List<Anchor> listEmptyList;
            HashMap map;
            int i;
            int iGroupSize = fromWriter.groupSize(fromIndex);
            int i2 = fromIndex + iGroupSize;
            int iDataIndex = fromWriter.dataIndex(fromIndex);
            int iDataIndex2 = fromWriter.dataIndex(i2);
            int i3 = iDataIndex2 - iDataIndex;
            boolean zContainsAnyGroupMarks = fromWriter.containsAnyGroupMarks(fromIndex);
            toWriter.insertGroups(iGroupSize);
            toWriter.insertSlots(i3, toWriter.getCurrentGroup());
            if (fromWriter.groupGapStart < i2) {
                fromWriter.moveGroupGapTo(i2);
            }
            if (fromWriter.slotsGapStart < iDataIndex2) {
                fromWriter.moveSlotGapTo(iDataIndex2, i2);
            }
            int[] iArr = toWriter.groups;
            int currentGroup = toWriter.getCurrentGroup();
            ArraysKt___ArraysJvmKt.copyInto(fromWriter.groups, iArr, currentGroup * 5, fromIndex * 5, i2 * 5);
            Object[] objArr = toWriter.slots;
            int i4 = toWriter.currentSlot;
            ArraysKt___ArraysJvmKt.copyInto(fromWriter.slots, objArr, i4, iDataIndex, iDataIndex2);
            int parent = toWriter.getParent();
            SlotTableKt.updateParentAnchor(iArr, currentGroup, parent);
            int i5 = currentGroup - fromIndex;
            int i6 = currentGroup + iGroupSize;
            int iDataIndex3 = i4 - toWriter.dataIndex(iArr, currentGroup);
            int i7 = toWriter.slotsGapOwner;
            int i8 = toWriter.slotsGapLen;
            int length = objArr.length;
            int i9 = i7;
            int i10 = currentGroup;
            while (true) {
                z = 0;
                if (i10 >= i6) {
                    break;
                }
                if (i10 != currentGroup) {
                    i = i6;
                    SlotTableKt.updateParentAnchor(iArr, i10, SlotTableKt.parentAnchor(iArr, i10) + i5);
                } else {
                    i = i6;
                }
                int i11 = iDataIndex3;
                SlotTableKt.updateDataAnchor(iArr, i10, toWriter.dataIndexToDataAnchor(toWriter.dataIndex(iArr, i10) + iDataIndex3, i9 >= i10 ? toWriter.slotsGapStart : 0, i8, length));
                if (i10 == i9) {
                    i9++;
                }
                i10++;
                iDataIndex3 = i11;
                i6 = i;
            }
            int i12 = i6;
            toWriter.slotsGapOwner = i9;
            int iLocationOf = SlotTableKt.locationOf(fromWriter.anchors, fromIndex, fromWriter.getSize$runtime_release());
            int iLocationOf2 = SlotTableKt.locationOf(fromWriter.anchors, i2, fromWriter.getSize$runtime_release());
            if (iLocationOf < iLocationOf2) {
                ArrayList arrayList = fromWriter.anchors;
                ArrayList arrayList2 = new ArrayList(iLocationOf2 - iLocationOf);
                for (int i13 = iLocationOf; i13 < iLocationOf2; i13++) {
                    Anchor anchor = (Anchor) arrayList.get(i13);
                    anchor.setLocation$runtime_release(anchor.getLocation() + i5);
                    arrayList2.add(anchor);
                }
                toWriter.anchors.addAll(SlotTableKt.locationOf(toWriter.anchors, toWriter.getCurrentGroup(), toWriter.getSize$runtime_release()), arrayList2);
                arrayList.subList(iLocationOf, iLocationOf2).clear();
                listEmptyList = arrayList2;
            } else {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            if ((!listEmptyList.isEmpty()) && (map = fromWriter.sourceInformationMap) != null) {
                HashMap map2 = toWriter.sourceInformationMap;
                int size = listEmptyList.size();
                for (int i14 = 0; i14 < size; i14++) {
                    Anchor anchor2 = listEmptyList.get(i14);
                    GroupSourceInformation groupSourceInformation = (GroupSourceInformation) map.get(anchor2);
                    if (groupSourceInformation != null) {
                        map.remove(anchor2);
                        if (map2 == null) {
                            Companion companion = SlotWriter.INSTANCE;
                            map2 = new HashMap();
                            toWriter.sourceInformationMap = map2;
                        }
                        map2.put(anchor2, groupSourceInformation);
                    }
                }
                if (map.isEmpty()) {
                    fromWriter.sourceInformationMap = null;
                }
            }
            int parent2 = toWriter.getParent();
            GroupSourceInformation groupSourceInformationSourceInformationOf = toWriter.sourceInformationOf(parent);
            if (groupSourceInformationSourceInformationOf != null) {
                int iGroupSize2 = parent2 + 1;
                int currentGroup2 = toWriter.getCurrentGroup();
                int i15 = -1;
                while (iGroupSize2 < currentGroup2) {
                    i15 = iGroupSize2;
                    iGroupSize2 = SlotTableKt.groupSize(toWriter.groups, iGroupSize2) + iGroupSize2;
                }
                groupSourceInformationSourceInformationOf.addGroupAfter(toWriter, i15, currentGroup2);
            }
            int iParent = fromWriter.parent(fromIndex);
            if (removeSourceGroup) {
                if (!updateFromCursor) {
                    boolean zRemoveGroups = fromWriter.removeGroups(fromIndex, iGroupSize);
                    fromWriter.removeSlots(iDataIndex, i3, fromIndex - 1);
                    z = zRemoveGroups;
                } else {
                    boolean z2 = iParent >= 0;
                    if (z2) {
                        fromWriter.startGroup();
                        fromWriter.advanceBy(iParent - fromWriter.getCurrentGroup());
                        fromWriter.startGroup();
                    }
                    fromWriter.advanceBy(fromIndex - fromWriter.getCurrentGroup());
                    boolean zRemoveGroup = fromWriter.removeGroup();
                    if (z2) {
                        fromWriter.skipToGroupEnd();
                        fromWriter.endGroup();
                        fromWriter.skipToGroupEnd();
                        fromWriter.endGroup();
                    }
                    z = zRemoveGroup;
                }
            }
            if ((!z) != 0) {
                toWriter.nodeCount += SlotTableKt.isNode(iArr, currentGroup) ? 1 : SlotTableKt.nodeCount(iArr, currentGroup);
                if (updateToCursor) {
                    toWriter.currentGroup = i12;
                    toWriter.currentSlot = i4 + i3;
                }
                if (zContainsAnyGroupMarks) {
                    toWriter.updateContainsMark(parent);
                }
                return listEmptyList;
            }
            ComposerKt.composeRuntimeError("Unexpectedly removed anchors".toString());
            throw new KotlinNothingValueException();
        }
    }

    @NotNull
    public final List<Anchor> moveTo(@NotNull Anchor anchor, int i, @NotNull SlotWriter writer) {
        ComposerKt.runtimeCheck(writer.insertCount > 0);
        ComposerKt.runtimeCheck(this.insertCount == 0);
        ComposerKt.runtimeCheck(anchor.getValid());
        int iAnchorIndex = anchorIndex(anchor) + i;
        int i2 = this.currentGroup;
        ComposerKt.runtimeCheck(i2 <= iAnchorIndex && iAnchorIndex < this.currentGroupEnd);
        int iParent = parent(iAnchorIndex);
        int iGroupSize = groupSize(iAnchorIndex);
        int iNodeCount = isNode(iAnchorIndex) ? 1 : nodeCount(iAnchorIndex);
        List<Anchor> listMoveGroup$default = Companion.moveGroup$default(INSTANCE, this, iAnchorIndex, writer, false, false, false, 32, null);
        updateContainsMark(iParent);
        boolean z = iNodeCount > 0;
        while (iParent >= i2) {
            int iGroupIndexToAddress = groupIndexToAddress(iParent);
            int[] iArr = this.groups;
            SlotTableKt.updateGroupSize(iArr, iGroupIndexToAddress, SlotTableKt.groupSize(iArr, iGroupIndexToAddress) - iGroupSize);
            if (z) {
                if (SlotTableKt.isNode(this.groups, iGroupIndexToAddress)) {
                    z = false;
                } else {
                    int[] iArr2 = this.groups;
                    SlotTableKt.updateNodeCount(iArr2, iGroupIndexToAddress, SlotTableKt.nodeCount(iArr2, iGroupIndexToAddress) - iNodeCount);
                }
            }
            iParent = parent(iParent);
        }
        if (z) {
            ComposerKt.runtimeCheck(this.nodeCount >= iNodeCount);
            this.nodeCount -= iNodeCount;
        }
        return listMoveGroup$default;
    }

    public static /* synthetic */ List moveFrom$default(SlotWriter slotWriter, SlotTable slotTable, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        return slotWriter.moveFrom(slotTable, i, z);
    }

    @NotNull
    public final List<Anchor> moveFrom(@NotNull SlotTable table, int i, boolean removeSourceGroup) {
        ComposerKt.runtimeCheck(this.insertCount > 0);
        if (i == 0 && this.currentGroup == 0 && this.table.getGroupsSize() == 0 && SlotTableKt.groupSize(table.getGroups(), i) == table.getGroupsSize()) {
            int[] iArr = this.groups;
            Object[] objArr = this.slots;
            ArrayList<Anchor> arrayList = this.anchors;
            HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
            int[] groups = table.getGroups();
            int groupsSize = table.getGroupsSize();
            Object[] slots = table.getSlots();
            int slotsSize = table.getSlotsSize();
            HashMap<Anchor, GroupSourceInformation> sourceInformationMap$runtime_release = table.getSourceInformationMap$runtime_release();
            this.groups = groups;
            this.slots = slots;
            this.anchors = table.getAnchors$runtime_release();
            this.groupGapStart = groupsSize;
            this.groupGapLen = (groups.length / 5) - groupsSize;
            this.slotsGapStart = slotsSize;
            this.slotsGapLen = slots.length - slotsSize;
            this.slotsGapOwner = groupsSize;
            this.sourceInformationMap = sourceInformationMap$runtime_release;
            table.setTo$runtime_release(iArr, 0, objArr, 0, arrayList, map);
            return this.anchors;
        }
        SlotWriter slotWriterOpenWriter = table.openWriter();
        try {
            return INSTANCE.moveGroup(slotWriterOpenWriter, i, this, true, true, removeSourceGroup);
        } finally {
            slotWriterOpenWriter.close();
        }
    }

    public final void bashCurrentGroup() {
        SlotTableKt.updateGroupKey(this.groups, this.currentGroup, -3);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x000f  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<Anchor> moveIntoGroupFrom(int i, @NotNull SlotTable table, int i2) {
        boolean z;
        if (this.insertCount <= 0) {
            z = groupSize(this.currentGroup + i) == 1;
        }
        ComposerKt.runtimeCheck(z);
        int i3 = this.currentGroup;
        int i4 = this.currentSlot;
        int i5 = this.currentSlotEnd;
        advanceBy(i);
        startGroup();
        beginInsert();
        SlotWriter slotWriterOpenWriter = table.openWriter();
        try {
            List<Anchor> listMoveGroup$default = Companion.moveGroup$default(INSTANCE, slotWriterOpenWriter, i2, this, false, true, false, 32, null);
            slotWriterOpenWriter.close();
            endInsert();
            endGroup();
            this.currentGroup = i3;
            this.currentSlot = i4;
            this.currentSlotEnd = i5;
            return listMoveGroup$default;
        } catch (Throwable th) {
            slotWriterOpenWriter.close();
            throw th;
        }
    }

    public static /* synthetic */ Anchor anchor$default(SlotWriter slotWriter, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = slotWriter.currentGroup;
        }
        return slotWriter.anchor(i);
    }

    @NotNull
    public final Anchor anchor(int i) {
        ArrayList<Anchor> arrayList = this.anchors;
        int iSearch = SlotTableKt.search(arrayList, i, getSize$runtime_release());
        if (iSearch < 0) {
            if (i > this.groupGapStart) {
                i = -(getSize$runtime_release() - i);
            }
            Anchor anchor = new Anchor(i);
            arrayList.add(-(iSearch + 1), anchor);
            return anchor;
        }
        return arrayList.get(iSearch);
    }

    public static /* synthetic */ void markGroup$default(SlotWriter slotWriter, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = slotWriter.parent;
        }
        slotWriter.markGroup(i);
    }

    public final void markGroup(int group) {
        int iGroupIndexToAddress = groupIndexToAddress(group);
        if (SlotTableKt.hasMark(this.groups, iGroupIndexToAddress)) {
            return;
        }
        SlotTableKt.updateMark(this.groups, iGroupIndexToAddress, true);
        if (SlotTableKt.containsMark(this.groups, iGroupIndexToAddress)) {
            return;
        }
        updateContainsMark(parent(group));
    }

    private final boolean containsGroupMark(int group) {
        return group >= 0 && SlotTableKt.containsMark(this.groups, groupIndexToAddress(group));
    }

    public final boolean containsAnyGroupMarks(int group) {
        return group >= 0 && SlotTableKt.containsAnyMark(this.groups, groupIndexToAddress(group));
    }

    private final void recalculateMarks() {
        PrioritySet prioritySet = this.pendingRecalculateMarks;
        if (prioritySet != null) {
            while (prioritySet.isNotEmpty()) {
                updateContainsMarkNow(prioritySet.takeMax(), prioritySet);
            }
        }
    }

    public final void updateContainsMark(int group) {
        if (group >= 0) {
            PrioritySet prioritySet = this.pendingRecalculateMarks;
            if (prioritySet == null) {
                prioritySet = new PrioritySet(null, 1, null);
                this.pendingRecalculateMarks = prioritySet;
            }
            prioritySet.add(group);
        }
    }

    private final void updateContainsMarkNow(int group, PrioritySet set) {
        int iGroupIndexToAddress = groupIndexToAddress(group);
        boolean zChildContainsAnyMarks = childContainsAnyMarks(group);
        if (SlotTableKt.containsMark(this.groups, iGroupIndexToAddress) != zChildContainsAnyMarks) {
            SlotTableKt.updateContainsMark(this.groups, iGroupIndexToAddress, zChildContainsAnyMarks);
            int iParent = parent(group);
            if (iParent >= 0) {
                set.add(iParent);
            }
        }
    }

    private final boolean childContainsAnyMarks(int group) {
        int iGroupSize = group + 1;
        int iGroupSize2 = group + groupSize(group);
        while (iGroupSize < iGroupSize2) {
            if (SlotTableKt.containsAnyMark(this.groups, groupIndexToAddress(iGroupSize))) {
                return true;
            }
            iGroupSize += groupSize(iGroupSize);
        }
        return false;
    }

    public final int anchorIndex(@NotNull Anchor anchor) {
        int location = anchor.getLocation();
        return location < 0 ? location + getSize$runtime_release() : location;
    }

    @NotNull
    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + getSize$runtime_release() + " gap=" + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + ')';
    }

    private final void saveCurrentGroupEnd() {
        this.endStack.push((getCapacity() - this.groupGapLen) - this.currentGroupEnd);
    }

    private final int restoreCurrentGroupEnd() {
        int capacity = (getCapacity() - this.groupGapLen) - this.endStack.pop();
        this.currentGroupEnd = capacity;
        return capacity;
    }

    private final void fixParentAnchorsFor(int parent, int endGroup, int firstChild) {
        int iParentIndexToAnchor = parentIndexToAnchor(parent, this.groupGapStart);
        while (firstChild < endGroup) {
            SlotTableKt.updateParentAnchor(this.groups, groupIndexToAddress(firstChild), iParentIndexToAnchor);
            int iGroupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(firstChild)) + firstChild;
            fixParentAnchorsFor(firstChild, iGroupSize, firstChild + 1);
            firstChild = iGroupSize;
        }
    }

    public final void moveGroupGapTo(int i) {
        int i2 = this.groupGapLen;
        int i3 = this.groupGapStart;
        if (i3 != i) {
            if (!this.anchors.isEmpty()) {
                updateAnchors(i3, i);
            }
            if (i2 > 0) {
                int[] iArr = this.groups;
                int i4 = i * 5;
                int i5 = i2 * 5;
                int i6 = i3 * 5;
                if (i < i3) {
                    ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i5 + i4, i4, i6);
                } else {
                    ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i6, i6 + i5, i4 + i5);
                }
            }
            if (i < i3) {
                i3 = i + i2;
            }
            int capacity = getCapacity();
            ComposerKt.runtimeCheck(i3 < capacity);
            while (i3 < capacity) {
                int iParentAnchor = SlotTableKt.parentAnchor(this.groups, i3);
                int iParentIndexToAnchor = parentIndexToAnchor(parentAnchorToIndex(iParentAnchor), i);
                if (iParentIndexToAnchor != iParentAnchor) {
                    SlotTableKt.updateParentAnchor(this.groups, i3, iParentIndexToAnchor);
                }
                i3++;
                if (i3 == i) {
                    i3 += i2;
                }
            }
        }
        this.groupGapStart = i;
    }

    public final void moveSlotGapTo(int i, int group) {
        int i2 = this.slotsGapLen;
        int i3 = this.slotsGapStart;
        int i4 = this.slotsGapOwner;
        if (i3 != i) {
            Object[] objArr = this.slots;
            if (i < i3) {
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i + i2, i, i3);
            } else {
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i3, i3 + i2, i + i2);
            }
        }
        int iMin = Math.min(group + 1, getSize$runtime_release());
        if (i4 != iMin) {
            int length = this.slots.length - i2;
            if (iMin < i4) {
                int iGroupIndexToAddress = groupIndexToAddress(iMin);
                int iGroupIndexToAddress2 = groupIndexToAddress(i4);
                int i5 = this.groupGapStart;
                while (iGroupIndexToAddress < iGroupIndexToAddress2) {
                    int iDataAnchor = SlotTableKt.dataAnchor(this.groups, iGroupIndexToAddress);
                    if (iDataAnchor >= 0) {
                        SlotTableKt.updateDataAnchor(this.groups, iGroupIndexToAddress, -((length - iDataAnchor) + 1));
                        iGroupIndexToAddress++;
                        if (iGroupIndexToAddress == i5) {
                            iGroupIndexToAddress += this.groupGapLen;
                        }
                    } else {
                        ComposerKt.composeRuntimeError("Unexpected anchor value, expected a positive anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                }
            } else {
                int iGroupIndexToAddress3 = groupIndexToAddress(i4);
                int iGroupIndexToAddress4 = groupIndexToAddress(iMin);
                while (iGroupIndexToAddress3 < iGroupIndexToAddress4) {
                    int iDataAnchor2 = SlotTableKt.dataAnchor(this.groups, iGroupIndexToAddress3);
                    if (iDataAnchor2 < 0) {
                        SlotTableKt.updateDataAnchor(this.groups, iGroupIndexToAddress3, iDataAnchor2 + length + 1);
                        iGroupIndexToAddress3++;
                        if (iGroupIndexToAddress3 == this.groupGapStart) {
                            iGroupIndexToAddress3 += this.groupGapLen;
                        }
                    } else {
                        ComposerKt.composeRuntimeError("Unexpected anchor value, expected a negative anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                }
            }
            this.slotsGapOwner = iMin;
        }
        this.slotsGapStart = i;
    }

    private final void clearSlotGap() {
        int i = this.slotsGapStart;
        ArraysKt___ArraysJvmKt.fill(this.slots, (Object) null, i, this.slotsGapLen + i);
    }

    public final void insertGroups(int size) {
        if (size > 0) {
            int i = this.currentGroup;
            moveGroupGapTo(i);
            int i2 = this.groupGapStart;
            int i3 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i4 = length - i3;
            if (i3 < size) {
                int iMax = Math.max(Math.max(length * 2, i4 + size), 32);
                int[] iArr2 = new int[iMax * 5];
                int i5 = iMax - i4;
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, 0, 0, i2 * 5);
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, (i2 + i5) * 5, (i3 + i2) * 5, length * 5);
                this.groups = iArr2;
                i3 = i5;
            }
            int i6 = this.currentGroupEnd;
            if (i6 >= i2) {
                this.currentGroupEnd = i6 + size;
            }
            int i7 = i2 + size;
            this.groupGapStart = i7;
            this.groupGapLen = i3 - size;
            int iDataIndexToDataAnchor = dataIndexToDataAnchor(i4 > 0 ? dataIndex(i + size) : 0, this.slotsGapOwner >= i2 ? this.slotsGapStart : 0, this.slotsGapLen, this.slots.length);
            for (int i8 = i2; i8 < i7; i8++) {
                SlotTableKt.updateDataAnchor(this.groups, i8, iDataIndexToDataAnchor);
            }
            int i9 = this.slotsGapOwner;
            if (i9 >= i2) {
                this.slotsGapOwner = i9 + size;
            }
        }
    }

    public final void insertSlots(int size, int group) {
        if (size > 0) {
            moveSlotGapTo(this.currentSlot, group);
            int i = this.slotsGapStart;
            int i2 = this.slotsGapLen;
            if (i2 < size) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i3 = length - i2;
                int iMax = Math.max(Math.max(length * 2, i3 + size), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i4 = 0; i4 < iMax; i4++) {
                    objArr2[i4] = null;
                }
                int i5 = iMax - i3;
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr2, 0, 0, i);
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr2, i + i5, i2 + i, length);
                this.slots = objArr2;
                i2 = i5;
            }
            int i6 = this.currentSlotEnd;
            if (i6 >= i) {
                this.currentSlotEnd = i6 + size;
            }
            this.slotsGapStart = i + size;
            this.slotsGapLen = i2 - size;
        }
    }

    public final boolean removeGroups(int i, int len) {
        if (len > 0) {
            ArrayList<Anchor> arrayList = this.anchors;
            moveGroupGapTo(i);
            zRemoveAnchors = arrayList.isEmpty() ^ true ? removeAnchors(i, len, this.sourceInformationMap) : false;
            this.groupGapStart = i;
            this.groupGapLen += len;
            int i2 = this.slotsGapOwner;
            if (i2 > i) {
                this.slotsGapOwner = Math.max(i, i2 - len);
            }
            int i3 = this.currentGroupEnd;
            if (i3 >= this.groupGapStart) {
                this.currentGroupEnd = i3 - len;
            }
            int i4 = this.parent;
            if (containsGroupMark(i4)) {
                updateContainsMark(i4);
            }
        }
        return zRemoveAnchors;
    }

    public final GroupSourceInformation sourceInformationOf(int group) {
        Anchor anchorTryAnchor$runtime_release;
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        if (map == null || (anchorTryAnchor$runtime_release = tryAnchor$runtime_release(group)) == null) {
            return null;
        }
        return map.get(anchorTryAnchor$runtime_release);
    }

    @Nullable
    public final Anchor tryAnchor$runtime_release(int group) {
        if (group < 0 || group >= getSize$runtime_release()) {
            return null;
        }
        return SlotTableKt.find(this.anchors, group, getSize$runtime_release());
    }

    public final void removeSlots(int i, int len, int group) {
        if (len > 0) {
            int i2 = this.slotsGapLen;
            int i3 = i + len;
            moveSlotGapTo(i3, group);
            this.slotsGapStart = i;
            this.slotsGapLen = i2 + len;
            ArraysKt___ArraysJvmKt.fill(this.slots, (Object) null, i, i3);
            int i4 = this.currentSlotEnd;
            if (i4 >= i) {
                this.currentSlotEnd = i4 - len;
            }
        }
    }

    private final void updateNodeOfGroup(int i, Object value) {
        int iGroupIndexToAddress = groupIndexToAddress(i);
        int[] iArr = this.groups;
        if (!(iGroupIndexToAddress < iArr.length && SlotTableKt.isNode(iArr, iGroupIndexToAddress))) {
            ComposerKt.composeRuntimeError(("Updating the node of a group at " + i + " that was not created with as a node group").toString());
            throw new KotlinNothingValueException();
        }
        this.slots[dataIndexToDataAddress(nodeIndex(this.groups, iGroupIndexToAddress))] = value;
    }

    private final void updateAnchors(int previousGapStart, int newGapStart) {
        Anchor anchor;
        int location;
        Anchor anchor2;
        int location2;
        int i;
        int capacity = getCapacity() - this.groupGapLen;
        if (previousGapStart < newGapStart) {
            for (int iLocationOf = SlotTableKt.locationOf(this.anchors, previousGapStart, capacity); iLocationOf < this.anchors.size() && (location2 = (anchor2 = this.anchors.get(iLocationOf)).getLocation()) < 0 && (i = location2 + capacity) < newGapStart; iLocationOf++) {
                anchor2.setLocation$runtime_release(i);
            }
            return;
        }
        for (int iLocationOf2 = SlotTableKt.locationOf(this.anchors, newGapStart, capacity); iLocationOf2 < this.anchors.size() && (location = (anchor = this.anchors.get(iLocationOf2)).getLocation()) >= 0; iLocationOf2++) {
            anchor.setLocation$runtime_release(-(capacity - location));
        }
    }

    private final boolean removeAnchors(int gapStart, int size, HashMap<Anchor, GroupSourceInformation> sourceInformationMap) {
        int i = size + gapStart;
        int iLocationOf = SlotTableKt.locationOf(this.anchors, i, getCapacity() - this.groupGapLen);
        if (iLocationOf >= this.anchors.size()) {
            iLocationOf--;
        }
        int i2 = iLocationOf + 1;
        int i3 = 0;
        while (iLocationOf >= 0) {
            Anchor anchor = this.anchors.get(iLocationOf);
            int iAnchorIndex = anchorIndex(anchor);
            if (iAnchorIndex < gapStart) {
                break;
            }
            if (iAnchorIndex < i) {
                anchor.setLocation$runtime_release(Integer.MIN_VALUE);
                if (sourceInformationMap != null) {
                    sourceInformationMap.remove(anchor);
                }
                if (i3 == 0) {
                    i3 = iLocationOf + 1;
                }
                i2 = iLocationOf;
            }
            iLocationOf--;
        }
        boolean z = i2 < i3;
        if (z) {
            this.anchors.subList(i2, i3).clear();
        }
        return z;
    }

    private final void moveAnchors(int originalLocation, int newLocation, int size) {
        Anchor anchor;
        int iAnchorIndex;
        int i = size + originalLocation;
        int size$runtime_release = getSize$runtime_release();
        int iLocationOf = SlotTableKt.locationOf(this.anchors, originalLocation, size$runtime_release);
        ArrayList arrayList = new ArrayList();
        if (iLocationOf >= 0) {
            while (iLocationOf < this.anchors.size() && (iAnchorIndex = anchorIndex((anchor = this.anchors.get(iLocationOf)))) >= originalLocation && iAnchorIndex < i) {
                arrayList.add(anchor);
                this.anchors.remove(iLocationOf);
            }
        }
        int i2 = newLocation - originalLocation;
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Anchor anchor2 = (Anchor) arrayList.get(i3);
            int iAnchorIndex2 = anchorIndex(anchor2) + i2;
            if (iAnchorIndex2 >= this.groupGapStart) {
                anchor2.setLocation$runtime_release(-(size$runtime_release - iAnchorIndex2));
            } else {
                anchor2.setLocation$runtime_release(iAnchorIndex2);
            }
            this.anchors.add(SlotTableKt.locationOf(this.anchors, iAnchorIndex2, size$runtime_release), anchor2);
        }
    }

    @NotNull
    public final String groupsAsString() {
        StringBuilder sb = new StringBuilder();
        int size$runtime_release = getSize$runtime_release();
        for (int i = 0; i < size$runtime_release; i++) {
            groupAsString(sb, i);
            sb.append('\n');
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private final void groupAsString(StringBuilder sb, int i) {
        int iGroupIndexToAddress = groupIndexToAddress(i);
        sb.append("Group(");
        if (i < 10) {
            sb.append(' ');
        }
        if (i < 100) {
            sb.append(' ');
        }
        if (i < 1000) {
            sb.append(' ');
        }
        sb.append(i);
        if (iGroupIndexToAddress != i) {
            sb.append("(");
            sb.append(iGroupIndexToAddress);
            sb.append(")");
        }
        sb.append('#');
        sb.append(SlotTableKt.groupSize(this.groups, iGroupIndexToAddress));
        boolean zGroupAsString$isStarted = groupAsString$isStarted(this, i);
        if (zGroupAsString$isStarted) {
            sb.append('?');
        }
        sb.append('^');
        sb.append(parentAnchorToIndex(SlotTableKt.parentAnchor(this.groups, iGroupIndexToAddress)));
        sb.append(": key=");
        sb.append(SlotTableKt.key(this.groups, iGroupIndexToAddress));
        sb.append(", nodes=");
        sb.append(SlotTableKt.nodeCount(this.groups, iGroupIndexToAddress));
        if (zGroupAsString$isStarted) {
            sb.append('?');
        }
        sb.append(", dataAnchor=");
        sb.append(SlotTableKt.dataAnchor(this.groups, iGroupIndexToAddress));
        sb.append(", parentAnchor=");
        sb.append(SlotTableKt.parentAnchor(this.groups, iGroupIndexToAddress));
        if (SlotTableKt.isNode(this.groups, iGroupIndexToAddress)) {
            sb.append(", node=" + this.slots[dataIndexToDataAddress(nodeIndex(this.groups, iGroupIndexToAddress))]);
        }
        int iSlotIndex = slotIndex(this.groups, iGroupIndexToAddress);
        int iDataIndex = dataIndex(this.groups, iGroupIndexToAddress + 1);
        if (iDataIndex > iSlotIndex) {
            sb.append(", [");
            for (int i2 = iSlotIndex; i2 < iDataIndex; i2++) {
                if (i2 != iSlotIndex) {
                    sb.append(", ");
                }
                sb.append(String.valueOf(this.slots[dataIndexToDataAddress(i2)]));
            }
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        sb.append(")");
    }

    private static final boolean groupAsString$isStarted(SlotWriter slotWriter, int i) {
        return i < slotWriter.currentGroup && (i == slotWriter.parent || slotWriter.startStack.indexOf(i) >= 0 || groupAsString$isStarted(slotWriter, slotWriter.parent(i)));
    }

    public final void verifyDataAnchors$runtime_release() {
        int i = this.slotsGapOwner;
        int length = this.slots.length - this.slotsGapLen;
        int size$runtime_release = getSize$runtime_release();
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (i2 < size$runtime_release) {
            int iGroupIndexToAddress = groupIndexToAddress(i2);
            int iDataAnchor = SlotTableKt.dataAnchor(this.groups, iGroupIndexToAddress);
            int iDataIndex = dataIndex(this.groups, iGroupIndexToAddress);
            if (iDataIndex < i3) {
                throw new IllegalStateException(("Data index out of order at " + i2 + ", previous = " + i3 + ", current = " + iDataIndex).toString());
            }
            if (iDataIndex > length) {
                throw new IllegalStateException(("Data index, " + iDataIndex + ", out of bound at " + i2).toString());
            }
            if (iDataAnchor < 0 && !z) {
                if (i != i2) {
                    throw new IllegalStateException(("Expected the slot gap owner to be " + i + " found gap at " + i2).toString());
                }
                z = true;
            }
            i2++;
            i3 = iDataIndex;
        }
    }

    public final void verifyParentAnchors$runtime_release() {
        int i = this.groupGapStart;
        int i2 = this.groupGapLen;
        int capacity = getCapacity();
        for (int i3 = 0; i3 < i; i3++) {
            if (SlotTableKt.parentAnchor(this.groups, i3) <= -2) {
                throw new IllegalStateException(("Expected a start relative anchor at " + i3).toString());
            }
        }
        for (int i4 = i2 + i; i4 < capacity; i4++) {
            int iParentAnchor = SlotTableKt.parentAnchor(this.groups, i4);
            if (parentAnchorToIndex(iParentAnchor) < i) {
                if (iParentAnchor <= -2) {
                    throw new IllegalStateException(("Expected a start relative anchor at " + i4).toString());
                }
            } else if (iParentAnchor > -2) {
                throw new IllegalStateException(("Expected an end relative anchor at " + i4).toString());
            }
        }
    }

    public final int getSize$runtime_release() {
        return getCapacity() - this.groupGapLen;
    }

    private final int getCapacity() {
        return this.groups.length / 5;
    }

    public final int groupIndexToAddress(int i) {
        return i < this.groupGapStart ? i : i + this.groupGapLen;
    }

    public final int dataIndexToDataAddress(int dataIndex) {
        return dataIndex < this.slotsGapStart ? dataIndex : dataIndex + this.slotsGapLen;
    }

    private final int parent(int[] iArr, int i) {
        return parentAnchorToIndex(SlotTableKt.parentAnchor(iArr, groupIndexToAddress(i)));
    }

    public final int dataIndex(int i) {
        return dataIndex(this.groups, groupIndexToAddress(i));
    }

    public final int dataIndex(int[] iArr, int i) {
        return i >= getCapacity() ? this.slots.length - this.slotsGapLen : dataAnchorToDataIndex(SlotTableKt.dataAnchor(iArr, i), this.slotsGapLen, this.slots.length);
    }

    public final int slotIndex(int[] iArr, int i) {
        return i >= getCapacity() ? this.slots.length - this.slotsGapLen : dataAnchorToDataIndex(SlotTableKt.slotAnchor(iArr, i), this.slotsGapLen, this.slots.length);
    }

    private final void updateDataIndex(int[] iArr, int i, int i2) {
        SlotTableKt.updateDataAnchor(iArr, i, dataIndexToDataAnchor(i2, this.slotsGapStart, this.slotsGapLen, this.slots.length));
    }

    private final int nodeIndex(int[] iArr, int i) {
        return dataIndex(iArr, i);
    }

    private final int auxIndex(int[] iArr, int i) {
        return dataIndex(iArr, i) + SlotTableKt.countOneBits(SlotTableKt.groupInfo(iArr, i) >> 29);
    }

    private final List<Integer> dataIndexes(int[] iArr) {
        List listDataAnchors$default = SlotTableKt.dataAnchors$default(this.groups, 0, 1, null);
        List listPlus = CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt___CollectionsKt.slice(listDataAnchors$default, RangesKt___RangesKt.until(0, this.groupGapStart)), (Iterable) CollectionsKt___CollectionsKt.slice(listDataAnchors$default, RangesKt___RangesKt.until(this.groupGapStart + this.groupGapLen, iArr.length / 5)));
        ArrayList arrayList = new ArrayList(listPlus.size());
        int size = listPlus.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.valueOf(dataAnchorToDataIndex(((Number) listPlus.get(i)).intValue(), this.slotsGapLen, this.slots.length)));
        }
        return arrayList;
    }

    private final List<Integer> keys() {
        List listKeys$default = SlotTableKt.keys$default(this.groups, 0, 1, null);
        ArrayList arrayList = new ArrayList(listKeys$default.size());
        int size = listKeys$default.size();
        for (int i = 0; i < size; i++) {
            Object obj = listKeys$default.get(i);
            ((Number) obj).intValue();
            int i2 = this.groupGapStart;
            if (i < i2 || i >= i2 + this.groupGapLen) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final int parentIndexToAnchor(int i, int gapStart) {
        return i < gapStart ? i : -((getSize$runtime_release() - i) + 2);
    }

    private final int parentAnchorToIndex(int i) {
        return i > -2 ? i : getSize$runtime_release() + i + 2;
    }
}
